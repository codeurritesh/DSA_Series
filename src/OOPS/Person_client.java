package OOPS;

public class Person_client {
    public static void main(String[] args) {
        person obj=new person("ritesh verma",21);// Using parameterised consturctor
//        obj.intro();
//        obj.name="ritesh"; // Data Member is not accessed in private type
//        obj.age=25;
//        obj.setAge(25);
//        obj.setName("Ritesh Verma");
//        System.out.println(obj.getAge());
        obj.setAge(-2);
        obj.intro();
    }
}
