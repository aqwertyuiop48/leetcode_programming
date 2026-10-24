import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && new int[1 << 22] instanceof int[] dp
            && Arrays.stream(a).allMatch(x -> (dp[x] = x) > 0)
            && ((IntBinaryOperator) (j, b) -> ((j >> b) << (b + 1)) | (1 << b) | (j & ((1 << b) - 1))) instanceof IntBinaryOperator idx
            && IntStream.range(0, 22).allMatch(b -> IntStream.range(0, 1 << 21).map(j -> (dp[idx.applyAsInt(j, b)] = dp[idx.applyAsInt(j, b)] != 0 ? dp[idx.applyAsInt(j, b)] : dp[idx.applyAsInt(j, b) ^ (1 << b)]) >= 0 ? 0 : 1).sum() == 0)
            ? Arrays.stream(a).mapToObj(x -> String.valueOf(dp[((1 << 22) - 1) ^ x] == 0 ? -1 : dp[((1 << 22) - 1) ^ x])).collect(Collectors.joining(" "))
            : "");
    }
}
