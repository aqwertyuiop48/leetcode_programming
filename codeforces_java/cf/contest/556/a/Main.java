import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.nextInt() > 0 && s.next() instanceof String t ? Math.abs(t.chars().filter(c -> c == '0').count() - t.chars().filter(c -> c == '1').count()) : 0L);
    }
}
