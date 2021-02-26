package gettingStarted;

public class TestImport {
    public static void main(String[] args) {
        String s = "We are testing ways to import classes";
        System.out.println(s);

        VineVegetable.main(args);
        gettingStarted.vegetable.VineVegetable.main(args);
    }
}

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am gettingStarted.a local vegetable that grows on gettingStarted.a vine.");
    }
}
