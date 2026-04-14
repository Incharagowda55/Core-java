class MallArray {

    MallAccount[] malls = new MallAccount[20];
    int index;

    public boolean addMall(MallAccount acc) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isLocationValid = false;
        boolean isShopsValid = false;
        boolean isParkingValid = false;
        boolean isOpenTimeValid = false;
        boolean isCloseTimeValid = false;
        boolean isCityValid = false;

        if (acc.getMallName() != null && !acc.getMallName().isEmpty())
            isNameValid = true;
        else System.out.println("Invalid Mall Name");

        if (acc.getLocation() != null && !acc.getLocation().isEmpty())
            isLocationValid = true;
        else System.out.println("Invalid Location");

        if (acc.getNumberOfShops() > 0)
            isShopsValid = true;
        else System.out.println("Invalid Shops");

        if (acc.getParkingCapacity() >= 0)
            isParkingValid = true;
        else System.out.println("Invalid Parking");

        if (acc.getOpeningTime() != null && !acc.getOpeningTime().isEmpty())
            isOpenTimeValid = true;
        else System.out.println("Invalid Opening Time");

        if (acc.getClosingTime() != null && !acc.getClosingTime().isEmpty())
            isCloseTimeValid = true;
        else System.out.println("Invalid Closing Time");

        if (acc.getCity() != null && !acc.getCity().isEmpty())
            isCityValid = true;
        else System.out.println("Invalid City");

        if (isNameValid && isLocationValid && isShopsValid &&
            isParkingValid && isOpenTimeValid && isCloseTimeValid && isCityValid) {

            if (index < malls.length) {
                malls[index++] = acc;
                isCreated = true;
            } else {
                System.out.println("Storage Full");
            }
        }

        return isCreated;
    }

    public void getAllMalls() {

        for (int i = 0; i < index; i++) {

            MallAccount acc = malls[i];

            System.out.println("----------------");
            System.out.println(acc.getMallName());
            System.out.println(acc.getLocation());
            System.out.println(acc.getNumberOfShops());
            System.out.println(acc.getParkingCapacity());
            System.out.println(acc.getOpeningTime());
            System.out.println(acc.getClosingTime());
            System.out.println(acc.getCity());
            System.out.println(acc.getIsOpen());
        }
    }
}