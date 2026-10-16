import java.util.*;


public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            new StringBuilder(s.next()).reverse().toString().equals(s.next()) ? "YES" : "NO"));
    }
}




