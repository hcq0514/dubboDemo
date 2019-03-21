package com.demo.consumer.conrtoller;

import com.demo.consumer.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ProductController {
    @Resource
    private ProductService productService;

    /**
     * 添加完 返回总共消费
     * @param a
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public String getCost(int a){
        return "该产品总共消费 ："+productService.getCost(a);
    }
}
