import java.util.*;

public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        String[] candidates = {"Alice", "Bob", "Charlie"};
        String[] voteSequence = {"Alice", "Bob", "Alice", "Charlie", "Bob", "Bob", "Alice", "Charlie", "Charlie", "Bob"};

        // Casting votes
        for (String v : voteSequence) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }

        // Print votes per candidate
        System.out.println("Votes count:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Find winner
        String winner = null;
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
    }
}