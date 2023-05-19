class Pen {
    String color;
    String type; // ballpoint: gel

    public void write() {
        System.out.println("writting something");
    }
    public void printColor() {
        System.out.println(this.color);
    }

}

class Student {
    String name;
    Integer age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
// constructor --
// 3  types - 1st -- non parameter
    // 2nd -- with parameters like below
    // 3rd -- copy constructor
//    Student(String name, int age) {
//        this.name= name;
//        this.age = age;
//    }

    Student(Student s2)
}

public class OOPS {
    public static void main(String[] args) {
//        Pen pen1 = new Pen();
//        pen1.color = "blue";
//        pen1.type = "gel";
//
//        Pen pen2 = new Pen();
//        pen2.color = "black";
//        pen2.type = "ballpoint";
//
//        pen1.printColor();
//        pen2.printColor();
//
//
//        pen1.write();

        Student s1 = new Student("aman" , 22);
//        s1.name = "sharma";
//        s1.age = 22;
        s1.printInfo();
    }

}