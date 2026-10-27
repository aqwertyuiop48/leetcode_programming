import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            Optional.of(new int[]{sc.nextInt(), sc.nextInt()}).ifPresent(nk ->
                Optional.of(sc.next()).ifPresent(s ->
                    System.out.println(IntStream.range(0, 10).mapToObj(d ->
                        IntStream.range(0, nk[0]).boxed()
                            .sorted(Comparator.comparingInt((Integer i) -> Math.abs(s.charAt(i) - '0' - d))
                                .thenComparingInt(i -> s.charAt(i) - '0' > d ? 0 : 1)
                                .thenComparingInt(i -> s.charAt(i) - '0' > d ? i : -i))
                            .limit(nk[1]).toList() instanceof List<Integer> c
                        && s.toCharArray() instanceof char[] arr
                        && c.stream().allMatch(i -> (arr[i] = (char) ('0' + d)) > 0)
                        ? String.format("%07d", c.stream().mapToInt(i -> Math.abs(s.charAt(i) - '0' - d)).sum()) + new String(arr)
                        : "").min(Comparator.naturalOrder())
                        .map(r -> Integer.parseInt(r.substring(0, 7)) + "\n" + r.substring(7)).orElse("")))));
    }
}

