akshaya P R

# Java 8 features
This is classic OOP style of hiding method implementations from the caller. The caller simply passes a variable to the method which then does something with the value of the variable and returns another value or produces a side effect as it is in our case.
```
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
```
see an equivalent implementation that uses behavior passing other than variable passing. To achieve this, we have to create a functional interface that defines that abstracts the behavior instead of a method. A functional interface is an interface that has only one method:

```package com.kg.lambdaapp;
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

```

```
public void print(String toPrint) {
                System.out.println(toPrint);
            }
```

lambda expressions

```package com.kg.lambdaapp;
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
        Printer printer = (String toPrint) -> {
                System.out.println(toPrint);
        };

        String something = "Learning Lambda";
        lambdaDemo.printSomething(something, printer);
    }
}
```

```
(String toPrint) -> {
                System.out.println(toPrint);
        }
```



```
package com.kg.lambdaapp;
interface Printer {
    void print(String something);
}

public class LambdaDemo {
    public static void printSomething(String something) {
        System.out.println(something);
        //printer.print(something);
    }


    public static void main(String[] args) {
        //LambdaDemo lambdaDemo = new LambdaDemo();
        String something = "Learning Lambda";
        Printer printer = LambdaDemo::printSomething;
        printer.print(something);
    }
}
```
```
package com.kg.lambdaapp;
interface Printer {
    void print();
}

public class LambdaDemo {
    public static void printSomething() {
        System.out.println("something");
        //printer.print(something);
    }

    public static void main(String[] args) {
        //LambdaDemo lambdaDemo = new LambdaDemo();
        String something = "Learning Lambda";
        Printer printer = LambdaDemo::printSomething;
        printer.print();
    }
}
```
end

# java 8 features
# Stream Min

description

```
List<String> list = Arrays.asList("Gza","Gzb","Gox","Elephant");
		String max = list.stream().max(Comparator.comparing(String::valueOf)).get();
		System.out.println("Max:"+ max);
		String min = list.stream().min(Comparator.comparing(String::valueOf)).get();
		System.out.println("Min:"+ min);
```
# Stream Max
