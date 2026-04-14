class RunnerMethodadahr {
    public static void main(String[] args) {

        Aadhaar a = new Aadhaar();
        a.number = "9876-5432-1000";
        a.name = "Likhitha";
        a.address = "Mysore";

        FreeBusTravel f = new FreeBusTravel(null);

        f.setAadhaar(a);

        f.display();
    }
}