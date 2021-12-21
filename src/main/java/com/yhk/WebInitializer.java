package com.yhk;

import com.yhk.config.MyConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @program: springboot01
 * @author: YHK
 * @create: 2021-10-31 21:25
 **/
public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        //注册mvc配置类
        ac.register(MyConfig.class);
        //设置上下文信息
        ac.setServletContext(servletContext);
        //配置转发器
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(ac));
        //配置映射路径
        dispatcher.addMapping("/");
        //启动时实例化bean
        dispatcher.setLoadOnStartup(1);
    }
}
