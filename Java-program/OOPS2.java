class car {
    String color;
    int speed;

    void start() {
        System.out.println("car is starting");
    }

    void stop() {
        System.out.println("car is stop");
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name : " + name + "age : " + age);
    }
}

public class OOPS2 {

    // car info

    // public static void main(String[] arg) {
    // car mycar = new car();

    // mycar.color = "red";
    // mycar.speed = 300;

    // mycar.start();
    // mycar.stop();
    // }

    // person

    public static void main(String[] arg) {
        Person p1 = new Person("Shohra ", 24);
        Person p2 = new Person("saif ", 26);

        p1.displayInfo();
        p2.displayInfo();
    }
}
