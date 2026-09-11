public class TravelPackage {
    private final String country, city, hotel, transport;
    TravelPackage(String country, String city, String hotel, String transport) {
        this.country = country;
        this.city = city;
        this.hotel = hotel;
        this.transport = transport;
    }
    @Override
    public String toString() {
        return "TravelPackage[" + country + ", " + city + ", " + hotel + ", " + transport + "]";
    }
}

