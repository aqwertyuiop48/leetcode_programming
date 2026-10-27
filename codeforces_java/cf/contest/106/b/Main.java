import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).mapToObj(i -> new int[] {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] l ? IntStream.range(0, n).filter(i -> IntStream.range(0, n).noneMatch(j -> l[j][0] > l[i][0] && l[j][1] > l[i][1] && l[j][2] > l[i][2])).boxed().min(Comparator.comparingInt(i -> l[i][3])).get() + 1 : -1).ifPresent(System.out::println);
    }
}

