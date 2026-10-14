import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December") instanceof List<String> l ? l.get((l.indexOf(s.next()) + s.nextInt()) % 12) : ""));
    }
}
