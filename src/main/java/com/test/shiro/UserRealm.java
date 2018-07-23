package com.test.shiro;

import java.io.Serializable;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.model.User;
import com.test.service.IUserService;

public class UserRealm extends AuthorizingRealm{
	
	@Autowired
	private IUserService userService;
	
	 @Override
	 protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
	        //String userName=(String)principals.getPrimaryPrincipal();

	        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
	        //authorizationInfo.setRoles();//获取角色信息
	        //authorizationInfo.setStringPermissions(userService.findPermissionsByUserName(userName));//获取权限信息

	        return authorizationInfo;
	    }

	    //获取身份验证信息
	    @Override
	    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
	        String userName = (String)token.getPrincipal();
	        String password = new String((char[]) token.getCredentials());
	        
	        User user=userService.getUserByUserName(userName);//获取身份信息(密码和密码盐)
	        SimpleAuthenticationInfo authenticationInfo= null;
	        if(user==null){
	            throw new UnknownAccountException();
	        }else if(user != null) {
	        	if(user.getPassword().equals(password)) {
	        		  authenticationInfo=new SimpleAuthenticationInfo(
	     	                user.getUsername(),
	     	                user.getPassword(),
	     	                ByteSource.Util.bytes(user.getPassword()),getName());
	        	}else {
	        		  authenticationInfo=new SimpleAuthenticationInfo(
	     	                user.getUsername(),
	     	                password,
	     	                ByteSource.Util.bytes(password),getName());
	        	}
	        }
	        return authenticationInfo;
	    }
	    
	   /* *//**
		 * 授权用户信息
		 *//*
		public static class Principal implements Serializable {

			private static final long serialVersionUID = 1L;
			
			private String id; // 编号
			private String username; // 登录名
			

			public Principal(User user) {
				this.id = user.getId();
				this.username = user.getUsername();
			}

			public String getId() {
				return id;
			}		

			public String getUsername() {
				return username;
			}

			*//**
			 * 获取SESSIONID
			 *//*
			public String getSessionid() {
				try{
					return (String) UserUtils.getSession().getId();
				}catch (Exception e) {
					return "";
				}
			}
			
			@Override
			public String toString() {
				return id;
			}

		}*/
}
