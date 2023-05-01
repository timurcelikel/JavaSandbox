package java17.generics.sports;

import java.util.ArrayList;
import java.util.List;

public class SportsClient {

	public static void main(String[] args) {

		BaseballSport baseball = new BaseballSport("Baseball", "field");
		BaseballPosition baseballPosition = new BaseballPosition("Center-fielder");
		SportsPlayer<BaseballSport, BaseballPosition> baseballPlayer = new SportsPlayer<>("Sam Harris", baseball, baseballPosition);

		SoccerSport soccer = new SoccerSport("Soccer", "pitch");
		SoccerPosition soccerPosition = new SoccerPosition(SoccerEnum.MID_FIELDER.position());
		SportsPlayer<SoccerSport, SoccerPosition> soccerPlayer = new SportsPlayer<>("Carlos Herrera", soccer, soccerPosition);

		List<SportsPlayer<?, ?>> players = new ArrayList<>();
		players.add(baseballPlayer);
		players.add(soccerPlayer);

		players.forEach(SportsPlayer::join);
	}
}
