package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        ArrayList<String> a=new ArrayList<>();
        a.add("kajal");
        a.add("sejal");
        a.add("krish");
        System.out.println(a.get(0));
        System.out.println("***********");
        for(int i=0;i<a.size();i++){

            System.out.println(a.get(i));
        }
        System.out.println("***********");
        for(String val:a)
        {
            System.out.println(val);
        }
        System.out.println("***********");
     System.out.println(a.contains("kajal"));
        String[] name={"raj","raju","rajesh"};
       List<String> arrayList= Arrays.asList(name);
       boolean ans=arrayList.contains("raju");
        System.out.println("***********");
       System.out.println(ans);
    }
}