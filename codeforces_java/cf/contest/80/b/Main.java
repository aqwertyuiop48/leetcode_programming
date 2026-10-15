import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            && Arrays.stream(s.split(":")).mapToInt(Integer::parseInt).toArray() instanceof int[] hm
            && Double.valueOf(hm[0] % 12 * 30 + hm[1] / 2.0) instanceof Double h
            ? (h % 1 == 0 ? "" + h.longValue() : "" + h) + " " + hm[1] * 6 : "");
    }
}


