package lk.sanchana.bagShop.asset.customer.dao;


<<<<<<< HEAD
=======

import lk.sanchana.bagShop.asset.customer.entity.Customer;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< HEAD
public interface CustomerDao extends JpaRepository< Customer, Integer> {
=======
public interface CustomerDao extends JpaRepository<Customer, Integer> {
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    Customer findFirstByOrderByIdDesc();
}
