public class TravelPackageDirector {
    public void makeVacationEurope (TravelPackageBuilder builder ) {
        builder.setCountry("Italy").setCity("Lampedusa").setHotel("Hotel La Calandra Resort").setTransport("Train");
    }
    public void makeVacationAsia (TravelPackageBuilder builder) {
        builder.setCountry("Vietnam").setCity("Nha Trang").setHotel("The Anam Cam Ranh").setTransport("Fly");
    }
}
