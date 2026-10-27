import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer t
            && new long[101][2701] instanceof long[][] dp
            && (dp[0][0] = 1) == 1
            && IntStream.rangeClosed(1, 100).allMatch(l -> IntStream.rangeClosed(1, 2600).allMatch(v -> (dp[l][v] = IntStream.rangeClosed(1, Math.min(26, v)).mapToLong(c -> dp[l - 1][v - c]).sum() % 1_000_000_007L) >= 0))
            ? Stream.generate(s::next).limit(t).map(w -> String.valueOf((dp[w.length()][w.chars().map(c -> c - 'a' + 1).sum()] + 1_000_000_006L) % 1_000_000_007L)).collect(Collectors.joining("\n"))
            : "");
    }
}

