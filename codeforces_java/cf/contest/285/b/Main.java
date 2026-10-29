import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner in && Integer.valueOf(in.nextInt()) instanceof Integer n && Integer.valueOf(in.nextInt()) instanceof Integer s && Integer.valueOf(in.nextInt()) instanceof Integer t
            && IntStream.range(0, n).map(i -> in.nextInt()).toArray() instanceof int[] p
            && new int[]{s} instanceof int[] cur
            ? IntStream.rangeClosed(0, n).filter(i -> (cur[0] == t ? true : (cur[0] = p[cur[0] - 1]) < 0)).findFirst().orElse(-1) : "");
    }
}

