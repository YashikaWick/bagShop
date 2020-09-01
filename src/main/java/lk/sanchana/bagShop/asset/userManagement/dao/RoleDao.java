package lk.sanchana.bagShop.asset.userManagement.dao;

<<<<<<< HEAD
=======

import lk.sanchana.bagShop.asset.userManagement.entity.Role;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository< Role, Integer > {
    Role findByRoleName(String roleName);
}
