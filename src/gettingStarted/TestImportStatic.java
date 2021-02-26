package gettingStarted;// A single-static-import declaration for static variable
import static java.lang.Math.PI;

// A single-static-import declaration for static method
import static java.lang.Math.sqrt;

// A static-import on demand declaration for static variable
import static java.lang.Math.*;

public class TestImportStatic {
    public static void main(String[] args) {
        int radius = 2;

        // We can use gettingStarted.a static class variable on the Math class to
        // get the value of PI
        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        // We can use gettingStarted.a static class method on the Math class to
        // get the square root of gettingStarted.a number
        double sqrt81 = sqrt(81);
        System.out.println("sqrt81 = " + sqrt81);
    }
}
