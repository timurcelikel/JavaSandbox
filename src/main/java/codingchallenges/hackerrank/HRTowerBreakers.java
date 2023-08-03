package codingchallenges.hackerrank;
import java.util.ArrayList;
import java.util.List;
public class HRTowerBreakers {

	// Note: This one was a lot simpler than needing to code how the game plays out. It's like Tic Tac Toe in that it's very predictable who will
	// win based on the tower set up and who goes first.

	public static void main(String[] args) {
		int n = 1;
		int m = 100000;
		int player = towerBreakers(n, m);
		System.out.println("Output: " + player);
	}

	public static int towerBreakers(int n, int m) {
		List<Integer> heights = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			heights.add(m);
		}
		int player = 1;
		boolean changed = true;
		while (changed) {
			boolean wasChanged = false;
			for (int k = 0; k < n; k++) {
				if (heights.get(k) > 1) {
					for (int i = 1; i < heights.get(k); i++) {
						if (m % i == 0) {
							heights.set(k, i);
							System.out.println("Tower: " + k + " new height: " + i);
							wasChanged = true;
							player *= -1;
							continue;
						}
					}
				}
			}
			if (!wasChanged) {
				System.out.println("Game over");
				changed = false;
			}
		}
		if (player == -1) {
			return 1;
		} else {
			return 2;
		}
	}
}
