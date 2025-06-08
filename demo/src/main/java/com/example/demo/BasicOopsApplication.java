package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicOopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicOopsApplication.class, args);

		System.out.println("Started");

//        Animal obj1 = new Animal();
//        Animal obj2 = new Animal("color2", 20, 29, 3267);
//        Animal obj3 = obj1;
//
//
//        System.out.println("Result Obj1: " + obj1.toString());
//        System.out.println("Result Obj2: " + obj2.toString());
//        System.out.println("Result Obj3: " + obj3.toString());


//        String res = "";
//        System.out.println("String created. Res: "+res);   //String created. Res:
//
//        String res1 = "test";
//        System.out.println("String created. Res1: "+res1);   //String created. Res1: test
//
//        String res2 = "test"+"123";
//        String res3 = "test"+123;
//        System.out.println("String created. Res2: "+res2);   //String created. Res2: test123
//        System.out.println("String created. Res3: "+res3);   //String created. Res3: test123
//        System.out.println("Compare : "+res2==res3);   //false
//        System.out.println("equals : "+res2.equals(res3));   //equals : true

//        String b = new String("abc");
//        String a = "abc";
//        String c = "abcd";
//        System.out.println(b==a);   //false
//        System.out.println(c==a);   //false
//        System.out.println(b.equals(a));    //true
//        c=a;
//        System.out.println(c==a);   //true
//        System.out.println(c.equals(a));    //true
//        c=b;
//        System.out.println(c==b); //true
//        System.out.println(c.equals(b));    //true
//        System.out.println(c==a);   //false
//        System.out.println(c.equals(a));    //true


		Employee e1 = new Employee();
		e1.setParentName("testParentName");
		e1.setName("testName");
		System.out.println("Employee Object:: "+e1.toString());
		System.out.println("Employee Name:: "+e1.getParentName());
		System.out.println("Employee Overload:: "+e1.getSalaryWithAge(12));
		System.out.println("Employee Overload:: "+e1.invokeParentMethod(12));
		System.out.println("Employee Overload:: "+e1.getSalaryWithAge("testString"));
		System.out.println("End");







//        String s = "hello";
//
////        s = s+"abcd";
//        System.out.println(s.equals(s+"abcd"));
	}

}
