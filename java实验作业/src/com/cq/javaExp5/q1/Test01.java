package com.cq.javaExp5.q1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<>();
        hashSet.add("I");
        hashSet.add("Love");
        hashSet.add("China");
        hashSet.add("Very");
        hashSet.add("Very");
        hashSet.add("Much");

        Iterator<String> it=hashSet.iterator();//创建Iterator对象
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
