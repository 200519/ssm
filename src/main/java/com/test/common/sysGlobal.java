package com.test.common;

import java.util.HashMap;
import java.util.Map;

public class sysGlobal {
	/**
	 * 当前对象实例
	 */
	private static sysGlobal global = new sysGlobal();
	/**
	 * 保存全局属性值
	 */
	private static Map<String, String> map = new HashMap<String, String>();
	/**
	 * 属性文件加载对象
	 */
	private static PropertiesLoader loader = new PropertiesLoader("config.properties");
	
	public static sysGlobal getInstance() {
		return global;
	}
	/**
	 * 获取配置
	 * @see ${fns:getConfig('adminPath')}
	 */
	public static String getConfig(String key) {
		String value = map.get(key);
		if (value == null){
			value = loader.getProperty(key);
			map.put(key, value != null ? value : "");
		}
		return value;
	}
	
	/**
	 * 获取管理端根路径
	 */
	public static String getAdminPath() {
		return getConfig("adminPath");
	}
}
