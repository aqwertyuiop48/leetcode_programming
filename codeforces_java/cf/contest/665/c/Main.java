import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next().toCharArray() instanceof char[] s
            && IntStream.range(1, s.length).filter(i -> s[i] == s[i - 1]
                && (s[i] = (char) "abc".chars().filter(c -> c != s[i - 1] && (i + 1 >= s.length || c != s[i + 1])).findFirst().getAsInt()) > 0).count() >= 0
            ? new String(s) : "");
    }
}
