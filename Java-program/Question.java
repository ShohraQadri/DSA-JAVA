import java.util.jar.Attributes.Name;

class Student {
    String name;
    int age;
    int marks[] = new int[3];

    Student(String Name, int Age, int Marks[]) {
        name = Name;
        age = Age;
        marks[0] = Marks[0];
        marks[1] = Marks[1];
        marks[2] = Marks[2];
    }

    public String get_name() {
        return name;
    }

    public int get_age() {
        return age;
    }

    public int get_maximum_marks() {
        int maximum = marks[0];
        if (marks[1] >= marks[0] && marks[1] >= marks[2]) {
            maximum = marks[1];
        } else if (marks[2] >= marks[1] && marks[2] >= marks[0]) {
            maximum = marks[2];
        }
        return maximum;
    }
}

public class Question {
    public static void main(String arg[]) {
        int marks[] = new int[3];
        marks[0] = 55;
        marks[1] = 80;
        marks[2] = 90;

        Student obj = new Student("Shohra", 24, marks);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.get_maximum_marks());

    }
}
