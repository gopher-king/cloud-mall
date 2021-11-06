package com.boot.service.impl;

import com.boot.dao.ProductMapper;
import com.boot.pojo.Classify;
import com.boot.pojo.Product;
import com.boot.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 游政杰
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productsMapper;


    @Override
    public List<Product> selectAllProduct() {
        return productsMapper.selectAllProduct();
    }

}