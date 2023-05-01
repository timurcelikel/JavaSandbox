package java17.generics.sports;

public class SportsPlayer<S extends Sport, P extends Position> {

	S sport;

	P position;

	String playerName;

	public SportsPlayer(final String playerName, final S sport, final P position) {

		this.playerName = playerName;
		this.sport = sport;
		this.position = position;
	}

	public void printSport() {

		System.out.println(sport);
	}

	public void printPosition() {

		System.out.println(position);
	}

	public void join() {

		System.out.println(sport.name() + " " + position.position() + " " + playerName + " joins the " + sport.playArea());
	}
}
