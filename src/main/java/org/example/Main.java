package org.example;

class Main {

    public static void main(String...args) {
        Program program = new Program();
        Program.main();
        program.createSomeCannons();
        program.fireEveryCannonOrLoadIt(3);
    }
}