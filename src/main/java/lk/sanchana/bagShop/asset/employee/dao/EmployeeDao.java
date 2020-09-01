package lk.sanchana.bagShop.asset.employee.dao;


<<<<<<< HEAD
=======
import lk.sanchana.bagShop.asset.employee.entity.Employee;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository< Employee, Integer> {
    Employee findFirstByOrderByIdDesc();

    Employee findByNic(String nic);
}

