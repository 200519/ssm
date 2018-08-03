package com.test.index.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
/*import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.common.BaseController;
import com.test.common.utils.commonUtil;
import com.test.sys.model.Person;
import com.test.sys.model.User;
import com.test.sys.service.IPersonService;
import com.test.sys.service.IUserService;

@Controller
@RequestMapping("/index")
public class indexController extends BaseController {
	
	@Autowired
	private IUserService userService;
	@Autowired
	private IPersonService personService;

	@RequestMapping("/register")
	public String register(User user,Person person,HttpServletRequest request,HttpServletResponse response) {
		//生成uuid
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();      
        String password = user.getPassword();//记录明文密码
       
        String newPs = commonUtil.EncryptUser(user.getPassword(), user.getUsername());
        user.setId(uuid);
        user.setPassword(newPs);
        user.setSalt(user.getUsername());//以登陆名称为加密盐
        
        userService.insert(user); 
        person.setUser(user);
        personService.insert(person);                
        
        //注册完后登陆验证
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername(user.getUsername());  
        token.setPassword(password.toCharArray());  
        SecurityUtils.getSubject().login(token);
        
        return "redirect:/index.jsp";
	}
	
	public static void main(String[] args) {
		/*Person person = personService.get("1");
		System.out.println(person.getId());*/
		/*String[] a = new String[] {"1","2","3","4"};
		System.out.println(a.length);*/
		/*System.out.println(indexController.class);*/
		
	}
}
