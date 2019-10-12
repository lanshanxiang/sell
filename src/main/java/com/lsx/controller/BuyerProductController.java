package com.lsx.controller;

import com.lsx.pojo.ProductCategory;
import com.lsx.pojo.ProductInfo;
import com.lsx.service.ProductCategoryService;
import com.lsx.service.ProductInfoService;
import com.lsx.utils.ResultVOUtil;
import com.lsx.vo.ProductInfoVO;
import com.lsx.vo.ProductVO;
import com.lsx.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 买家商品
 * @ClassName BuyerProductController
 * @Author lanshanxiang
 * @Date 2019/10/10 12:19
 * @Version V1.0
 **/
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;
    @GetMapping("/list")
    public ResultVO list(){

        //1.查询所有上架的商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        //2.查询类目
        List<Integer> categoryTypeList = new ArrayList<Integer>();
        for (ProductInfo p: productInfoList){
            categoryTypeList.add(p.getCategoryType());
        }
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);

        //3. 数据拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory: productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo: productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);

    }
}
