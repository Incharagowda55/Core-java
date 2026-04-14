class GeotagAccount {

    private String userName;
    private String latitude;
    private String longitude;
    private String locationName;
    private String date;
    private String time;
    private String deviceName;
    private boolean isTagged;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return this.locationName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return this.time;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setIsTagged(boolean isTagged) {
        this.isTagged = isTagged;
    }

    public boolean getIsTagged() {
        return this.isTagged;
    }
}