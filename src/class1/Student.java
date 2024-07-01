package class1;

public class Student {
    String name;
    int age;
    int grade;


    public String rtnString() {
        return "이름 : " + name + " 나이 : " + age + " grade : " + grade;
    }

    @Override
    public String toString() {
        return " toString() -- 이름 : " + name + " 나이 : " + age + " grade : " + grade;
    }
}
