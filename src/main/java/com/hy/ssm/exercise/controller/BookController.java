package com.hy.ssm.exercise.controller;

import com.hy.ssm.exercise.entity.users;
import com.hy.ssm.exercise.service.IBookService;
import com.hy.ssm.exercise.service.impl.BookServiceImpl;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-03-24
 */
@Controller
@RequestMapping("/exercise/book")
public class BookController {

    static Logger logger=Logger.getLogger(BookController.class);
    @Autowired
    private IBookService bookServiceImpl;
    @Autowired
    private BookServiceImpl BookServiceImpl ;

    @RequestMapping("/query.do")
    public String query(){
        System.out.println(bookServiceImpl.list(null).size());
        return "/index.jsp";
    }

    @RequestMapping("/login.do")
    public String login(String username, @RequestParam("password") String jianjie, Model model){
        System.out.println(username+jianjie);
        //ModelAndView model=new ModelAndView();
        UsernamePasswordToken token=new UsernamePasswordToken(username,jianjie); /*令牌*/
        Subject subject =SecurityUtils.getSubject();
        try {
            subject.login(token);
            logger.info("登录成功！");
        }catch (IncorrectCredentialsException ice){
            //捕获密码出现异常
            model.addAttribute("message","密码出现异常");
            System.out.println(subject.isAuthenticated());
            return  "/index";
        }catch (UnknownAccountException uae){
            //捕获未知用户名异常
            model.addAttribute("message","用户名出现异常");
             System.out.println("222");
            return  "/index";
        }catch (ExcessiveAttemptsException eae){
            //捕获错误登录多次的异常
            model.addAttribute("message","错误登录多次");
            return  "/index";
        }
System.out.println("sssssssssssssssssssssssssssss");


        return "/query";
    }


    @RequestMapping("/zuce.do")
    public String zuce(String username,String password){
    System.out.println(username+password);

        String hashAlgorithmName="MD5"; //加密方式
        Object credentials=password;   //要加密的密码
        Object salt= ByteSource.Util.bytes(username);//加的盐
        int hashIterations=1024;//加密次数
        Object result=new SimpleHash(hashAlgorithmName,credentials,salt,hashIterations);
        System.out.println("==>"+result);
        users users= new users();
        users.setUsername(username);
        users.setPasswords(result.toString());
        bookServiceImpl.save(users);
        return "/login";
    }


    @RequiresPermissions(value = "eqwe.do")
    @RequestMapping("/admin/quanxian.do")
    //@RequiresRoles(value = "admin")
    public String quanxian(){

        return "权限测试" ;
    }

}
