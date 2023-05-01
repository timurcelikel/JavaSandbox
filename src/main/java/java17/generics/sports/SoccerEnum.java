package java17.generics.sports;

public enum SoccerEnum implements Position {

	MID_FIELDER("Mid-Fielder");

	private final String position;

	SoccerEnum(final String position) {

		this.position = position;
	}

	@Override
	public String position() {

		return position;
	}
}
