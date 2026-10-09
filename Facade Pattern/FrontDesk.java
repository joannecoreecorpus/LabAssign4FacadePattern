public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        valet = new Valet();
        houseKeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void handleValet(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void handleCleaning(String roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void handleCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}