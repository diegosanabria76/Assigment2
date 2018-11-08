package tests;

//import com.sun.javaws.exceptions.InvalidArgumentException;


public class ConstructorExceptionTest {
    public static void main(String[] args) {
        A a = null;
        try {
            a = new A("HELLO WORLD!");
        }
        catch(IllegalArgumentException iae){

        }

        //If this prints out, the object has been created, if a NullPointerException is thrown, it was not
        System.out.println(a.name);
    }

    static class A{
        String name;

        A(String name){
            this.name = name;
           // throw new IllegalArgumentException();
        }
    }
}
