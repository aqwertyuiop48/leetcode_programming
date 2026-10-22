import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && new int[]{0, 0, 0, 0} instanceof int[] rm
            && s.chars().filter(c -> c != 48).filter(c -> "1689".indexOf(c) < 0 || rm["1689".indexOf(c)]++ > 0).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()) instanceof String pre
            && Integer.valueOf(pre.chars().reduce(0, (r, c) -> (r * 10 + c - 48) % 7)) instanceof Integer r
            && Integer.valueOf(IntStream.range(1000, 10000).filter(p -> String.valueOf(p).chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()).equals("1689") && (r * 10000 + p) % 7 == 0).findFirst().getAsInt()) instanceof Integer perm
            ? pre + perm + "0".repeat((int) s.chars().filter(c -> c == 48).count()) : "");
    }
}
