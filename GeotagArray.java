class GeotagArray {

    GeotagAccount[] tags = new GeotagAccount[20];
    int index;

    public boolean addTag(GeotagAccount acc) {

        boolean isCreated = false;

        boolean isUserValid = false;
        boolean isLatValid = false;
        boolean isLongValid = false;
        boolean isLocationValid = false;
        boolean isDateValid = false;
        boolean isTimeValid = false;
        boolean isDeviceValid = false;

        if (acc.getUserName() != null && !acc.getUserName().isEmpty())
            isUserValid = true;
        else System.out.println("Invalid User");

        if (acc.getLatitude() != null && !acc.getLatitude().isEmpty())
            isLatValid = true;
        else System.out.println("Invalid Latitude");

        if (acc.getLongitude() != null && !acc.getLongitude().isEmpty())
            isLongValid = true;
        else System.out.println("Invalid Longitude");

        if (acc.getLocationName() != null && !acc.getLocationName().isEmpty())
            isLocationValid = true;
        else System.out.println("Invalid Location");

        if (acc.getDate() != null && !acc.getDate().isEmpty())
            isDateValid = true;
        else System.out.println("Invalid Date");

        if (acc.getTime() != null && !acc.getTime().isEmpty())
            isTimeValid = true;
        else System.out.println("Invalid Time");

        if (acc.getDeviceName() != null && !acc.getDeviceName().isEmpty())
            isDeviceValid = true;
        else System.out.println("Invalid Device");

        if (isUserValid && isLatValid && isLongValid &&
            isLocationValid && isDateValid && isTimeValid && isDeviceValid) {

            if (index < tags.length) {
                tags[index++] = acc;
                isCreated = true;
            } else {
                System.out.println("Storage Full");
            }
        }

        return isCreated;
    }

    public void getAllTags() {

        for (int i = 0; i < index; i++) {

            GeotagAccount acc = tags[i];

            System.out.println("----------------");
            System.out.println(acc.getUserName());
            System.out.println(acc.getLatitude());
            System.out.println(acc.getLongitude());
            System.out.println(acc.getLocationName());
            System.out.println(acc.getDate());
            System.out.println(acc.getTime());
            System.out.println(acc.getDeviceName());
            System.out.println(acc.getIsTagged());
        }
    }
}