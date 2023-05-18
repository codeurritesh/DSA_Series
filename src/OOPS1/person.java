package OOPS1;

public class person {
    private String name;
    private int age;
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void intro(){
        System.out.println("My name is "+this.name+" and my age is "+this.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setAge(int age) throws Exception {
//        if(age<0){
//            throw new Exception("Not valid age");
//        }
//        this.age = age;
//    }
public void setAge(int age) {// Exception by using try and catch block
        try {


            if (age < 0) {
                throw new Exception("Not valid age");
            }
        }
        catch(Exception err){
            System.out.println(err);// print the exception
            err.printStackTrace();
        }
    this.age = age;
}
}
