import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLine().trim()).ifPresent(s ->
            System.out.println(s.matches("[a-z0-9]+(\\.[a-z0-9]+)*") && s.substring(s.lastIndexOf('.') + 1).length() >= 2 && s.substring(s.lastIndexOf('.') + 1).length() <= 3 ? "YES" : "NO"));
    }
}



