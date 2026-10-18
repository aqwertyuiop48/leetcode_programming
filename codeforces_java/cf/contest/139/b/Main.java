import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> rooms
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> types
            ? rooms.stream().mapToLong(r -> types.stream().filter(t -> t[0] / r[2] > 0).mapToLong(t ->
                (long) t[2] * (((2L * (r[0] + r[1]) + t[1] - 1) / t[1] + t[0] / r[2] - 1) / (t[0] / r[2]))).min().getAsLong()).sum()
            : -1);
    }
}
