package ru.netology.lawerdao.controller;


import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.lawerdao.repo.ProductsRepo;
import ru.netology.lawerdao.service.ProductsService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
@Validated
public class ProductsController {

    private final ProductsService productsService;

    @GetMapping("/fetch-product")
    public List <String> getProducts(String managerName) {

        return productsService.getProductNameByCustomerName(managerName);
    }

}
