class IPL {

    RCB rcb;

    IPL(RCB rcb) {
        this.rcb = rcb;
    }

    void setRCB(RCB rcb) {
        this.rcb = rcb;
    }

    void display() {
        System.out.println("IPL Team Details:");

        if (rcb != null) {
            System.out.println("Captain: " + rcb.captain);
            System.out.println("Titles: " + rcb.titles);
            System.out.println("Home Ground: " + rcb.homeGround);
        } else {
            System.out.println("No team assigned");
        }
    }
}