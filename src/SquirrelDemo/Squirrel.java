package SquirrelDemo;

public class Squirrel {

    public static void main(String[] args){


    SquirrelDemo squirrel1 = new SquirrelDemo(true, "red", "175 pounds", " 5 foot 6", "Tyler1");
    SquirrelDemo squirrel2 = new SquirrelDemo(true, "red", "250 pounds", " 6 foot 5", "FakeTyler1");
    SquirrelDemo squirrel3 = new SquirrelDemo(true, "red", "500 pounds", "10 feet", "Mutant");

    squirrel1.walk();
    squirrel2.eat();
    squirrel3.sleep();
    System.out.println(squirrel2.name + " has " + squirrel2.getHealth() + " health.");

    }
}
