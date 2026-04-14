class FanRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Switch sw = new Switch();
        Blade blade = new Blade();
        Regulator reg = new Regulator();

        Fan fan = new Fan(sw, blade, reg);

        fan.getFanDetails();

        System.out.println("------------");

        sw.brand = "Anchor";
        sw.isOn = true;

        blade.count = 4;

        reg.level = 5;

        fan.getFanDetails();
    }
}