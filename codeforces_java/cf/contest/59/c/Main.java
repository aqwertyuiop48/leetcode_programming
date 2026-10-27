import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.nextInt()).ifPresent(k -> Optional.of(sc.next()).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.length()) instanceof Integer n
                && IntStream.range(0, n).allMatch(i -> s.charAt(i) == '?' || s.charAt(n - 1 - i) == '?' || s.charAt(i) == s.charAt(n - 1 - i))
                && IntStream.range(0, n).map(i -> s.charAt(i) == '?' ? s.charAt(n - 1 - i) : s.charAt(i)).toArray() instanceof int[] b
                && IntStream.iterate('a' + k - 1, c -> c >= 'a', c -> c - 1).filter(c -> Arrays.stream(b).noneMatch(x -> x == c)).boxed()
                    .collect(Collectors.toCollection(ArrayDeque::new)) instanceof ArrayDeque<Integer> dq
                && IntStream.iterate((n - 1) / 2, i -> i >= 0, i -> i - 1)
                    .allMatch(i -> b[i] != '?' || ((b[i] = b[n - 1 - i] = dq.isEmpty() ? 'a' : dq.poll()) > 0))
                && dq.isEmpty()
                ? Arrays.stream(b).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining())
                : "IMPOSSIBLE"))));
    }
}





