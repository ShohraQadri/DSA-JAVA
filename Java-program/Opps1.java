class SchoolMembers {
    String name;
    int number;
}

class Teacher extends SchoolMembers {
    Teacher() {
        number++;
    }
}

class Student extends SchoolMembers {
    Student() {
        number++;
    }
}

public class Opps1 {
    public static void main(String[] arg) {
        Student obj = new Student();
        Teacher obj1 = new Teacher();

        System.out.println(obj.name);
        System.out.println(obj1.name);
    }
}
