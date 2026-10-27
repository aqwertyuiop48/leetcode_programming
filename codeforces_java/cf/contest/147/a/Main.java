import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in).nextLine().trim().replaceAll(" +", " ").replaceAll(" ([,.!?])", "$1").replaceAll("([,.!?])([^ ])", "$1 $2"));
    }
}

