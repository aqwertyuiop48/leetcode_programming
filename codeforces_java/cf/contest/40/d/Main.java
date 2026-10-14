import java.util.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(
            new Scanner(System.in) instanceof Scanner sc
            && new BigInteger(sc.next()) instanceof BigInteger A
            && BigInteger.valueOf(12) instanceof BigInteger TWELVE
            && BigInteger.valueOf(13) instanceof BigInteger THIRTEEN
            && new TreeSet<Integer>() instanceof TreeSet<Integer> years
            && new TreeSet<BigInteger>() instanceof TreeSet<BigInteger> others
            && new Set[]{new HashSet<>(List.of(Arrays.asList(BigInteger.valueOf(2), BigInteger.valueOf(13))))} instanceof Set[] activeRef
            && ((A.equals(BigInteger.valueOf(2)) && years.add(1)) || true)
            && ((A.equals(BigInteger.valueOf(13)) && years.add(2)) || true)
            && (IntStream.rangeClosed(3, 400).allMatch(year ->
                !activeRef[0].isEmpty()
                && activeRef[0].stream()
                    .flatMap(p -> Stream.of(
                        Arrays.asList(((List) p).get(1), ((BigInteger) ((List) p).get(0)).multiply(TWELVE)),
                        Arrays.asList(((List) p).get(1), ((BigInteger) ((List) p).get(1)).multiply(THIRTEEN).subtract(((BigInteger) ((List) p).get(0)).multiply(TWELVE)))
                    ))
                    .collect(Collectors.toCollection(HashSet::new)) instanceof Set full
                && full.stream().map(p -> ((List) p).get(1)).collect(Collectors.toCollection(HashSet::new)) instanceof Set values
                && ((values.contains(A) && (years.add(year) | others.addAll(values) | others.remove(A))) || true)
                && full.stream().filter(p -> ((BigInteger) ((List) p).get(1)).compareTo(A) <= 0).collect(Collectors.toCollection(HashSet::new)) instanceof Set pruned
                && (activeRef[0] = pruned) != null
            ) || true)
            ? (years.isEmpty() ? "NO" :
                "YES\n" + years.size() + "\n" +
                years.stream().map(String::valueOf).collect(Collectors.joining(" ")) + "\n" +
                others.size() + (others.isEmpty() ? "" : "\n" + others.stream().map(String::valueOf).collect(Collectors.joining("\n")))
              )
            : "unreachable"
        );
    }
}
