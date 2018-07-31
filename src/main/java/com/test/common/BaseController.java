package com.test.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * 控制支持类
 * @author user
 *
 */
public abstract class BaseController {
	/**
    * 日志对象
    */
   protected Logger logger = LoggerFactory.getLogger(getClass());

   /**
    * 管理基础路径
    */
   @Value("${adminPath}")
   protected String adminPath;
}
