package com.lambdaschool.javaorders.repos;

import com.lambdaschool.javaorders.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Long>
{
	Customer findByCustname(String name);
}
