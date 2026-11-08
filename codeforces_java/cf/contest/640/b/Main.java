import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String[]{"winter", "winter", "spring", "spring", "spring", "summer", "summer", "summer", "autumn", "autumn", "autumn", "winter"}[Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December").indexOf(new String(System.in.readAllBytes()).trim())]);
    }
}
