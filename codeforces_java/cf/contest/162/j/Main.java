import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && s.nextLine() instanceof String t
            && new int[]{0} instanceof int[] bal
            ? t.chars().allMatch(c -> (bal[0] += c == '(' ? 1 : c == ')' ? -1 : 0) >= 0) && bal[0] == 0 ? "YES" : "NO"
            : "");
    }
}
