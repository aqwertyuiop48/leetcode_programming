import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Washington,Adams,Jefferson,Madison,Monroe,Adams,Jackson,Van Buren,Harrison,Tyler,Polk,Taylor,Fillmore,Pierce,Buchanan,Lincoln,Johnson,Grant,Hayes,Garfield,Arthur,Cleveland,Harrison,Cleveland,McKinley,Roosevelt,Taft,Wilson,Harding,Coolidge,Hoover,Roosevelt,Truman,Eisenhower,Kennedy,Johnson,Nixon,Ford,Carter,Reagan".split(",")[new Scanner(System.in).nextInt() - 1]);
    }
}
