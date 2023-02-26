package Labs.Lab03;

public class ShapesDemo {
    public static void main(String[] args) {

        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(10,1);
        Cylinder cylinder3 = new Cylinder(2,10);

        System.out.println(cylinder1.toString());
        System.out.println(cylinder2.toString());
        System.out.println(cylinder3.toString());



    }
}
