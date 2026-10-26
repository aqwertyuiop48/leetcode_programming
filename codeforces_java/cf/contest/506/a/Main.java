import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer d
            && new int[30001] instanceof int[] gem && (Integer) IntStream.range(0, n).map(i -> s.nextInt()).peek(x -> ++gem[x]).max().getAsInt() instanceof Integer last
            && new int[30001 * 501] instanceof int[] dp && (dp[d * 501 + 250] = gem[d] + 1) > 0
            && ((IntBinaryOperator) (idx, dl) -> idx / 501 + d + idx % 501 - 250 + dl > idx / 501 && idx / 501 + d + idx % 501 - 250 + dl <= last
                && idx % 501 + dl >= 0 && idx % 501 + dl <= 500
                && (dp[(idx / 501 + d + idx % 501 - 250 + dl) * 501 + idx % 501 + dl] = Math.max(dp[(idx / 501 + d + idx % 501 - 250 + dl) * 501 + idx % 501 + dl], dp[idx] + gem[idx / 501 + d + idx % 501 - 250 + dl])) < 0 ? 1 : 0) instanceof IntBinaryOperator go
            ? IntStream.range(0, 30001 * 501).map(idx -> dp[idx] == 0 ? 0 : go.applyAsInt(idx, -1) + go.applyAsInt(idx, 0) + go.applyAsInt(idx, 1) + dp[idx]).max().getAsInt() - 1
            : 0);
    }
}
