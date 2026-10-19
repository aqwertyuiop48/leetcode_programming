import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] d && Integer.valueOf(sc.nextInt() - 1) instanceof Integer s && Integer.valueOf(sc.nextInt() - 1) instanceof Integer t
            && Integer.valueOf(IntStream.range(Math.min(s, t), Math.max(s, t)).map(i -> d[i]).sum()) instanceof Integer a
            ? Math.min(a, Arrays.stream(d).sum() - a) : "");
    }
}
