package com.boot.controller;

import com.boot.pojo.Product;
import com.boot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/feign/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ResponseBody
    @GetMapping(path = "/selectAllProduct")
    public List<Product> selectAllProduct()
    {
        return productService.selectAllProduct();
    }

    @ResponseBody
    @GetMapping(path = "/selectmxdp")
    public List<Product> selectmxdp()
    {
        return productService.selectmxdp();
    }

    @ResponseBody
    @GetMapping(path = "/selectwntj")
    public List<Product> selectwntj()
    {
        return productService.selectwntj();
    }

}
