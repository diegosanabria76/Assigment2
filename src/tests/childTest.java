package tests;

import java.awt.Color;
//import java.util.Scanner;

import javax.swing.plaf.ColorUIResource;

import models.Toy;
import models.Toy.Type;
import models.child.Child;
import models.child.Eye;
import models.child.Eye.Colour;
//import returnTypes.models.Hair;
//import returnTypes.models.Job;

public class childTest {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter a name for the child");
		String name = input.nextLine();
		
		System.out.println("Enter age for the child");
		int age = input.nextInt();
		
		
		
		
		
		Eye leftEye ;
		Eye rightEye;
		// Toy(String name, Type type, double cost)
		
//		String toyName;
//		System.out.println("Enter the name of the toy");
//		toyName = input.nextLine();
		
		
		//Hair.Type type = Hair.Type.CURLY;// was working but not anymore!
		//Job job = Job.JAVA_PROGRAMMER;//
		
		
		System.out.println("Enter price for a ");
		double cost = input.nextInt();
		
		Toy.Type toy = Toy.Type.CAR;
		
		
		
		//Child(String name, int age, Eye.Colour eyeColour, Eye.Type eyeType)
		Eye.Colour eyeColour = Eye.Colour.BLUE;
		Eye.Type eyeType = Eye.Type.PROSTHETIC;
		Child child = new Child(name, age, eyeColour, eyeType);
		
		String name2 = "Michael";
		int age2 = 19;
		Eye.Colour eyeColour2 = eyeColour.BROWN;
		Eye.Type eyeType2 = Eye.Type.REAL;
		String toyName2 = "Nintendo";
		Toy.Type toyType2 = Toy.Type.VIDEO_GAME;
		double cost2 = 400;
		//Child(String name, int age, Eye.Colour eyeColour, Eye.Type eyeType, String ToyName, Toy.Type toyType, double cost){
		Child child2 = new Child(name2, age2, eyeColour2,eyeType2, toyName2, toyType2, cost2);
		System.out.println("This is the second child "+child2.toString());
				
		
		System.out.println("The child age is "+child.getAge()+"years old");
		System.out.println("The child eyes are "+child.getEyes());
		System.out.println("The child name is "+child.getName());
		System.out.println("The child has a " + toy.toString().toLowerCase() + " toy");
		
		//Child(String name, int age, Type type, double cost)
		//Child child2 = new Child(name, age, );  not capable of build an object from this constructor.

	}

}

