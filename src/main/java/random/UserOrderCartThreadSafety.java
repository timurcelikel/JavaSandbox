package random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserOrderCartThreadSafety {
    public static void main(String[] args) {

        Map<String, List<Double>> userOrders = new HashMap<>();

        List<Double> order = new ArrayList<>();
        order.add(10.5);
        userOrders.put("user1", order);

        addToUserCart("user1", userOrders, List.of(21.0, 15.97));

        System.out.println(userOrders);
    }

    // Potential thread safety issue below as discussed in Java Pub House Ep. 3
    // Check for user1 and adding to existing list or creating new entry is not atomic
    private static void addToUserCart(final String userId, Map<String, List<Double>> userOrders, List<Double> newOrder) {
        if (userOrders.get(userId) != null) {
            userOrders.get(userId).addAll(newOrder);
        } else {
            userOrders.put(userId, newOrder);
        }
    }
}
