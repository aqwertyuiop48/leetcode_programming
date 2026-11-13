import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in).nextLine().trim() instanceof String s && Long.valueOf(s.substring(0, s.length() - 1)) instanceof Long n
            ? (n - 1) / 4 * 16 + (n % 2 == 0 ? 7 : 0) + "fedabc".indexOf(s.charAt(s.length() - 1)) + 1 : 0);
    }
}
