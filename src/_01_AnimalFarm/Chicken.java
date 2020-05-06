package _01_AnimalFarm;

public class Chicken extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("cluck");
	}

	@Override
	public void live(int existance) {
		// TODO Auto-generated method stub
		System.out.println("The chicken has been alive for " + existance + " seconds");
	}

}
