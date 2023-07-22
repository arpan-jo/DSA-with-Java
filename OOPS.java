public class OOPS {

    // Encapsulation is defined as the wrapping up of data & methods under a single
    // unit. It also implements data hiding.
    public static void main(String[] args) {
        // Pen myPen = new Pen();
        // myPen.setColor("Blue");
        // myPen.setTip(10);
        // System.out.println(myPen.getColor());
        // System.out.println(myPen.getTip());

        // Student myStudent = new Student("Arpan");
        // System.out.println(myStudent.name);
        // Student1 myStudent1 = new Student1();
        // System.out.println(myStudent1.name);

        // HelloClassForAbs myDog = new HelloClassForAbs();
        // myDog.myAbsFun();
        // myDog.eat();
        // myDog.legs = 10;
        // System.out.println(myDog.legs)

        Queen myQueen = new Queen();
        myQueen.moves();

    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Hello from Queen moves");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Hello from Rook moves");
    }
}

abstract class MyAbstructClass {
    abstract void myAbsFun();
}

class HelloClassForAbs extends MyAbstructClass {
    void myAbsFun() {
        System.out.println("Abstruct class testing");
    }
}

class Animal {
    // void eat() {
    // System.out.println("eat");
    // }
    void eat() {
        System.out.println("eat");
    }

    void eat(String param) {
        System.out.println(param);
    }
}

class Mamals extends Animal {
    int legs;

    void mamal() {
        System.out.println("hello from mamals");
    }
}

class Dog extends Mamals {
    void dog() {
        System.out.println("hello from dogs");
    }
}

// class Student1 extends Student {
// }

// class Student {
// String name;

// Student(String name) {
// this.name = name;
// }

// Student() {
// System.out.println("Hello");
// }
// }

// class Pen {
// private String color;
// int tip;

// String getColor() {
// return this.color;
// }

// int getTip() {
// return this.tip;
// }

// void setColor(String color) {
// this.color = color;
// }

// void setTip(int tip) {
// this.tip = tip;
// }
// }