class Student {
    public Student() {
        System.out.println("无参构造方法");
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = null;
        Animal a=new Animal("bob",18);
        System.out.println(a.age);
    }
}
class Animal{
    String name;
    int age;
    public Animal(String n, int a) {
        name= n;
        age = a;
        System.out.println("有参构造方法");
    }
}
