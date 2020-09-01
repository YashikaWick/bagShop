package lk.sanchana.bagShop.asset.employee.dao;

<<<<<<< HEAD
=======

import lk.sanchana.bagShop.asset.employee.entity.Employee;
import lk.sanchana.bagShop.asset.employee.entity.EmployeeFiles;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeFilesDao extends JpaRepository<EmployeeFiles, Integer > {
    List< EmployeeFiles > findByEmployeeOrderByIdDesc(Employee employee);

    EmployeeFiles findByName(String filename);

    EmployeeFiles findByNewName(String filename);

    EmployeeFiles findByNewId(String filename);
}
