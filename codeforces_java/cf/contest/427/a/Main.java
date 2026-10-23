import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && new int[2] instanceof int[] st
            && IntStream.range(0, n).allMatch(i -> (Integer) s.nextInt() instanceof Integer x && (x < 0 ? st[0] > 0 ? --st[0] >= 0 : ++st[1] > 0 : (st[0] += x) >= 0))
            ? st[1] : 0);
    }
}
