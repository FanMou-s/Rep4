package com.cq.javaExp5.q3;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        Random r=new Random();//创建随机对象
        int count=0;//计数器
        for(int i=0;i<1000;i++){
            arrayList.add(r.nextInt(10));
        }
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arrayList.size();i++){
            Integer integer=hashMap.get(arrayList.get(i));//返回指定键所映射的值
            hashMap.put(arrayList.get(i),integer==null ? 1 : integer+1);
        }
        //遍历Map
        Set<Map.Entry<Integer,Integer>> nodes=hashMap.entrySet();
        for(Map.Entry<Integer,Integer> node:nodes){
            System.out.println("数字："+node.getKey()+"  出现的次数："+node.getValue());
            count+=node.getValue();
        }
        System.out.println("各数出现的次数之和为："+count);
    }
}
