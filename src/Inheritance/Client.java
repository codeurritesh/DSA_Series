package Inheritance;

public class Client {
    public static void main(String[] args) {
        //CASE-1
//        parent obj=new parent();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();
        /*
        output-
         1
        10
        Fun from Parent
        Fun1 from Parent*/


        //CASE-2
//        parent obj=new Child();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        System.out.println(((Child)(obj)).d);
//        System.out.println(((Child)(obj)).d2);
//        obj.fun();
//        obj.fun1();
//        obj.fun2(); not accessed direcly
        //((Child)(obj)).fun2();
        /*
        Output:
             1
            10
            2
            20
            Fun from Child
            Fun1 from Parent
            Fun2 from Child
         */



        //CASE-3
//        Child obj=new parent();// show err

        //CASE-4
//        Child obj=new Child();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        System.out.println(((parent)(obj)).d);
//        System.out.println(obj.d2);
//        obj.fun();
//        obj.fun1();
//        obj.fun2();

    }
}
