import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && new int[]{0, 1} instanceof int[] st
            && IntStream.range(0, n).allMatch(i -> (Integer) s.nextInt() instanceof Integer g && (st[0] + g > m ? (st[0] = g) > 0 && ++st[1] > 0 : (st[0] += g) > 0))
            ? st[1] : 0);
    }
}
