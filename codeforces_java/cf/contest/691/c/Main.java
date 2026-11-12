import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && Integer.valueOf(s.indexOf('.') < 0 ? s.length() : s.indexOf('.')) instanceof Integer p
            && s.replace(".", "") instanceof String d && Integer.valueOf(d.length()) instanceof Integer len
            && Integer.valueOf(IntStream.range(0, len).filter(i -> d.charAt(i) != '0').findFirst().orElse(0)) instanceof Integer f
            && Integer.valueOf(IntStream.range(0, len).map(i -> len - 1 - i).filter(i -> d.charAt(i) != '0').findFirst().orElse(0)) instanceof Integer l
            && Integer.valueOf(p - f - 1) instanceof Integer b
            ? d.charAt(f) + (l > f ? "." + d.substring(f + 1, l + 1) : "") + (b != 0 ? "E" + b : "") : "");
    }
}
