import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.generate(sc::nextInt).limit(n).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray() instanceof int[] a
            && new int[]{Integer.MAX_VALUE, 0} instanceof int[] s
            && Arrays.stream(a).filter(v -> (s[0] = Math.max(0, Math.min(v, s[0] - 1))) + (s[1] += s[0]) < 0).count() >= 0
            ? s[1] : "");
    }
}
