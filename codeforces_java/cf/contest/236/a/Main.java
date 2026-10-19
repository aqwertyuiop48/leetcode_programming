import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next().chars().distinct().count() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
