import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t && Integer.valueOf(t.nextToken()) instanceof Integer n && new int[n + 1] instanceof int[] pos && new int[n + 1] instanceof int[] dp
            && IntStream.rangeClosed(1, n).filter(i -> (pos[Integer.parseInt(t.nextToken())] = i) > 0).count() >= 0
            ? n - IntStream.rangeClosed(1, n).map(v -> dp[v] = pos[v] > pos[v - 1] ? dp[v - 1] + 1 : 1).max().getAsInt() : "");
    }
}
