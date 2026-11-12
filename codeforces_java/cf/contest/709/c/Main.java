import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && Integer.valueOf(s.length()) instanceof Integer n
            && IntStream.range(0, n).filter(k -> s.charAt(k) != 'a').findFirst() instanceof OptionalInt o
            && Integer.valueOf(o.orElse(-1)) instanceof Integer i
            && Integer.valueOf(i < 0 ? n : IntStream.range(i, n).filter(k -> s.charAt(k) == 'a').findFirst().orElse(n)) instanceof Integer j
            ? (i < 0 ? s.substring(0, n - 1) + "z"
                : s.substring(0, i) + IntStream.range(i, j).mapToObj(k -> String.valueOf((char) (s.charAt(k) - 1))).collect(Collectors.joining()) + s.substring(j)) : "");
    }
}
