package com.demo.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
  * @description:添加静态资源的映射路径
  * @author yt.wei
  * @date 2018/2/11 9:28
  * @version 0.1
  */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
      * 重写静态资源的配置路径
      * @author yt.wei
      * @param 
      * @return 
      * @date 2018/2/11 9:30
      */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
       /* registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");*/
    }

}
