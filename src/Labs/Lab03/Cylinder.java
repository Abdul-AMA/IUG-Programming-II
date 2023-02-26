package Labs.Lab03;

public class Cylinder extends Circle{
    private double height = 1.0;


    public Cylinder(){

    }
    public Cylinder(double radius) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return 2*Math.PI*height*getRadius() + 2*super.getArea();
    }
    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString() {      // in Cylinder class
        return "Cylinder: " + "radius=" + getRadius()  // use Circle's toString()
                + " height=" + height
                + " base area=" + getArea()
                + "volume=" + getVolume()
                ;
    }
}
