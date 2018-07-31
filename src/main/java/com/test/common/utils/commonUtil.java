package com.test.common.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class commonUtil {
	private static String algorithmName = "MD5"; //加密方式
	 
	private static int hashIterations = 1024; //加密次数
	
	/**
	 * 加密,通过salt判断是否加盐加密
	 * @param str
	 * @param salt
	 * @return
	 */
	public static String EncryptUser(String str,Object salt) { 
		 /*
	      * 加密方式必须跟shiro配置文件一致
	      * MD5加密：
	      * 使用SimpleHash类对原始密码进行加密。
	      * 第一个参数代表使用MD5方式加密
	      * 第二个参数为原始密码
	      * 第三个参数为盐值，
	      * 第四个参数为加密次数
	      * 最后用toHex()方法将加密后的密码转成String
	      * */
		String strNew = "";
		if(salt!=null && salt!="") {
			strNew = new SimpleHash(algorithmName, str, ByteSource.Util.bytes(salt), hashIterations).toHex();
		}else {
			strNew = new SimpleHash(algorithmName, str, null, hashIterations).toHex();
		}
		return strNew;
	}
	
	/**
	 * 通过反射,获得定义Class时声明的父类的范型参数的类型. 
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Class getSuperClassGenricType(Class clazz) {
		Type genType = clazz.getGenericSuperclass();
		if (!(genType instanceof ParameterizedType)) {
			return Object.class;
		}
 
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		if (!(params[0] instanceof Class)) {
			return Object.class;
		}
		return (Class) params[0];
	}

}
