import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && IntStream.range(0, s.length()).allMatch(i -> "AHIMOTUVWXYovwx".indexOf(s.charAt(i)) >= 0 ? s.charAt(i) == s.charAt(s.length() - 1 - i)
                : s.charAt(i) == 'b' ? s.charAt(s.length() - 1 - i) == 'd' : s.charAt(i) == 'd' ? s.charAt(s.length() - 1 - i) == 'b'
                : s.charAt(i) == 'p' ? s.charAt(s.length() - 1 - i) == 'q' : s.charAt(i) == 'q' && s.charAt(s.length() - 1 - i) == 'p')
            ? "TAK" : "NIE");
    }
}
