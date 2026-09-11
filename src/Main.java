public class Main {
    public static void main(String[] args) {
        TravelPackageDirector director = new TravelPackageDirector();

        TravelPackageObjectBuilder objBuilder = new TravelPackageObjectBuilder();
        director.makeVacationEurope(objBuilder);
        TravelPackage euTrip = objBuilder.getResult();
        System.out.println(euTrip);

        TourBuilder tourBuilder = new TourBuilder();
        director.makeVacationEurope(tourBuilder);
        String tour = tourBuilder.getResult();
        System.out.println(tour);

        TravelPackageObjectBuilder objBuilder2 = new TravelPackageObjectBuilder();
        director.makeVacationAsia(objBuilder2);
        TravelPackage asiaTrip = objBuilder2.getResult();
        System.out.println(asiaTrip);
    }
}