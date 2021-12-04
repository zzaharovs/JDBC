package ru.netology.lawerdao.repo;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.netology.lawerdao.entity.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@AllArgsConstructor
public class ProductsRepo {


    @PersistenceContext
    private final EntityManager entityManager;

    public List<Order> findOrdersByCustomerName(String name) {

        Query findAllOrdersByCustomerName = entityManager.createQuery(
                "select o from Order o where upper(o.customer.name) = upper(:name) ");
        findAllOrdersByCustomerName.setParameter("name", name);

        return findAllOrdersByCustomerName.getResultList();


    }

}
