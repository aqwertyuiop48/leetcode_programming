import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(sc -> new int[] {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()}).map(v ->
            new int[v[0]] instanceof int[] f1
            && new int[v[0]] instanceof int[] f2
            && new int[v[0]] instanceof int[] f3
            && IntStream.range(0, v[0]).allMatch(i ->
                (f1[i] = (i >= v[1] ? f1[i - v[1]] : 0) + v[4]) > 0
                && (f2[i] = Math.max(f1[i], i >= v[2] ? f2[i - v[2]] : 0) + v[5]) > 0
                && (f3[i] = Math.max(f2[i], i >= v[3] ? f3[i - v[3]] : 0) + v[6]) > 0)
            ? f3[v[0] - 1] : -1).ifPresent(System.out::println);
    }
}
