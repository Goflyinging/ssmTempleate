package cn.xidian.aemaip.interceptor;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/***
 * Created on 2016年8月25日<br>
 * Title: [ameaip]_[拦截器]<br>
 * Description: [判断用户状态和权限进行拦截]<br>
 * Copyright: Copyright (c) 2016<br>
 * Company: 西安电子科技大学<br>
 * Department: 软件学院<br>
 * 
 * @author 路星星
 * @version 1.0
 */
//@Component("helloInterceptor")
public class HelloInterceptor implements HandlerInterceptor {

	@Resource
	protected ServletContext application;

	// 执行Action前先判断权限
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

		return true;
	}

	// 生成视图前，可以改model和视图
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
			ModelAndView modelAndView) throws Exception {

	}

	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object o, Exception e) throws Exception {
	}
}
