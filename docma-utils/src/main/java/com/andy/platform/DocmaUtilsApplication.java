package com.andy.platform;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

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
//@ComponentScan(basePackages = "com.andy.**.controller,com.andy.**.impl,com.andy.**.mapper")
//@EnableAutoConfiguration
public class DocmaUtilsApplication {

    //public static void main(String[] args) {
    //    SpringApplication.run(DocmaUtilsApplication.class, args);
    //}
}
