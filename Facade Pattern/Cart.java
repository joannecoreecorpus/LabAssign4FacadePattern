public class Cart implements HotelService {
    @Override
    public void performService() {
        System.out.println("Cart service is ready.");
    }

    public void requestCart(int numberOfCarts) {
        if (numberOfCarts <= 0) {
            System.out.println(
                "Please request at least one cart."
            );
            return;
        }

        System.out.println(
            "Requesting " + numberOfCarts + " luggage cart(s)..."
        );
        System.out.println(
            numberOfCarts + " luggage cart(s) have been delivered."
        );
    }
}