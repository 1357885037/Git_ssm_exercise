package com.huayu.sanqi.shiro;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huayu.sanqi.entity.Users;
import com.huayu.sanqi.service.IUsersService;
import com.hy.ssm.lanxin.entity.Accounts;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private IUsersService usersService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Object object = principalCollection.getPrimaryPrincipal();
        System.out.println(object+"进来了");
        Set roles=new HashSet();
        roles.add("none");

        Set perms=new HashSet();
        perms.add("queryAll");

        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roles);
        simpleAuthorizationInfo.addStringPermissions(perms);

        return simpleAuthorizationInfo;
    }

    @Override
    @RequestMapping("/authenticationInfo.do")
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       UsernamePasswordToken usernamePasswordToken=(UsernamePasswordToken)authenticationToken;
      String username = usernamePasswordToken.getUsername();
        QueryWrapper<Users> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("aname",username);
        Users users = usersService.getOne(queryWrapper);
      System.out.print(users.toString());
      if (null == users){
          throw new UnknownAccountException("未知账号！");
      }
        ByteSource byteSource = ByteSource.Util.bytes(username);
      System.out.println(users.getuPass()+"455");
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(accounts.getAname(),accounts.getApass(),byteSource,getName());
        return authenticationInfo;
    }

    public static void main(String[] args){
        Object obj1= ByteSource.Util.bytes("关羽");
       Object obj = new SimpleHash("MD5","123",obj1,1024);
       System.out.println(obj);
    }



}
