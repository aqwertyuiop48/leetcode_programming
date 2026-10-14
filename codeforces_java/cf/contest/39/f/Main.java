import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, m).map(i -> s.nextInt()).toArray() instanceof int[] d
            && IntStream.range(0, k).map(i -> s.nextInt()).toArray() instanceof int[] p
            && IntStream.range(0, m).map(i -> (int) Arrays.stream(p).filter(x -> x % d[i] == 0).count()).toArray() instanceof int[] cnt
            && IntStream.range(0, m).filter(i -> cnt[i] == Arrays.stream(cnt).min().getAsInt()).mapToObj(i -> "" + (i + 1)).toList() instanceof List<String> idx
            ? idx.size() + "\n" + String.join(" ", idx) : ""));
    }
}
