import java.util.Scanner;

public class CinemaTicket03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ticketPrice = 50000;
        int tickets;
        int totalTickets = 0;
        double price, totalSales = 0, discount = 0;

        while (true) {
            System.out.print("Enter number of tickets (0 to finish): ");
            tickets = sc.nextInt();

            if (tickets < 0) {
                System.out.println("Invalid input. Please re-enter!");
                continue;
            }
            if (tickets == 0) {
                break;
            }

            price = tickets * ticketPrice;
            if (tickets > 10) {
                discount = 0.15;
            } else if (tickets > 4) {
                discount = 0.10;
            } else {
                discount = 0;
            }

            price -= price * discount;
            System.out.println("Price for this customer: Rp " + price);
            totalTickets += tickets;
            totalSales += price;
        }

        System.out.println("Total tickets sold: " + totalTickets);
        System.out.println("Total ticket sales: Rp " + totalSales);

        sc.close();
    }
}