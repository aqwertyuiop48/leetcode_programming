import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).next()).ifPresent(s -> System.out.println(
            new int[]{0} instanceof int[] p
            && s.chars().allMatch(c -> p[0] >= 5 || (c == "hello".charAt(p[0]) ? ++p[0] > 0 : true))
            && p[0] == 5 ? "YES" : "NO"));
    }
}
