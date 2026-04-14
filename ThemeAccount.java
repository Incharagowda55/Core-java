class ThemeAccount {

    private String themeName;
    private String category;
    private String designer;
    private double price;
    private int downloads;
    private String platform;
    private String version;
    private boolean isPremium;

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public String getThemeName() {
        return this.themeName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getDesigner() {
        return this.designer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public int getDownloads() {
        return this.downloads;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return this.version;
    }

    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public boolean getIsPremium() {
        return this.isPremium;
    }
}