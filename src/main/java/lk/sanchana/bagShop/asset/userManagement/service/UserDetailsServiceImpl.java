package lk.sanchana.bagShop.asset.userManagement.service;

<<<<<<< HEAD
=======


import lk.sanchana.bagShop.asset.userManagement.CustomerUserDetails;
import lk.sanchana.bagShop.asset.userManagement.dao.UserDao;
import lk.sanchana.bagShop.asset.userManagement.entity.User;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserDao userDao;


    public UserDetailsServiceImpl() {
    }

    @Transactional( readOnly = true )
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userDao.findByUsername(username.toLowerCase());
       CustomerUserDetails userDetails;
        if ( user != null ) {
            userDetails = new CustomerUserDetails();
            userDetails.setUser(user);
        } else {
            throw new UsernameNotFoundException("User not exist with name : " + username);
        }
        return userDetails;
    }
}

