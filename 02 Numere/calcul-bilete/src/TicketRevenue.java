import java.util.Scanner;

public class TicketIncome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Cate bilete am vandut?");
        int ticketsSold = keyboard.nextInt();

        System.out.println("Ce pret are un bilet?");
        int ticketPrice = keyboard.nextInt();

        int income = ticketsSold * ticketPrice;

        System.out.println("Suma incasata: ");
        System.out.println(income);
    }
}