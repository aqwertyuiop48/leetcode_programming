import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String s
            && new int[128] instanceof int[] c && s.chars().filter(ch -> ++c[ch] < 0).count() >= 0
            && n % 4 == 0 && Integer.valueOf(n / 4) instanceof Integer q
            && "ACGT".chars().allMatch(ch -> c[ch] <= q)
            ? s.chars().mapToObj(ch -> ch != '?' ? String.valueOf((char) ch) : "ACGT".chars().filter(g0 -> c[g0] < q).boxed().findFirst().get() instanceof Integer g && ++c[g] > 0 ? String.valueOf((char) g.intValue()) : "").collect(Collectors.joining()) : "===");
    }
}
