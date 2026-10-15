import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next().chars().boxed().reduce(new StringBuilder(), (sb, c) -> sb.length() > 0 && sb.charAt(sb.length() - 1) == c ? sb.deleteCharAt(sb.length() - 1) : sb.append((char) (int) c), (x, y) -> x));
    }
}


