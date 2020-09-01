package lk.sanchana.bagShop.asset.userManagement.dao;

<<<<<<< HEAD
=======


import lk.sanchana.bagShop.asset.employee.entity.Employee;
import lk.sanchana.bagShop.asset.userManagement.entity.User;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository< User, Integer > {

    @Query( value = "select id from User where employee_id=?1", nativeQuery = true )
    Integer findByEmployeeId(@Param("employee_id") Integer id);

    @Query( "select id from User where username=?1" )
    Integer findUserIdByUserName(String userName);

    User findByUsername(String name);

    User findByEmployee(Employee employee);
}
