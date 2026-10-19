import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && Arrays.stream(a).filter(x -> x < 0).boxed().toList() instanceof List<Integer> neg && Arrays.stream(a).filter(x -> x > 0).boxed().toList() instanceof List<Integer> pos && Arrays.stream(a).filter(x -> x == 0).boxed().toList() instanceof List<Integer> zero
            && (pos.isEmpty() ? List.of(neg.get(2), neg.get(1)) : pos) instanceof List<Integer> s2
            && Stream.concat(zero.stream(), neg.stream().skip(pos.isEmpty() ? 3 : 1)).toList() instanceof List<Integer> s3
            ? Stream.of(List.of(neg.get(0)), s2, s3).map(l -> l.size() + " " + l.stream().map(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
