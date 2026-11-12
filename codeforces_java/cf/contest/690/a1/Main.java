public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println((Long.parseLong(new String(System.in.readAllBytes()).trim()) + 1) / 2);
    }
}
