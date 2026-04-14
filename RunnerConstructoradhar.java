class RunnerConstructoradhar {
    public static void main(String[] args) {

        Aadhaar a = new Aadhaar();
        a.number = "1111-2222-3333";
        a.name = "Anusha";
        a.address = "Chennai";

        FreeBusTravel f = new FreeBusTravel(a);

        f.display();
    }
}