package com.lambdaschool.javaorders.repos;

import com.lambdaschool.javaorders.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepo extends CrudRepository<Order, Long>
{

}
