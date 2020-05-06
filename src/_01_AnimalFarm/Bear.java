package _01_AnimalFarm;

public class Bear extends Animal{
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("sound like a huff, chomp, woof, growl, and/or bark");
	}

	@Override
	public void live(int existance) {
		// TODO Auto-generated method stub
		System.out.println("the bear has been alive for " + existance + " seconds");
	}
}
