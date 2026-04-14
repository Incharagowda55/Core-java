class HMArray {

    HMAccount[] products = new HMAccount[20];
    int index;

    public boolean addProduct(HMAccount acc) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isCategoryValid = false;
        boolean isSizeValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isQuantityValid = false;
        boolean isBrandValid = false;

        if (acc.getProductName() != null && !acc.getProductName().isEmpty())
            isNameValid = true;
        else System.out.println("Invalid Product Name");

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

        if (acc.getBrand() != null && !acc.getBrand().isEmpty())
            isBrandValid = true;
        else System.out.println("Invalid Brand");

        if (isNameValid && isCategoryValid && isSizeValid &&
            isColorValid && isPriceValid && isQuantityValid && isBrandValid) {

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

        System.out.println("----- H&M Products -----");

        for (int i = 0; i < index; i++) {

            HMAccount acc = products[i];

            System.out.println("----------------");
            System.out.println("Product: " + acc.getProductName());
            System.out.println("Category: " + acc.getCategory());
            System.out.println("Size: " + acc.getSize());
            System.out.println("Color: " + acc.getColor());
            System.out.println("Price: " + acc.getPrice());
            System.out.println("Quantity: " + acc.getQuantity());
            System.out.println("Brand: " + acc.getBrand());
            System.out.println("In Stock: " + acc.getInStock());
        }
    }
}