import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k && sc.next() instanceof String s && new int[]{k} instanceof int[] rem
            && IntStream.range(0, n).map(i -> Integer.valueOf(s.charAt(i) - 'a') instanceof Integer c && Integer.valueOf(Math.min(rem[0], Math.max(c, 25 - c))) instanceof Integer m && (rem[0] -= m) >= 0 ? 'a' + (c >= 25 - c ? c - m : c + m) : 0).toArray() instanceof int[] res && rem[0] == 0
            ? Arrays.stream(res).mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining()) : "-1");
    }
}
