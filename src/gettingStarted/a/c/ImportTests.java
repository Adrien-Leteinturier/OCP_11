package gettingStarted.a.c;

import java.lang.*;  // This is redundant but OK, always included

import gettingStarted.a.b.PackageTest;

public class ImportTests {
    public static void main(String[] args) {
        System.out.println("Import Tests");
        PackageTest.main(args);
    }
}