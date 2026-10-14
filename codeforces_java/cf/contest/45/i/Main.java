import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            IntStream.range(0, s.nextInt()).map(i -> s.nextInt()).sorted().boxed().toList() instanceof List<Integer> all
            && all.stream().filter(x -> x != 0).collect(Collectors.toCollection(ArrayList::new)) instanceof ArrayList<Integer> a
            && Long.valueOf(all.stream().filter(x -> x < 0).count()) instanceof Long neg
            && Integer.valueOf(neg % 2 == 1 ? a.get((int) (neg - 1)) : 0) instanceof Integer orig
            && (neg % 2 == 0 || (a.set((int) (neg - 1), a.get(a.size() - 1)) != null && a.remove(a.size() - 1) != null))
            ? (a.isEmpty() ? (all.contains(0) ? "0" : "" + orig) : a.stream().map(String::valueOf).collect(Collectors.joining(" ")))
            : ""));
    }
}

