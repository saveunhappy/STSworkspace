package cn.wolfcode.shiro.web.controller;


import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam(value="username",required=false) String username, @RequestParam(value="password",required=false) String password,Model model, HttpServletRequest req) throws  Exception{
        //如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
    	Subject subject = SecurityUtils.getSubject();
    	UsernamePasswordToken token = new UsernamePasswordToken(username, password);
       
        //根据shiro返回的异常类路径判断，抛出指定异常信息
        try {
        	subject.login(token);
        	return "main";
		} catch (UnknownAccountException e) {
			model.addAttribute("errorMsg", "账号不存在");
		}catch (IncorrectCredentialsException e) {
			model.addAttribute("errorMsg", "用户名/密码错误");
		}catch (Exception e) {
			model.addAttribute("errorMsg", "其他异常信息");
		}
        return "forward:/login.jsp";
/*	Subject currentUser = SecurityUtils.getSubject();
		
		if (!currentUser.isAuthenticated()) {
        	// ���û����������װΪ UsernamePasswordToken ����
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            // rememberme
            //token.setRememberMe(true);
            try {
            	// ִ�е�¼. 
                currentUser.login(token);
            } 
            // ... catch more exceptions here (maybe custom ones specific to your application?
            // ������֤ʱ�쳣�ĸ���. 
            catch (AuthenticationException ae) {
                //unexpected condition?  error?
            	System.out.println( ae.getMessage());
            }
        }
		
		return "redirect:main";*/
    	
    	
    	
    	
    	
    /*	
        String exceptionClassName = (String) req.getAttribute("shiroLoginFailure");
        if(exceptionClassName!=null){
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                //最终会抛给异常处理器

                model.addAttribute("errorMsg", "账号不存在");
            } else if (IncorrectCredentialsException.class.getName().equals(
                    exceptionClassName)) {
                model.addAttribute("errorMsg", "用户名/密码错误");
            } else {
                //最终在异常处理器生成未知错误.
                model.addAttribute("errorMsg", "其他异常信息");
            }
        }
        //此方法不处理登陆成功（认证成功），shiro认证成功会自动跳转到上一个请求路径
        //登陆失败还到login页面
        return "forward:/login.jsp";*/
    }

}
