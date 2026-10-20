import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && Integer.valueOf(s.indexOf(94)) instanceof Integer p
            && Long.valueOf(IntStream.range(0, s.length()).filter(i -> Character.isDigit(s.charAt(i))).mapToLong(i -> (long) (s.charAt(i) - 48) * (i - p)).sum()) instanceof Long w
            ? w < 0 ? "left" : w > 0 ? "right" : "balance" : "");
    }
}
