import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && new int[1 << 22] instanceof int[] dp
            && Arrays.stream(a).allMatch(x -> (dp[x] = x) > 0)
            && IntStream.range(0, 22).allMatch(b -> Stream.of(0).peek(z -> Arrays.setAll(dp, m -> (m >> b & 1) != 0 && dp[m] == 0 ? dp[m ^ (1 << b)] : dp[m])).findFirst().isPresent())
            ? Arrays.stream(a).mapToObj(x -> String.valueOf(dp[((1 << 22) - 1) ^ x] == 0 ? -1 : dp[((1 << 22) - 1) ^ x])).collect(Collectors.joining(" "))
            : "");
    }
}
