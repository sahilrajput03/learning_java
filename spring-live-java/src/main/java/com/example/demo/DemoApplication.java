package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.json.JSONObject;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*; // This line is a substitution for using multiple entities. Src: https://stackoverflow.com/a/39382541/10012446

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@GetMapping("/page1")
	public String page1() {
		return "Welcome to Page 1. Have a nice day!!";// String.format("Welcome to Page 1.")
	}

	@GetMapping("/random")
	public Double randomNumber() {
		return Math.random()*100;// String.format("Welcome to Page 1.")
	}

	@GetMapping("/my_json")
	public String my_json() {
		JSONObject obj = new JSONObject();

		obj.put("name", "foo");
		obj.put("num", 100);
		obj.put("balance", 1000.21);
		obj.put("is_vip", true);

		System.out.printf("We're sending data: %s \n", obj.toString());
		System.out.printf("We're sending data(prettily): %s \n", obj.toString(2));
		// Here 2 value in toString method is the indentation level i.e., 2 spaces.

		 String obj_type = obj.getClass().getSimpleName();// returns type of anything in string format.
		//  We should not use == to check for value equality coz its pupose is to check reference equality(i.e., same object). Src: https://stackoverflow.com/a/513839/10012446
		 System.out.printf("Type of 'obj' is JSONObject: %s\n",obj_type.equals("JSONObject"));

		 String a = "Light is invisible.";
		 String type_a = a.getClass().getSimpleName();
		 System.out.printf("Type of 'a' is string: %s\n",type_a.equals("String"));

		return obj.toString();

	}
	
	// This doesn't work IDK why..!
	// @GetMapping("/error")
	// public String errorPage() {
	// 	return "Sorry for the inconvenience, we're working to fix this ASAP!";
	// }

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hellol Buddy, %s!", name);
	}
}
