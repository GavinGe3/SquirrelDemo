package SquirrelDemo;

public class SquirrelDemo{

    Boolean alive;
    String color;
    String weight;
    String height;
    String name;
    int health = 0; 

    public SquirrelDemo(Boolean newAlive, String newColor, String newWeight, String newHeight, String newName){
        this.alive = newAlive;
        this.color = newColor;
        this.weight = newWeight;
        this.height = newHeight;
        this.name = newName;
        this.health = 100;
    }

    public void walk(){
        System.out.println(this.name + " is walking.");
    }
    public void eat(){
        System.out.println(this.name + " is eating.");
        this.health += 5;
    }
    public void sleep(){
        System.out.println(this.name + " is sleeping.");
        this.health += 5;
    }
    public int getHealth(){
        return this.health;
    }
    public void injury(){
        this.health--;
    }
}

