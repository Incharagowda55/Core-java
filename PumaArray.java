class PumaArray {

    PumaAccount[] products = new PumaAccount[20];
    int index;

    public boolean addProduct(PumaAccount acc) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isCategoryValid = false;
        boolean isSizeValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isQuantityValid = false;
        boolean isMaterialValid = false;

        if (acc.getProductName() != null && !acc.getProductName().isEmpty())
            isNameValid = true;
        else System.out.println("Invalid Product");

        if (acc.getCategory() != null && !acc.getCategory().isEmpty())
            isCategoryValid = true;
        else System.out.println("Invalid Category");

        if (acc.getSize() != null && !acc.getSize().isEmpty())
            isSizeValid = true;
        else System.out.println("Invalid Size");

        if (acc.getColor() != null && !acc.getColor().isEmpty())
            isColorValid = true;
        else System.out.println("Invalid Color");

        if (acc.getPrice() > 0)
            isPriceValid = true;
        else System.out.println("Invalid Price");

        if (acc.getQuantity() >= 0)
            isQuantityValid = true;
        else System.out.println("Invalid Quantity");

        if (acc.getMaterial() != null && !acc.getMaterial().isEmpty())
            isMaterialValid = true;
        else System.out.println("Invalid Material");

        if (isNameValid && isCategoryValid && isSizeValid &&
            isColorValid && isPriceValid && isQuantityValid && isMaterialValid) {

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

            PumaAccount acc = products[i];

            System.out.println("----------------");
            System.out.println(acc.getProductName());
            System.out.println(acc.getCategory());
            System.out.println(acc.getSize());
            System.out.println(acc.getColor());
            System.out.println(acc.getPrice());
            System.out.println(acc.getQuantity());
            System.out.println(acc.getMaterial());
            System.out.println(acc.getIsAvailable());
        }
    }
}