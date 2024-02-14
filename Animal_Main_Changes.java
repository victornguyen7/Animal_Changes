package Animal_Changes;

public class Animal_Main_Changes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat_Changes cat = new Cat_Changes(12, 15, 3, true, "Cat", "male", "black", 10, 100, "fish", "sleep");
		Dolphin_Changes dolphin = new Dolphin_Changes(25, 20, 5, false, "Dolphin", "male", "white", 15, 158, "fish", "swim");
		
		LandAnimal_Changes dog = new LandAnimal_Changes(19, 15, 3, true, "Dog", "female", "Yellow", 15, 90);
		SeaAnimal_Changes turtle = new SeaAnimal_Changes(25, 30, 5, false, "Turtle", "male", "green", 2, 70);
		
		Animal_Changes monkey = new Animal_Changes(15, 20, "forest" ,10, false, "Monkey", "male", "brown", 18, 100);
		Animal_Changes shark = new Animal_Changes(35, 40, "deep-sea",20, true, "Shark", "femal", "black", 20, 120);
		
		Animal_Changes lizard = new LandAnimal_Changes(10, 10, 4, true, "Lizard", "male", "green", 8, 70);
		Animal_Changes fish = new SeaAnimal_Changes(5, 7, 10, false, "Fish", "male", "blue", 9, 70);
		
		cat.compareHeight(lizard);
		
		fish.compareWeight(shark);
		
		System.out.println("Do the two animals live together? " + cat.liveTogether(dog));
		
		System.out.println(lizard.makeNoise());
		
		cat.makeNoise(1);
		
		dolphin.makeNoise(1);
		
		System.out.println(shark.makeNoise());
		
		System.out.println(dolphin.battle("sea", shark));
		
		System.out.println(cat.battle("land", dog, monkey));
		
		System.out.println(dolphin.battle("sea", fish, turtle));
		
		System.out.println(((LandAnimal_Changes) lizard).walk( 5));
		
		System.out.println(turtle.swim(5));
		
		System.out.println(lizard.informationOfAnimal());
		
		System.out.println(dolphin.informationOfFavoriteSeaAnimal());
		
		System.out.println(cat.informationOfFavoriteLandAnimal());
	}

}
