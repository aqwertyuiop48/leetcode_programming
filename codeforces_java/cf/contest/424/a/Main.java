import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && s.next().toCharArray() instanceof char[] c
            && (Integer) (int) new String(c).chars().filter(ch -> ch == 'X').count() instanceof Integer x && new int[]{x - n / 2} instanceof int[] d
            ? Math.abs(d[0]) + "\n" + new String(c).chars().mapToObj(ch -> d[0] > 0 && ch == 'X' ? (d[0]-- > 0 ? "x" : "X") : d[0] < 0 && ch == 'x' ? (d[0]++ < 0 ? "X" : "x") : String.valueOf((char) ch)).collect(Collectors.joining()) : "");
    }
}
