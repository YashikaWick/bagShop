package lk.sanchana.bagShop.asset.userManagement.dao;
<<<<<<< HEAD
=======


import lk.sanchana.bagShop.asset.userManagement.entity.Enum.UserSessionLogStatus;
import lk.sanchana.bagShop.asset.userManagement.entity.User;
import lk.sanchana.bagShop.asset.userManagement.entity.UserSessionLog;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSessionLogDao extends JpaRepository< UserSessionLog, Integer > {
    UserSessionLog findByUserAndUserSessionLogStatus(User user, UserSessionLogStatus userSessionLogStatus);
}
