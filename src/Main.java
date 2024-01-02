////import com.sun.security.jgss.GSSUtil;
//
////import java.lang.reflect.Array;
////import java.util.ArrayList;
//
//import java.net.Proxy;
//import java.sql.Array;
//import java.util.Scanner;
//import java.util.*;
//
//
//public class Main {
//
//    public static void printArray(int arr[]){
//        for(int i=0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }
//
//    static int[]get(){
//        return new int[]{445,5645};
//    }
//
//
//    public static void main(String[] args) {
//
//
//        // array input function
//
//        int myarr[]=get();
//
//
//        printArray(myarr);
//
//
////        int n;
////
////        Scanner my=new Scanner(System.in);
////        n= my.nextInt();
////        int myResult = n+34;
////        System.out.println(myResult);
//
//
////        int myArr[] = {3, 56, 5, 5};
////        for(int i: myArr){
//////            System.out.println(i);
////            System.out.println(myArr[0]);
////        }
//
////        String arr[] = {"my","what","myname"};
////        for(String i:arr){
////            System.out.println(i);
////        }
////        int n;
////        Scanner myValue = new Scanner(System.in);
////        System.out.println("inter your array: ");
////        n=myValue.nextInt();
////        int[] array = new int[10];
////        for(int i=0; i<n; i++){
////            array[i] = myValue.nextInt();
////        }
////
////        for(int i=0; i<=n; i++){
////            System.out.println(array[i]);
////        }
////
////        System.out.println(n);
//
//        printArray(new int[]{34,54,65,65,65,44,33,3});
//
//
//
//        int []myArray = new int[]{3,4,5,6,3};
//
//
////        my(myArray);
//
//
//
//
//
//
//
//
//
//    }
//}


//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class Main {
//    public static void main(String[] args){
//        ArrayList<HashMap<String,String>>arrayList = new ArrayList<>();
//        HashMap<String,String>hashMap= new HashMap<>();
//
//        hashMap.put("name", "nirapdak");
//        hashMap.put("email", "Nirpadak@gmail.com");
//        arrayList.add(hashMap);
//
//        hashMap = new HashMap<>();
//        hashMap.put("name", "Bijoy");
//        hashMap.put("email", "bijoy@gamil.com");
//        arrayList.add(hashMap);
//
//        for (int i=0; i<arrayList.size(); i++){
//            hashMap = arrayList.get(i);
//            String name = hashMap.get("name");
//            String email = hashMap.get("email");
//            System.out.println(name+"\n"+email);
//
//        }
//
//        String name = "niradak";
//        for (int j=0; j<name.length(); j++){
//            System.out.println(j);
//        }
//
//
//
//
//
//
//
//
//
//    }
//
//}



// how to user defined package import


import TaxtCalculator.employee;
import TaxtCalculator.fullTimeEmployee;
import TaxtCalculator.partTimeEmployee;



import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){


        employee fullTimeEmployee = new fullTimeEmployee("Nirpaddak","Developer", 32948, 2002);


        fullTimeEmployee.saySomething();
        String name =fullTimeEmployee.getName();
        String pos = fullTimeEmployee.getPosition();
        float salary = fullTimeEmployee.getSalary();
        float taxt = fullTimeEmployee.calculate();


        System.out.println(name+"\n"+pos+" \n"+salary+"\n myText is : "+taxt+"\n I'm "+ fullTimeEmployee.getDataOfBirth()+" year old"+"myActual Salary : "+ fullTimeEmployee.actualSalary());


        employee PartTimeEmployee = new partTimeEmployee("bejoy pal", "App developer", 10000, 2007);

        PartTimeEmployee.saySomething();
        System.out.println(PartTimeEmployee.getName());
        System.out.println(PartTimeEmployee.getPosition());
        System.out.println(PartTimeEmployee.getSalary());
        System.out.println("myTEXt is: "+PartTimeEmployee.calculate());
        System.out.println("I'm "+ PartTimeEmployee.calculateAge());

        // data and time object in java ----------------------------
        LocalDate dataObj = LocalDate.now();
        LocalTime timeObj = LocalTime.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("dd:MM:yyyy");


        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter Moth = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter year = DateTimeFormatter.ofPattern("yyyy");


        System.out.println("\ntoday "+date.format(dataObj));
        System.out.println("\nmoth "+Moth.format(dataObj));
        System.out.println("\nYear "+year.format(dataObj));

        System.out.println(formatter.format(timeObj));
        System.out.println(dayFormatter.format(dataObj));

        System.out.println("\n"+timeObj);
        System.out.println("\n\n"+dataObj);



        employee anotherEmployee = new employee("sumon", "Web Developer", 30000, 2000) {

            LocalDate obj = LocalDate.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");
            int myYear = Integer.parseInt(dateTimeFormatter.format(obj));

            @Override
            public float calculate() {
                return getSalary()*4/100;
            }

            @Override
            public int calculateAge() {
                return myYear-getDataOfBirth();
            }

            @Override
            public int actualSalary() {
                return (int) (getSalary()-calculate());
            }
        };

        System.out.println("\n\n\n");
        System.out.println("my name is : "+anotherEmployee.getName());
        System.out.println("my position :"+anotherEmployee.getPosition());
        System.out.println("my Taxt : "+anotherEmployee.calculate());
        System.out.println("I'm : "+anotherEmployee.calculateAge());
        System.out.println("my salary: "+anotherEmployee.getSalary());
        System.out.println("my actual salary: "+anotherEmployee.actualSalary());

//        oop employeeOne = new oop("nirapadak", "developer", 234);
//
//        oop employeeTwo = new oop("Bijoy", "Chandra", "App developer", 3000, 3);
//
//
//
//
//
//        System.out.println(employeeOne.getName());
//        System.out.println(employeeOne.getPosition());
//        System.out.println(employeeOne.getSalary());
//        System.out.println(employeeOne.getmyCount());
//        System.out.println("\n");
//        System.out.println(employeeTwo.getName());
//        System.out.println(employeeTwo.getPosition());
//        System.out.println(employeeTwo.getSalary());
//        System.out.println("\n");
//        employeeOne.sayHello();
//        employeeOne.propertyOne();

//        ArrayList arrayList;
//
//        arrayList = new ArrayList<>();
//
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//        arrayList.add(6);
//
//        arrayList.forEach((e)-> System.out.println(e));




    }
}