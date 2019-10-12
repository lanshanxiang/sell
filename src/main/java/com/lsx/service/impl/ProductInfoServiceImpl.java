package com.lsx.service.impl;

import com.lsx.dto.CartDTO;
import com.lsx.enums.ProductStatusEnum;
import com.lsx.enums.ResultEnum;
import com.lsx.exception.SellException;
import com.lsx.pojo.ProductInfo;
import com.lsx.repository.ProductInfoRepository;
import com.lsx.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName ProductInfoServiceImpl
 * @Author lanshanxiang
 * @Date 2019/10/9 21:27
 * @Version V1.0
 **/
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public ProductInfo findById(String productId) {
        Optional<ProductInfo> optional = productInfoRepository.findById(productId);
        ProductInfo productInfo = optional.get();
        return productInfo;
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoRepository.save(productInfo);
    }

    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {

    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO: cartDTOList) {
           ProductInfo productInfo = productInfoRepository.findById(cartDTO.getProductId()).get();
           if (productInfo == null){
               throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
           }
           Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
           if (result < 0){
               throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
           }
           productInfo.setProductStock(result);
           productInfoRepository.save(productInfo);

        }
    }
}
