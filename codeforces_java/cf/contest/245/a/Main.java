import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new int[]{0, 0, 0, 0} instanceof int[] acc
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(s.nextInt()) instanceof Integer t && (acc[2 * (t - 1)] += s.nextInt()) >= 0 && (acc[2 * (t - 1) + 1] += s.nextInt()) >= 0)
            ? (acc[0] >= acc[1] ? "LIVE" : "DEAD") + "\n" + (acc[2] >= acc[3] ? "LIVE" : "DEAD") : "");
    }
}
