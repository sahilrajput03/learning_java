# Rockstart - Java

## Contents:

- **_[with spring and live reloading](spring-live-java/README.md)_**

---

Learning Java continute from [here](https://www.w3schools.com/java/java_modifiers.asp)

## good friend - constructor

Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

```java
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```

## Making use of variables of class members

```java
// Modify Attributes
public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
```

- If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
```

## Making objects of a class

src: https://www.w3schools.com/java/java_classes.asp

(^^ do read if you wanna dig inside dust..)

**FYI** :In the end of above source link(w3school) you'll learn how difference files can access eachother's class members to use them. Yikes! (similar to modules in nodejs but java sucks!)

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```

## Java convention ?

Remember from the Java Syntax chapter that a class should always start with an uppercase first letter, and that the name of the java file should match the class name.

## Loading code from another file in java

Src: https://stackoverflow.com/a/43350661/10012446

Take a look:

• Non-static method:

```java
// B.java

class B {
   public void myMethod() {
     // do stuff
   }
}


// A.java

class A {
    public void anotherMethod()
    {
         B b=new B();
         b.myMethod();        // calling B class's method
    }
}
```

• STATIC method:

```java
// B.java

class B {
   public static void myMethod() {
     // do stuff
   }
}


// A.java
class A {
    public void anotherMethod()
    {
         B.myMethod();        // calling B class's method
    }
}
```

## recursion practise in java

```java
public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
```

Halting Condition
Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion. Infinite recursion is when the function never stops calling itself. Every recursive function should have a halting condition, which is the condition where the function stops calling itself. In the previous example, the halting condition is when the parameter k becomes 0.

It is helpful to see a variety of different examples to better understand the concept. In this example, the function adds a range of numbers between a start and an end. The halting condition for this recursive function is when end is not greater than start:

```java
public class Main {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}
```

## method overloading

```java
static int plusMethodInt(int x, int y) {
  return x + y;
}

static double plusMethodDouble(double x, double y) {
  return x + y;
}
public static void main(String[] args) {
  int myNum1 = plusMethodInt(8, 5);
  double myNum2 = plusMethodDouble(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
```

## lovely methods

Methods are used to perform certain actions, and they are also known as functions. Why use methods? To reuse code: define the code once, and use it many times.

```java
public class Main {
  static void myMethod() {
    // code to be executed
  }

  static void myMethod2(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod();
    myMethod2("Liam", 5);
    myMethod2("Jenny", 8);
  }
}
// - static means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
// - void means that this method does not have a return value. You will learn more about return values later in this chapter

```

## Switch

```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
  // Run if there is no case match:
    // code block
}

// The break keyword:
// When Java reaches a break keyword, it breaks out of the switch block.

// This will stop the execution of more code and case testing inside the block.

// When a match is found, and the job is done, it's time for a break. There is no need for more testing.
```

## Two dimentional array

```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2];
System.out.println(x); // Outputs 7
```

## arrays in java

```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo

System.out.println(cars.length);
// Outputs 4
```

## break/continue

src: https://www.w3schools.com/java/java_break.asp
Java Break
You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.

The break statement can also be used to jump out of a loop.

Java Continue
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

## for each loop

There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

```java
for (type variableName : arrayName) {
  // code block to be executed
}

// for e.g.,
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for (String i : cars) {
  System.out.println(i);
}
```

## For loop

```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```

## Ternary operator in java

```java
// Syntax:
// variable = (condition) ? expressionTrue :  expressionFalse;

int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}

// REDUCES TO:
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
```

## if/else, while, do/while

```java
while (condition) {
  // code block to be executed
}

// do/while loop:
// This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
do {
  // code block to be executed
}
while (condition);

if (20 > 18) {
  System.out.println("20 is greater than 18");
}

if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}

if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
```

## Modules importing and easeness

```java
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// So instead of above lines we can do like this:
import org.springframework.web.bind.annotation.*;
// src: This line is a substitution for using multiple entities. Src: https://stackoverflow.com/a/39382541/10012446
```

## Booleans

```java
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false


System.out.println(10 > 9); // returns true, because 10 is higher than 9


int x = 10;
System.out.println(x == 10); // returns true, because the value of x is equal to 10
```

## Math functions:

```java
Math.max(5, 10);// to find the highest value of x and y
Math.min(5, 10);// to find the lowest value of x and y:
Math.sqrt(x); // square root.
Math.abs(x); // method returns the absolute (positive) value of x i.e., -2 => 2 and 2 => 2
Math.random(); // returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

// want a random number between 0 and 100, you can use the following formula:
int randomNum = (int)(Math.random() * 101);  // 0 to 100
// Complete reference of Math: https://www.w3schools.com/java/java_ref_math.asp
```

## String methods:

```java
// A String variable contains a collection of characters surrounded by double quotes:
String txt = "Hello World";
System.out.println("The length of the txt string is: " + txt.length());
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"

// Finding character in string:
System.out.println(txt.indexOf("locate")); // Outputs 7

// Concatate without using + operator:
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));// JohnDoe

// If you add a number and a string, the result will be a string concatenation:
String x = "10";
int y = 20;
String z = x + y;   // z will be 1020 (a String)

// Closest to template literal in java:
System.out.printf("This is a template %s %s %s", "for", "an ", "example");
// NOTE :  ^^^^^^^ this is printf not print or println.
```

## Java operators:

All operators are very similar to other langs like js, python and c.
https://www.w3schools.com/java/java_operators.asp

## Type casting ( converting type) in Java

src: https://www.w3schools.com/java/java_type_casting.asp

```java
// Automatic Casting:
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double

// Narrow Casting:
double myDouble = 9.78d;
int myInt = (int) myDouble; // Manual casting: double to int
```

## Using variables in java

Src: https://www.w3schools.com/java/java_variables.asp

```txt
String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
```

**Syntax**:

```java
type variableName = value;

int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";

int x = 5, y = 6, z = 50;

System.out.println(variableName);
```

## Primitive Data Types in Java

src: https://www.w3schools.com/java/java_data_types.asp

Primitive Data Types
A primitive data type specifies the size and type of variable values, and it has no additional methods.

There are eight primitive data types in Java:

```txt
Data Type Size Description
byte 1 byte Stores whole numbers from -128 to 127
short 2 bytes Stores whole numbers from -32,768 to 32,767
int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean 1 bit Stores true or false values
char 2 bytes Stores a single character/letter or ASCII values
```

#### Final Variables/ Constants

However, you can add the final keyword if you don't want others (or yourself) to overwrite existing values (this will declare the variable as "final" or "constant", which means unchangeable and read-only):

Example

```java
final int myNum = 15;
myNum = 20; // will generate an error: cannot assign a value to a final variable
```

## Using json in java:

1. Add below code to your pom.xml file:

Docs (what I found): https://stleary.github.io/JSON-java/org/json/JSONObject.html
Docs @ android: https://developer.android.com/reference/org/json/JSONObject
Docs @ javadoc: https://www.javadoc.io/doc/org.json/json/20170516/org/json/class-use/JSONObject.html

FYI: We can use google's library as well i.e.,
`import com.google.gson.JsonObject;`

```txt
<!-- src: https://stackoverflow.com/a/22876057/10012446 -->
<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20211205</version>
</dependency>
```

2. Then you can use it like:

```java
import org.json.JSONObject;
JSONObject obj = new JSONObject();

obj.put("name", "foo");
obj.put("num", new Integer(100));
obj.put("balance", new Double(1000.21));
obj.put("is_vip", new Boolean(true));
System.out.print(obj);
```

FYI: Deprecations since Java 9: (i.e., Sept 27, 2017):

```txt
The constructor Boolean(boolean) is deprecated
The constructor Byte(byte) is deprecated
The constructor Short(short) is deprecated
The constructor Character(char) is deprecated
The constructor Long(long) is deprecated
The constructor Float(float) is deprecated
The constructor Double(double) is deprecated
```

What does deprecation imply us to use now.?

More shit: https://stackoverflow.com/a/47095501/10012446
