package _01_AnimalFarm;
public class Emu extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("very low-pitched non-vocal sounds");
	}

	@Override
	public void live(int existance) {
		// TODO Auto-generated method stub
		System.out.println("the emu has been alive for " + existance + " seconds");
	}

}
