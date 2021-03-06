
  [2019-03-21T05:12:26Z] baraneetharan.r: <https://www.javatpoint.com/interface-in-java>
  
    ---------------
    | Attachments |
    ---------------
    
    Interface in Java - Javatpoint
    https://www.javatpoint.com/interface-in-java

    
  

  [2019-03-21T05:12:46Z] baraneetharan.r: <https://www.javatpoint.com/nested-interface>
  
    ---------------
    | Attachments |
    ---------------
    
    Java Nested Interface - javatpoint
    https://www.javatpoint.com/nested-interface

    
  

  [2019-03-21T05:12:57Z] baraneetharan.r: <https://www.tutorialspoint.com/Can-we-define-a-class-inside-a-Java-interface>
  
    ---------------
    | Attachments |
    ---------------
    
    Can we define a class inside a Java interface
    https://www.tutorialspoint.com/Can-we-define-a-class-inside-a-Java-interface

    
  

  [2019-03-21T05:17:36Z] baraneetharan.r: <https://www.javatpoint.com/java-default-methods>
  
    ---------------
    | Attachments |
    ---------------
    
    Java 8 Default Methods - javatpoint
    https://www.javatpoint.com/java-default-methods

    
  

  [2019-03-21T05:31:17Z] baraneetharan.r: <https://www.javatpoint.com/java-9-interface-private-methods>
  
    ---------------
    | Attachments |
    ---------------
    
    Java 9 Interface Private Methods - javatpoint
    https://www.javatpoint.com/java-9-interface-private-methods

    
  

  [2019-03-22T03:27:56Z] gowtham.mani: interface behaviour{
    void user();
    void name();
    void details();
    void location();
}
abstract class Good implements behaviour{

     Good(){
     System.out.println("ABstract constructor");
    }
    public void name(){
        System.out.println("Gowtham");
    }
}
class Bad extends Good{
    int x;
    Bad(){
        //super();
        System.out.println("Bad constructor");
    }
    Bad(int x){
        this();
        System.out.println("parameterized bad constructor");
    }
    public void user(){
        System.out.println("Good");
    }

    public void details(){
        System.out.println("Active");
    }
    public void location(){
        System.out.println("Coimbatore");
    }
}
class Test5{
    public static void main(String[] args){
    Bad ob=new Bad(5);
    ob.user();
    ob.name();
    ob.details();
    ob.location();
    }
}
  

  [2019-03-25T04:00:08Z] baraneetharan.r: <https://www.javatpoint.com/java-inner-class>
  
    ---------------
    | Attachments |
    ---------------
    
    Java Inner Class  - javatpoint
    https://www.javatpoint.com/java-inner-class

    
  

  [2019-03-25T04:00:15Z] baraneetharan.r: <https://www.tutorialspoint.com/java/java_innerclasses.htm>
  
    ---------------
    | Attachments |
    ---------------
    
    Java Inner classes
    https://www.tutorialspoint.com/java/java_innerclasses.htm

    
  

  [2019-03-25T04:00:47Z] baraneetharan.r: <https://topjavatutorial.com/wp-content/uploads/2016/02/Java-inner-class-definitions.png>
  
    ---------------
    | Attachments |
    ---------------
    
    
    

    
  

  [2019-03-25T04:01:08Z] baraneetharan.r: <http://www.c4learn.com/java/java-nested-class-overview/>
  
    ---------------
    | Attachments |
    ---------------
    
    Java nested class overview - Java Tutorials - c4learn.com
    http://www.c4learn.com/java/java-nested-class-overview/

    
  

  [2019-03-25T04:20:01Z] baraneetharan.r: Why can't we instantiate an interface or an abstract class in java?
  

  [2019-03-26T04:12:35Z] baraneetharan.r: <https://www.javatpoint.com/array-in-java>
  
    ---------------
    | Attachments |
    ---------------
    
    Java Array - Javatpoint
    https://www.javatpoint.com/array-in-java

    
  

  [2019-03-26T09:20:51Z] gowtham.mani: /**
 * StringArray
 */
import java.util.Scanner;

public class StringArray {

    // static String a[]={"Bike","Car","pulsar","R15"};
    static String a[] = new String[2];
    // a[0]="Bike";

    public static void main(String[] args) {
        selectOptions();
        // create();
        // display();
        // getOne();
        // update();
        // display();
        // remove();
        // display();
    }

