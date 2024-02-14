package Animal_Changes;
import java.util.Random;
public class Cat_Changes extends LandAnimal_Changes{
	
	private String food;
	private String activity;
	
	public Cat_Changes(double h, double w, int a, boolean p, String fn, String g, String c, int ws, int iq, String f, String ac) {
		super(h, w, a, p, fn, g, c, ws, iq);
		// TODO Auto-generated constructor stub
		food = f;
		activity = ac;

	}
	public void makeNoise(int repeat) {
		for( int i = 1; i <= repeat; i++) {
			System.out.println("moeww");
		}
	}//method to make a unique cat noise
	
	public String informationOfFavoriteLandAnimal() {
		return getFirstName() + " has " + getHeight() + " heights, " + getWeight() + " weights, " + getAge() + " years old, " + getWalkingSpeed() + " walking speeds, " + getIQ() + " IQ, " + food + " is the favorite food, and " + activity + " is the favorite activity.";
	}// method to returns the informations of the favorite land animal
}
