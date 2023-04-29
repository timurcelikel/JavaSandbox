package java17.generics;

public class Dog implements Animal {

	private String noiseToMake;

	public Dog(String noiseToMake) {

		this.noiseToMake = noiseToMake;
	}

	public String getNoiseToMake() {

		return noiseToMake;
	}

	public void setNoiseToMake(final String noiseToMake) {

		this.noiseToMake = noiseToMake;
	}

	@Override
	public void makeNoise() {

		System.out.println(this.noiseToMake);
	}

	@Override
	public String toString() {

		return "Dog{" +
				"noiseToMake='" + noiseToMake + '\'' +
				'}';
	}
}