    static void selectOptions() {
        System.out.println("Select Options");
        System.out.println("1.Create\t2.Display\t3.Getone\t4.Update\t5.Remove");
        System.out.println("Select Your Option");
        Scanner scan = new Scanner(<http://System.in|System.in>);
        int myOption = scan.nextInt();
        switch (myOption) {
        case 1:
            create();
            selectOptions();
            break;
        case 2:
            display();
            selectOptions();
            break;
        case 3:
            getOne();
            selectOptions();
            break;
        case 4:
            update();
            selectOptions();
            break;
        case 5:
            remove();
            selectOptions();
            break;
        default:
            selectOptions();
            break;
        }
    }

    static void getOne() {
        System.out.println("getOne");
        System.out.println("Enter Name to find:");
        Scanner scan = new Scanner(<http://System.in|System.in>);
        String findName = scan.nextLine();
        for (String var : a) {
            if (findName.equals(var)) {
                System.out.println(findName);
                break;
            }
        }
    }

    static void create() {
        System.out.println("create");
        for (int i = 0; i &lt; a.length; i++) {
            System.out.println("Enter name:");
            Scanner scan = new Scanner(<http://System.in|System.in>);
            String inputName = scan.nextLine();
            a[i] = inputName;
        }

    }

    static void display() {
        System.out.println("display");
        for (String var : a) {
            System.out.println(var);
        }
    }

    static void update() {
        System.out.println("update");
        System.out.println("Enter Name to update:");
        Scanner scan = new Scanner(<http://System.in|System.in>);
        String findName = scan.nextLine();
        System.out.println("Enter New Name:");
        scan = new Scanner(<http://System.in|System.in>);
        String updateName = scan.nextLine();
        for (int i = 1; i &lt; a.length; i++) {
            if (findName.equals(a[i])) {
                a[i] = updateName;
                break;
            }
        }
    }

    static void remove() {
        System.out.println("Remove");
        System.out.println("Enter Name to Remove:");
        Scanner scan = new Scanner(<http://System.in|System.in>);
        String findName = scan.nextLine();
        for (int i = 0; i &lt; a.length; i++) {
            if (findName.equals(a[i])) {
                a[i] = "";
                break;
            }
        }
    }
}
  

  [2019-03-26T11:08:03Z] amirthavalli.r: 
  

  [2019-03-26T12:11:56Z] ramya.a: public class ArrayMin {

    public static void main(String[] args) {
        int a[] = {  23,4, 43, 5,2, 54 };
        int min = a[0];
        int secondMin = a[0];
        for (int i = 0; i &lt; a.length; i++) {

            if (min &gt; a[i]) {
                secondMin = min;
                min = a[i];

                // System.out.println("Min values:" + min);
            }
            // secondMin=min;
            else if (secondMin &gt; a[i]) {
                secondMin = a[i];
                // System.out.println("Min values:" + secondMin);
            }
        }
        System.out.println("Min: " + min);
        System.out.println("SecondMin: " + secondMin);
    }
    // min(a);
}
  

  [2019-03-27T09:47:58Z] prabhakar.g: <http://www.javawithus.com/tutorial/array-of-objects>
  

  [2019-03-27T09:48:07Z] prabhakar.g: <http://www.tutorialdost.com/Java-Programming-Tutorial/15-Java-Array-of-Object.aspx>
  
    ---------------
    | Attachments |
    ---------------
    
    Java Array of Objects
    http://www.tutorialdost.com/Java-Programming-Tutorial/15-Java-Array-of-Object.aspx

    
  

  [2019-03-27T10:05:19Z] prabhakar.g: 
  

  [2019-03-27T11:00:43Z] devi.perinbaraj: import java.util.*;
import java.util.Scanner;

public class FinalAtm{
    static int a[]={1001, 50000};
    public static void main(String[] args){

        selectoptions();

    }

    static void selectoptions(){
        System.out.println("1.withdraw\t2.updatepin");
        Scanner scan= new Scanner(<http://System.in|System.in>);
        int myOption = scan.nextInt();
        switch (myOption){
            case 1:
             withdraw();
            selectoptions();
              break;
            case 2:
            updatepin();
            break;
            default:
            System.out.println("Retry");
            break;

        }
        scan.close();
    }

    static void updatepin(){
        System.out.println("Enter old pin");
        Scanner scan1= new Scanner(<http://System.in|System.in>);
        int oldPin = scan1.nextInt();
        System.out.println("Enter New pin:");
        int newPin = scan1.nextInt();
        for (int i = 0; i &lt; a.length; i++){
        if(oldPin==(a[i])){
            a[i]=newPin;
        System.out.println("Success");
        selectoptions();
        }}
        scan1.close();


    }
    static void withdraw(){
        System.out.println("Enter your pin");
        Scanner inp = new Scanner(<http://System.in|System.in>);
        int pin= inp.nextInt();
        for (int var : a) {
            if (pin==var) {
                System.out.println("Enter Amount");
                int wd = inp.nextInt();
                int c = a[1] - wd;
                System.out.println("Available balance Rs." + c);
            }



        }



 }
}
  

  [2019-03-27T11:39:14Z] devi.perinbaraj: public class Employee_Array {
public static void main(String[] args) {
    Employee employees[]=new Employee[2];
    for (Employee var : employees) {
        System.out.println(var);
    }
    for(int i=0;i&lt;employees.length;i++){
        employees[i]=new Employee();

    }
    for (Employee var : employees) {
        System.out.println(var);
    }
    for(int i=0;i&lt;employees.length;i++){
        employees[i]=new Employee(i,"name"+i);

    }
    for (Employee var : employees) {
        System.out.println(var);
    }

}

}
  

  [2019-03-27T11:39:54Z] hajashariff.a: 
  

  [2019-03-27T12:25:52Z] devi.perinbaraj: import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

class Employee{
    private int id;
   private String name;
   private String update;
   Employee(int id ,String name,String update){
       this.id=id;
       this.name=name;
       this.update=update;

       }
       Employee(){

       }

/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
//@Override
public String toString() {
    return id +" "+ name;
}
/**
 * @return the update
 */
public String getUpdate() {

        return update;
}
/**
 * @param update the update to set
 */
public void setUpdate(int update) {
	this.update = update;
}

}
  

  [2019-03-28T06:25:53Z] prabhakar.g: <https://www.tutorialspoint.com/java/util/java_util_arrays.htm>
  
    ---------------
    | Attachments |
    ---------------
    
    Java.util.Arrays Class
    https://www.tutorialspoint.com/java/util/java_util_arrays.htm

    
  

  [2019-03-28T06:55:20Z] prabhakar.g: 
  

  [2019-03-28T09:01:40Z] swetha.m: <@UHE66045V> has joined the channel
  

  [2019-03-29T04:01:38Z] sanjeevi.p: 
  

  [2019-04-01T09:35:50Z] sasikumar.b: <https://dzone.com/articles/top-10-methods-java-arrays>
  
    ---------------
    | Attachments |
    ---------------
    
    Top 10 Methods for Java Arrays - DZone Java
    https://dzone.com/articles/top-10-methods-java-arrays

    
  

  [2019-04-01T09:35:57Z] sasikumar.b: <https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.8.1>
  

  [2019-04-01T09:37:39Z] sasikumar.b: 
  

  [2019-04-02T04:09:34Z] prabhakar.g: Good Morning
  

  [2019-04-02T04:09:39Z] prabhakar.g: package com.kgisl.qs1;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Hello world!
 *
 */
public class App {
    // static String[] names = new String[2];
    static String[] names ={"element0","element1"};
    public static void main(String[] args) {
        displayNames();
        displayOneName();
        updateName();
        deleteName();
    }

    static void create() {
        System.out.println("create");
    }

    static void displayNames() {
        System.out.println("displayNames");
        System.out.println(ArrayUtils.toString(names));
    }

    static void displayOneName() {
        System.out.println("displayOneName");
        String findName = "element0";
        // System.out.println(ArrayUtils.indexOf(names, findName));
        System.out.println(names[ArrayUtils.indexOf(names, findName)]);
    }

    static void updateName() {
        System.out.println("updateName");
        String findName = "element0";
        String updateName = "element0000";
        //System.out.println(ArrayUtils.indexOf(names, findName));
        names[ArrayUtils.indexOf(names, findName)] = updateName;
        displayNames();
    }

    static void deleteName() {
        System.out.println("deleteName");
        String findName = "element0000";
        // String[] newArray = ArrayUtils.remove(names, ArrayUtils.indexOf(names, findName));
        // System.out.println(ArrayUtils.toString(newArray));
        String[] newArray=ArrayUtils.removeElement(names, findName);
        System.out.println(ArrayUtils.toString(newArray));
    }
}
  

  [2019-04-04T11:35:48Z] giriprasath.j: package com.kgisl.javaarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    static ArrayList&lt;String&gt; names = new ArrayList&lt;String&gt;();
    static ArrayList&lt;String&gt; names1 = new ArrayList&lt;String&gt;();
    static String name1 = "Devi";
    static String name2 = "Kavin";

    public static void main(String[] args) {
        create();
        display();
        getName();
        removeif();
        // removeNameInLastIndex();
        // removeName();
        updateName();
        // display();
        toarray();
        toarrayAsType();
        arrayClone();
        arrayContains();
        clearAll();
    }

    static void create() {
        // names.ensureCapacity(3);
        System.out.println(names.isEmpty());
        names.add("Giri");
        names.add("Sasi");
        names.add("Kannan");
        names.add("Sasi");
        names.add("Gowtham");
        names.add("Sasi");

        names1.add(name1);
        names1.add(name2);

        names.addAll(names1);

    }

    static void display() {
        System.out.println(names);
    }

    static void getName() {
        String findName = "Sasi";
        int findNameIdx = names.indexOf(findName);
        System.out.println(names.get(findNameIdx));
    }

    static void removeName() {
        String findName = "Sasi";
        int findNameIdx = names.indexOf(findName);
        names.remove(findNameIdx);
        System.out.println(names);
    }

    static void removeNameInLastIndex() {
        String findName = "Sasi";
        int findNameIdx = names.lastIndexOf(findName);
        names.remove(findNameIdx);
        System.out.println(names);
    }

    static void updateName() {
        String findName = "Kannan";
        String updateName = "Kannan R";
        int findNameIdx = names.indexOf(findName);
        names.set(findNameIdx, updateName);
        System.out.println(names);
    }

    static void toarray() {
        System.out.println("******** toArray ********");
        Object[] arr = names.toArray();
        System.out.println(Arrays.toString(arr));
    }

    static void toarrayAsType() {
        System.out.println("******** toarrayAsType ********");
        String[] myArray = names.toArray(new String[0]);
        // String[] arr = (String)names.toArray();
        System.out.println(Arrays.toString(myArray));
    }

    static void arrayClone() {
        System.out.println("******** arrayClone ********");
        Object arrayClone = names.clone();
        System.out.println(arrayClone.toString());
    }

    static void arrayContains() {
        String findName = "Sasi 1";
        System.out.println(names.contains(findName));
    }

    static void removeif(){
        System.out.println("******** removeif ********");
        names.removeIf( x -&gt; x == "Sasi" );
        System.out.println(names);
    }

    // static void removeRange(){
    //     System.out.println("******** removeRange ********");
    //     // names.removeRange(1, 4);
    //     // System.out.println(names);
    //     List&lt;Integer&gt; al = new ArrayList&lt;Integer&gt;();
    //     al.add(10);
    //     al.add(20);
    //     al.add(30);
    //     al.add(1);
    //     al.add(2);
    //     al.removeRange(1, 4);
    // }

    static void clearAll() {
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names.isEmpty());
    }

}
  

  [2019-04-04T12:36:18Z] kannan.r: package com.kgisl.pgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App
{ public static void main( String[] args ){

    ArrayList&lt;String&gt;  al = new ArrayList&lt;String&gt;();
    al.add("kannan");
    al.add("nivi");
    al.add("ramya");

    Collections.sort(al);
    System.out.println("sorting A 2 z"+al);
     Collections.sort(al,Collections.reverseOrder()); //reverseOrder
    System.out.println("reverseOrder"+al);

}}
  

  [2019-04-04T13:04:58Z] kannan.r: package com.kgisl.pgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App
{ public static void main( String[] args ){

    ArrayList&lt;String&gt;  al = new ArrayList&lt;String&gt;();
    al.add("kannan");
    al.add("nivi");
    al.add("ramya");
    al.add("mahi");
    al.add("nidhya");
    al.add("mohana");

    System.out.println(al);
     ArrayList &lt;String&gt; sb =new ArrayList&lt;String&gt;();

     System.out.println(al.subList(2,4 ));
     //hear 2is start value and upto 4 index
     System.out.println(al.subList(5,6 ));
}}
  

  [2019-04-05T06:05:30Z] baraneetharan.r: 1. Write a C# Sharp program that takes a number and a width also a number, as input and then displays a triangle of that width, using that number. 
Test Data
Enter a number: 6 
Enter the desired width: 6 
Expected Output :

666666                                                      
66666                                                           
6666                                                                  
666                                                        
66                                                                  
6 

2. Write a C# Sharp program that takes two numbers as input and perform an operation (+,-,*,x,/) on them and displays the result of that operation. 

Test Data
Input first number: 20
Input operation: - 
Input second number: 12
Expected Output :
20 - 12 = 8

3. Write a C# Sharp program to find the largest of three numbers. 
Test Data :
Input the 1st number :25 
Input the 2nd number :63 
Input the 3rd number :10 
Expected Output :
The 2nd Number is the greatest among three

4. Write a C# Sharp program to find the eligibility of admission for a professional course based on the following criteria: 
Marks in Maths &gt;=65
Marks in Phy &gt;=55
Marks in Chem&gt;=50
Total in all three subject &gt;=180
or
Total in Math and Subjects &gt;=140

Test Data : 
Input the marks obtained in Physics :65 
Input the marks obtained in Chemistry :51 
Input the marks obtained in Mathematics :72
Expected Output :
The candidate is eligible for admission.

5. Write a program in C# Sharp which is a Menu-Driven Program to perform a simple calculation. 

Test Date and Expected Output 
Enter the first Integer :10 
Enter the second Integer :2 

Here are the options : 
1-Addition. 
2-Substraction. 
3-Multiplication. 
4-Division. 
5-Exit. 

Input your choice :3 
The Multiplication of 10 and 2 is: 20

6. Write a program in C# Sharp to read n number of values in an array and display it in reverse order. 
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7 
Expected Output: 
The values store into the array are: 
2 5 7 
The values store into the array in reverse are : 
7 5 2

7. Write a program in C# Sharp to find the sum of all elements of the array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 8 
Expected Output : 
Sum of all elements stored in the array is : 15

8. Write a program in C# Sharp to count the frequency of each element of an array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 25 
element - 1 : 12 
element - 2 : 43 
Expected Output : 
Frequency of all elements of array : 
25 occurs 1 times 
12 occurs 1 times 
43 occurs 1 times

9. Write a program in C# Sharp to find maximum and minimum element in an array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 45 
element - 1 : 25 
element - 2 : 21 
Expected Output : 
Maximum element is : 45 
Minimum element is : 21

10. Write a program in C# Sharp to sort elements of the array in descending order. 
Test Data : 
Input the size of array : 3 
Input 3 elements in the array : 
element - 0 : 5 
element - 1 : 9 
element - 2 : 1
Expected Output : 
Elements of the array in sorted descending order: 
9 5 1

11. Write a program in C# Sharp to delete an element at desired position from an array. 
Test Data : 
Input the size of array : 5 
Input 5 elements in the array in ascending order: 
element - 0 : 1 
element - 1 : 2 
element - 2 : 3 
element - 3 : 4 
element - 4 : 5 
Input the position where to delete: 3 
Expected Output : 
The new list is : 1 2 4 5

12. Write a program in C# Sharp to find the second largest element in an array. 
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
  

  [2019-04-05T06:05:30Z] baraneetharan.r: element - 0 : 2 
element - 1 : 9 
element - 2 : 1 
element - 3 : 4 
element - 4 : 6 
Expected Output : 
The Second largest element in the array is: 6
  

  [2019-04-05T11:27:55Z] prabhakar.g: package com.kgisl.ex3;

import java.lang.reflect.Field;
import java.util.ArrayList;
public class Test {

    public static void main(String[] args) throws Exception {
        ArrayList&lt;Integer&gt; list = new ArrayList&lt;Integer&gt;(5);
        for (int i = 0; i &lt; 10; i++) {
            list.add(i);
            System.out.format("Size: %2d, Capacity: %2d%n",
                              list.size(), getCapacity(list));
        }
    }

    static int getCapacity(ArrayList&lt;Integer&gt; list) throws Exception {
        // Field x = Student1.class.getDeclaredField("rollno");
        Field d = ArrayList.class.getDeclaredField("elementData");
        d.setAccessible(true);
        return ((Object[]) d.get(list)).length;
    }
}
  

  [2019-04-08T08:49:28Z] baraneetharan.r: package com.kgisl.qs1;

public class Student {
    private int rollno;
    private String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the rollno
     */
    public int getRollno() {
        return rollno;
    }

    /**
     * @param rollno the rollno to set
     */
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "rollno:" + rollno + " name:" + name;
    }
}
  

  [2019-04-08T08:49:39Z] baraneetharan.r: package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static ArrayList&lt;Student&gt; studentList = new ArrayList&lt;Student&gt;();
    static Student newStudent=new Student(502, "name");
    static Student updateStudent=new Student(502, "updatename");
    public static void main(String[] args) {
        StudentDemo s=new StudentDemo();
        s.loadStudents();
        s.getAllStudents();
        s.getStudent(12);
        s.newStudent(newStudent);
        s.updateStudent(502,updateStudent);
        s.removeStudent(101);
    }

    StudentDemo(){
        loadStudents();
    }

    public void loadStudents() {
        studentList.add(new Student(101, "ramu"));
        studentList.add(new Student(12, "Divya"));
        studentList.add(new Student(11, "Janani"));
    }

    public List&lt;Student&gt; getAllStudents() {
        System.out.println(studentList);
        return studentList;
    }

    public Student getStudent(int rollno) {
        for (Student student : studentList) {
            if (student.getRollno() == rollno) {
                System.out.println(String.valueOf(student.getRollno())+student.getName());
                return student;
            }
        }

        return getStudent(0);

    }

    public void newStudent(Student student) {
        studentList.add(newStudent);
        getAllStudents();
        System.out.println(studentList);
    }

    public void updateStudent(int rollno, Student updateStudent) {
        for (Student student : studentList) {
            if (student.getRollno() == rollno) {
                System.out.println(studentList.indexOf(student));
                studentList.set(studentList.indexOf(student),updateStudent);
            }
        }
        getAllStudents();
        System.out.println(studentList);
    }

    public void removeStudent(int rollno) {
        for (Student student : studentList) {
            if (student.getRollno() == rollno) {
                System.out.println(studentList.indexOf(student));
                studentList.remove(studentList.indexOf(student));
            }
            break;
        }
        getAllStudents();
        System.out.println(studentList);
    }

}
  

  [2019-04-09T06:32:01Z] baraneetharan.r: <https://howtodoinjava.com/junit-4/>
  
    ---------------
    | Attachments |
    ---------------
    
    JUnit Tutorial - HowToDoInJava
    https://howtodoinjava.com/junit-4/

    
  

  [2019-04-09T10:02:16Z] sasikumar.b: package com.kgisl.qs1;

/**
 * Calculator
 */
public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }
    public int sub(int x, int y) {
        return x - y;
    }
    public int mul(int x, int y) {
        return x * y;
    }
    public int div(int x, int y) {
        return x / y;
    }
}


package com.kgisl.qs1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * CalculatorTest
 */
public class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    public void addTest() {
        int actual=c.add(10, 20);
        int expected=30;
        assertEquals(expected, actual);
    }

    @Test
    public void subTest() {
        int actual=c.sub(10, 20);
        int expected=-10;
        assertEquals(expected, actual);
    }

    @Test
    public void mulTest() {
        int actual=c.mul(10, 20);
        int expected=200;
        assertEquals(expected, actual);
    }

    @Test
    public void divTest() {
        int actual=c.div(100, 20);
        int expected=5;
        assertEquals(expected, actual);
    }
}


package com.kgisl.qs1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * CalculatorTest
 */
@RunWith(Parameterized.class)
public class CalculatorParamsTest {
    private int fn;
    private int sn;

    Calculator c = new Calculator();

    public CalculatorParamsTest(int fn, int sn) {
        this.fn = fn;
        <http://this.sn|this.sn> = sn;
    }

    @Parameters
    public static Collection input() {

        return Arrays.asList(new Object[][] { { 10, 20 }, { 30, 40 } });
    }

    @Test
    public void addTest() {
        int actual = c.add(fn, sn);
        int expected = fn + sn;
        assertEquals(expected, actual);
    }

    @Test
    public void subTest() {
        int actual = c.sub(fn, sn);
        int expected = fn - sn;
        assertEquals(expected, actual);
    }

    @Test
    public void mulTest() {
        int actual = c.mul(fn, sn);
        int expected = fn * sn;
        assertEquals(expected, actual);
    }

    @Test
    public void divTest() {
        // int actual = c.div(fn, sn);
        // int expected = fn/sn;
        // assertEquals(expected, actual);
        System.out.println(fn);
        System.out.println(sn);
        int actual = c.div(fn, sn);
        int expected = 10 / 20;
        assertEquals(expected, actual);
    }
}
  

  [2019-04-09T11:36:07Z] baraneetharan.r: By default maven uses maven-surefire-plugin:2.12.4. Some of the maven commands may not work with the following error.
**********************************************************************************
Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test
**********************************************************************************

Add the following plugin to get rid of this error


&lt;plugin&gt;
        &lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;
        &lt;artifactId&gt;maven-surefire-plugin&lt;/artifactId&gt;
        &lt;version&gt;3.0.0-M3&lt;/version&gt;
&lt;/plugin&gt;


Maven commands to run test classes and methods
**********************************************
Run all test methods with in test package
mvn test

Run all test methods in a class
mvn -Dtest=StudentDemoTest test

Run one test method in a class
mvn -Dtest=StudentDemoTest#getAllStudentsTest test

Run multiple test methods in a class
mvn -Dtest=StudentDemoTest#getAllStudentsTest+getStudentTest test

Run all test methods in multiple test classes
mvn -Dtest="StudentDemoTest,CalculatorTest" test

Run selected test methods in multiple test classes
mvn -Dtest="StudentDemoTest#getAllStudentsTest+getStudentTest,CalculatorTest" test

Run all test methods in multiple test classes using expression
mvn -Dtest="*Test" test

Run all test Clases from subdirectory, eg: /doc/ You can use command:
mvn -Dtest=*/doc/* test
  

  [2019-04-09T11:37:31Z] baraneetharan.r: 
  

  [2019-04-09T12:02:23Z] baraneetharan.r: <https://www.guru99.com/junit-parameterized-test.html>
  
    ---------------
    | Attachments |
    ---------------
    
    JUnit Parameterized Test with Example using @Parameters
    https://www.guru99.com/junit-parameterized-test.html

    
  

  [2019-04-09T12:07:05Z] baraneetharan.r: A static method belongs to the class rather than object of a class. A static method invoked without the need for creating an instance of a class. static method can access static data member and can change the value of it.

  

  [2019-04-09T12:08:53Z] baraneetharan.r: <https://www.geeksforgeeks.org/static-methods-vs-instance-methods-java/>
  
    ---------------
    | Attachments |
    ---------------
    
    Static methods vs Instance methods in Java - GeeksforGeeks
    https://www.geeksforgeeks.org/static-methods-vs-instance-methods-java/

    
  

  [2019-04-09T12:36:03Z] baraneetharan.r: Do it Yourself
  

  [2019-04-09T12:36:04Z] baraneetharan.r: Create ArrayList from array

How do You remove repeated elements from ArrayList?
  

  [2019-04-10T08:49:51Z] baraneetharan.r: Java - Method executed prior to Default Constructor
***************************************************
public class ChkCons {

    int var = getVal();

    ChkCons() {
        System.out.println("I'm Default Constructor.");
    }

    public int getVal() {
        System.out.println("I'm in Method.");
        return 10;
    }

    public static void main(String[] args) {

        ChkCons c = new ChkCons();

    }

}
OUTPUT :

I'm in Method.
I'm Default Constructor.

Instance variable initialization expressions such as int var = getVal(); are evaluated after the super class constructor is executed but prior to the execution of the current class constructor's body.
Therefore getVal() is called before the body of the ChkCons constructor is executed

In what order do static blocks and initialization blocks execute when using inheritance?
****************************************************************************************
public class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
    static {
        System.out.println("Parent static block");
    }
    {
        System.out.println("Parent initialisation  block");
    }
}

public class Child extends Parent {
    {
        System.out.println("Child initialisation block");
    }
    static {
        System.out.println("Child static block");
    }

    public Child() {
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) {
        new Child();
    }
}
The output of the above code will be

Parent static block
Child static block
Parent initialization  block
Parent Constructor
Child initialization block
Child Constructor

There are several rules in play

static blocks are always run before the object is created, so that's why you see print messages from both parents and child static blocks
now, when you are calling constructor of the subclass (child), then this constructor implicitly calls super(); before executing it's own constructor. Initialization block comes into play even before the constructor call, so that's why it is called first. So now your parent is created and the program can continue creating child class which will undergo the same process.

Explanations:

Static block of parent is executed first because it is loaded first and static blocks are called when the class is loaded.
  

  [2019-04-10T08:50:53Z] baraneetharan.r: 
  

  [2019-04-10T11:58:40Z] baraneetharan.r: import static org.junit.Assert.assertEquals;

// import static junit.framework.Assert.assertEquals;

******************************************************************************************

JUnit 3.X: junit.framework.Assert

JUnit 4.X: org.junit.Assert

Prefer the newest one, especially when running JDK5 and higher with annotation support.

******************************************************************************************

The old method (of JUnit 3) was to mark the test-classes by extending junit.framework.TestCase. That inherited junit.framework.Assert itself and your test class gained the ability to call the assert methods this way.
Since version 4 of JUnit, the framework uses Annotations for marking tests. So you no longer need to extend TestCase. But that means, the assert methods aren't available. But you can make a static import of the new Assert class. That's why all the assert methods in the new class are static methods. So you can import it this way:

import static org.junit.Assert.*;
After this static import, you can use this methods without prefix.

At the redesign they also moved to the new package org.junit that follows better the normal conventions for package naming.

******************************************************************************************
  

  [2019-04-11T10:42:15Z] baraneetharan.r: Do it Yourself
  

  [2019-04-11T10:42:17Z] baraneetharan.r: Combine two arraylists
find unique values
find common values
Collection&lt;String&gt; listOne = new ArrayList(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
Collection&lt;String&gt; listTwo = new ArrayList(Arrays.asList("a", "b", "d", "e", "f", "gg", "h"));
  

  [2019-04-11T11:07:50Z] baraneetharan.r: <https://git-scm.com/download/win>
  

  [2019-04-12T04:30:11Z] baraneetharan.r: import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class HowForEachWorks1 {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        List&lt;Integer&gt; numberList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (Integer i : numberList) {
            if ((i &amp; 1)==0) {
                System.out.println(i);
            }

        }
    }

}
  

  [2019-04-12T05:39:55Z] baraneetharan.r: <https://image.slidesharecdn.com/java8-141003090600-phpapp02/95/functional-java-8-in-everyday-life-9-638.jpg?cb=1412327296>
  
    ---------------
    | Attachments |
    ---------------
    
    
    

    
  

  [2019-04-12T06:04:06Z] baraneetharan.r: <https://www.slideshare.net/martyhall/java-8-tutorial-streams-part-1>
  
    ---------------
    | Attachments |
    ---------------
    
    Java 8 Tutorial: Streams Part 1
    https://www.slideshare.net/martyhall/java-8-tutorial-streams-part-1

    
  

  [2019-04-12T06:04:19Z] baraneetharan.r: <https://www.javatpoint.com/java-8-stream>
  
    ---------------
    | Attachments |
    ---------------
    
    Java 8 Stream - javatpoint
    https://www.javatpoint.com/java-8-stream

    
  

  [2019-04-12T06:04:36Z] baraneetharan.r: <https://2.bp.blogspot.com/-tFyvqQwhpFQ/WZp6467TqrI/AAAAAAAAPnY/AfdnCrqViQ4dJQ6jUAXnF-thOTuT-apYQCLcBGAs/s640/What%2Bare%2Bthe%2Bcore%2Bstream%2Boperations%2Bof%2BJava%2B8%2BStream%2B%2BStreams%2Bin%2BJava%2B8.jpg>
  
    ---------------
    | Attachments |
    ---------------
    
    
    

    
  

  [2019-04-12T06:05:08Z] baraneetharan.r: import java.util.*;
import java.util.Arrays;
import java.util.function.Consumer;

class HowForEachWorks {

    public static void main(String[] args) {
        List&lt;String&gt; disneyCharacters = Arrays.asList("Micky", "Donald", "Minnie", "Aurora", "Winnie", "Pluto");

        /*Consumer&lt;String&gt; con = new Consumer&lt;String&gt;() {
            public void accept(String s) {
                System.out.println(s);
            }
        };*/

        //Consumer&lt;String&gt; con = s -&gt; System.out.println(s);
        //disneyCharacters.forEach(con);
        //disneyCharacters.forEach(s-&gt;System.out.println(s));


        // call by method
        disneyCharacters.forEach(System.out::println);

    }
}
```

```
package com.kg.lambdaapp;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class HowForEachWorks1 {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        List&lt;Integer&gt; numberList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (Integer i : numberList) {
            if ((i &amp; 1)==0) {
                System.out.println(i);
            }

        }
    }

}
```
  

  [2019-04-12T06:05:41Z] baraneetharan.r: This is classic OOP style of hiding method implementations from the caller.
The caller simply passes a variable to the method which then does something with the value of the variable
and returns another value or produces a side effect as it is in our case.


class LambdaDemo {

    public void printSomething(String something) {
        System.out.println(something);
    }

    public static void main(String[] args) {
        LambdaDemo lambdaDemo = new LambdaDemo();
        String something = "Learning Lambda";
        lambdaDemo.printSomething(something);
    }
}


see an equivalent implementation that uses behavior passing other than variable passing.
To achieve this, we have to create a functional interface that defines that abstracts the behavior instead of a method.
A functional interface is an interface that has only one method:

package com.kg.lambdaapp;

interface Printer {
    void print(String val);
}

class LambdaDemo {

    public void printSomething(String something, Printer printer) {
        //System.out.println(something);
        printer.print(something);
    }

    public static void main(String[] args) {
        LambdaDemo lambdaDemo = new LambdaDemo();
        Printer printer = new Printer() {
            @Override
            public void print(String val) {
                System.out.println(val);
            }
        };
        String something = "Learning Lambda";
        lambdaDemo.printSomething(something, printer);
    }
}

public void print(String toPrint) {
                System.out.println(toPrint);
            }

lambda expressions

package com.kg.lambdaapp;

interface Printer {
    void print(String val);
}

class LambdaDemo {

    public void printSomething(String something, Printer printer) {
        //System.out.println(something);
        printer.print(something);
    }

    public static void main(String[] args) {
        LambdaDemo lambdaDemo = new LambdaDemo();
        Printer printer = (String toPrint) -&gt; {
                System.out.println(toPrint);

        };
        String something = "Learning Lambda";
        lambdaDemo.printSomething(something, printer);
    }
}

(String toPrint) -&gt; {
                System.out.println(toPrint);

        }
  

  [2019-04-12T06:05:55Z] baraneetharan.r: <https://beginnersbook.com/2017/10/java-8-interface-changes-default-method-and-static-method/>
  
    ---------------
    | Attachments |
    ---------------
    
    Java 8 Interface Changes � default method and static method
    https://beginnersbook.com/2017/10/java-8-interface-changes-default-method-and-static-method/

    
  

  [2019-04-15T04:00:40Z] baraneetharan.r: 
  

  [2019-04-15T05:25:20Z] baraneetharan.r: 
  

  [2019-04-15T05:34:19Z] baraneetharan.r: Do it Yourself
  

  [2019-04-15T05:34:20Z] baraneetharan.r: concurrency, parallelism, thread and process
socket vs port

find odd even in single line java
  

  [2019-04-15T09:42:50Z] baraneetharan.r: import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * LambdaDemo
 */
public class LambdaDemo1 {
    public static void main(String[] args) {

        List&lt;Integer&gt; numberList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate&lt;Integer&gt; odd=new Predicate&lt;Integer&gt;() {
            @Override
            public boolean test(Integer t) {
                return t%2!=0;
            }
        };

        // Predicate&lt;Integer&gt; odd=x-&gt;x%2!=0;
        // Predicate&lt;Integer&gt; even=x-&gt;x%2==0;

        numberList.stream().filter(odd).forEach(System.out::println);
        numberList.stream().filter(odd.negate()).forEach(System.out::println);
    }


}
  

  [2019-04-15T10:55:52Z] baraneetharan.r: *Comparable*

A comparable object is capable of comparing itself with another object. The class itself must implements the java.lang.Comparable interface in order to be able to compare its instances.

*Comparator*

A comparator object is capable of comparing two different objects. The class is not comparing its instances, but some other class�s instances. This comparator class must implement the java.util.Comparator interface.

<https://www.javatpoint.com/Comparator-interface-in-collection-framework>
<https://www.javatpoint.com/difference-between-comparable-and-comparator>

<https://www.digizol.com/2008/07/java-sorting-comparator-vs-comparable.html>
  
    ---------------
    | Attachments |
    ---------------
    
    Java Comparator - javatpoint
    https://www.javatpoint.com/Comparator-interface-in-collection-framework

    
    Difference between Comparable and Comparator - javatpoint
    https://www.javatpoint.com/difference-between-comparable-and-comparator

    
    Java Sorting: Comparator vs Comparable Tutorial
    https://www.digizol.com/2008/07/java-sorting-comparator-vs-comparable.html

    
  

  [2019-04-16T03:41:55Z] baraneetharan.r: <https://docs.oracle.com/javase/8/docs/api/?java/lang/FunctionalInterface.html>
  

  [2019-04-16T05:45:08Z] baraneetharan.r: JSR
JCP
JEP

Java 8 vs java 9
open jdk vs oracle jdk
Java 8 / 9 features
  

  [2019-04-17T04:10:35Z] baraneetharan.r: Do it Yourself
  

  [2019-04-17T04:10:35Z] baraneetharan.r: id, name, college, department, year, mark1, mark2, mark3

First 3 colleges
Last 3 colleges
College wise toppers
Top 3 departments
Department wise average
  

  [2019-04-17T04:23:40Z] baraneetharan.r: <https://blog.idrsolutions.com/2015/02/java-8-method-references-explained-5-minutes/>
  
    ---------------
    | Attachments |
    ---------------
    
    Java 8 Method References explained in 5 minutes
    https://blog.idrsolutions.com/2015/02/java-8-method-references-explained-5-minutes/

    
  

  [2019-04-17T09:02:35Z] baraneetharan.r: *Spread Syntax*
Take a look at how the spread syntax can spread an array

var parts = ['shoulders', 'knees'];
var lyrics = ['head', ...parts, 'and', 'toes']; // ["head", "shoulders", "knees", "and", "toes"]
  

  [2019-04-17T09:03:30Z] baraneetharan.r: <https://stackoverflow.com/questions/26684562/whats-the-difference-between-map-and-flatmap-methods-in-java-8>
  
    ---------------
    | Attachments |
    ---------------
    
    What's the difference between map and flatMap methods in Java 8?
    https://stackoverflow.com/questions/26684562/whats-the-difference-between-map-and-flatmap-methods-in-java-8

    
  

  [2019-04-17T09:04:12Z] baraneetharan.r: *Java 8 Optional Class*
  

  [2019-04-17T09:04:15Z] baraneetharan.r: <https://www.tutorialspoint.com/java8/java8_optional_class.htm>
<https://beginnersbook.com/2017/10/java-8-optional-class/>
  
    ---------------
    | Attachments |
    ---------------
    
    Java 8 Optional Class
    https://www.tutorialspoint.com/java8/java8_optional_class.htm

    
    Java 8 Optional Class
    https://beginnersbook.com/2017/10/java-8-optional-class/

    
  

  [2019-04-24T04:04:10Z] baraneetharan.r: CAPITALIZATION OF IDENTIFIERS
There are two standard capitalization patterns for identifiers, particularly �multiple
word� identifiers:
camel case: First word begins with a lowercase letter, additional words begin
with uppercase letters (finalTotal)
Pascal case: All words begin with an uppercase letter (FinalTotal)
The code in this chapter uses the following convention for creating identifiers (examples included):
Simple variables � camel case: speed, time, finalTotal
Named constants - all uppercase: PI, FREEZING_POINT
Method names � camel case: myMethod, getInput
Class names � Pascal case: MyClass
Object names � camel case: myObject
The underscore character is not used except for named constants. Occasionally, however,
we�ll use single capital letters for identifiers in quick code fragments.
  

  [2019-04-24T09:00:36Z] baraneetharan.r: <https://github.com/baraneetharan/javatest/blob/master/javatest>
  
    ---------------
    | Attachments |
    ---------------
    
    baraneetharan/javatest
    https://github.com/baraneetharan/javatest/blob/master/javatest

    
  

  [2019-04-24T12:56:08Z] baraneetharan.r: set HTTP_PROXY=<http://10.100.1.124:3128>
set HTTPS_PROXY=<http://10.100.1.124:3128>

git config --global http.proxy 10.100.1.124:3128
git config --global https.proxy 10.100.1.124:3128

npm config set proxy <http://10.100.1.124:3128>
npm config set https-proxy <http://10.100.1.124:3128>
  

  [2019-04-26T13:03:02Z] baraneetharan.r: <https://github.com/baraneetharan/javatest>
  
    ---------------
    | Attachments |
    ---------------
    
    baraneetharan/javatest
    https://github.com/baraneetharan/javatest

    
  

  [2019-04-26T13:04:13Z] baraneetharan.r: git push -f origin &lt;branch&gt;

git rm -r dependency-reduced-pom.xml
git commit -m "Remove dependency-reduced-pom.xml"
git push -u origin master
  

  [2019-04-26T13:04:55Z] baraneetharan.r: 
  

  [2019-04-29T04:44:06Z] sasikumar.b: <https://www.testingexcellence.com/4-different-ways-iterate-map-java/>
  
    ---------------
    | Attachments |
    ---------------
    
    Different Ways to Iterate Through a Map in Java Including Java 8 ForEach
    https://www.testingexcellence.com/4-different-ways-iterate-map-java/

    
  

  [2019-04-29T04:44:21Z] sasikumar.b: <https://www.geeksforgeeks.org/iterate-map-java/>
  
    ---------------
    | Attachments |
    ---------------
    
    How to iterate any Map in Java - GeeksforGeeks
    https://www.geeksforgeeks.org/iterate-map-java/

    
  

  [2019-04-29T04:45:14Z] sasikumar.b: <https://stackoverflow.com/questions/36782231/printing-a-java-map-mapstring-object-how>
  
    ---------------
    | Attachments |
    ---------------
    
    Printing a java map Map - How?
    https://stackoverflow.com/questions/36782231/printing-a-java-map-mapstring-object-how

    
  

  [2019-04-29T05:43:47Z] baraneetharan.r: <https://docstore.mik.ua/orelly/java-ent/jnut/figs/JN3_1101.gif>
<https://javarevisited.blogspot.com/2011/12/read-and-write-text-file-java.html>
<https://www.geeksforgeeks.org/file-handling-in-java-with-crud-operations/>
<http://www.authorstream.com/Presentation/AANILL-2976585-day-io-streams/>
<https://www.mkyong.com/tutorials/java-io-tutorials/>
  

  [2019-04-29T05:57:55Z] baraneetharan.r: <https://www.javatpoint.com/java-file-class>
<https://www.javatpoint.com/java-fileinputstream-class>
<https://www.javatpoint.com/java-fileoutputstream-class>
  
    ---------------
    | Attachments |
    ---------------
    
    Java File Class - javatpoint
    https://www.javatpoint.com/java-file-class

    
    Java FileInputStream Class - javatpoint
    https://www.javatpoint.com/java-fileinputstream-class

    
    Java FileOutputStream Class - javatpoint
    https://www.javatpoint.com/java-fileoutputstream-class

    
  

  [2019-04-29T06:01:38Z] ramya.a: File Read and Write:
  

  [2019-04-29T06:01:42Z] ramya.a: package com.kgisl.data;

import java.io.*;

public class FileRead {
    public static void main(String[] args) throws Exception {
        File f = new File("D:\\Ramya\\ReadFiles.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        String str = "File writing here";
        FileWriter fw = new FileWriter("D:\\Ramya\\wirten2.txt");
        for (int i = 0; i &lt; str.length(); i++) {
            fw.write(str);
            System.out.println("Successfully written..");
            fw.close();
        }
    }
}
  

  [2019-04-29T10:10:19Z] jeevitha.yuvaraj: <@UHXJZBPTM> has joined the channel
  

  [2019-04-30T06:58:09Z] baraneetharan.r: <https://stackabuse.com/libraries-for-reading-and-writing-csvs-in-java/>
<https://stackabuse.com/reading-and-writing-csvs-in-java/>
<https://www.journaldev.com/12014/opencsv-csvreader-csvwriter-example>
  
    ---------------
    | Attachments |
    ---------------
    
    Libraries for Reading and Writing CSVs in Java
    https://stackabuse.com/libraries-for-reading-and-writing-csvs-in-java/

    
    Reading and Writing CSVs in Java
    https://stackabuse.com/reading-and-writing-csvs-in-java/

    
    OpenCSV CSVReader CSVWriter Example - JournalDev
    https://www.journaldev.com/12014/opencsv-csvreader-csvwriter-example

    
  

  [2019-04-30T10:46:47Z] baraneetharan.r: import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
* Scanner1
*/
public class Scanner1 {

   public static void main(String[] args) {
       String file = "sample.txt";
       FileReader fr;
       try {
           fr = new FileReader(file);
           BufferedReader buffer = new BufferedReader(fr);
           String line;
           long length = 0;
           try {
               while ((line = buffer.readLine()) != null) {
                   if (line.isEmpty()) {
                       break;
                   }
                   System.out.println(line);
                   length += line.length();
               }
           } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
       } catch (FileNotFoundException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }

   }
}







import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
* Scanner1
*/
public class Scanner1 {

   public static void main(String[] args) {
       String file = "sample.txt";
       FileReader fr;
       try {
           fr = new FileReader(file);
           BufferedReader buffer = new BufferedReader(fr);
           String line;
           long length = 0;
           String[] data1 = null;
           try {
               while ((line = buffer.readLine()) != null) {
                   // if (line.isEmpty()) {
                   // break;
                   // }
                   data1 = line.split(",");
                   for (String var : data1) {
                       System.out.println(var);
                   }
                   length += line.length();
               }

           } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
       } catch (FileNotFoundException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }

   }
}
  

  [2019-05-02T07:25:14Z] baraneetharan.r: String line;
          long length = 0;
          String[] data1 = null;
          try {
              while ((line = buffer.readLine()) != null) {
                  // if (line.isEmpty()) {
                  // break;
                  // }
                  data1 = line.split(",");
                  for (String var : data1) {
                      System.out.println(var);
                  }
                  length += line.length();
              }
			  
<https://stackabuse.com/reading-and-writing-csvs-in-java/>
<https://www.callicoder.com/assets/images/post/large/apache-poi-classes-and-interfaces.jpg>
<https://www.guru99.com/images/AdvanceSelenium/071514_0711_AllAboutExc5.png>
<https://en.wikipedia.org/wiki/Apache_POI>
<https://poi.apache.org/components/spreadsheet/>
<https://howtodoinjava.com/apache-commons/readingwriting-excel-files-in-java-poi-tutorial/>
  

  [2019-05-02T07:25:23Z] baraneetharan.r: &lt;dependency&gt;
      &lt;groupId&gt;org.apache.poi&lt;/groupId&gt;
      &lt;artifactId&gt;poi-ooxml&lt;/artifactId&gt;
      &lt;version&gt;4.1.0&lt;/version&gt;
    &lt;/dependency&gt;
  

  [2019-05-02T07:26:31Z] baraneetharan.r: ApachePOIRead
  

  [2019-05-02T08:51:00Z] baraneetharan.r: new File("D:\\baranee\\java\\mavenprojects\\excelpoi\\src\\main\\resources\\Book1.xlsx"));
new File("src/main/resources/Book1.xlsx"));
enum in java
<https://www.geeksforgeeks.org/enum-in-java/>
cell.getCellType()
  
    ---------------
    | Attachments |
    ---------------
    
    enum in Java - GeeksforGeeks
    https://www.geeksforgeeks.org/enum-in-java/

    
  

  [2019-05-03T04:42:14Z] baraneetharan.r: package com.kgisl.excelpoi;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * WriteExcelFile
 */
public class WriteExcelFile {

    public static void main(String[] args) {
        // Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Employee Data");

        // This data needs to be written (Object[])
        Map&lt;String, Object[]&gt; data = new TreeMap&lt;String, Object[]&gt;();
        data.put("1", new Object[] { "ID", "NAME", "LASTNAME", "M1", "M2", "M3" });
        data.put("2", new Object[] { 1, "Amit", "Shukla", 10, 20, 30 });
        data.put("3", new Object[] { 2, "Lokesh", "Gupta", 15, 25, 35 });
        data.put("4", new Object[] { 3, "John", "Adwards", 20, 30, 40 });
        data.put("5", new Object[] { 4, "Brian", "Schultz", 30, 35, 45 });

        // Row header = sheet.createRow(0);
        // header.createCell(4).setCellValue("Total");
        // // Row dataRow = sheet.createRow(1);

        // // dataRow.createCell(4).setCellFormula("A2*B2*C2");

        // // sheet.getRow(17).createCell(4);
        // // sheet.getRow(17).getCell(4).setCellValue("NEWCOLUMN");

        // Iterate over data and write to sheet
        Set&lt;String&gt; keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;

            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
            // Cell newcell = row.createCell(row.getLastCellNum(), CellType.STRING);
            Cell totcell = row.createCell(row.getLastCellNum(), CellType.NUMERIC);
            if (row.getRowNum() == 0) {
                totcell.setCellValue("Total");
            } else {
                // totcell.setCellFormula("SUM(D2:F2)");
                double m1 = row.getCell(3).getNumericCellValue();
                double m2 = row.getCell(4).getNumericCellValue();
                double m3 = row.getCell(5).getNumericCellValue();
                totcell.setCellValue(m1+m2+m3);;
            }
        }
        try {
            // Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("writeexcel.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("File written successfully on disk.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
  

  [2019-05-03T09:20:07Z] baraneetharan.r: Conditional Formatting
  

  [2019-05-03T09:20:08Z] baraneetharan.r: public static void formatting(){
        SheetConditionalFormatting sheetCF = sheet.getSheetConditionalFormatting();

        // //Condition 1: Cell Value Is   greater than  70   (Blue Fill)
        // ConditionalFormattingRule rule1 = sheetCF.createConditionalFormattingRule(<http://ComparisonOperator.GT|ComparisonOperator.GT>, "70");
        // PatternFormatting fill1 = rule1.createPatternFormatting();
        // fill1.setFillBackgroundColor(IndexedColors.BLUE.index);
        // fill1.setFillPattern(PatternFormatting.SOLID_FOREGROUND);

        //Condition 2: Cell Value Is  less than      50   (Green Fill)
        ConditionalFormattingRule rule2 = sheetCF.createConditionalFormattingRule(<http://ComparisonOperator.LT|ComparisonOperator.LT>, "40");
        PatternFormatting fill2 = rule2.createPatternFormatting();
        fill2.setFillBackgroundColor(IndexedColors.RED.index);
        fill2.setFillPattern(PatternFormatting.SOLID_FOREGROUND);

        CellRangeAddress[] regions = {
                CellRangeAddress.valueOf("D1:D5"),CellRangeAddress.valueOf("E1:E5"),CellRangeAddress.valueOf("F1:F5")
        };

        sheetCF.addConditionalFormatting(regions,  rule2);

    }
  

  [2019-05-03T12:58:31Z] baraneetharan.r: 
  

  [2019-05-03T12:58:54Z] baraneetharan.r: package com.kgisl.excelpoi;

/**
 * Marks
 */
public class Marks {

    private int id;
    private String name;
    private String college;
    private String department;
    private int year;
    private int mark1;
    private int mark2;
    private int mark3;

    Marks() {
    }

    Marks(int id, String name, String college, String department, int year, int mark1, int mark2, int mark3) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.department = department;
        this.year = year;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * @param college the college to set
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the mark1
     */
    public int getMark1() {
        return mark1;
    }

    /**
     * @param mark1 the mark1 to set
     */
    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    /**
     * @return the mark2
     */
    public int getMark2() {
        return mark2;
    }

    /**
     * @param mark2 the mark2 to set
     */
    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    /**
     * @return the mark3
     */
    public int getMark3() {
        return mark3;
    }

    /**
     * @param mark3 the mark3 to set
     */
    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + college + " " + department + " " + year + " " + mark1 + " " + mark2 + " "
                + mark3;
    }
}
  

  [2019-05-03T12:59:30Z] baraneetharan.r: 
  

  [2019-05-03T13:00:11Z] baraneetharan.r: outputfile
  

  [2019-05-06T06:13:36Z] manimekalai.k: // Create headerRow cells
        for (int i = 0; i &lt; columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
        }

        // sort by result
        markList.sort(Comparator.comparing(Marks::result));
        markList.forEach(System.out::println);

        // Construct data cells
        int rowNum = 1;
  

  [2019-05-06T06:27:05Z] manimekalai.k: // sort by result
        markList.sort(Comparator.comparing(Marks::result));
        // markList.forEach(System.out::println);

        markList.removeIf(x -&gt; x.result().equals("fail"));
        // Construct data cells
        int rowNum = 1;
  

  [2019-05-07T04:57:32Z] baraneetharan.r: <https://i2.wp.com/www.knowledgewala.com/wp-content/uploads/2016/07/JDBC-Architecture.gif?resize=613%2C502>
<http://www.ntu.edu.sg/home/ehchua/programming/java/images/JDBC_Cycle.png>
<http://www.benchresources.net/wp-content/uploads/2016/05/4-Java-JDBC-Database-URL-explanation-diagrammetrically-oracle.png>
<http://www.ntu.edu.sg/home/ehchua/programming/java/jdbc_basic.html>
<https://javaconceptoftheday.com/wp-content/uploads/2015/07/executeQueryVSexecuteUpdateVSexecute.png>
<https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.16>
drivermanager vs datasource
create statement vs prepared statement
  

  [2019-05-07T10:21:57Z] baraneetharan.r: <https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples>
  
    ---------------
    | Attachments |
    ---------------
    
    Java Singleton Design Pattern Example Best Practices - JournalDev
    https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples

    
  

  [2019-05-07T10:22:12Z] baraneetharan.r: <http://www.kubikvirrey2.com/wp-content/uploads/2018/10/design-patterns-java-design-pattern-and-implementation-of-singleton-design-pattern-in.png>
  
    ---------------
    | Attachments |
    ---------------
    
    
    

    
  

  [2019-05-08T07:33:48Z] baraneetharan.r: Unit test : 2, Integration test : 0
  

  [2019-05-08T08:40:53Z] giriprasath.j: package com.kgisl.junit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * DataSourceExample
 */
public class DataSourceExample {
    Connection connection = null;
    // BasicDataSource bdSource = new BasicDataSource();
    MysqlDataSource bdSource = new MysqlDataSource();

    DataSourceExample() {
        // Set dataSource Properties

        // bdSource.setDriverClassName("com.mysql.jdbc.Driver");
        // bdSource.setUrl("jdbc:<mysql://localhost:3306/giriprasath%22|mysql://localhost:3306/giriprasath">);
        // bdSource.setUsername("root");
        // bdSource.setPassword("");

        bdSource.setServerName("localhost");
        bdSource.setPortNumber(3306);
        bdSource.setDatabaseName("giriprasath");
        bdSource.setUser("root");
        bdSource.setPassword("");

    }

    public static void main(String[] args) throws SQLException {
        display();
        delete();
        display();
        insert();
        display();
        update();
        display();
    }

    public static void display() throws SQLException {
        DataSourceExample dsExample = new DataSourceExample();
        Connection con = dsExample.createConnection();
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM student";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println("Name- " + rs.getString("Name") + ", RollNo- " + rs.getInt("RollNo") + ", Dept- "
                    + rs.getString("Dept") + ", College- " + rs.getString("College"));
        }
        rs.close();
        stmt.close();
        con.close();

    }

    public static void insert() throws SQLException {
        String query = "insert into student values ('Gone Fishing', 3001, 'IT', 'KITE')";
        System.out.println("\nThe SQL statement is: " + query + "\n"); // Echo for debugging
        DataSourceExample dsExample = new DataSourceExample();
        Connection con = dsExample.createConnection();
        Statement stmt = con.createStatement();
        int countInserted = stmt.executeUpdate(query);
        System.out.println(countInserted + " records inserted.\n");

        stmt.close();
        con.close();
    }

    public static void delete() throws SQLException {
        String query = "delete from student where RollNo =3001";
        System.out.println("\nThe SQL statement is: " + query + "\n"); // Echo for debugging
        DataSourceExample dsExample = new DataSourceExample();
        Connection con = dsExample.createConnection();
        Statement stmt = con.createStatement();
        int countDeleted = stmt.executeUpdate(query);
        System.out.println(countDeleted + " records deleted.\n");

        stmt.close();

    }

    public static void update() throws SQLException {
        String query = "update student set Name='GiriPrasath' where RollNo =1001";
        System.out.println("\nThe SQL statement is: " + query + "\n"); // Echo for debugging
        DataSourceExample dsExample = new DataSourceExample();
        Connection con = dsExample.createConnection();
        Statement stmt = con.createStatement();
        int countDeleted = stmt.executeUpdate(query);
        System.out.println(countDeleted + " records updated.\n");

        stmt.close();

    }

    private Connection createConnection() {
        Connection con = null;
        try {

            con = bdSource.getConnection();
        } catch (Exception e) {
            System.out.println("Error Occured " + e.toString());
        }
        return con;
    }
}
  

  [2019-05-08T12:51:07Z] manimekalai.k: public static void multiplesinsertuspreparedstatement() throws SQLException {

    String query = " insert into student (RollNo ,  Name , Course , Address  )"
        + " values (?, ?, ?, ?)";
    List&lt;Student&gt; al = new ArrayList&lt;Student&gt;();
    al.add(new Student(11,"Aaaa","IT","XXXXX"));
    al.add(new Student(12,"Aaaa","IT","XXXXX"));
    al.add(new Student(13,"Aaaa","IT","XXXXX"));

    System.out.println("\nThe SQL statement is: " + query + "\n"); // Echo for debugging
    DataSourceExample dsExample = new DataSourceExample();
    Connection con = dsExample.createConnection();
   PreparedStatement preparedStmt = con.prepareStatement(query);
   int i=0;
   for (Student data : al) {
      preparedStmt.setInt (1, data.getRollno());
      preparedStmt.setString (2, data.getName());
      preparedStmt.setString   (3, data.getCourse());
      preparedStmt.setString(4, data.getAddress());
      i+=preparedStmt.executeUpdate();
   }
      System.out.println(i);

    con.close();
}
  

  [2019-05-08T13:01:58Z] sanjeevi.p: <https://javaconceptoftheday.com/wp-content/uploads/2015/09/StatementVsPreparedStatementVsCallableStatement.png>
  
    ---------------
    | Attachments |
    ---------------
    
    
    

    
  

  [2019-05-09T03:36:46Z] manimekalai.k: 
  

  [2019-05-09T03:37:57Z] manimekalai.k: <https://www.roseindia.net/tutorial/java/jdbc/jdbcdatasourceexample.html>
  
    ---------------
    | Attachments |
    ---------------
    
    JDBC DataSource Example
    https://www.roseindia.net/tutorial/java/jdbc/jdbcdatasourceexample.html

    
  

  [2019-05-09T03:40:31Z] manimekalai.k: <https://docs.oracle.com/javase/7/docs/api/java/sql/ResultSet.html>
  

  [2019-05-09T03:49:08Z] manimekalai.k: List&lt;Object&gt; list = MysqlConnect.getDbCon().resultSetToArrayList(query);
            List&lt;Country&gt; countryList = (List&lt;Country&gt;)(List&lt;?&gt;)list;
  

  [2019-05-09T12:15:58Z] krishnan.u: private LocalDateTime releasedate;

LocalDate releasedate;
        releasedate = LocalDate.of(2015, 06, 26);
  

  [2019-05-09T13:07:43Z] krishnan.u: package com.kgisl.excel;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * CRUD_DB
 */
public class CsvToDB
{
    Connection connection = null;
    // BasicDataSource bdSource = new BasicDataSource();
    MysqlDataSource bdSource = new MysqlDataSource();

    CsvToDB()
    {
        // Set dataSource Properties

        // bdSource.setDriverClassName("com.mysql.jdbc.Driver");
        // bdSource.setUrl("jdbc:<mysql://localhost:3306/giriprasath%22|mysql://localhost:3306/giriprasath">);
        // bdSource.setUsername("root");
        // bdSource.setPassword("");

        bdSource.setServerName("localhost");
        bdSource.setPortNumber(3306);
        bdSource.setDatabaseName("student?allowPublicKeyRetrieval=true&amp;useSSL=false&amp;serverTimezone=UTC");
        bdSource.setUser("root");
        bdSource.setPassword("");

    }

    public static void main(String[] args) throws SQLException, IOException
    {

       display();
        insert();
        System.out.println("after insertion :");
        display();

    }

    public static void display() throws SQLException
     {
        CsvToDB dsExample = new CsvToDB();
        Connection con = dsExample.createConnection();
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM employee1";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next())
        {
            System.out.println( "RollNo- " + rs.getInt("id") + ", Name- " + rs.getString("name") +", Age- "
                    + rs.getString("age") + ", Country- " + rs.getString("country"));
        }
        rs.close();
        stmt.close();
        con.close();

    }

    public static void insert() throws SQLException, FileNotFoundException
    {
        String query = "insert into employee1 (id,name,age,country)" + "values(?,?,?,?)";
        CsvToDB dsExample = new CsvToDB();
        Connection con = dsExample.createConnection();
        PreparedStatement prstm = con.prepareStatement(query);


		CSVReader reader = new CSVReader(new FileReader("D:\\krishna\\New folder\\1234\\emps.csv"), ',');

        List&lt;Employee&gt; emps = new ArrayList&lt;Employee&gt;();
		//read line by line
		String[] record = null;

        try {
            while ((record = reader.readNext()) != null) {
                Employee emp = new Employee();
                emp.setId(record[0]);
                emp.setName(record[1]);
                emp.setAge(record[2]);
                emp.setCountry(record[3]);
                emps.add(emp);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            int i=1;
            for (Employee    var : emps)
            {
            prstm.setString(1, var.getId());
            prstm.setString(2, var.getName());
            prstm.setString(3, var.getAge());
            prstm.setString(4, var.getCountry());
            i+=prstm.executeUpdate();
		    }

            System.out.println(i);
            System.out.println(emps);
		
            try {
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        }


	
        private Connection createConnection()
        {
            Connection con = null;
            try
            {

                con = bdSource.getConnection();
            }
            catch (Exception e)
            {
                System.out.println("Error Occured " + e.toString());
            }
            return con;

    }
}
  

  [2019-05-13T08:52:07Z] baraneetharan.r: Programming languages race
  

  [2019-05-13T09:12:09Z] baraneetharan.r: 
  

  [2019-05-13T09:12:29Z] baraneetharan.r: <https://github.com/baraneetharan/javatest/blob/master/testMay13th.txt>
  
    ---------------
    | Attachments |
    ---------------
    
    baraneetharan/javatest
    https://github.com/baraneetharan/javatest/blob/master/testMay13th.txt

    
  

  [2019-05-13T09:13:46Z] baraneetharan.r: Create a new maven project and solve your programming problems
  

  [2019-05-14T03:55:44Z] baraneetharan.r: <http://agilelion.com/sites/default/files/field/image/Agile_Pyramid.jpg>
<https://cdn-images-1.medium.com/max/1600/1*u8EkWJKo52kzIKXAQHcxyw.png>
<http://nicocasel.net/blog/wp-content/uploads/2017/06/12-agile-principles.png>
<https://issart.com/blog/wp-content/uploads/2018/01/scrum-vs-kanban-comparison-diagram-common-agile-principles.png>
  
    ---------------
    | Attachments |
    ---------------
    
    
    

    
    
    

    
    
    

    
    
    

    
  

  [2019-05-14T09:11:52Z] baraneetharan.r: Trade
UccCode, TradeDate, Scrip, TradeType, Quantity, TradePrice

BhavCopy
TradeDate, Scrip, ClosingPrice
  

  [2019-05-14T11:46:42Z] baraneetharan.r: <https://github.com/baraneetharan/eBarter>
  
    ---------------
    | Attachments |
    ---------------
    
    baraneetharan/eBarter
    https://github.com/baraneetharan/eBarter

    
  

  [2019-05-14T12:16:59Z] baraneetharan.r: File read and write using opencsv - Bay3 (Amirtha,Meena,Anandraj,Krishnan)
sorting,sum, Avg Stream - Bay4 (Devi,Jajja,Sasikumar,Gowtham)
Brokerage calculation - Bay1 (GopalaKrishnan,Mohana,Jeevitha,Swetha,Prabhakar)
Using property file -Bay5 (GiriPrasath, Sanjeev, Kavin,Kannan )
Compare two arraylists - Bay6 ( Manimegalai,Uma,Banu,Naveen)
JDBC connection - Bay2 (SheinsDiwakar, SasikumarB,Cladis,Ramya)
  

  [2019-05-15T04:06:05Z] sanjeevi.p: 
  

  [2019-05-15T04:06:31Z] sanjeevi.p: 
  

  [2019-05-15T05:57:51Z] manimekalai.k: &lt;dependency&gt;
	  &lt;groupId&gt;com.google.code.gson&lt;/groupId&gt;
	  &lt;artifactId&gt;gson&lt;/artifactId&gt;
	  &lt;version&gt;2.2.4&lt;/version&gt;
        &lt;/dependency&gt;
  

  [2019-05-15T05:58:35Z] manimekalai.k: 
  

  [2019-05-15T06:17:15Z] manimekalai.k: 
  

  [2019-05-15T06:56:41Z] manimekalai.k: 
  

  [2019-05-15T06:59:18Z] manimekalai.k: 
  

  [2019-05-16T04:15:18Z] manimekalai.k: id	ucccode	tradedate	scrip	tradetype	quantity	price	Market amount	Brokerage%	brokerage	Gst%	gst	Stt%	stt	stamp duty	sd amt	netamount sell	buy amount
1	 ucccode2	 2019-5-23	 CIPLA	 S	1500	558.9	838350	1.25	10479.38	18	1886	0.017	143	0.001	8.3835	825841.62	850858.38
2	 ucccode2	 2019-5-23	 HDFC	 S	45	1,977.50	88987.5	1.25	1112.34	18	200	0.017	15			87660.16	90314.84
3	 ucccode1	 2019-5-23	 LT	 B	2525	1,350.50	3410012.5	1.25	42625.16	18	7673	0.017	580			3460890.66	3460890.66
4	 ucccode3	 2019-5-23	 MARUTI	 B	1500	6,608.15	9912225	1.25	123902.81	18	22303	0.017	1685			10060115.81	10060115.81
5	 ucccode2	 2019-5-23	 ONGC	 B	1500	163.65	245475	1.25	3068.44	18	552	0.017	42			249137.44	249137.44
6	 ucccode1	 2019-5-23	 GAIL	 B	1500	349.4	524100	1.25	6551.25	18	1179	0.017	89			531919.25	531919.25
7	 ucccode3	 2019-5-23	 CIPLA	 B	1500	551.5	827250	1.25	10340.63	18	1861	0.017	141			839592.63	839592.63
8	 ucccode3	 2019-5-23	 GAIL	 S	1500	341.5	512250	1.25	6403.13	18	1153	0.017	87			504606.87	519893.13
9	 ucccode1	 2019-5-23	 GAIL	 B	1500	343	514500	1.25	6431.25	18	1158	0.017	87			522176.25	522176.25
10	 ucccode1	 2019-5-23	 HDFC	 B	1500	1,978.60	2967900	1.25	37098.75	18	6678	0.017	505			3012181.75	3012181.75
  

  [2019-05-16T06:29:21Z] baraneetharan.r: @Contract note for a person on given date 
Top Buy scrip in a month 
Top Sell scrip in a month 
Top Turnover scrip 
Low Turnover scrip 
Net pay for each person for given date 
Total Brokerage for a day 
Highest Brokerage collection day 
Avg Buy price per scrip 
Avg Sell price per scrip 
Total Brokerage for a person 
Highest Brokerage paid on wich date by a person 
Current holding for a person / day 
Who is holding highest share 
Dynamic Brokerage, GST, STT 
Who is doing tranaction on every day 

  

  [2019-05-16T06:38:43Z] gopalakrishnan.a: 
  

  [2019-05-16T06:49:54Z] gopalakrishnan.a: 
  

  [2019-05-20T11:44:29Z] baraneetharan.r: 
  

  [2019-05-21T09:37:19Z] jeevitha.yuvaraj: 
  

  [2019-05-21T09:42:35Z] jeevitha.yuvaraj: <https://www.tutorialspoint.com/html/html_forms.htm>
<https://www.w3schools.com/html/html_forms.asp>

<https://www.guru99.com/jsp-tutorial.html>
<https://beginnersbook.com/jsp-tutorial-for-beginners/>
  
    ---------------
    | Attachments |
    ---------------
    
    HTML Forms
    https://www.tutorialspoint.com/html/html_forms.htm

    
    HTML Forms
    https://www.w3schools.com/html/html_forms.asp

    
    JSP Tutorial for Beginners: Learn in 7 Days
    https://www.guru99.com/jsp-tutorial.html

    
    JSP tutorial for beginners with examples - Java Server Pages
    https://beginnersbook.com/jsp-tutorial-for-beginners/

    
  

  [2019-05-22T06:11:54Z] baraneetharan.r: <https://www.slideshare.net/rizaman/exploring-the-java-servlet-technology>
<https://www.slideshare.net/martyhall/jsp-and-servlet-tutorial-servlet-basics>
<https://image.slidesharecdn.com/q7m2chapter2-160322015257/95/exploring-the-java-servlet-technology-4-638.jpg?cb=1458611710>
<https://www.codeproject.com/KB/web-cache/cacheinwebfarmandwebgarde/States.JPG>
<https://qph.fs.quoracdn.net/main-qimg-2d824814982ef3568d2690434e64761f.webp>
<https://www.java-forums.org/attachments/ocpjwcd/2632d1326391817t-tutorial-review-http-methods-servlet-api-web-component-developer-exam-a13-httpservletallmethods.jpg>
  

  [2019-05-24T06:42:17Z] mohanapriya.s: <https://maven.apache.org/download.cgi>

MAVEN_HOME
D:\apache-maven-3.6.1

JAVA_HOME
C:\Program Files\Java\jdk1.8.0_121

%MAVEN_HOME%\bin
%JAVA_HOME%\bin
  

  [2019-05-27T05:15:23Z] baraneetharan.r: <https://stackoverflow.com/questions/2047122/requestdispatcher-forward-vs-httpservletresponse-sendredirect>

<https://i.stack.imgur.com/RtckU.png>
&lt;context-param&gt;
       &lt;param-name&gt;user_name&lt;/param-name&gt;
       &lt;param-value&gt;Welcome to SpLessons&lt;/param-value&gt;
    &lt;/context-param&gt;

 ServletContext context = getServletContext();
        String fullname = context.getInitParameter("user_name");


&lt;servlet&gt;
        &lt;servlet-name&gt;DemoServlet&lt;/servlet-name&gt;
        &lt;servlet-class&gt;config2.DemoServlet&lt;/servlet-class&gt;
        &lt;init-param&gt;
        &lt;param-name&gt;splesson&lt;/param-name&gt;
        &lt;param-value&gt;Hey man stop thinking start coding&lt;/param-value&gt;
        &lt;/init-param&gt;
  &lt;/servlet&gt;
 ServletConfig config=getServletConfig();
        String splesson=config.getInitParameter("splesson");
  
    ---------------
    | Attachments |
    ---------------
    
    RequestDispatcher.forward() vs HttpServletResponse.sendRedirect()
    https://stackoverflow.com/questions/2047122/requestdispatcher-forward-vs-httpservletresponse-sendredirect

    
    
    

    
  

  [2019-05-27T10:58:35Z] krishnan.u: 
  

  [2019-05-28T12:19:59Z] krishnan.u: 
  

  [2019-05-28T13:35:33Z] krishnan.u: 
  

  [2019-05-29T04:13:10Z] baraneetharan.r: <https://www.journaldev.com/1945/servletcontextlistener-servlet-listener-example>

Event- something which happened. E.g. Mouse clicks, key down,etc
Event Handler- A callback which is usually called when there is an event
Event Listener- Detect an event and call the event handler

A listener is an object that subscribes for events from a source. Cf. the observer pattern. Usually you can have many listeners subscribing for each type of event, and they are added through addXyzListener methods.
Example: The MouseListener in the Java API.

A handler is an object that is responsible for handling certain events. A typical scenario would be to provide a handler for a specific event/task as an argument to a constructor, or set the handler through a setXyzHandler method. In other words, you usually have one handler for each type of event.
Example: The MemoryHandler in the Java API.

Event Listener- Detect an event and call the event handler
  
    ---------------
    | Attachments |
    ---------------
    
    ServletContextListener Servlet Listener Example - JournalDev
    https://www.journaldev.com/1945/servletcontextlistener-servlet-listener-example

    
  

  [2019-05-29T04:41:01Z] baraneetharan.r: 
  

  [2019-05-29T06:34:42Z] krishnan.u: <https://www.heidisql.com/downloads/releases/HeidiSQL_10.1_64_Portable.zip>

CREATE TABLE trade ( Id int(4), Ucccode varchar(50), Scrip varchar(50), TradeDate varchar(50), TradeType varchar(50), Quantity int(10) , TradePrice int(10));

INSERT INTO trade (Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES (1, 'ucccode2', 'S', '2019-05-23', 'CIPLA', 1500, 559);
INSERT INTO trade (Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES (2, 'ucccode2', 'S', '2019-05-23', 'HDFC', 45, 1978);
INSERT INTO trade (Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES (3, 'ucccode1', 'B', '2019-05-23', 'LT', 2525, 1351);
INSERT INTO trade (Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES (4, 'ucccode3', 'B', '2019-05-23', 'MARUTI', 150, 6608);
INSERT INTO trade (Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES (5, 'ucccode2', 'B', '2019-05-23', 'ONGC', 225, 164);
INSERT INTO trade (Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES (6, 'ucccode1', 'B', '2019-05-23', 'GAIL', 335, 349);
INSERT INTO trade (Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES (7, 'ucccode3', 'B', '2019-05-23', 'CIPLA', 420, 552);
INSERT INTO trade (Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES (8, 'ucccode3', 'S', '2019-05-23', 'GAIL', 515, 342);
INSERT INTO trade (Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES (9, 'ucccode1', 'B', '2019-05-23', 'GAIL', 1005, 343);
INSERT INTO trade (Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) VALUES (10, 'ucccode1', 'B', '2019-05-23', 'HDFC', 780, 1979);

*Create PROCEDURE*

CREATE PROCEDURE trade()
BEGIN
SELECT * FROM trade;
END

*Execute Procedure*
CALL trades
  

  [2019-05-29T13:17:26Z] ramya.a: 
  

  [2019-05-29T13:19:49Z] ramya.a: <https://www.codejava.net/java-ee/servlet/webservlet-annotation-examples>
  
    ---------------
    | Attachments |
    ---------------
    
    WebServlet annotation examples
    https://www.codejava.net/java-ee/servlet/webservlet-annotation-examples

    
  

  [2019-05-30T03:33:04Z] baraneetharan.r: <https://docs.oracle.com/javaee/6/api/javax/servlet/annotation/package-summary.html>
<https://www.tutorialspoint.com/servlets/servlets-annotations.htm>
  
    ---------------
    | Attachments |
    ---------------
    
    Servlets Annotations
    https://www.tutorialspoint.com/servlets/servlets-annotations.htm

    
  

  [2019-05-30T03:41:32Z] baraneetharan.r: <https://www.logicbig.com/tutorials/java-ee-tutorial/java-servlet/servlet-annotations.html>
  

  [2019-05-31T05:01:26Z] naveenkumar.a: *Session Tracking*

*Session* - particular interval of time
*Tracking* - recording of the thing

Session Tracking is remembering and recording of client conversion in span of time. It is also called as session management.



<https://www.sitesbay.com/servlet/images/http-protocol.png>

*Http protocol is stateless*

Http protocol is stateless, that means each *request is considered as the new request*.


If Http is *stateful protocol* for multiple requests given by client to web application single connection will be used between browser and web server across the multiple requests

*Session Tracking Techniques*

Cookies
URL Rewriting
Hidden Form Field
HttpSession

<https://www.sitesbay.com/servlet/images/session-tracking.png>


*Cookies*

Name:&lt;input type="text" name="userName"/&gt; &lt;br/&gt;

*Servlet1*
String n=request.getParameter("userName");
*javax.servlet.http.Cookie*

Cookie ck=new Cookie("uname",n);//creating cookie object
response.addCookie(ck);//adding cookie in the response

form action goes to *'servlet2'*

*Servlet2*
Cookie ck[]=request.getCookies();
ck[0].getValue();
  
    ---------------
    | Attachments |
    ---------------
    
    
    

    
    
    

    
  

  [2019-05-31T08:30:45Z] kavinprasath.g: 
  

  [2019-06-04T03:35:31Z] baraneetharan.r: <http://candidjava.com/tutorial/servlet-jsp-httpsession-login-logout-example/>
  
    ---------------
    | Attachments |
    ---------------
    
    Servlet Jsp HttpSession Login logout example | Http session login logout - Candidjava
    http://candidjava.com/tutorial/servlet-jsp-httpsession-login-logout-example/

    
  

  [2019-06-04T03:36:05Z] baraneetharan.r: <http://java.candidjava.com/tutorial/Servlet-Jsp-HttpSession-Login-logout-example.htm>
  
    ---------------
    | Attachments |
    ---------------
    
    Servlet, Jsp, HttpSession, Login, logout, example, tutorial, download
    http://java.candidjava.com/tutorial/Servlet-Jsp-HttpSession-Login-logout-example.htm

    
  

  [2019-06-04T04:13:30Z] naveenkumar.a: 
  

  [2019-06-06T08:49:16Z] baraneetharan.r: PLSQL PPT
  

  [2019-06-07T12:32:43Z] baraneetharan.r: 
  

  [2019-06-08T04:03:53Z] baraneetharan.r: <https://stackoverflow.com/questions/2422468/how-to-upload-files-to-server-using-jsp-servlet>
<https://www.codejava.net/java-ee/servlet/java-file-upload-example-with-servlet-30-api>
<https://www.baeldung.com/upload-file-servlet>
  
    ---------------
    | Attachments |
    ---------------
    
    How to upload files to server using JSP/Servlet?
    https://stackoverflow.com/questions/2422468/how-to-upload-files-to-server-using-jsp-servlet

    
    Java File Upload Example with Servlet 3.0 API
    https://www.codejava.net/java-ee/servlet/java-file-upload-example-with-servlet-30-api

    
    Uploading Files with Servlets and JSP | Baeldung
    https://www.baeldung.com/upload-file-servlet

    
  

  [2019-06-10T12:43:06Z] baraneetharan.r: <https://www.codejava.net/coding/jsp-servlet-jdbc-mysql-create-read-update-delete-crud-example>
  
    ---------------
    | Attachments |
    ---------------
    
    JSP Servlet JDBC MySQL Create Read Update Delete (CRUD) Example
    https://www.codejava.net/coding/jsp-servlet-jdbc-mysql-create-read-update-delete-crud-example

    
  

  [2019-06-11T04:16:50Z] mohanasankari.g: CREATE PROCEDURE insertuser1
(IN  id INT ,
IN uname VARCHAR(20)
)
BEGIN
INSERT INTO USER VALUES(id,uname);
END;
  

  [2019-06-11T04:17:15Z] mohanasankari.g: CALL insertuser1(12,'aaa');
SELECT * FROM USER;
  

  [2019-06-11T04:17:28Z] mohanasankari.g: CREATE PROCEDURE CountOrderByStatus1(
 IN ucccode VARCHAR(25),
 OUT total INT)
BEGIN
 SELECT count(ucccode)
 INTO total
 FROM trade
 WHERE trade.ucccode = ucccode;
END;
  

  [2019-06-11T04:17:40Z] mohanasankari.g: CALL CountOrderByStatus1('ucccode1',@total);
SELECT @total;
  

  [2019-06-11T04:31:13Z] mohanasankari.g: 
  

  [2019-06-11T08:55:02Z] baraneetharan.r: <https://www.codejava.net/java-se/jdbc/jdbc-examples-for-calling-stored-procedures-mysql>
  
    ---------------
    | Attachments |
    ---------------
    
    JDBC Examples for Calling Stored Procedures (MySQL)
    https://www.codejava.net/java-se/jdbc/jdbc-examples-for-calling-stored-procedures-mysql

    
  

  [2019-06-12T03:22:11Z] baraneetharan.r: <https://www.guru99.com/jsp-tutorial.html>
  
    ---------------
    | Attachments |
    ---------------
    
    JSP Tutorial for Beginners: Learn in 7 Days
    https://www.guru99.com/jsp-tutorial.html

    
  

  [2019-06-14T11:54:17Z] ramya.a: <https://tomcat.apache.org/download-80.cgi>
VSCode --&gt; Tomcat for java extension install
VSCode --&gt; file explorer --&gt; tomcat servers + (add tomcat installation directory)
Run Tomcat server
Target --&gt; Right click on war --&gt; run on tomcat server
VSCode --&gt; file explorer --&gt; tomcat servers --&gt; Expnad --&gt; Open in browser --&gt; <http://localhost:8080/>
Click your Application

<https://stackoverflow.com/questions/5109112/how-to-deploy-a-war-file-in-tomcat-7>
  
    ---------------
    | Attachments |
    ---------------
    
    How to deploy a war file in Tomcat 7
    https://stackoverflow.com/questions/5109112/how-to-deploy-a-war-file-in-tomcat-7

    
  

  [2019-06-17T07:18:46Z] sasikumar.b: <https://spring.io/projects>

<https://dzone.com/articles/why-spring-framework-is-popular>

<https://himanshugpt.files.wordpress.com/2010/07/spring.png?w=503&amp;h=398>

<https://memorynotfound.com/spring-mvc-xml-configuration-example/>

<https://stackoverflow.com/questions/18486660/what-are-the-differences-between-model-modelmap-and-modelandview>
  
    ---------------
    | Attachments |
    ---------------
    
    Spring Projects
    https://spring.io/projects

    
    Why Is the Spring Framework so Popular? - DZone Java
    https://dzone.com/articles/why-spring-framework-is-popular

    
    
    

    
    Spring MVC XML Configuration Example
    https://memorynotfound.com/spring-mvc-xml-configuration-example/

    
    What are the differences between Model, ModelMap, and ModelAndView?
    https://stackoverflow.com/questions/18486660/what-are-the-differences-between-model-modelmap-and-modelandview

    
  

  [2019-06-19T07:15:37Z] baraneetharan.r: <https://www.baeldung.com/spring-requestmapping>
  
    ---------------
    | Attachments |
    ---------------
    
    Spring @RequestMapping | Baeldung
    https://www.baeldung.com/spring-requestmapping

    
  

  [2019-06-20T06:20:53Z] baraneetharan.r: <https://www.w3schools.com/xml/ajax_xmlhttprequest_create.asp>
<https://www.w3schools.com/tags/ref_httpmessages.asp>
<https://www.codejava.net/frameworks/spring/spring-mvc-with-jdbctemplate-example>
  
    ---------------
    | Attachments |
    ---------------
    
    AJAX The XMLHttpRequest Object
    https://www.w3schools.com/xml/ajax_xmlhttprequest_create.asp

    
    HTTP Messages
    https://www.w3schools.com/tags/ref_httpmessages.asp

    
    Spring MVC with JdbcTemplate Example
    https://www.codejava.net/frameworks/spring/spring-mvc-with-jdbctemplate-example

    
  

  [2019-06-21T03:28:24Z] baraneetharan.r: <https://dzone.com/articles/spring-mvc-example-for-user-registration-and-login-1>
  
    ---------------
    | Attachments |
    ---------------
    
    Spring MVC Example for User Registration and Login - DZone Web Dev
    https://dzone.com/articles/spring-mvc-example-for-user-registration-and-login-1

    
  

  [2019-06-21T10:20:39Z] ajay.kuttysankaran: <https://stackoverflow.com/questions/17444410/where-is-the-exact-location-of-spring-config-file-and-web-xml>
  
    ---------------
    | Attachments |
    ---------------
    
    Where is the exact location of spring config file and web.xml?
    https://stackoverflow.com/questions/17444410/where-is-the-exact-location-of-spring-config-file-and-web-xml

    
  

  [2019-06-21T10:48:35Z] ajay.kuttysankaran: 
  

  [2019-06-21T12:21:47Z] baraneetharan.r: <https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/jdbc/core/JdbcTemplate.html>
  

  [2019-06-25T06:16:05Z] baraneetharan.r: 
  

  [2019-06-25T08:47:16Z] baraneetharan.r: <https://www.baeldung.com/bootstraping-a-web-application-with-spring-and-java-based-configuration>
<https://www.baeldung.com/spring-xml-vs-java-config>
<https://stackoverflow.com/questions/47552835/the-type-webmvcconfigureradapter-is-deprecated>
<https://stackoverflow.com/questions/27539610/order-of-loading-contextconfiglocation-in-web-xml-of-spring-servlet-project>
<https://stackoverflow.com/questions/3652090/difference-between-applicationcontext-xml-and-spring-servlet-xml-in-spring-frame>
  
    ---------------
    | Attachments |
    ---------------
    
    Bootstrap a Web Application with Spring 5 | Baeldung
    https://www.baeldung.com/bootstraping-a-web-application-with-spring-and-java-based-configuration

    
    Spring: web.xml vs Initializer | Baeldung
    https://www.baeldung.com/spring-xml-vs-java-config

    
    The type WebMvcConfigurerAdapter is deprecated
    https://stackoverflow.com/questions/47552835/the-type-webmvcconfigureradapter-is-deprecated

    
    Order of loading contextConfigLocation in web.xml of Spring Servlet project
    https://stackoverflow.com/questions/27539610/order-of-loading-contextconfiglocation-in-web-xml-of-spring-servlet-project

    
    Difference between applicationContext.xml and spring-servlet.xml in Spring Framework
    https://stackoverflow.com/questions/3652090/difference-between-applicationcontext-xml-and-spring-servlet-xml-in-spring-frame

    
  

  [2019-06-27T03:58:16Z] baraneetharan.r: package com.kgisl.springbeanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * GreetingService
 */
@Component
// @Scope("singleton")
// @Scope("prototype")
@Scope(value="request", proxyMode =ScopedProxyMode.TARGET_CLASS)
public class GreetingService {

    public String greet(){
        return "Hello";
    }
}



package com.kgisl.springbeanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private GreetingService greetingService;
    @GetMapping
    public String getall() {
        String myGreet=greetingService.greet();
        System.out.println(greetingService);
        return "HelloController "+myGreet;
    }

}




package com.kgisl.springbeanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private GreetingService greetingService;
    @GetMapping
    public String getall() {
        String myGreet=greetingService.greet();
        System.out.println(greetingService);
        return "HomeController "+myGreet;
    }
    @PutMapping
    public String put() {
        String myGreet=greetingService.greet();
        System.out.println(greetingService);
        return "HomeController "+myGreet;
    }
    @DeleteMapping
    public String delete() {
        String myGreet=greetingService.greet();
        System.out.println(greetingService);
        return "HomeController "+myGreet;
    }

}
  

  [2019-06-27T03:58:29Z] baraneetharan.r: <https://www.concretepage.com/spring/spring-bean-scopes>
  
    ---------------
    | Attachments |
    ---------------
    
    Spring Bean Scopes
    https://www.concretepage.com/spring/spring-bean-scopes

    
  

  [2019-06-27T11:56:53Z] supriya.sanjay: <https://www.javatpoint.com/spring-tutorial-dependency-injection-by-constructor>
  
    ---------------
    | Attachments |
    ---------------
    
    Spring Constructor injection - javatpoint
    https://www.javatpoint.com/spring-tutorial-dependency-injection-by-constructor

    
  

  [2019-06-27T11:57:01Z] supriya.sanjay: <https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/BeanFactory.html>
  

  [2019-07-01T10:31:44Z] baraneetharan.r: &lt;!DOCTYPE html&gt;
&lt;html lang="en"&gt;

&lt;head&gt;
   &lt;meta charset="UTF-8"&gt;
   &lt;meta name="viewport" content="width=device-width, initial-scale=1.0"&gt;
   &lt;meta http-equiv="X-UA-Compatible" content="ie=edge"&gt;
   &lt;title&gt;Document&lt;/title&gt;

   &lt;script src="country.js"&gt;&lt;/script&gt;
&lt;/head&gt;

&lt;body onload="app.FetchAll()"&gt;
   &lt;form action="javascript:void(0);" method="POST" onsubmit="app.Add()"&gt;
       &lt;input type="text" id="countryName" placeholder="New country"&gt;
       &lt;input type="submit" id="submit" value="Add"&gt;
   &lt;/form&gt;
   &lt;!-- &lt;div id="countriesList"&gt;&lt;/div&gt; --&gt;
   &lt;table&gt;
           &lt;tr&gt;
             &lt;th&gt;Name&lt;/th&gt;
           &lt;/tr&gt;
             &lt;tbody id="countriesList"&gt;
             &lt;/tbody&gt;
         &lt;/table&gt;

&lt;/body&gt;

&lt;/html&gt;
  

  [2019-07-01T10:31:52Z] baraneetharan.r: var app = new function () {
    this.countries = ['France', 'Germany', 'England', 'Spain', 'Belgium', 'Italy', 'Portugal', 'Irland', 'Luxembourg'];
    // this.countries = [];

    this.FetchAll = function () {
        alert("this.countries.length =" + this.countries.length);
        // this.data += '&lt;table&gt;&lt;tr&gt;&lt;th&gt;Name&lt;/th&gt;&lt;/tr&gt;';
        var data = '';
        if (this.countries.length &gt; 0) {
            for (i = 0; i &lt; this.countries.length; i++) {

                data += '&lt;tr&gt;';
                data += '&lt;td&gt;' + this.countries[i] + '&lt;/td&gt;';
                data += '&lt;td&gt;&lt;button onclick="app.Edit(' + i + ')"&gt;Edit&lt;/button&gt;&lt;/td&gt;';
                data += '&lt;td&gt;&lt;button onclick="app.Delete(' + i + ')"&gt;Delete&lt;/button&gt;&lt;/td&gt;';
                data += '&lt;/tr&gt;';
            }
            // this.data += '&lt;table&gt;';
            console.log(data);
            document.getElementById("countriesList").innerHTML = data;
        }
    };

    this.Edit = function (item) {
        document.getElementById('submit').value = "Update"
        alert(this.countries[item]);
        document.getElementById('countryName').value = this.countries[item];
        this.countries.splice(0, 1, document.getElementById('countryName').value);
        app.FetchAll();
    };

    this.Delete = function (item) {
        alert(this.countries[item]);
        this.countries.splice(item, 1);
        app.FetchAll();
    };

    this.Add = function () {
        document.getElementById('countryName').value;
        // alert(document.getElementById('countryName').value);
        this.countries.push(document.getElementById('countryName').value);

        app.FetchAll();
    };
}

 // app.FetchAll();
  

  [2019-07-01T11:30:41Z] naveenkumar.a: ====================================country.html==================&lt;!DOCTYPE html&gt;
&lt;html lang="en"&gt;

&lt;head&gt;
  &lt;meta charset="UTF-8"&gt;
  &lt;meta name="viewport" content="width=device-width, initial-scale=1.0"&gt;
  &lt;meta http-equiv="X-UA-Compatible" content="ie=edge"&gt;
  &lt;title&gt;Document&lt;/title&gt;

  &lt;script src="country.js"&gt;&lt;/script&gt;
&lt;/head&gt;

&lt;body onload="app.FetchAll()"&gt;
  &lt;form action="javascript:void(0);" method="POST" onsubmit="app.AddorUpdate()"&gt;
      &lt;input type="text" id="countryName" placeholder="New country"&gt;
      &lt;input type="submit" id="submit" value="Add"&gt;
  &lt;/form&gt;
  &lt;!-- &lt;div id="countriesList"&gt;&lt;/div&gt; --&gt;
  &lt;table&gt;
          &lt;tr&gt;
            &lt;th&gt;Name&lt;/th&gt;
          &lt;/tr&gt;
            &lt;tbody id="countriesList"&gt;
            &lt;/tbody&gt;
        &lt;/table&gt;

&lt;/body&gt;

&lt;/html&gt;


===================================country.js====================
var app = new function () {
  this.countries = ['France', 'Germany', 'England', 'Spain', 'Belgium', 'Italy', 'Portugal', 'Irland', 'Luxembourg'];
  // this.countries = [];
  this.updateItem="";

  this.FetchAll = function () {
    // alert("this.countries.length =" + this.countries.length);
    // this.data += '&lt;table&gt;&lt;tr&gt;&lt;th&gt;Name&lt;/th&gt;&lt;/tr&gt;';
    var data = '';
    if (this.countries.length &gt; 0) {
      for (i = 0; i &lt; this.countries.length; i++) {

        data += '&lt;tr&gt;';
        data += '&lt;td&gt;' + this.countries[i] + '&lt;/td&gt;';
        data += '&lt;td&gt;&lt;button onclick="app.Edit(' + i + ')"&gt;Edit&lt;/button&gt;&lt;/td&gt;';
        data += '&lt;td&gt;&lt;button onclick="app.Delete(' + i + ')"&gt;Delete&lt;/button&gt;&lt;/td&gt;';
        data += '&lt;/tr&gt;';
      }
      // this.data += '&lt;table&gt;';
      console.log(data);
      document.getElementById("countriesList").innerHTML = data;
    }
  };

  this.Edit = function (item) {
    this.updateItem=item;
    document.getElementById('submit').value = "Update";
    document.getElementById('countryName').value = this.countries[item];
  };

  this.Delete = function (item) {
    alert(this.countries[item]);
    this.countries.splice(item, 1);
    app.FetchAll();
  };

  this.Add = function () {
    document.getElementById('countryName').value;
    // alert(document.getElementById('countryName').value);
    this.countries.push(document.getElementById('countryName').value);

    app.FetchAll();
  };
  this.AddorUpdate = function () {
    var action = document.getElementById('submit').value;
    if (action != "Update") {
      document.getElementById('countryName').value;
      this.countries.push(document.getElementById('countryName').value);
    }
    else {
      var updateCountry = document.getElementById('countryName').value;
      alert(updateCountry);
      this.countries.splice(this.updateItem, 1, updateCountry);
      this.updateItem="";
      document.getElementById('submit').value = "add";

    }


    app.FetchAll();
  };
}

// app.FetchAll();
  

  [2019-07-02T07:36:51Z] mohanasankari.g: <http://dummy.restapiexample.com/>

<https://www.w3schools.com/js/js_ajax_http.asp>
<https://www.w3schools.com/xml/xml_http.asp>
<https://gist.github.com/EtienneR/2f3ab345df502bd3d13e>
<https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop/related?hl=en>
<https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS>
<https://chrome.google.com/webstore/detail/allow-control-allow-origi/nlfbmbojpeacfghkpbjhddihlkkiljbi/related?hl=en>

*://*/*
<https://www.google.com/search?q=cors>
  

  [2019-07-02T09:18:56Z] mohanasankari.g: =============================emp.html
&lt;!DOCTYPE html&gt;
&lt;html lang="en"&gt;
&lt;head&gt;
    &lt;meta charset="UTF-8"&gt;
    &lt;meta name="viewport" content="width=device-width, initial-scale=1.0"&gt;
    &lt;meta http-equiv="X-UA-Compatible" content="ie=edge"&gt;
    &lt;title&gt;Document&lt;/title&gt;
    &lt;script src="emp.js"&gt;&lt;/script&gt;
&lt;/head&gt;
&lt;body&gt;
    &lt;input type="text" name="name" id="name"&gt;
    &lt;input type="text" name="salary" id="salary"&gt;
    &lt;input type="text" name="age" id="age"&gt;
    &lt;input type="submit" value="submit" onclick="app.add()"&gt;
&lt;/body&gt;
&lt;/html&gt;





===================================emp.js



var app = new function () {
    this.add = function () {
        // {"name":"test","salary":"123","age":"23"}

        var data = {};
        data.name = document.getElementById("name").value;
        data.salary = document.getElementById("salary").value;
        data.age = document.getElementById("age").value;
        var json = JSON.stringify(data);
        alert(json);
        console.log(json);

        // Post a user
        var xhttp = new XMLHttpRequest();
        xhttp.open("POST", "<http://dummy.restapiexample.com/api/v1/create>", true);
        xhttp.send(json);
        xhttp.onreadystatechange = function () {
            if (this.readyState == 4 &amp;&amp; this.status == 200) {
                // Typical action to be performed when the document is ready:
                // document.getElementById("demo").innerHTML = xhttp.responseText;
            }
        };

    };
}
  

  [2019-07-02T09:56:53Z] krishnan.u: 
  

  [2019-07-03T05:51:39Z] baraneetharan.r: <https://start.spring.io/>
<https://stackoverflow.com/questions/33619532/configuration-using-annotation-springbootapplication>
<https://stackoverflow.com/questions/35005158/what-is-the-difference-between-componentscan-and-enableautoconfiguration-in-sp>
<https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html>
  
    ---------------
    | Attachments |
    ---------------
    
    Configuration using annotation @SpringBootApplication
    https://stackoverflow.com/questions/33619532/configuration-using-annotation-springbootapplication

    
    What is the difference between @ComponentScan and @EnableAutoConfiguration in Spring Boot?
    https://stackoverflow.com/questions/35005158/what-is-the-difference-between-componentscan-and-enableautoconfiguration-in-sp

    
  

  [2019-07-03T07:08:05Z] baraneetharan.r: 
  

  [2019-07-03T11:24:47Z] baraneetharan.r: 
  

  [2019-07-04T05:23:24Z] mohanasankari.g: 
  

  [2019-07-04T11:49:02Z] supriya.sanjay: <https://www.boraji.com/spring-mvc-5-static-resources-handling-example>
  
    ---------------
    | Attachments |
    ---------------
    
    Spring MVC 5 - Static resources handling example | BORAJI.COM
    https://www.boraji.com/spring-mvc-5-static-resources-handling-example

    
  

  [2019-07-04T11:49:24Z] supriya.sanjay: package com.memorynotfound.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
   public void onStartup(ServletContext servletContext) throws ServletException
   {
     AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
     context.scan("com.memorynotfound");
     servletContext.addListener(new ContextLoaderListener(context));

     ServletRegistration.Dynamic dispatcher = servletContext.addServlet("mvc", new DispatcherServlet(context));
     dispatcher.setLoadOnStartup(1);
     dispatcher.addMapping("/");
   }

   @Override
   protected Class&lt;?&gt;[] getRootConfigClasses() {
      return null;
   }

   @Override
   protected Class&lt;?&gt;[] getServletConfigClasses() {
      return new Class[] { MvcWebConfig.class };
   }

   @Override
   protected String[] getServletMappings() {
      return new String[] { "/" };
   }

}
  

  [2019-07-04T11:49:34Z] supriya.sanjay: package com.memorynotfound.controller;

import java.util.concurrent.TimeUnit;

import javax.sql.DataSource;

// import com.kgisl.springjson.dao.ContactDAO;
// import com.kgisl.springjson.dao.ContactDAOImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.memorynotfound")
public class MvcWebConfig implements WebMvcConfigurer {

   // @Override
   public void configureViewResolvers(ViewResolverRegistry registry) {
      registry.jsp("/WEB-INF/view/", ".jsp");
   }

   /**
    * Static Resource (CSS or JS) mapping
    */
   // @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {

      // Register resource handler for CSS and JS
      registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/statics/", "D:/statics/")
            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());

      // Register resource handler for images

      registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/")
            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
   }

   @Bean
   public DataSource getDataSource() {
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("com.mysql.jdbc.Driver");
       dataSource.setUrl("jdbc:<mysql://localhost:3306/contactdb%22|mysql://localhost:3306/contactdb">);
       dataSource.setUsername("root");
       dataSource.setPassword("");

       return dataSource;
   }

   // @Bean
   // public ContactDAO getContactDAO() {
   //     return new ContactDAOImpl(getDataSource());
   // }
}
  

  [2019-07-04T12:38:06Z] baraneetharan.r: 
  

  [2019-07-05T07:31:19Z] baraneetharan.r: <http://hibernate.org/orm/documentation/5.3/>
<https://docs.jboss.org/hibernate/orm/5.3/userguide/html_single/Hibernate_User_Guide.html>
<https://www.slideshare.net/intellibitz/hibernate-developer-reference>
<https://github.com/baraneetharan/hibernatexml>
<https://www.objectdb.com/api/java/jpa/annotations>
  
    ---------------
    | Attachments |
    ---------------
    
    Hibernate Developer Reference
    https://www.slideshare.net/intellibitz/hibernate-developer-reference

    
    baraneetharan/hibernatexml
    https://github.com/baraneetharan/hibernatexml

    
    JPA 2 Annotations - The Complete Reference (JavaDoc)
    https://www.objectdb.com/api/java/jpa/annotations

    
  

  [2019-07-10T03:56:47Z] baraneetharan.r: <https://bushansirgur.in/complete-crud-application-in-spring-mvc-and-hibernate-xml-configuration/>
  
    ---------------
    | Attachments |
    ---------------
    
    Complete CRUD Application in Spring MVC and Hibernate [XML Configuration] - B2 Tech
    https://bushansirgur.in/complete-crud-application-in-spring-mvc-and-hibernate-xml-configuration/

    
  

  [2019-07-15T03:59:09Z] baraneetharan.r: <https://gist.github.com/baraneetharan/9f510cedab43983ba1cf47f3db1d01aa>
  

  [2019-07-16T11:16:23Z] baraneetharan.r: <https://netsurfingzone.com/wp-content/uploads/2018/10/jpa1.png>
  
    ---------------
    | Attachments |
    ---------------
    
    
    

    
  

  [2019-07-17T13:10:12Z] supriya.sanjay: <https://www.javaguides.net/2018/11/spring-mvc-5-hibernate-5-jsp-mysql-crud-tutorial.html>
  
    ---------------
    | Attachments |
    ---------------
    
    Spring MVC 5 + Hibernate 5 + JSP + MySQL CRUD Tutorial
    https://www.javaguides.net/2018/11/spring-mvc-5-hibernate-5-jsp-mysql-crud-tutorial.html

    
  

  [2019-07-17T13:10:23Z] supriya.sanjay: <https://www.javaguides.net/2018/11/spring-mvc-5-spring-data-jpa-hibernate-jsp-mysql-tutorial.html>
  
    ---------------
    | Attachments |
    ---------------
    
    Spring MVC 5 + Spring Data JPA + Hibernate 5 + JSP + MySQL Tutorial
    https://www.javaguides.net/2018/11/spring-mvc-5-spring-data-jpa-hibernate-jsp-mysql-tutorial.html

    
  

  [2019-07-17T13:11:07Z] supriya.sanjay: 
  
