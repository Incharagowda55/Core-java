class RunnerRefadhar {
    public static void main(String[] args) {

        Aadhaar a = new Aadhaar();
        a.number = "1234-5678-9012";
        a.name = "Inchara";
        a.address = "Bangalore";

        FreeBusTravel f = new FreeBusTravel(a);

        f.display();
    }
}