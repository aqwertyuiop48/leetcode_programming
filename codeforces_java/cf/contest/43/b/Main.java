import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println((new int[128] instanceof int[] c && s.nextLine().chars().allMatch(ch -> ch == ' ' || ++c[ch] > 0) && s.nextLine().chars().allMatch(ch -> ch == ' ' || --c[ch] >= 0)) ? "YES" : "NO"));
    }
}

