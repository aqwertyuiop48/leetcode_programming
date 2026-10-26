import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, 8).mapToObj(i -> s.next()).collect(Collectors.joining()) instanceof String b
            && "QRBNP".chars().map(c -> c).toArray() instanceof int[] ks && new int[]{9, 5, 3, 3, 1} instanceof int[] w
            && (Integer) IntStream.range(0, 5).map(i -> w[i] * (int) (b.chars().filter(c -> c == ks[i]).count() - b.chars().filter(c -> c == Character.toLowerCase(ks[i])).count())).sum() instanceof Integer d
            ? d > 0 ? "White" : d < 0 ? "Black" : "Draw" : "");
    }
}
