/*
 * 文件名：arrayToJson.java
 * 版权：Copyright by www.huawei.com
 * 描述：
 * 修改人：Hello World
 * 修改时间：2017年2月15日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.yuan.train.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.yuan.train.entity.IpEntity;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author YuanPeng
 * @version 2017年2月15日
 * @see arrayToJson
 * @since
 */

public class arrayToJson {
    
    public static void main(String[] args) {
        
        
        Map<String, String> map = new HashMap<String, String>();
        
        map.put("192.1.1.1", "test1"); 
        map.put("192.1.1.2", "test2");
        map.put("192.1.1.3", "test3");
        
      String aString = JSON.toJSONString(map);
        System.out.println(aString);
        
        //--------------------------------
        
        List<IpEntity> ipEntities = new ArrayList<IpEntity>();
        for(int i =0 ;i<3;i++){
            IpEntity ipEntity = new IpEntity();
            ipEntity.setIp("192.168.0.1");
            ipEntity.setDom("test");
            
            ipEntities.add(ipEntity);
        }
        
        
        System.out.println(JSON.toJSONString(ipEntities));
    }

}
