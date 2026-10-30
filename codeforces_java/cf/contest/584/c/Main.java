import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer t && s.next() instanceof String a && s.next() instanceof String b && (Integer) (int) IntStream.range(0, n).filter(i -> a.charAt(i) != b.charAt(i)).count() instanceof Integer d && (Integer) Math.max(0, d - t) instanceof Integer x && (Integer) Math.max(0, t - d) instanceof Integer w && new int[2] instanceof int[] cnt ? (2 * x > d ? "-1" : IntStream.range(0, n).mapToObj(i -> a.charAt(i) != b.charAt(i) ? ((Integer) cnt[0]++ instanceof Integer k ? (k < x ? String.valueOf(a.charAt(i)) : k < 2 * x ? String.valueOf(b.charAt(i)) : String.valueOf(a.charAt(i) != 'a' && b.charAt(i) != 'a' ? 'a' : a.charAt(i) != 'b' && b.charAt(i) != 'b' ? 'b' : 'c')) : "") : ((Integer) cnt[1]++ instanceof Integer k ? (k < w ? String.valueOf(a.charAt(i) != 'a' ? 'a' : 'b') : String.valueOf(a.charAt(i))) : "")).collect(Collectors.joining())) : "");
    }
}
