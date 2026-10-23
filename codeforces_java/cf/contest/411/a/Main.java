import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && s.length() >= 5 && s.chars().anyMatch(Character::isUpperCase) && s.chars().anyMatch(Character::isLowerCase) && s.chars().anyMatch(Character::isDigit) ? "Correct" : "Too weak");
    }
}
