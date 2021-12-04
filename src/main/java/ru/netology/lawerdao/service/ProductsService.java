package ru.netology.lawerdao.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.lawerdao.entity.Order;
import ru.netology.lawerdao.repo.ProductsRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductsService {

    private final ProductsRepo repo;

    public List<String> getProductNameByCustomerName(String managerName) {

        return repo.findOrdersByCustomerName(managerName)
                .stream()
                .map(Order::getProductName)
                .collect(Collectors.toList());
    }


}
