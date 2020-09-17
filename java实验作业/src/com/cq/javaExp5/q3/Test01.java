package com.cq.javaExp5.q3;

public class Test01 {
    public static void main(String[] args) throws Exception{
        ClassLoader classLoader=Test01.class.getClassLoader();
        //1、使用ClassLoader.loadClass()来加载类，不会执行初始化块
        classLoader.loadClass("com.cq.javaExp5.q3.Demo");

        //2、使用Class.forName()来加载类，默认会执行初始化块
        Class.forName("com.cq.javaExp5.q3.Demo");

        //3、使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块
        Class.forName("com.cq.javaExp5.q3.Demo",false,classLoader);
    }

}
class Demo{
    static {
        System.out.println("static 静态代码块");
    }
}