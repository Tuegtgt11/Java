package Practice.Ex2;

public class TestFlight {
    public static void main(String[] args) {
        Flight f = new Flight(875, "Toronto");
        f.display();
        System.out.println("Number Flight is :" + f.getNumber());
        System.out.println("Destination Flight is :" + f.getDestination());
    }
}
