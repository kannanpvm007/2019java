// package com.kgisl.one;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

// /**
//  * Hello world!
//  *
//  */

// class entry {
//     static ArrayList<String> data = new ArrayList<String>();
//     static ArrayList<String> names = new ArrayList<String>();
//     static ArrayList<String> output = new ArrayList<String>();

//     void name() {
//         names.add("raj");
//         data.add("kavi");
//         data.add("anbu");
//         data.add("nivi");
//         data.add("kamali");
//         names.addAll(data);
//         names.add("tamil");
//         names.add("ravi");
//         System.out.println("\n" + names + "\n");

//     }

//     void Clear() {
//         //data.clear();
//         System.out.println("\n after clear" + names + "\n");
//     }

//     // void ensurecapacity(){
//     // names.ensureCapacity(20);
//     // System.out.println("\n ensurecapacity"+names+"\n");
//     // }
//     void get() {
//         names.get(5);
//         System.out.println("\n  get     " + names.get(5) + "\n");
//         System.out.println(" name is ematy? :    " + names.isEmpty());
//         System.out.println(" name is ematy? :    " + data.isEmpty());

//     }

//     void latsindex() {
//         System.out.println(" last index " + names.lastIndexOf("anbu"));
//     }

//     void objtoarray() {
//         Object[] ok = names.toArray();// to string
//         System.out.println("to array   " + Arrays.toString(ok));
//         System.out.println("to string" + Arrays.toString(ok));
//     }

//     void update() {
//         String findname = "nivi";
//         String replce = "EX";
//         int fn = names.indexOf(findname);
//         names.set(fn, replce);
//         System.out.println(names);
//         System.out.println("_________________________");
//           data.clone();
//         System.out.println("colone"+ data.clone());
//         System.out.println("_________________________");
        
//         System.out.print("remove");
//        //output= names.remove(data);
//     }
// }
   

    

//     public class App {
//     public static  void main(String[] args) {
//         Object cloning;
//          entry nm= new entry();
//         nm.name();
//         nm.Clear();
//         nm.get();
//         nm.latsindex();
//         nm.objtoarray();nm.update();
//         cloning=names.clone();
//       //  nm.ensurecapacity();





      
//     }
// }