import java.io.IOException;


public class test2 {
    public static void main(String[] args) {
        test2 obj = new test2();
        obj.p();
        System.out.println("finally");
    }

    public void m() throws IOException {
        throw new IOException("error");
    }

    public void n() throws IOException {
        m();
    }

    public void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled in p()");
        }
    }
}


