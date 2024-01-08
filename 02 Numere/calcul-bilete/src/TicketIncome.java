import java.util.Scanner;

public class TicketRevenue2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Tickets sold: ");
        int ticketsSold = keyboard.nextInt();
        System.out.print("Ticket price: ");
        int ticketPrice = keyboard.nextInt();
        System.out.print("Tax percent (eg. 10 for 10%): ");
        int taxRate = keyboard.nextInt();

        int income = ticketsSold * ticketPrice;
        int tax = (taxRate / 100) * income;
        int revenue = income - tax;

        System.out.println("revenue = " + revenue);
    }
}
