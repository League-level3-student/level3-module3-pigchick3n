package _01_AnimalFarm;

public class Pig extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("oink");
	}

	@Override
	public void live(int existance) {
		// TODO Auto-generated method stub
		System.out.println("the pig has been alive for " + existance + " seconds");
	}

}
