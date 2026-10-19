import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            && new int[]{0} instanceof int[] p
            && s.chars().map(c -> p[0] += c == '+' ? 1 : -1).boxed().collect(Collectors.toList()) instanceof List<Integer> pre
            ? Stream.concat(Stream.of(0), pre.stream()).mapToInt(Integer::intValue).max().getAsInt() - Stream.concat(Stream.of(0), pre.stream()).mapToInt(Integer::intValue).min().getAsInt() : "");
    }
}
