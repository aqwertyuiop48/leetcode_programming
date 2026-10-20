import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && new StringBuilder() instanceof StringBuilder sb
            && s.chars().allMatch(c -> sb.length() > 0 && sb.charAt(sb.length() - 1) == c ? sb.deleteCharAt(sb.length() - 1) != null : sb.append((char) c) != null) ? (sb.isEmpty() ? "Yes" : "No") : "");
    }
}
