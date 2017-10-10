package cn.xidian.aemaip.listener;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;

/***
 * Created on 2017/10/10 <br>
 * Description: [spring 监听器 demo]<br>
 * @author lxing
 * @version 1.0
 */
//@Component("demoListener")
public class DemoListener implements ApplicationListener<ApplicationEvent> {
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
