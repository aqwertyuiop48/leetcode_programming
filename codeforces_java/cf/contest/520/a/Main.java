import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.nextInt() > 0 && s.next().toLowerCase().chars().distinct().count() == 26 ? "YES" : "NO");
    }
}
