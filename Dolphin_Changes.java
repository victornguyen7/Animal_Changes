package Animal_Changes;
import java.util.Random;
public class Dolphin_Changes extends SeaAnimal_Changes{
	
	private String food;
	private String activity;

	public Dolphin_Changes(double h, double w, int a, boolean p, String fn, String g, String c, int sws, int iq, String f, String ac) {
		super(h, w, a, p, fn, g, c, sws, iq);
		// TODO Auto-generated constructor stub
		food = f;
		activity = ac;
	}
	
	public void makeNoise(int repeat) {
		for( int i = 1; i <= repeat; i++) {
			System.out.println("eeeee");
		}
	}//method to make a unique dolphin noise
	
	public String informationOfFavoriteSeaAnimal() {
		return getFirstName() + " has " + getHeight() + " heights, " + getWeight() + " weights, " + getAge() + " years old, " + getSwimmingSpeed() + " swimming speeds, " + getIQ() + " IQ, " + food + " is the favorite food, and " + activity + " is the favorite activity.";
	}// method to returns the informations of the favorite land animal
}