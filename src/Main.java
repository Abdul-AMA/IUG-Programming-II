
public class Main {
    public static void main(String[] args) {


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