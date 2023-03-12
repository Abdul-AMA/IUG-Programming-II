
public class Main {
    public static void main(String[] args) {
        Shape2 shape2 = new Shape2();
        Shape shape = new Shape();
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();

        System.out.println(show(shape2)); // No value
        System.out.println(show(shape)); // No value
        System.out.println(show(cir)); // No value
        System.out.println(show(rect)); // No value

    }

    public static String show(Object obj) {
        if (obj instanceof Shape) {
            return ((Shape) obj).print();
        }
        return "No value";
    }
}


class Shape {
    public Shape() {
    }

    public String print() {
        return "General";
    }
}

class Shape2 {
    public Shape2() {
    }
}

class Circle extends Shape {
    public Circle() {
    }

    @Override
    public String print() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    public Rectangle() {
    }

    @Override
    public String print() {
        return "Rectangle";
    }
}