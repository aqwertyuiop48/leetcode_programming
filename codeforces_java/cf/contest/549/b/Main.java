import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> g && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new int[n] instanceof int[] cnt && new boolean[n] instanceof boolean[] on
            && Stream.generate(() -> 0).takeWhile(z -> IntStream.range(0, n).filter(i -> cnt[i] == a[i]).findFirst() instanceof OptionalInt f && f.isPresent()
                    && (on[f.getAsInt()] = true) && IntStream.range(0, n).filter(j -> g.get(f.getAsInt()).charAt(j) == '1').allMatch(j -> ++cnt[j] > 0)).count() >= 0
            ? IntStream.range(0, n).filter(i -> on[i]).count() + "\n" + IntStream.range(0, n).filter(i -> on[i]).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "");
    }
}
