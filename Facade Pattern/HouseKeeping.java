public class HouseKeeping implements HotelService {
    @Override
    public void performService() {
        System.out.println("Housekeeping service is ready.");
    }

    public void cleanRoom(String roomNumber) {
        System.out.println("Cleaning room " + roomNumber + "...");
        System.out.println(
            "Room " + roomNumber + " has been cleaned."
        );
    }
}