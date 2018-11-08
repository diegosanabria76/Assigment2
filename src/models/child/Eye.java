package models.child;

public class Eye{
    private Colour colour;
    private Type type;

    //DIEGO: note how I do not allow nulls
    public Eye(Colour colour){
        if(colour == null) throw new IllegalArgumentException("null values are not accepted");

        this.colour = colour;
        this.type = Type.REAL;
    }

    public Eye(Colour colour, Type type){
        if(colour == null || type == null) throw new IllegalArgumentException("null values are not accepted");

        this.colour = colour;
        this.type = type;
    }

    //DIEGO: note that throwing an exception inside the constructor stops the object from being instantiated. 
    //Thus, not allowing invalid objects to be created
    public Eye(String colour, String type){
         if(colour.equalsIgnoreCase(Colour.BLUE.toString())) this.colour = Colour.BLUE;
         else if(colour.equalsIgnoreCase(Colour.GREEN.toString())) this.colour = Colour.GREEN;
         else if(colour.equalsIgnoreCase(Colour.BROWN.toString())) this.colour = Colour.BROWN;
         else throw new IllegalArgumentException("Eye colour was not one of the accepted values");

         if(type.equalsIgnoreCase(Type.REAL.toString())) this.type = Type.REAL;
         else if(type.equalsIgnoreCase(Type.PROSTHETIC.toString())) this.type = Type.PROSTHETIC;
         else throw new IllegalArgumentException("Eye type was not one of the accepted values");
    }

    public String getColour(){
        return this.colour.toString();
    }

    public Type getType(){
        return this.type;
    }


    public enum Colour{
        GREEN(java.awt.Color.GREEN),
        BLUE(java.awt.Color.BLUE),
        BROWN(new java.awt.Color(160, 82, 45));

        private java.awt.Color colour;

        private Colour(java.awt.Color colour) {
            this.colour = colour;
        }

        //DIEGO: Notice the pattern used here, declare variable of type you want to return, figure out the value you want to return, return the variable.
        @Override
        public String toString(){
            String stringRepresentationOfColour = null;

            if(this.equals(GREEN)) stringRepresentationOfColour = "green";
            else if(this.equals(BLUE)) stringRepresentationOfColour = "blue";
            else if(this.equals(BROWN)) stringRepresentationOfColour = "brown";

            return stringRepresentationOfColour;
        }
    }

    public enum Type{
        REAL,
        PROSTHETIC
    }
}