package cn.xidian.aemaip.listener;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;

/***
 * Created on 2016年8月22日<br>
 * Title: [AEMAIP]_[系统参数加载]<br>
 * Description: [在系统参数启动后加载一些常用的参数]<br>
 * Copyright: Copyright (c) 2016<br>
 * Company: 西安电子科技大学<br>
 * Department: 软件学院<br>
 * 
 * @author 路星星
 * @version 1.0
 */
//@Component("beanConfig")
public class BeanConfig implements ApplicationListener<ApplicationEvent> {
	@Resource
	ServletContext application;
	/***
	 * Title: onApplicationEvent Description:Spring容器application事件
	 * 
	 * @param event
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof ApplicationContextEvent) {
			if (((ApplicationContextEvent) event).getApplicationContext().getParent() == null) {// rootapplicationcontext
				// 系统参数加载
				System.out.println("Spring初始化完毕");

			}
		}

	}
}
