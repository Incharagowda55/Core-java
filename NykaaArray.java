class NykaaArray {

    NykaaAccount[] products = new NykaaAccount[20];
    int index;

    public boolean addProduct(NykaaAccount acc) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isCategoryValid = false;
        boolean isBrandValid = false;
        boolean isPriceValid = false;
        boolean isQuantityValid = false;
        boolean isSkinValid = false;
        boolean isShadeValid = false;

        if (acc.getProductName() != null && !acc.getProductName().isEmpty())
            isNameValid = true;
        else System.out.println("Invalid Product");

        if (acc.getCategory() != null && !acc.getCategory().isEmpty())
            isCategoryValid = true;
        else System.out.println("Invalid Category");

        if (acc.getBrand() != null && !acc.getBrand().isEmpty())
            isBrandValid = true;
        else System.out.println("Invalid Brand");

        if (acc.getPrice() > 0)
            isPriceValid = true;
        else System.out.println("Invalid Price");

        if (acc.getQuantity() >= 0)
            isQuantityValid = true;
        else System.out.println("Invalid Quantity");

        if (acc.getSkinType() != null && !acc.getSkinType().isEmpty())
            isSkinValid = true;
        else System.out.println("Invalid SkinType");

        if (acc.getShade() != null && !acc.getShade().isEmpty())
            isShadeValid = true;
        else System.out.println("Invalid Shade");

        if (isNameValid && isCategoryValid && isBrandValid &&
            isPriceValid && isQuantityValid && isSkinValid && isShadeValid) {

            if (index < products.length) {
                products[index++] = acc;
                isCreated = true;
            } else {
                System.out.println("Storage Full");
            }
        }

        return isCreated;
    }

    public void getAllProducts() {

        for (int i = 0; i < index; i++) {

            NykaaAccount acc = products[i];

            System.out.println("----------------");
            System.out.println(acc.getProductName());
            System.out.println(acc.getCategory());
            System.out.println(acc.getBrand());
            System.out.println(acc.getPrice());
            System.out.println(acc.getQuantity());
            System.out.println(acc.getSkinType());
            System.out.println(acc.getShade());
            System.out.println(acc.getIsAvailable());
        }
    }
}
 

    