
package com.demo.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
  * Swagger2的配置类
  * @author yt.wei
  * @date 2018/2/11 9:05
  * @version 0.1
  */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    /**
     * 扫描的包路径，配置在application中
     */
    @Value(value = "${swagger.package}")
    private String swaggerPackage;

    /**
      * description:构建api文档
      * @author yt.wei
      * @param 
      * @return 
      * @date 2018/2/11 9:10
      */
    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo()).select()
                // 设置包扫描路径
                .apis(RequestHandlerSelectors.basePackage(swaggerPackage))
                .paths(PathSelectors.any()).build();
    }

    /**
      * description:api文档的基本信息
      * @author yt.wei
      * @param 
      * @return 
      * @date 2018/2/11 9:10
      */
    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                // API的Title
                .title("SpringBoot-Demo之Swagger2项目 Restful APIs")
                // 描述信息
                .description("Swagger2的api接口文档")
                .termsOfServiceUrl("http://localhost:8080/doc.html")
                .contact(new Contact("yt.wei","http://localhost:8080/doc.html","yt.wei@126.com"))
                // 版本号
                .version("1.0")
                .build();
    }
}
