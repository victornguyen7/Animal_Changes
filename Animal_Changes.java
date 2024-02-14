package Animal_Changes;
import java.util.Random;
import java.util.Scanner;
public class Animal_Changes {
	
	private double height;
	private double weight;
	private String habitat;
	private int age;
	private boolean predator;
	private String firstName;	
	private String gender;
	private String color;
	private int speed;
	private int IQ;
	
	public Animal_Changes( double h, double w, String ha, int a, boolean p, String fn, String g, String c, int s, int iq) {
		height = h;
		weight = w;
		habitat = ha;
		age = a;
		predator = p;
		firstName = fn;
		gender = g;	
		color = c;
		speed = s;
		IQ = iq;
	}
	public double getHeight() {
		return height;
	}//method to get the height for the animal
	
	public void setHeight(double newHeight) {
		height = newHeight;
	}//method to set the height for the animal
	
	public double getWeight() {
		return weight;
	}//method to get the weight for the animal
	
	public void setWeight(double newWeight) {
		weight = newWeight;
	}//metod to set the weight for the animal
	
	public String getHabitat() {
		return habitat;
	}//method to get the habitat for the animal
	
	public void setHabitat(String newHabitat) {
		habitat = newHabitat;
	}//method to set the habitat for the animal
	
	public int getAge() {
		return age;
	}//method to get the age for the animal
	
	public void setAge(int newAge) {
		age = newAge;
	}//method to set the age for the animal
	
	public boolean getPredator() {
		return predator;
	}//method to get the predator for the animal
	
	public void setPredator(boolean newPredator) {
		predator = newPredator;
	}//method to set the predator for the animal
	
	public String getFirstName() {
		return firstName;
	}//method to get the name for the animal
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}// method to set the name for the animal
	
	public String getColor() {
		return color;
	}// method to get the color for the animal
	
	public void setColor(String newColor) {
		color = newColor;
	}// method to set the color for the animal
	
	public String getGender() {
		return gender;
	}// method to get the gender for the animal
	
	public void setGender(String newGender) {
		gender = newGender;
	}// method to set the gender for the animal
	
	public int getSpeed() {
		return speed;
	}// method to get the speed for the animal
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}// method to set the speed for the animal
	
	public int getIQ() {
		return IQ;
	}// method to get the IQ for the animal
	
	public void setIQ(int newIQ) {
		IQ = newIQ;
	}// method to set the IQ for the animal
	
	public void compareWeight(Animal_Changes an) {
		if(weight < an.getWeight()) {
			System.out.println(this.getFirstName() + " is not heavier as " + an.getFirstName());
		}
		else if(weight > an.getWeight()) {
			System.out.println(this.getFirstName() + " is heavier than " + an.getFirstName());
		}
		else {
			System.out.println("They have the same weight.");
		}
	}// method to compare weights of two animals
	
	public void compareHeight(Animal_Changes an) {
		if(height < an.getHeight()) {
			System.out.println(this.getFirstName() + " is shorter than " + an.getFirstName());
		}
		else if(height > an.getHeight()) {
			System.out.println(this.getFirstName() + " is taller than " + an.getFirstName());
		}
		else {
			System.out.println("They have the same height.");
		}
	}//method to compare heights of two animals
	
	public String makeNoise() {
		return "A noise";
	}//method to make a default animal noise
	
	public boolean liveTogether(Animal_Changes an) {
		boolean liveTogether = false;
		if(!predator == !an.getPredator() && habitat.equals(an.getHabitat())) {
			liveTogether = true;
		}
		return liveTogether;
	}//method to check if two animals can live with each other
	
	public String informationOfAnimal() {
		return firstName + " has " + height + " heights, " + weight + " weights, " + age + " years old, " + speed + " speeds, and " + IQ + " IQ";
	}// method to returns the informations of the animal
}
