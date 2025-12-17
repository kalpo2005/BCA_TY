import java.util.Scanner;

public class Q3_Day_Switch_case {
     public static void main(String[] args) {
        int day;
        Scanner sc;
        sc = new Scanner(System.in);

            System.out.print("Enter Day No : ");
            day = sc.nextInt();

                switch (day) {
                    case 1 -> System.out.print("Sunday...");

                    case 2 -> System.out.print("Monday...");

                    case 3 -> System.out.print("Tuesday...");

                    case 4 -> System.out.print("Wednesday...");

                    case 5 -> System.out.print("Thursday...");

                    case 6 -> System.out.print("Friday...");

                    case 7 -> System.out.print("Saturday...");

                    default -> System.out.println("Invalide Choice.......");
                }
        sc.close();
    }
}
