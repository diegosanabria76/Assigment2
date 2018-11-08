package models.child;

import models.Toy;
import models.Toy.Type;

public class Child {
    private String name;

    //DIEGO: age should never be allowed to be less than 0 or higher than 17
    private int age;
    private Eye[] eyes;
    private Toy toy;

    //DIEGO: this consctructor needs to accept name, age and 1 eye but the caller of this method cannot be 
    //aware that there is an Eye object
    public Child(String name, int age, Eye.Colour eyeColour, Eye.Type eyeType){
        this.name = name;
        if(age > 0 || age >= 17){
        this.age = age;
        }else{
        	age=17;
        }
      this.eyes = new Eye[1];// this is an array, so do I have to loop trough it?
      this.eyes[0] = new Eye(eyeColour,eyeType);//this is the way to create one eye
       this.toy = null; // only default value on this variable. cause the constructor does not have one toy.
    }

    //DIEGO: this consctructor needs to accept name, age, 1 eye, and toy but the caller of this method 
    //cannot be aware that there are Eye and Toy objects
  //  (String name, Type type, double cost)
    public Child(String name, int age, Eye.Colour eyeColour, Eye.Type eyeType, String ToyName, Toy.Type toyType, double cost){
        this.name = name;
        this.age = age;
        this.eyes =  new Eye[2];
        eyes[0] = new Eye(eyeColour, eyeType);
        this.toy = new Toy(ToyName, toyType, cost);
    }

    //DIEGO: this consctructor needs to accept name, age and 2 eyes but the caller of this method cannot
    //be aware that there is an Eye object
    public Child(String name, int age, Eye.Type eyeType , Eye.Colour eyeColour){
        this.name = name;
        this.age = age;
        this.eyes =  new Eye[2];
        eyes[0] = new Eye(eyeColour, eyeType);
        eyes[1] = new Eye(eyeColour, eyeType);
        
        this.toy = null;
        
    }

//DIEGO: this consctructor needs to accept name, age, 2 eyes, and toy but the caller of this method cannot be aware
    //that there are Eye and Toy objects
    public Child(String name, int age, Type type, Eye.Type eyeType , Eye.Colour eyeColour, String toyName, Toy.Type toyType, double cost){
        this.name = name;
        this.age = age;
       this.eyes = new Eye[2];
       eyes[0] = new Eye(eyeColour, eyeType);
       this.toy = new Toy(toyName, toyType, cost);
    }

    public Child(String name, int age, Eye leftEye, Eye rightEye,String toyName, Toy.Type toyType, int cost)
    {
        this.name = name;
        this.age = age;

        eyes = new Eye[2];
        eyes[0] = leftEye;
        eyes[1] = rightEye;

        this.toy = new Toy(toyName, toyType, cost);
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    //DIEGO: this should return a nice string such as:
    //brown eyes
    //one brown and one green eye
    //brown eyes (1 prosthetic)
    //blue eyes (2 prosthetics)
    public String getEyes(){
    return this.eyes[0].getColour().toString() + " eyes " + this.eyes[0].getType().toString().toLowerCase();
    }

    //DIEGO: this should return a nice string ex:
    //car called El Diablo
    //doll named GI Joe
    //video game called GTA 20
    public String getToy(){
        return  "this is" +  this.toy.getType() + "called " + this.toy.getName() + this.toy.getCost() + " Dollars";
    }
}
