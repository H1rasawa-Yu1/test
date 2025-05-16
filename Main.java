class Student {
<<<<<<< HEAD
    public Student() {
        System.out.println("无参构造方法");
    }
}
class Animal{
    String name;
    int age;
    public Animal(String n, int a) {
        name= n;
        age = a;
        System.out.println("有参构造方法");
=======
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("error");
        }
        else {
            this.age = age;
        }
    }
    void read(){
        System.out.print("我是 "+name+",今年 "+age);
>>>>>>> faf4e6e87a5704829d067e325fa86c3204107770
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
<<<<<<< HEAD
        Student s2 = null;
        Animal a=new Animal("bob",18);
        System.out.println(a.age);
=======
        s1.setName("yui");
        s1.setAge(0);
        s1.read();
>>>>>>> faf4e6e87a5704829d067e325fa86c3204107770
    }
}