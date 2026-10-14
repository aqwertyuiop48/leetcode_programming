import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new int[]{n - 1} instanceof int[] mArr
                && new int[n][n] instanceof int[][] M
                && IntStream.range(0, mArr[0]).allMatch(r ->
                    new int[]{(r + mArr[0] - 1) % mArr[0]} instanceof int[] cArr
                    && (M[mArr[0]][cArr[0]] = r + 1) == r + 1
                    && (M[cArr[0]][mArr[0]] = r + 1) == r + 1
                    && IntStream.rangeClosed(1, (mArr[0] - 1) / 2).allMatch(k ->
                        new int[]{(cArr[0] + k) % mArr[0], ((cArr[0] - k) % mArr[0] + mArr[0]) % mArr[0]} instanceof int[] ab
                        && (M[ab[0]][ab[1]] = r + 1) == r + 1
                        && (M[ab[1]][ab[0]] = r + 1) == r + 1))
                ? Arrays.stream(M).map(row -> Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))
                : "")));
    }
}

