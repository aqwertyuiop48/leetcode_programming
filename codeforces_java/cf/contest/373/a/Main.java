import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer k
            && String.join("", Arrays.copyOfRange(t, 1, t.length)) instanceof String g
            ? IntStream.rangeClosed(1, 9).allMatch(d -> g.chars().filter(c -> c == 48 + d).count() <= 2L * k) ? "YES" : "NO" : "");
    }
}
