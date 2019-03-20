package com.demo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.demo.api.service.CostService;
import com.demo.consumer.service.ProductService;

/**
 * 产品service
 */
@Service
public class ProductServiceImpl implements ProductService {


    /**
     * 使用dubbo的注解 com.alibaba.dubbo.config.annotation.Reference。进行远程调用service
     */
    @Reference
    private CostService costService;

    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }
}
