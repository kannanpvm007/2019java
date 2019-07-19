package com.kgisl.one;
import java.util.*;
/**
 * Clonelist
 */
public class Clonelist {

    public static void main(String[] args) {
        Object cloning,remove;
        ArrayList<String> list=new ArrayList<String>();
        list.add("sanju");
        list.add("kannan");
        System.out.println(list);
        cloning=list.clone();
        remove=list.remove(1);
        System.out.println(remove);
        System.out.println(list);

    }
}