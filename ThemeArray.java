class ThemeArray {

    ThemeAccount[] themes = new ThemeAccount[20];
    int index;

    public boolean addTheme(ThemeAccount acc) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isCategoryValid = false;
        boolean isDesignerValid = false;
        boolean isPriceValid = false;
        boolean isDownloadValid = false;
        boolean isPlatformValid = false;
        boolean isVersionValid = false;

        if (acc.getThemeName() != null && !acc.getThemeName().isEmpty())
            isNameValid = true;
        else System.out.println("Invalid Theme");

        if (acc.getCategory() != null && !acc.getCategory().isEmpty())
            isCategoryValid = true;
        else System.out.println("Invalid Category");

        if (acc.getDesigner() != null && !acc.getDesigner().isEmpty())
            isDesignerValid = true;
        else System.out.println("Invalid Designer");

        if (acc.getPrice() >= 0)
            isPriceValid = true;
        else System.out.println("Invalid Price");

        if (acc.getDownloads() >= 0)
            isDownloadValid = true;
        else System.out.println("Invalid Downloads");

        if (acc.getPlatform() != null && !acc.getPlatform().isEmpty())
            isPlatformValid = true;
        else System.out.println("Invalid Platform");

        if (acc.getVersion() != null && !acc.getVersion().isEmpty())
            isVersionValid = true;
        else System.out.println("Invalid Version");

        if (isNameValid && isCategoryValid && isDesignerValid &&
            isPriceValid && isDownloadValid && isPlatformValid && isVersionValid) {

            if (index < themes.length) {
                themes[index++] = acc;
                isCreated = true;
            } else {
                System.out.println("Storage Full");
            }
        }

        return isCreated;
    }

    public void getAllThemes() {

        for (int i = 0; i < index; i++) {

            ThemeAccount acc = themes[i];

            System.out.println("----------------");
            System.out.println(acc.getThemeName());
            System.out.println(acc.getCategory());
            System.out.println(acc.getDesigner());
            System.out.println(acc.getPrice());
            System.out.println(acc.getDownloads());
            System.out.println(acc.getPlatform());
            System.out.println(acc.getVersion());
            System.out.println(acc.getIsPremium());
        }
    }
}