import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLine()).ifPresent(s -> System.out.print(s.chars().reduce(0, (d, c) -> d < 0 ? d : c == '(' ? d + 1 : c == ')' ? d - 1 : d) == 0 ? "YES" : "NO"));
    }
}
