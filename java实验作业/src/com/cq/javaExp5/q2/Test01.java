package com.cq.javaExp5.q2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        Set<Person> treeSet=new TreeSet<>();
        treeSet.add(new Person("Tom",23,3000));
        treeSet.add(new Person("Tom",24,3000));
        treeSet.add(new Person("Tom",23,4000));
        treeSet.add(new Person("Jack",27,5000));
        treeSet.add(new Person("Sam",23,6000));
        treeSet.add(new Person("Sam",23,7000));

        Iterator<Person> it =treeSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
