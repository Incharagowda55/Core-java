
class RunnerMethodlocation {
    public static void main(String[] args) {

        Location loc = new Location();
        loc.city = "Mysore";
        loc.area = "Vijayanagar";
        loc.pincode = 570017;

        Map map = new Map(null);

        map.setLocation(loc);

        map.display();
    }
}