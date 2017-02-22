
package com.yuan.train;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;


/**
* 
* method
* 
* @author Hello World
* @version 2016年9月5日
* @see WebAppConfig
* @since
* 
*/

@EnableAutoConfiguration
@SpringBootApplication
public class WebAppConfig extends WebMvcAutoConfigurationAdapter {
    /**
     * 
     * Description: <br>
     * 1、…<br>
     * 2、…<br>
     * Implement: <br>
     * 1、…<br>
     * 2、…<br>
     * 
     * @param args 
     * @see
     */
    public static void main(String[] args) {
        SpringApplication.run(WebAppConfig.class, args);
        System.out.println("这是一个spring boot应用");
    }

}
