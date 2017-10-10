package cn.xidian.aemaip.interceptor;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/***
 * Created on 2017/10/10 <br>
 * Description: [spring 拦截器 demo]<br>
 * @author lxing
 * @version 1.0
 */
//@Component("demoInterceptor")
public class DemoInterceptor implements HandlerInterceptor {

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
