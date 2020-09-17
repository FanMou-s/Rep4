package com.classTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test1 {
    public static void main(String[] args) throws Exception{
        File file=new File("C:\\data.txt");
        File[] files=file.listFiles();
        BufferedReader reader;
        String str;
        int count=0;
        HashMap<Integer,String> allWords=new HashMap<Integer,String>();
        LinkedHashMap<String,Integer> words=new LinkedHashMap<String,Integer>();
        HashMap<Integer,LinkedHashMap<Integer,Integer>> doc_voctor=new HashMap<Integer,LinkedHashMap<Integer,Integer>>();
        for(File theFile:files){
            reader=new BufferedReader(new FileReader(theFile));
            while((str=reader.readLine())!=null){
                String[] temStr=str.trim().split(" |,|.|;|!|(|)");
                for(String str1:temStr)
                    words.put(str1,count++);
            }
            for(File theFile1:files){
                int num=0;
                reader=new BufferedReader(new FileReader(theFile1));
                LinkedHashMap<Integer,Integer> tmpMap=new LinkedHashMap<Integer,Integer>();
                while((str=reader.readLine())!=null){
                    String[] temStr=str.trim().split(" |,|.|;|!|(|)");
                    for(String str1:temStr){
                        if(words.containsKey(str1)){

                        }
                    }
                }
                doc_voctor.put(num, tmpMap);
            }
        }
    }
}
