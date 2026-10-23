import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k && (Integer) s.nextInt() instanceof Integer p
            && IntStream.range(0, n).map(i -> s.nextInt()).boxed().toList() instanceof List<Integer> a
            && a.stream().filter(x -> x % 2 == 1).toList() instanceof List<Integer> od && a.stream().filter(x -> x % 2 == 0).toList() instanceof List<Integer> ev
            && od.size() >= k - p && (od.size() - (k - p)) % 2 == 0 && ev.size() + (od.size() - (k - p)) / 2 >= p
            && IntStream.range(0, k - p).mapToObj(i -> new ArrayList<>(List.of(od.get(i)))).collect(Collectors.toCollection(ArrayList::new)) instanceof ArrayList<ArrayList<Integer>> parts
            && Stream.concat(ev.stream().map(x -> new ArrayList<>(List.of(x))), IntStream.range(0, (od.size() - (k - p)) / 2).mapToObj(i -> new ArrayList<>(List.of(od.get(k - p + 2 * i), od.get(k - p + 2 * i + 1))))).toList() instanceof List<ArrayList<Integer>> groups
            && IntStream.range(0, groups.size()).allMatch(i -> i < p ? parts.add(new ArrayList<>(groups.get(i))) : parts.get(parts.size() - 1).addAll(groups.get(i)))
            ? "YES\n" + parts.stream().map(q -> q.size() + " " + q.stream().map(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "NO");
    }
}
