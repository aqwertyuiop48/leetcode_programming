import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            Optional.of(new Scanner(System.in).next())
                .map(s -> s.contains("0000000") || s.contains("1111111") ? "YES" : "NO")
                .get());
    }
}



