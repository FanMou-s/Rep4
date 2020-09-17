package com.cq.javaExp8.q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyStatistics {
    public static void main(String[] args) {
        //获得文件
        BufferedReader bufReader=null;
        //创建装文件的数组
        List<String> linkList=new LinkedList<>();
        try {
            FileReader reader=new FileReader("C:\\Users\\88471\\Desktop\\The Sword of Welleran.txt");
            bufReader=new BufferedReader(reader);
            String str=null;
            while((str=bufReader.readLine())!=null){
                linkList.add(str);
            }
            wordFrequencyStatistics(linkList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufReader!=null){
                try {
                    bufReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    //统计词频
    private static void wordFrequencyStatistics(List<String> list) {
        Map<String,Integer> hashMap=new HashMap<>();
        //Map<String,HashMap<String,Integer>> map=new HashMap<String,HashMap<String,Integer>>();
        int count=0;
        int number=0;
        for(int i=0;i<list.size();i++){
            String[] str=list.get(i).split(" |\\.|'|,|\\?|;|!|:|\"|\\(|\\)|\\*|");//将每行拆分成一个String数组
            number+=str.length;
            for(String s:str){
                Integer integer=hashMap.get(s);//返回指定键所映射的值
                hashMap.put(s,integer==null ? 1 : integer+1);//无指定键，则赋值为1，有则+1
            }
        }
        Set<Map.Entry<String,Integer>> nodes=hashMap.entrySet();
        for(Map.Entry<String,Integer> node:nodes){
            System.out.println("单词："+node.getKey()+"  出现的次数："+node.getValue());
            count+=node.getValue();
        }
        System.out.println("总单词数为"+number);
        System.out.println("各单词出现的次数之和为："+count);
    }

}

