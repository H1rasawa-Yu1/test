class Student {
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
        System.out.print("我是 "+name+",今年 了"+age);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("yui");
        s1.setAge(0);
        s1.read();
    }
}