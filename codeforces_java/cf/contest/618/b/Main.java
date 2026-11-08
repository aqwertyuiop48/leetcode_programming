import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> IntStream.range(0, n).map(j -> Integer.parseInt(t[1 + i * n + j])).max().getAsInt()).toArray() instanceof int[] p
            && new int[]{n - 1} instanceof int[] first
            && IntStream.range(0, n).filter(i -> p[i] == n - 1).findFirst() instanceof OptionalInt f
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf(i == f.getAsInt() ? n : p[i])).collect(Collectors.joining(" ")) : "");
    }
}
