import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, 2 * n + 2).map(i -> i + 1).toArray() instanceof int[] a
            && IntStream.rangeClosed(2, (n - 1) / 9).mapToObj(k -> k).peek(k -> ((IntConsumer) c -> Arrays.setAll(new int[c + 1],
                idx -> idx == 0 ? (a[k - 2 + n] = a[k - 2 + c * k]) : (a[k - 2 + (c + 1 - idx) * k] = a[k - 2 + (c - idx) * k]))).accept((n - 1) / k)).allMatch(k -> true)
            && IntStream.rangeClosed(Math.max(2, (n - 1) / 9 + 1), (n - 1) / 8).allMatch(k -> (a[k - 2 + n] = a[k - 2 + 8 * k]) >= 0 && (a[k - 2 + 8 * k] = a[k - 2 + 7 * k]) >= 0 && (a[k - 2 + 7 * k] = a[k - 2 + 6 * k]) >= 0 && (a[k - 2 + 6 * k] = a[k - 2 + 5 * k]) >= 0 && (a[k - 2 + 5 * k] = a[k - 2 + 4 * k]) >= 0 && (a[k - 2 + 4 * k] = a[k - 2 + 3 * k]) >= 0 && (a[k - 2 + 3 * k] = a[k - 2 + 2 * k]) >= 0 && (a[k - 2 + 2 * k] = a[k - 2 + 1 * k]) >= 0 && (a[k - 2 + k] = a[k - 2]) >= 0)
            && IntStream.rangeClosed(Math.max(2, (n - 1) / 8 + 1), (n - 1) / 7).allMatch(k -> (a[k - 2 + n] = a[k - 2 + 7 * k]) >= 0 && (a[k - 2 + 7 * k] = a[k - 2 + 6 * k]) >= 0 && (a[k - 2 + 6 * k] = a[k - 2 + 5 * k]) >= 0 && (a[k - 2 + 5 * k] = a[k - 2 + 4 * k]) >= 0 && (a[k - 2 + 4 * k] = a[k - 2 + 3 * k]) >= 0 && (a[k - 2 + 3 * k] = a[k - 2 + 2 * k]) >= 0 && (a[k - 2 + 2 * k] = a[k - 2 + 1 * k]) >= 0 && (a[k - 2 + k] = a[k - 2]) >= 0)
            && IntStream.rangeClosed(Math.max(2, (n - 1) / 7 + 1), (n - 1) / 6).allMatch(k -> (a[k - 2 + n] = a[k - 2 + 6 * k]) >= 0 && (a[k - 2 + 6 * k] = a[k - 2 + 5 * k]) >= 0 && (a[k - 2 + 5 * k] = a[k - 2 + 4 * k]) >= 0 && (a[k - 2 + 4 * k] = a[k - 2 + 3 * k]) >= 0 && (a[k - 2 + 3 * k] = a[k - 2 + 2 * k]) >= 0 && (a[k - 2 + 2 * k] = a[k - 2 + 1 * k]) >= 0 && (a[k - 2 + k] = a[k - 2]) >= 0)
            && IntStream.rangeClosed(Math.max(2, (n - 1) / 6 + 1), (n - 1) / 5).allMatch(k -> (a[k - 2 + n] = a[k - 2 + 5 * k]) >= 0 && (a[k - 2 + 5 * k] = a[k - 2 + 4 * k]) >= 0 && (a[k - 2 + 4 * k] = a[k - 2 + 3 * k]) >= 0 && (a[k - 2 + 3 * k] = a[k - 2 + 2 * k]) >= 0 && (a[k - 2 + 2 * k] = a[k - 2 + 1 * k]) >= 0 && (a[k - 2 + k] = a[k - 2]) >= 0)
            && IntStream.rangeClosed(Math.max(2, (n - 1) / 5 + 1), (n - 1) / 4).allMatch(k -> (a[k - 2 + n] = a[k - 2 + 4 * k]) >= 0 && (a[k - 2 + 4 * k] = a[k - 2 + 3 * k]) >= 0 && (a[k - 2 + 3 * k] = a[k - 2 + 2 * k]) >= 0 && (a[k - 2 + 2 * k] = a[k - 2 + 1 * k]) >= 0 && (a[k - 2 + k] = a[k - 2]) >= 0)
            && IntStream.rangeClosed(Math.max(2, (n - 1) / 4 + 1), (n - 1) / 3).allMatch(k -> (a[k - 2 + n] = a[k - 2 + 3 * k]) >= 0 && (a[k - 2 + 3 * k] = a[k - 2 + 2 * k]) >= 0 && (a[k - 2 + 2 * k] = a[k - 2 + 1 * k]) >= 0 && (a[k - 2 + k] = a[k - 2]) >= 0)
            && IntStream.rangeClosed(Math.max(2, (n - 1) / 3 + 1), (n - 1) / 2).allMatch(k -> (a[k - 2 + n] = a[k - 2 + 2 * k]) >= 0 && (a[k - 2 + 2 * k] = a[k - 2 + 1 * k]) >= 0 && (a[k - 2 + k] = a[k - 2]) >= 0)
            && IntStream.rangeClosed(Math.max(2, (n - 1) / 2 + 1), (n - 1) / 1).allMatch(k -> (a[k - 2 + n] = a[k - 2 + 1 * k]) >= 0 && (a[k - 2 + k] = a[k - 2]) >= 0)
            && (n < 2 || (a[2 * n - 2] = a[n - 2]) >= 0)
            && new StringBuilder() instanceof StringBuilder sb && IntStream.range(0, n).allMatch(i -> sb.append(a[n - 1 + i]).append(' ') != null)
            ? sb : "");
    }
}
