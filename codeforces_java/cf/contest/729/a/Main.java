import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.nextLine() != null ? sc.nextLine().trim().replaceAll("ogo(go)*", "***") : "");
    }
}
