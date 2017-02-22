/*
 * 文件名：RealSubject.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年2月15日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.yuan.train.controller.TestReflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author YuanPeng
 * @version 2017年2月15日
 * @see RealSubject
 * @since
 */

public class RealSubject implements Subject {

    @Override
    public String say(String name, int age) {
        return name + " " + age; 
    }
    
    class MyInvocationHandler implements InvocationHandler {
        private Object obj = null;
        public Object bind(Object obj) {
            this.obj = obj;
            return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
        }
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object temp = method.invoke(this.obj, args);
            return temp;
        }
    }

}
