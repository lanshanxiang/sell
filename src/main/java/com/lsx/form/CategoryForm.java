package com.lsx.form;

import lombok.Data;

/**
 * @ClassName SellerOrderController
 * @Author lanshanxiang
 * @Date 2019/10/14 18:16
 * @Version V1.0
 **/
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
