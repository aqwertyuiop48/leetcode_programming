import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && new StringBuilder() instanceof StringBuilder sb
            && s.chars().allMatch(c -> sb.length() >= 2 && sb.charAt(sb.length() - 1) == c && sb.charAt(sb.length() - 2) == c
                || sb.length() >= 3 && sb.charAt(sb.length() - 1) == c && sb.charAt(sb.length() - 2) == sb.charAt(sb.length() - 3) || sb.append((char) c) != null)
            ? sb.toString() : "");
    }
}
