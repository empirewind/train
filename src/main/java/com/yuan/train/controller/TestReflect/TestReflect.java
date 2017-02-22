/*
 * 文件名：TestReflect.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年2月14日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.yuan.train.controller.TestReflect;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import javax.swing.DefaultBoundedRangeModel;

import com.mysql.fabric.xmlrpc.base.Array;
import com.mysql.jdbc.Field;
import com.yuan.train.controller.newttt;
import com.yuan.train.controller.TestReflect.RealSubject.MyInvocationHandler;
import com.yuan.train.entity.User;

import net.sf.ezmorph.object.DateMorpher;

/**
 * java反射机制的联系类
 * 〈功能详细描述〉
 * @author YuanPeng
 * @version 2017年2月14日
 * @see TestReflect
 * @since
 */

public class TestReflect implements Serializable {

   public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
       ArrayList<Integer> list = new ArrayList<Integer>();
       Method method = list.getClass().getMethod("add", Object.class);
       method.invoke(list, "java反射机制的实力");
       System.err.println(list.get(0));
   }
}
