package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @author wlj Email:wanglujiexx@gmail.com
 * @version 1.0
 * @description .
 * @date 2020/11/30 下午8:04
 */
@Data
public class AttrRespVo extends AttrVo {
    private String catelogName;
    private String groupName;
    private Long[] catelogPath;
}
