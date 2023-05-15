package designpatterns.singleton.challenge;
public class CricketCaptain {

	private CricketCaptain() {
	}

	public static CricketCaptain getCaptain() {
		return CricketCaptainHelper.uniqueCaptain;
	}
	private static class CricketCaptainHelper {

		private static final CricketCaptain uniqueCaptain = new CricketCaptain();
	}
}
