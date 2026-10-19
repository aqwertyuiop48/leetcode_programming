import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new ArrayList<Integer>() instanceof ArrayList<Integer> sizes && new int[]{0, 0} instanceof int[] st
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(s.nextInt()) instanceof Integer a
                && (a < 0 && st[1] == 2 ? sizes.add(st[0]) && (st[0] = 1) > 0 && (st[1] = 1) > 0 : (st[0] += 1) > 0 && (st[1] += a < 0 ? 1 : 0) >= 0))
            && sizes.add(st[0])
            ? sizes.size() + "\n" + sizes.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
