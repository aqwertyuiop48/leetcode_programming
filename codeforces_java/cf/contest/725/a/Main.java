import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.nextLine() != null && sc.nextLine().trim() instanceof String s
            ? 2 * s.length() - s.replaceFirst("^<*", "").length() - new StringBuilder(s).reverse().toString().replaceFirst("^>*", "").length() : 0);
    }
}
