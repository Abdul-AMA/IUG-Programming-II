package Chapters.Chapter09;
public class P9_11 {
    public static void main(String[] args) {
        LinearEquation linearEquation = new LinearEquation(6, 2, 3, 1, 3, 2);
        System.out.println(linearEquation.isSolvable() ? "x = " + linearEquation.getX() +
                ", Y = " + linearEquation.getY() : "The equation has no solution");
    }
}
class LinearEquation {
    private int a, b, c, d, e, f;
    LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public int getA() {return a;}
    public int getB() {return b;}
    public int getC() {return c;}
    public int getD() {return d;}
    public int getE() {return e;}
    public int getF() {return f;}
    public boolean isSolvable() {
        if ((a * d) - (b * c) == 0) {
            return false;
        } else
            return true;
    }
    public int getX() {return ((e * d) - (b * f)) / ((a * d) - (b * c));}
    public int getY() {return ((a * f) - (e * c)) / ((a * d) - (b * c));}
}
