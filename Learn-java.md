## Using variables in java

Src: https://www.w3schools.com/java/java_variables.asp

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false

**Syntax**:

```java
type variableName = value;
System.out.println(variableName);
```

## Using json in java:

1. Add below code to your pom.xml file:

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
// src:
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
