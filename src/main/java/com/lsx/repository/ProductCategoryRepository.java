package com.lsx.repository;

import com.lsx.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * 类目 Dao层
 * @ClassName ProductCategoryRepository
 * @Author lanshanxiang
 * @Date 2019年10月9日 17:49:42
 * @Version v1.0
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    //通过类目编号查类目
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);


}
