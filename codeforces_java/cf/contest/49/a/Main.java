import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println("AEIOUY".indexOf(Character.toUpperCase(s.nextLine().chars().filter(Character::isLetter).reduce((x, y) -> y).getAsInt())) >= 0 ? "YES" : "NO"));
    }
}

