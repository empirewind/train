/**
 * 
 */
package com.yuan.train.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author yuanpeng
 *
 */
@Controller
public class IndexController
{

    @RequestMapping(value = {"index", "/"}, method = RequestMethod.GET)
    public String index()
    {
        return "html/login/index.html";
    }
    
    @RequestMapping(value = {"login"}, method = RequestMethod.POST)
    public void String(String jsonTextarea)
    {
        System.out.println(jsonTextarea);
    }
}
