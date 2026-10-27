import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s ? s.nextLine().chars().anyMatch(c -> c == 'H' || c == 'Q' || c == '9') ? "YES" : "NO" : "");
    }
}

