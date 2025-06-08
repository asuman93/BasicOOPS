package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(DemoApplication.class, args);
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
//
//
////        Map<Character, Long> m =
//                s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
//                .max(Map.Entry.comparingByValue());
////        System.out.println("Result: "+m);
//        System.out.println("End");

       // demoOldCode();

    }

    public static int sum(int a, int b) {
        return a+b;
    }


//    private static void demoOldCode() throws ParseException {
//        Calendar startDate = Calendar.getInstance();
//        startDate.set(Calendar.DAY_OF_MONTH, 1);
//        startDate.set(Calendar.HOUR_OF_DAY, 0);
//        startDate.set(Calendar.MINUTE, 0);
//        startDate.set(Calendar.SECOND, 0);
//        startDate.set(Calendar.MILLISECOND, 0);
//        System.out.println("date time very start: " + startDate.getTime());
//
//        Date startingDate = startDate.getTime();
//        SimpleDateFormat simDateFormat = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS");
//        String currentTime = simDateFormat.format(startingDate);
//        Date dateLocal = simDateFormat.parse(currentTime);
//        long epochTime1 = dateLocal.getTime();
//        System.out.println("initial date epoch1: " + epochTime1);
//
//
//        //////////////////////////////start conversion
//        TimeZone utcZone = TimeZone.getTimeZone("UTC");
//        simDateFormat.setTimeZone(utcZone);
//
////        SimpleDateFormat simDateFormat1 = new SimpleDateFormat("MMM dd yyyy HH:mm:ss");
////        simDateFormat1.setTimeZone(utcZone);
//        String newRes = simDateFormat.format(startDate.getTime());
//        System.out.println("res: " + newRes);
//
//        Calendar c = Calendar.getInstance(utcZone);
//        c.set(Calendar.DAY_OF_MONTH, startDate.get(Calendar.DAY_OF_MONTH));
//        c.set(Calendar.HOUR_OF_DAY, startDate.get(Calendar.HOUR_OF_DAY));
//        c.set(Calendar.MINUTE, startDate.get(Calendar.MINUTE));
//        c.set(Calendar.SECOND, startDate.get(Calendar.SECOND));
//        c.set(Calendar.MILLISECOND, startDate.get(Calendar.MILLISECOND));
//
//        c.getTime();
//
//
//        Date dateUTC = simDateFormat.parse(newRes);
////        startDate.setTimeZone(utcZone);
//
////        Date startingDate1 = startDate.getTime();
////        SimpleDateFormat simDateFormat1 = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS");
////        String currentTime1 = simDateFormat.format(startingDate1);
////        Date dateLocal1 = simDateFormat.parse(currentTime1);
////        long epochTime2 = dateLocal1.getTime();
//    }

}
