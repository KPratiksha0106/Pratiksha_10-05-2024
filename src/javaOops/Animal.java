package javaOops;

public class Animal {
    //fields
	
	private String name;
	private int noOfLegs;
	private String colour;
	private String eyeColour;

	// default constructor
	public Animal()
	{
		name= "Tiger";
		noOfLegs= 4;
		colour="Brown";
		eyeColour="black";
		
		
	}
	//parameterized constructor
	public Animal(String name,int noOfLegs,String colour,String eyeColour) {
		this.name = name;
		this.noOfLegs = noOfLegs;
		this.colour = colour;
		this.eyeColour = eyeColour;
		
	}
	//method
	public void DisplayAnimalFeatures(){
		System.out.println(name);
		System.out.println(noOfLegs);
		System.out.println(colour);
		System.out.println(eyeColour);


		
	}
	
	}


	

	

