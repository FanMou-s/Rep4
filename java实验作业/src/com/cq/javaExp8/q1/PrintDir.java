package com.cq.javaExp8.q1;

import java.io.File;

/**
 * 期末考？
 */
public class PrintDir {
    public static void main(String[] args) {
        //目标源
        File srcFile=new File("E:\\办公室任务\\");
        //打印
        printDir(srcFile);
    }

    private static void printDir(File srcFile) {
        if(srcFile.isFile()){
            System.out.println("     "+srcFile.getName());
            return;
        }
        File[] files=srcFile.listFiles();
        for(File file:files){
            if(file.isDirectory()) {
                System.out.println("文件夹=>"+file.getName());
            }
            printDir(file);
        }
    }
}
