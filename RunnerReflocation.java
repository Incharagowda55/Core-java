class RunnerReflocation {
    public static void main(String[] args) {

        Location loc = new Location();
        loc.city = "Bangalore";
        loc.area = "BTM";
        loc.pincode = 560076;

        Map map = new Map(loc);

        map.display();
    }
}