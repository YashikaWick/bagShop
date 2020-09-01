package lk.sanchana.bagShop.asset.customer.service;

<<<<<<< HEAD


=======
import lk.sanchana.bagShop.asset.customer.dao.CustomerDao;
import lk.sanchana.bagShop.asset.customer.entity.Customer;
import lk.sanchana.bagShop.util.interfaces.AbstractService;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
import java.util.*;

@Service
@CacheConfig( cacheNames = "customer" )
public class CustomerService implements AbstractService< Customer, Integer> {
=======

import java.util.List;

@Service
@CacheConfig( cacheNames = "customer" )
public class CustomerService implements AbstractService<Customer, Integer> {
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    private final CustomerDao customerDao;

    @Autowired
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    public Customer findById(Integer id) {
        return customerDao.getOne(id);
    }

    public Customer persist(Customer customer) {
        return customerDao.save(customer);
    }

    public boolean delete(Integer id) {
        customerDao.deleteById(id);
        return false;
    }

    public List<Customer> search(Customer customer) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Customer> customerExample = Example.of(customer, matcher);
        return customerDao.findAll(customerExample);
    }

    public Customer lastCustomer(){
        return customerDao.findFirstByOrderByIdDesc();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
