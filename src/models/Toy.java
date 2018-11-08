package models;

public class Toy {
    private String name;
    private Type type;

    //DIEGO: The cost should not have more than 2 decimal places, if the value given does have more than 2,
    //it should truncate (cut) the extra decimal place values
    //ex: if cost = 20.12345, you should save it as 20.12.
    //google how to remove decimal place values or figure out your own solution
    private double cost;

    public Toy(String name, Type type, double cost){
        this.name = name;
        this.type = type;
        this.cost = (int)(this.cost * 100.0) / 100.0;
   
        
                
       
        
    }

    public String getName(){
        return this.name;
    }

    //DIEGO: complete this method to return a beautiful String
    public String getType(){
    	
    	return this.type.toString().replaceAll("_", " ").toLowerCase();
    	
    }

    public double getCost(){
        return this.cost;
    }

    public enum Type{
        CAR,
        DOLL,
        VIDEO_GAME
    }
}
