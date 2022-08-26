import java.util.Scanner;

public class werty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        System.out.println(sum(a,b));
    }
    public static Integer sum(int a,int b){
        return a + b;
    }
}
