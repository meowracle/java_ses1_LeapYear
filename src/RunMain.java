import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap vao nam de kiem tra");
        int year = scanner.nextInt();
        LeapYear leapYear = new LeapYear(year);
        leapYear.checkLeapYear();
    }
}
