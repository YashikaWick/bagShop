package lk.sanchana.bagShop.asset.userManagement.service;

<<<<<<< HEAD
=======


import lk.sanchana.bagShop.asset.userManagement.dao.UserSessionLogDao;
import lk.sanchana.bagShop.asset.userManagement.entity.Enum.UserSessionLogStatus;
import lk.sanchana.bagShop.asset.userManagement.entity.User;
import lk.sanchana.bagShop.asset.userManagement.entity.UserSessionLog;
import lk.sanchana.bagShop.util.interfaces.AbstractService;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig( cacheNames = {"userSessionLog"} )
public class UserSessionLogService implements AbstractService< UserSessionLog, Integer > {
    private final UserSessionLogDao userSessionLogDao;

    @Autowired
    public UserSessionLogService(UserSessionLogDao userSessionLogDao) {
        this.userSessionLogDao = userSessionLogDao;
    }

    @Override
    @Cacheable
    public List<UserSessionLog> findAll() {
        return userSessionLogDao.findAll();
    }

    @Override
    @Cacheable
    public UserSessionLog findById(Integer id) {
        return userSessionLogDao.getOne(id);
    }

    @Override
    @Caching( evict = {@CacheEvict( value = "userSessionLog", allEntries = true )},
            put = {@CachePut( value = "userSessionLog", key = "#userSessionLog.id" )} )
    public UserSessionLog persist(UserSessionLog userSessionLog) {
        return userSessionLogDao.save(userSessionLog);
    }

    @Override
    public boolean delete(Integer id) {
        // can not be implement

        return true;
    }

    public void delete(UserSessionLog userSessionLog){
        userSessionLogDao.delete(userSessionLog);
    }

    @Override
    public List<UserSessionLog> search(UserSessionLog userSessionLog) {
        return null;
    }

    @Cacheable
    public UserSessionLog findByUserAndUserSessionLogStatus(User user, UserSessionLogStatus userSessionLogStatus) {
        return userSessionLogDao.findByUserAndUserSessionLogStatus(user, userSessionLogStatus);
    }
}

