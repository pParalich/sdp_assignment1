public class TourBuilder implements TravelPackageBuilder {
    private final StringBuilder tb = new StringBuilder("=== Tour Package ===\n");
    public TourBuilder setCountry(String country) {tb.append("Country: ").append(country).append("\n"); return this;}
    public TourBuilder setCity(String city) {tb.append("City: ").append(city).append("\n"); return this;}
    public TourBuilder setHotel(String hotel) {tb.append("Hotel: ").append(hotel).append("\n"); return this;}
    public TourBuilder setTransport(String transport) {tb.append("Transport: ").append(transport).append("\n"); return this;}
    public String getResult() {
        return tb.toString();
    }
}
