# Rockstart - Java

## Contents:

- **_[Jump to hot reloading topic](#hot-reloading-in-java)_**

---

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

# Hot reloading in java

Source of Spring learning: https://spring.io/quickstart

Created project using https://youtu.be/a7-v6PW1458?t=213 . Thanks to this guy!

**Running project:** To run the project in _watch mode_ run `./mvnw spring-boot:run` only and it watches automatically for changes.

**TIP**: You can simply use `./start-development.sh` to run it too.

**Live reload extension for chrome**: Needs to be enabled by clicking on the icon in the extension bar(in the tool tip it'll show you the the status i.e, if its enabled or disabled). Src: https://chrome.google.com/webstore/detail/livereload/jnihajbhpnppcggbcgedagnkighmdlei/related?hl=en

Others:

- Also very helpful: https://www.youtube.com/watch?v=_3uMgaAncmA
  ^^ this video exaplains maintaing different environment like dev, prod as well. Yikes!
