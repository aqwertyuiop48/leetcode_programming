import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt() + s.nextInt()).ifPresent(z -> Optional.of(s.next()).ifPresent(r -> Optional.of(s.next()).ifPresent(c -> System.out.print(r.charAt(0) == '>' && c.charAt(c.length() - 1) == 'v' && r.charAt(r.length() - 1) == '<' && c.charAt(0) == '^' || r.charAt(0) == '<' && c.charAt(0) == 'v' && r.charAt(r.length() - 1) == '>' && c.charAt(c.length() - 1) == '^' ? "YES" : "NO")))));
    }
}
