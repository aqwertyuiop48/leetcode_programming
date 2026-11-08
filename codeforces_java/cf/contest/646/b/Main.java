import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && IntStream.range(s.length() / 2 + 1, s.length()).filter(L -> s.endsWith(s.substring(0, L))).findFirst() instanceof OptionalInt o && o.isPresent()
            ? "YES\n" + s.substring(0, o.getAsInt()) : "NO");
    }
}
