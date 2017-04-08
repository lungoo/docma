package com.andy.platform;

import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;

@Configuration
@Import({
        DispatcherServletAutoConfiguration.class,
        EmbeddedServletContainerAutoConfiguration.class,
        ErrorMvcAutoConfiguration.class,
        HttpEncodingAutoConfiguration.class,
        HttpMessageConvertersAutoConfiguration.class,
        JacksonAutoConfiguration.class,
        //JmxAutoConfiguration.class,
        MultipartAutoConfiguration.class,
        ServerPropertiesAutoConfiguration.class,
        ValidationAutoConfiguration.class,
        WebClientAutoConfiguration.class,
        WebMvcAutoConfiguration.class
        //WebSocketAutoConfiguration.class

})
@ComponentScan(basePackages = "com.andy.**.controller,com.andy.**.impl,com.andy.**.mapper")
@EnableAutoConfiguration
public class DocmaWebApplication {



    public static void main(String[] args) {
        SpringApplication.run(DocmaWebApplication.class, args);
    }


    /**
     * beetl配置
     */

    @Bean(initMethod = "init", name = "beetlConfig")
    public BeetlGroupUtilConfiguration getBeetlGroupUtilConfiguration() {

        BeetlGroupUtilConfiguration beetlGroupUtilConfiguration = new BeetlGroupUtilConfiguration();
        ResourcePatternResolver patternResolver = ResourcePatternUtils.getResourcePatternResolver(new DefaultResourceLoader());
        try {
            // WebAppResourceLoader 配置root路径是关键
            ClasspathResourceLoader cploder = new ClasspathResourceLoader(DocmaWebApplication.class.getClassLoader(),"templates/");
            beetlGroupUtilConfiguration.setResourceLoader(cploder);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //读取配置文件信息
        beetlGroupUtilConfiguration.setConfigFileResource(patternResolver.getResource("classpath:beetl.yml"));
        return beetlGroupUtilConfiguration;
    }

    @Bean(name = "beetlViewResolver")
    public BeetlSpringViewResolver getBeetlSpringViewResolver(@Qualifier("beetlConfig") BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
        BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
        beetlSpringViewResolver.setPrefix("/");
        beetlSpringViewResolver.setSuffix(".html");
        beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
        beetlSpringViewResolver.setOrder(0);
        beetlSpringViewResolver.setConfig(beetlGroupUtilConfiguration);
        beetlSpringViewResolver.setCache(false);
        return beetlSpringViewResolver;
    }

}
