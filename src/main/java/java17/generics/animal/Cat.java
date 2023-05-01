package java17.generics.animal;

public class Cat implements Animal {

	private String noiseToMake;

	public Cat(String noiseToMake) {

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

		return "Cat{" +
				"noiseToMake='" + noiseToMake + '\'' +
				'}';
	}
}
