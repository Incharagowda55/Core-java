
class RunnerConstructorlocation {
    public static void main(String[] args) {

        Location loc = new Location();
        loc.city = "Chennai";
        loc.area = "T Nagar";
        loc.pincode = 600017;

        Map map = new Map(loc);

        map.display();
    }
}