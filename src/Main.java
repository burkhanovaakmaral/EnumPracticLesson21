import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(" Write a month: ");
        String month = console.nextLine();

        Winter snow = Winter.valueOf(month.toUpperCase());
        switch (snow) {
            case DECEMBER -> System.out.println(Winter.DECEMBER);
            case JANUARY -> System.out.println(Winter.JANUARY);
            case FEBRUARY -> System.out.println(Winter.FEBRUARY);

        }


    }
}