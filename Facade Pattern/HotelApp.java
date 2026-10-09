public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("=== Hotel Management System ===\n");

        frontDesk.handleValet("ABC-1234");
        System.out.println();

        frontDesk.handleCleaning("101");
        System.out.println();

        frontDesk.handleCart(2);

        System.out.println(
            "\nAll hotel service requests have been processed."
        );
    }
}