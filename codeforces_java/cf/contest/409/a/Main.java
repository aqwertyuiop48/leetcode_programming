import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String a && s.next() instanceof String b
            && Integer.valueOf(IntStream.range(0, a.length() / 2).map(i -> (Integer) "8<[]()".indexOf(a.substring(2 * i, 2 * i + 2)) instanceof Integer x && (Integer) "8<[]()".indexOf(b.substring(2 * i, 2 * i + 2)) instanceof Integer y
                ? (x - y + 6) % 6 == 4 ? 1 : (y - x + 6) % 6 == 4 ? -1 : 0 : 0).sum()) instanceof Integer r
            ? r > 0 ? "TEAM 1 WINS" : r < 0 ? "TEAM 2 WINS" : "TIE" : "");
    }
}
