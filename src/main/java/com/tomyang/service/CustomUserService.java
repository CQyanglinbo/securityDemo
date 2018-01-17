package com.tomyang.service;

import com.tomyang.dao.PermissionDao;
import com.tomyang.dao.UserDao;
import com.tomyang.domain.Permission;
import com.tomyang.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * CustomUserService(UserDetailsService的实现类)
 * @author yc
 * @date 2018/1/16
 */
@Service("CustomUserService")
public class CustomUserService implements UserDetailsService { //自定义UserDetailsService 接口

    @Autowired
    private UserDao userDao;
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public UserDetails loadUserByUsername(String username) {
        SysUser user = userDao.findByUsername(username);
        if (user != null) {
            List<Permission> permissions = permissionDao.findById(user.getId());
            List<GrantedAuthority> grantedAuthorities = new ArrayList <>();
            for (Permission permission : permissions) {
                if (permission != null && permission.getName()!=null) {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
                grantedAuthorities.add(grantedAuthority);
                }
            }
            return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
        } else {
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
    }
}
