package Animal_Changes;

import java.util.Random;

public class SeaAnimal_Changes extends Animal_Changes{
	
	private int swimmingSpeed;

	public SeaAnimal_Changes(double h, double w, int a, boolean p, String fn, String g, String c, int sws, int iq) {
		super(h, w, "sea", a, p, fn, g, c, sws, iq);
		// TODO Auto-generated constructor stub
		
		swimmingSpeed = sws;
		// changes the speed to swimmingSpeed
	}
	
	public int getSwimmingSpeed() {
		return swimmingSpeed;
	}// method to get the swimming speed for the sea animal
	
	public void setSwimmingSpeed(int newSwimmingSpeed) {
		swimmingSpeed = newSwimmingSpeed;
	}// method to set the swimming speed for the sea animal
	
	public String swim(int time) {
		double distance = swimmingSpeed * time;
		String Distance = String.valueOf(distance);
		return this.getFirstName() + " swims " + Distance + " inches";
	}//method to simulate the sea animal to swim
	
	public String battle(String location, Animal_Changes an) {
		
		double ageBenefit = (getAge() < an.getAge()) ? 1 : 1.5;
	    double locationBenefit = (location.equals(getHabitat())) ? 1.5 : 1;
	    double predatorBenefit = (getPredator() == true) ? 1.25 : 1;
	    double speedBenefit = (getSpeed() != 0) ? (getSpeed() * 0.5) : (((SeaAnimal_Changes) this).getSwimmingSpeed() * 0.5);
		double strength = getHeight() * getWeight() * ageBenefit * locationBenefit * predatorBenefit * speedBenefit;
		//calculate the strength of the first animal
		
		double anAgeBenefit = (getAge() < an.getAge()) ? 1.5 : 1;
		double anLocationBenefit = (location.equals(an.getHabitat())) ? 1.5 : 1;
	    double anPredatorBenefit = (an.getPredator() == true) ? 1.25 : 1;
	    double anSpeedBenefit = (an.getSpeed() != 0) ? (an.getSpeed() * 0.5) : (((SeaAnimal_Changes) an).getSwimmingSpeed() * 0.5);
		double anStrength = an.getHeight() * an.getWeight() * anAgeBenefit * anLocationBenefit * anPredatorBenefit * anSpeedBenefit;
		//calculate the strength of the second animal
		
		if(strength < anStrength) {
			return an.getFirstName() + " ( " + anStrength + " strengths )" + " wins the battle against the " + this.getFirstName() + " ( " + strength + " strengths )" + " on " + location;
		}
		else if(strength > anStrength) {
			return this.getFirstName() + " ( " + strength + " strengths )" + " wins the battle against the " + an.getFirstName() + " ( " + anStrength + " strengths )" + " on " + location;
		}
		else {
			return "The battle ended in draw in " + location;
		}
	}//method simulate the battle between two animals 
	
	public String battle(String location, Animal_Changes an, Animal_Changes an2) {
		double ageBenefit = (getAge() < an.getAge()) ? 1 : 1.5;
	    double locationBenefit = (location.equals(getHabitat())) ? 1.5 : 1;
	    double predatorBenefit = (getPredator() == true) ? 1.25 : 1;
	    double speedBenefit = (getSpeed() != 0) ? (getSpeed() * 0.5) : (((SeaAnimal_Changes) this).getSwimmingSpeed() * 0.5);
		double strength = getHeight() * getWeight() * ageBenefit * locationBenefit * predatorBenefit * speedBenefit;
		//calculate the strength of the first animal
		
		double anAgeBenefit = (getAge() < an.getAge()) ? 1.5 : 1;
		double anLocationBenefit = (location.equals(an.getHabitat())) ? 1.5 : 1;
	    double anPredatorBenefit = (an.getPredator() == true) ? 1.25 : 1;
	    double anSpeedBenefit = (an.getSpeed() != 0) ? (an.getSpeed() * 0.5) : (((SeaAnimal_Changes) an).getSwimmingSpeed() * 0.5);
		double anStrength = an.getHeight() * an.getWeight() * anAgeBenefit * anLocationBenefit * anPredatorBenefit * anSpeedBenefit;
		//calculate the strength of the second animal
		
		double an2AgeBenefit = (getAge() < an2.getAge()) ? 1.5 : 1;
		double an2LocationBenefit = (location.equals(an2.getHabitat())) ? 1.5 : 1;
	    double an2PredatorBenefit = (an2.getPredator() == true) ? 1.25 : 1;
	    double an2SpeedBenefit = (an2.getSpeed() != 0) ? (an2.getSpeed() * 0.5) : (((SeaAnimal_Changes) an2).getSwimmingSpeed() * 0.5);
		double an2Strength = an2.getHeight() * an2.getWeight() * an2AgeBenefit * an2LocationBenefit * an2PredatorBenefit * an2SpeedBenefit;
		//calculate the strength of the third animal
		
		boolean workWithAn = new Random().nextBoolean();
		boolean workWithAn2 = new Random().nextBoolean();
		//random if the animals work together or not
		
		if(workWithAn == true && workWithAn2 == false) {
			double total1 = strength + anStrength;
			if(total1 > an2Strength) {
				return this.getFirstName() + " ( " + strength + " strengths )" + " works with the " + an.getFirstName() + " ( " + anStrength + " strengths )" + " and wins the battle on " + location;
			}
			else {
				return this.getFirstName() + " ( " + strength + " strengths )" + " works with the " + an.getFirstName() + " ( " + anStrength + " strengths )" + " and loses the battle on " + location;
			}
		}
		else if(workWithAn == false && workWithAn2 == true){
			double total2 = strength + an2Strength;
			if(total2 > anStrength) {
				return this.getFirstName() + " ( " + strength + " strengths )" + " works with the " + an2.getFirstName() + " ( " + an2Strength + " strengths )" + " and wins the battle on " + location;
			}
			else {
				return this.getFirstName() + " ( " + strength + " strengths )" + " works with the " + an2.getFirstName() + " ( " + an2Strength + " strengths )" + " and loses the battle on " + location;
			}
		}
		else {
			if(strength > anStrength && strength > an2Strength) {
				return this.getFirstName() + " ( " + strength + " strengths )" + " wins the battle individually on " + location;
			}
			else if(anStrength > an2Strength && anStrength > strength) {
				return an.getFirstName() + " ( " + anStrength + " strengths )" + " wins the battle individually on " + location;
			}
			else {
				return an2.getFirstName() + " ( " + an2Strength + " strengths )" + " wins the battle individually on " + location;
			}
		}
	}//method simulate the battles between three animals
}
