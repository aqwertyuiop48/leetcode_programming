import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer a
            && Integer.valueOf(sc.nextInt()) instanceof Integer b && sc.nextInt() >= 0 && sc.next() instanceof String s && new int[1] instanceof int[] run
            && IntStream.range(0, n).filter(i -> s.charAt(i) == '1' ? (run[0] = 0) > 0 : ++run[0] == b && (run[0] = 0) == 0).toArray() instanceof int[] pos
            ? (pos.length - a + 1) + "\n" + IntStream.range(0, pos.length - a + 1).mapToObj(i -> String.valueOf(pos[i] + 1)).collect(Collectors.joining(" ")) : "");
    }
}
