package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        /*
        Student("학생1", 15, 90);
        Student("학생2", 16, 80);
        */

        // 배열 사용
        /*
        String [][] StudentArr = { {"학생1", "15", "90"}, {"학생2", "16", "80"} };
        for( String[] arr : StudentArr ){
            String name = arr[0];
            String age = arr[1];
            String grade = arr[2];
            System.out.println("이름 : " + name + " 나이 : " + age + " grade : " + grade);
        }
        */

        /*
        Student student1; // 변수 선언
        student1 = new Student(); // 객체 생성
        // 이때 student1 은 Student 의 인스턴스
        student1.name="학생1";
        student1.age=15;
        student1.grade=90;
        System.out.println(student1.toString());
        */

        Student student1 = studentFnc("1학생1", 15, 90);
        System.out.println("객체 출력 :: " + student1); // class1.Student@23fc625e
        System.out.println("toString :: " + student1.toString()); // class1.Student@23fc625e
        System.out.println(student1.rtnString()); // 이름 : 1학생1 나이 : 15 grade : 90

        Student student2 = studentFnc("2학생2", 16, 80);
        System.out.println("객체 출력 :: " + student2); // class1.Student@548c4f57
        System.out.println("toString :: " + student2.toString()); // class1.Student@548c4f57
        System.out.println(student2.rtnString()); // 이름 : 2학생2 나이 : 16 grade : 80
    }

    /*
    public static void student(String name, int age, int grade){
        String rtn = "이름 : " + name + " 나이 : " + age + " grade : " + grade;
        System.out.println(rtn);
    }
    */


    public static Student studentFnc(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
}

