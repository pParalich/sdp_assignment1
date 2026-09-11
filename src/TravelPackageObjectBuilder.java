public class TravelPackageObjectBuilder implements TravelPackageBuilder {
    private String country, city, hotel, transport;

    public TravelPackageBuilder setCountry(String country) {
        this.country = country;
        return this;
    }
    public TravelPackageBuilder setCity(String city) {
        this.city = city;
        return this;
    }
    public TravelPackageBuilder setHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }
    public TravelPackageBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }
    public TravelPackage getResult() {
        if (country == null || city == null)
            throw new IllegalStateException("Country and City are required");
        return new TravelPackage(country, city, hotel, transport);
    }
}
