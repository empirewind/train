/*
 * 文件名：FruitInfoUtil.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年1月7日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.yuan.train.controller;

import java.lang.reflect.AnnotatedElement;

import com.mysql.jdbc.Field;
import com.yuan.train.controller.annon.Apple;
import com.yuan.train.controller.annon.FruitColor;
import com.yuan.train.controller.annon.FruitName;
import com.yuan.train.controller.annon.FruitProvider;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author YuanPeng
 * @version 2017年1月7日
 * @see FruitInfoUtil
 * @since
 */

public class FruitInfoUtil {

    public static void getFruitInfo(Class<?> clazz){
        String strFruitName=" 水果名称：";
        String strFruitColor=" 水果颜色：";
        String strFruitProvicer="供应商信息：";
        
        java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
        
        for(java.lang.reflect.Field field :fields){
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class); 
                strFruitName=strFruitName+fruitName.value();
                System.out.println(strFruitName);
            }else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor =field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor+fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
                
            }else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvicer=" 供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()+" 供应商地址："+fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
        }
    }
}

 class FruitRun {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        FruitInfoUtil.getFruitInfo(Apple.class);
        
    }

}
