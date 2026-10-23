import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Optional.of(new Scanner(System.in)).map(sc -> sc.next()).map(s -> Integer.parseInt(s.substring(Math.max(0, s.length() - 2))) % 4 == 0 ? 4 : 0).get());
    }
}
