package designpatterns.singleton.challenge;
public class ChallengeRunner {

	public static void main(String[] args) {
		System.out.println("Trying to make a captain for our team");
		CricketCaptain captain = CricketCaptain.getCaptain();
		System.out.println("Trying to make another captain for our team");
		CricketCaptain captain2 = CricketCaptain.getCaptain();
		if (captain == captain2) {
			System.out.println("Captain 1 and Captain 2 are the same instance");
		}
	}
}
