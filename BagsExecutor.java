class BagsExecutor {

    public static void main(String[] args) {

        Bags bag = new Bags();

        System.out.println("Before Initialization");

        System.out.println("Bag Name: " + bag.bagName);
        System.out.println("Brand: " + bag.brand);
        System.out.println("Rating: " + bag.rating);
        System.out.println("Discount Percentage: " + bag.discountPercentage);
        System.out.println("Manufacturer: " + bag.manufacturer);
        System.out.println("Price: " + bag.price);
        System.out.println("Capacity In Liters: " + bag.capacityInLiters);
        System.out.println("Color: " + bag.color);
        System.out.println("Number Of Compartments: " + bag.numberOfCompartments);
        System.out.println("Number Of Pockets: " + bag.numberOfPockets);
        System.out.println("Material: " + bag.material);
        System.out.println("Type: " + bag.type);
        System.out.println("Waterproof: " + bag.waterproof);
        System.out.println("Laptop Compartment: " + bag.laptopCompartment);
        System.out.println("Weight In Grams: " + bag.weightInGrams);
        System.out.println("Width: " + bag.width);
        System.out.println("Height: " + bag.height);
        System.out.println("Depth: " + bag.depth);
        System.out.println("Country Of Origin: " + bag.countryOfOrigin);
        System.out.println("Warranty: " + bag.warranty);
        System.out.println("Model Number: " + bag.modelNumber);
        System.out.println("Expandable: " + bag.expandable);
        System.out.println("Recyclable Material: " + bag.recyclableMaterial);


        // Initialization

        bag.bagName = "BackPack";
        bag.brand = "Puma";
        bag.rating = 5.0;
        bag.discountPercentage = 10.5;
        bag.manufacturer = "Puma Industries";
        bag.price = 2500;
        bag.capacityInLiters = 35;
        bag.color = "Black";
        bag.numberOfCompartments = 3;
        bag.numberOfPockets = 5;
        bag.material = "Polyester";
        bag.type = "Laptop Bag";
        bag.waterproof = true;
        bag.laptopCompartment = true;
        bag.weightInGrams = 800;
        bag.width = 30;
        bag.height = 45;
        bag.depth = 15;
        bag.countryOfOrigin = "India";
        bag.warranty = "1 Year";
        bag.modelNumber = "PM123";
        bag.expandable = true;
        bag.recyclableMaterial = true;


        System.out.println("\nAfter Initialization");

        System.out.println("Bag Name: " + bag.bagName);
        System.out.println("Brand: " + bag.brand);
        System.out.println("Rating: " + bag.rating);
        System.out.println("Discount Percentage: " + bag.discountPercentage);
        System.out.println("Manufacturer: " + bag.manufacturer);
        System.out.println("Price: " + bag.price);
        System.out.println("Capacity In Liters: " + bag.capacityInLiters);
        System.out.println("Color: " + bag.color);
        System.out.println("Number Of Compartments: " + bag.numberOfCompartments);
        System.out.println("Number Of Pockets: " + bag.numberOfPockets);
        System.out.println("Material: " + bag.material);
        System.out.println("Type: " + bag.type);
        System.out.println("Waterproof: " + bag.waterproof);
        System.out.println("Laptop Compartment: " + bag.laptopCompartment);
        System.out.println("Weight In Grams: " + bag.weightInGrams);
        System.out.println("Width: " + bag.width);
        System.out.println("Height: " + bag.height);
        System.out.println("Depth: " + bag.depth);
        System.out.println("Country Of Origin: " + bag.countryOfOrigin);
        System.out.println("Warranty: " + bag.warranty);
        System.out.println("Model Number: " + bag.modelNumber);
        System.out.println("Expandable: " + bag.expandable);
        System.out.println("Recyclable Material: " + bag.recyclableMaterial);
		
		
		System.out.println("The Second Copy");
		
		
		Bags bag1 = new Bags();

		System.out.println("Before Initialization");

		System.out.println("Bag Name: " + bag1.bagName);
		System.out.println("Brand: " + bag1.brand);
		System.out.println("Rating: " + bag1.rating);
		System.out.println("Discount Percentage: " + bag1.discountPercentage);
		System.out.println("Manufacturer: " + bag1.manufacturer);
		System.out.println("Price: " + bag1.price);
		System.out.println("Capacity In Liters: " + bag1.capacityInLiters);
		System.out.println("Color: " + bag1.color);
		System.out.println("Number Of Compartments: " + bag1.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag1.numberOfPockets);
		System.out.println("Material: " + bag1.material);
		System.out.println("Type: " + bag1.type);
		System.out.println("Waterproof: " + bag1.waterproof);
		System.out.println("Laptop Compartment: " + bag1.laptopCompartment);
		System.out.println("Weight In Grams: " + bag1.weightInGrams);
		System.out.println("Width: " + bag1.width);
		System.out.println("Height: " + bag1.height);
		System.out.println("Depth: " + bag1.depth);
		System.out.println("Country Of Origin: " + bag1.countryOfOrigin);
		System.out.println("Warranty: " + bag1.warranty);
		System.out.println("Model Number: " + bag1.modelNumber);
		System.out.println("Expandable: " + bag1.expandable);
		System.out.println("Recyclable Material: " + bag1.recyclableMaterial);


		// Initialization

		bag1.bagName = "SlingBag";
		bag1.brand = "Nike";
		bag1.rating = 4.5;
		bag1.discountPercentage = 12.0;
		bag1.manufacturer = "Nike Industries";
		bag1.price = 1800;
		bag1.capacityInLiters = 20;
		bag1.color = "Blue";
		bag1.numberOfCompartments = 2;
		bag1.numberOfPockets = 4;
		bag1.material = "Leather";
		bag1.type = "Casual Bag";
		bag1.waterproof = true;
		bag1.laptopCompartment = false;
		bag1.weightInGrams = 600;
		bag1.width = 25;
		bag1.height = 35;
		bag1.depth = 12;
		bag1.countryOfOrigin = "USA";
		bag1.warranty = "6 Months";
		bag1.modelNumber = "NK456";
		bag1.expandable = false;
		bag1.recyclableMaterial = true;


		System.out.println("After Initialization");

		System.out.println("Bag Name: " + bag1.bagName);
		System.out.println("Brand: " + bag1.brand);
		System.out.println("Rating: " + bag1.rating);
		System.out.println("Discount Percentage: " + bag1.discountPercentage);
		System.out.println("Manufacturer: " + bag1.manufacturer);
		System.out.println("Price: " + bag1.price);
		System.out.println("Capacity In Liters: " + bag1.capacityInLiters);
		System.out.println("Color: " + bag1.color);
		System.out.println("Number Of Compartments: " + bag1.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag1.numberOfPockets);
		System.out.println("Material: " + bag1.material);
		System.out.println("Type: " + bag1.type);
		System.out.println("Waterproof: " + bag1.waterproof);
		System.out.println("Laptop Compartment: " + bag1.laptopCompartment);
		System.out.println("Weight In Grams: " + bag1.weightInGrams);
		System.out.println("Width: " + bag1.width);
		System.out.println("Height: " + bag1.height);
		System.out.println("Depth: " + bag1.depth);
		System.out.println("Country Of Origin: " + bag1.countryOfOrigin);
		System.out.println("Warranty: " + bag1.warranty);
		System.out.println("Model Number: " + bag1.modelNumber);
		System.out.println("Expandable: " + bag1.expandable);
		System.out.println("Recyclable Material: " + bag1.recyclableMaterial);

		
		System.out.println("The Third Copy");
		
		Bags bag2 = new Bags();

		System.out.println("Before Initialization");

		System.out.println("Bag Name: " + bag2.bagName);
		System.out.println("Brand: " + bag2.brand);
		System.out.println("Rating: " + bag2.rating);
		System.out.println("Discount Percentage: " + bag2.discountPercentage);
		System.out.println("Manufacturer: " + bag2.manufacturer);
		System.out.println("Price: " + bag2.price);
		System.out.println("Capacity In Liters: " + bag2.capacityInLiters);
		System.out.println("Color: " + bag2.color);
		System.out.println("Number Of Compartments: " + bag2.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag2.numberOfPockets);
		System.out.println("Material: " + bag2.material);
		System.out.println("Type: " + bag2.type);
		System.out.println("Waterproof: " + bag2.waterproof);
		System.out.println("Laptop Compartment: " + bag2.laptopCompartment);
		System.out.println("Weight In Grams: " + bag2.weightInGrams);
		System.out.println("Width: " + bag2.width);
		System.out.println("Height: " + bag2.height);
		System.out.println("Depth: " + bag2.depth);
		System.out.println("Country Of Origin: " + bag2.countryOfOrigin);
		System.out.println("Warranty: " + bag2.warranty);
		System.out.println("Model Number: " + bag2.modelNumber);
		System.out.println("Expandable: " + bag2.expandable);
		System.out.println("Recyclable Material: " + bag2.recyclableMaterial);


		// Initialization

		bag2.bagName = "LaptopBag";
		bag2.brand = "Skybags";
		bag2.rating = 4.8;
		bag2.discountPercentage = 15.0;
		bag2.manufacturer = "Skybags Pvt Ltd";
		bag2.price = 3200;
		bag2.capacityInLiters = 40;
		bag2.color = "Grey";
		bag2.numberOfCompartments = 4;
		bag2.numberOfPockets = 6;
		bag2.material = "Nylon";
		bag2.type = "Office Bag";
		bag2.waterproof = true;
		bag2.laptopCompartment = true;
		bag2.weightInGrams = 900;
		bag2.width = 32;
		bag2.height = 48;
		bag2.depth = 18;
		bag2.countryOfOrigin = "India";
		bag2.warranty = "2 Years";
		bag2.modelNumber = "SB789";
		bag2.expandable = true;
		bag2.recyclableMaterial = false;


		System.out.println("After Initialization");

		System.out.println("Bag Name: " + bag2.bagName);
		System.out.println("Brand: " + bag2.brand);
		System.out.println("Rating: " + bag2.rating);
		System.out.println("Discount Percentage: " + bag2.discountPercentage);
		System.out.println("Manufacturer: " + bag2.manufacturer);
		System.out.println("Price: " + bag2.price);
		System.out.println("Capacity In Liters: " + bag2.capacityInLiters);
		System.out.println("Color: " + bag2.color);
		System.out.println("Number Of Compartments: " + bag2.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag2.numberOfPockets);
		System.out.println("Material: " + bag2.material);
		System.out.println("Type: " + bag2.type);
		System.out.println("Waterproof: " + bag2.waterproof);
		System.out.println("Laptop Compartment: " + bag2.laptopCompartment);
		System.out.println("Weight In Grams: " + bag2.weightInGrams);
		System.out.println("Width: " + bag2.width);
		System.out.println("Height: " + bag2.height);
		System.out.println("Depth: " + bag2.depth);
		System.out.println("Country Of Origin: " + bag2.countryOfOrigin);
		System.out.println("Warranty: " + bag2.warranty);
		System.out.println("Model Number: " + bag2.modelNumber);
		System.out.println("Expandable: " + bag2.expandable);
		System.out.println("Recyclable Material: " + bag2.recyclableMaterial);
		
		System.out.println("The Fourth Copy");
		
		
		
		Bags bag3 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag3.bagName);
		System.out.println("Brand: " + bag3.brand);
		System.out.println("Rating: " + bag3.rating);
		System.out.println("Discount Percentage: " + bag3.discountPercentage);
		System.out.println("Manufacturer: " + bag3.manufacturer);
		System.out.println("Price: " + bag3.price);
		System.out.println("Capacity In Liters: " + bag3.capacityInLiters);
		System.out.println("Color: " + bag3.color);
		System.out.println("Number Of Compartments: " + bag3.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag3.numberOfPockets);
		System.out.println("Material: " + bag3.material);
		System.out.println("Type: " + bag3.type);
		System.out.println("Waterproof: " + bag3.waterproof);
		System.out.println("Laptop Compartment: " + bag3.laptopCompartment);
		System.out.println("Weight In Grams: " + bag3.weightInGrams);
		System.out.println("Width: " + bag3.width);
		System.out.println("Height: " + bag3.height);
		System.out.println("Depth: " + bag3.depth);
		System.out.println("Country Of Origin: " + bag3.countryOfOrigin);
		System.out.println("Warranty: " + bag3.warranty);
		System.out.println("Model Number: " + bag3.modelNumber);
		System.out.println("Expandable: " + bag3.expandable);
		System.out.println("Recyclable Material: " + bag3.recyclableMaterial);


		// Initialization

		bag3.bagName = "TravelBag";
		bag3.brand = "Wildcraft";
		bag3.rating = 4.7;
		bag3.discountPercentage = 18.0;
		bag3.manufacturer = "Wildcraft India";
		bag3.price = 3500;
		bag3.capacityInLiters = 50;
		bag3.color = "Green";
		bag3.numberOfCompartments = 4;
		bag3.numberOfPockets = 5;
		bag3.material = "Polyester";
		bag3.type = "Travel";
		bag3.waterproof = true;
		bag3.laptopCompartment = false;
		bag3.weightInGrams = 1200;
		bag3.width = 35;
		bag3.height = 55;
		bag3.depth = 20;
		bag3.countryOfOrigin = "India";
		bag3.warranty = "1 Year";
		bag3.modelNumber = "WC101";
		bag3.expandable = true;
		bag3.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag3.bagName);
		System.out.println("Brand: " + bag3.brand);
		System.out.println("Rating: " + bag3.rating);
		System.out.println("Discount Percentage: " + bag3.discountPercentage);
		System.out.println("Manufacturer: " + bag3.manufacturer);
		System.out.println("Price: " + bag3.price);
		System.out.println("Capacity In Liters: " + bag3.capacityInLiters);
		System.out.println("Color: " + bag3.color);
		System.out.println("Number Of Compartments: " + bag3.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag3.numberOfPockets);
		System.out.println("Material: " + bag3.material);
		System.out.println("Type: " + bag3.type);
		System.out.println("Waterproof: " + bag3.waterproof);
		System.out.println("Laptop Compartment: " + bag3.laptopCompartment);
		System.out.println("Weight In Grams: " + bag3.weightInGrams);
		System.out.println("Width: " + bag3.width);
		System.out.println("Height: " + bag3.height);
		System.out.println("Depth: " + bag3.depth);
		System.out.println("Country Of Origin: " + bag3.countryOfOrigin);
		System.out.println("Warranty: " + bag3.warranty);
		System.out.println("Model Number: " + bag3.modelNumber);
		System.out.println("Expandable: " + bag3.expandable);
		System.out.println("Recyclable Material: " + bag3.recyclableMaterial);
		
		
		System.out.println("the 5th copy");
				Bags bag4 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag4.bagName);
		System.out.println("Brand: " + bag4.brand);
		System.out.println("Rating: " + bag4.rating);
		System.out.println("Discount Percentage: " + bag4.discountPercentage);
		System.out.println("Manufacturer: " + bag4.manufacturer);
		System.out.println("Price: " + bag4.price);
		System.out.println("Capacity In Liters: " + bag4.capacityInLiters);
		System.out.println("Color: " + bag4.color);
		System.out.println("Number Of Compartments: " + bag4.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag4.numberOfPockets);
		System.out.println("Material: " + bag4.material);
		System.out.println("Type: " + bag4.type);
		System.out.println("Waterproof: " + bag4.waterproof);
		System.out.println("Laptop Compartment: " + bag4.laptopCompartment);
		System.out.println("Weight In Grams: " + bag4.weightInGrams);
		System.out.println("Width: " + bag4.width);
		System.out.println("Height: " + bag4.height);
		System.out.println("Depth: " + bag4.depth);
		System.out.println("Country Of Origin: " + bag4.countryOfOrigin);
		System.out.println("Warranty: " + bag4.warranty);
		System.out.println("Model Number: " + bag4.modelNumber);
		System.out.println("Expandable: " + bag4.expandable);
		System.out.println("Recyclable Material: " + bag4.recyclableMaterial);


		// Initialization

		bag4.bagName = "SchoolBag";
		bag4.brand = "AmericanTourister";
		bag4.rating = 4.6;
		bag4.discountPercentage = 10.0;
		bag4.manufacturer = "Samsonite";
		bag4.price = 2000;
		bag4.capacityInLiters = 30;
		bag4.color = "Blue";
		bag4.numberOfCompartments = 3;
		bag4.numberOfPockets = 4;
		bag4.material = "Nylon";
		bag4.type = "School";
		bag4.waterproof = true;
		bag4.laptopCompartment = false;
		bag4.weightInGrams = 700;
		bag4.width = 28;
		bag4.height = 42;
		bag4.depth = 15;
		bag4.countryOfOrigin = "USA";
		bag4.warranty = "1 Year";
		bag4.modelNumber = "AT202";
		bag4.expandable = false;
		bag4.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag4.bagName);
		System.out.println("Brand: " + bag4.brand);
		System.out.println("Rating: " + bag4.rating);
		System.out.println("Discount Percentage: " + bag4.discountPercentage);
		System.out.println("Manufacturer: " + bag4.manufacturer);
		System.out.println("Price: " + bag4.price);
		System.out.println("Capacity In Liters: " + bag4.capacityInLiters);
		System.out.println("Color: " + bag4.color);
		System.out.println("Number Of Compartments: " + bag4.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag4.numberOfPockets);
		System.out.println("Material: " + bag4.material);
		System.out.println("Type: " + bag4.type);
		System.out.println("Waterproof: " + bag4.waterproof);
		System.out.println("Laptop Compartment: " + bag4.laptopCompartment);
		System.out.println("Weight In Grams: " + bag4.weightInGrams);
		System.out.println("Width: " + bag4.width);
		System.out.println("Height: " + bag4.height);
		System.out.println("Depth: " + bag4.depth);
		System.out.println("Country Of Origin: " + bag4.countryOfOrigin);
		System.out.println("Warranty: " + bag4.warranty);
		System.out.println("Model Number: " + bag4.modelNumber);
		System.out.println("Expandable: " + bag4.expandable);
		System.out.println("Recyclable Material: " + bag4.recyclableMaterial);
		
		
		System.out.println("the 6th copy");
		Bags bag5 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag5.bagName);
		System.out.println("Brand: " + bag5.brand);
		System.out.println("Rating: " + bag5.rating);
		System.out.println("Discount Percentage: " + bag5.discountPercentage);
		System.out.println("Manufacturer: " + bag5.manufacturer);
		System.out.println("Price: " + bag5.price);
		System.out.println("Capacity In Liters: " + bag5.capacityInLiters);
		System.out.println("Color: " + bag5.color);
		System.out.println("Number Of Compartments: " + bag5.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag5.numberOfPockets);
		System.out.println("Material: " + bag5.material);
		System.out.println("Type: " + bag5.type);
		System.out.println("Waterproof: " + bag5.waterproof);
		System.out.println("Laptop Compartment: " + bag5.laptopCompartment);
		System.out.println("Weight In Grams: " + bag5.weightInGrams);
		System.out.println("Width: " + bag5.width);
		System.out.println("Height: " + bag5.height);
		System.out.println("Depth: " + bag5.depth);
		System.out.println("Country Of Origin: " + bag5.countryOfOrigin);
		System.out.println("Warranty: " + bag5.warranty);
		System.out.println("Model Number: " + bag5.modelNumber);
		System.out.println("Expandable: " + bag5.expandable);
		System.out.println("Recyclable Material: " + bag5.recyclableMaterial);


		// Initialization

		bag5.bagName = "GymBag";
		bag5.brand = "Adidas";
		bag5.rating = 4.5;
		bag5.discountPercentage = 12.0;
		bag5.manufacturer = "Adidas Ltd";
		bag5.price = 2800;
		bag5.capacityInLiters = 40;
		bag5.color = "Black";
		bag5.numberOfCompartments = 2;
		bag5.numberOfPockets = 3;
		bag5.material = "Polyester";
		bag5.type = "Sports";
		bag5.waterproof = false;
		bag5.laptopCompartment = false;
		bag5.weightInGrams = 900;
		bag5.width = 40;
		bag5.height = 30;
		bag5.depth = 22;
		bag5.countryOfOrigin = "Germany";
		bag5.warranty = "6 Months";
		bag5.modelNumber = "AD303";
		bag5.expandable = true;
		bag5.recyclableMaterial = false;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag5.bagName);
		System.out.println("Brand: " + bag5.brand);
		System.out.println("Rating: " + bag5.rating);
		System.out.println("Discount Percentage: " + bag5.discountPercentage);
		System.out.println("Manufacturer: " + bag5.manufacturer);
		System.out.println("Price: " + bag5.price);
		System.out.println("Capacity In Liters: " + bag5.capacityInLiters);
		System.out.println("Color: " + bag5.color);
		System.out.println("Number Of Compartments: " + bag5.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag5.numberOfPockets);
		System.out.println("Material: " + bag5.material);
		System.out.println("Type: " + bag5.type);
		System.out.println("Waterproof: " + bag5.waterproof);
		System.out.println("Laptop Compartment: " + bag5.laptopCompartment);
		System.out.println("Weight In Grams: " + bag5.weightInGrams);
		System.out.println("Width: " + bag5.width);
		System.out.println("Height: " + bag5.height);
		System.out.println("Depth: " + bag5.depth);
		System.out.println("Country Of Origin: " + bag5.countryOfOrigin);
		System.out.println("Warranty: " + bag5.warranty);
		System.out.println("Model Number: " + bag5.modelNumber);
		System.out.println("Expandable: " + bag5.expandable);
		System.out.println("Recyclable Material: " + bag5.recyclableMaterial);
		
		System.out.println("the 7th copy");
			Bags bag6 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag6.bagName);
		System.out.println("Brand: " + bag6.brand);
		System.out.println("Rating: " + bag6.rating);
		System.out.println("Discount Percentage: " + bag6.discountPercentage);
		System.out.println("Manufacturer: " + bag6.manufacturer);
		System.out.println("Price: " + bag6.price);
		System.out.println("Capacity In Liters: " + bag6.capacityInLiters);
		System.out.println("Color: " + bag6.color);
		System.out.println("Number Of Compartments: " + bag6.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag6.numberOfPockets);
		System.out.println("Material: " + bag6.material);
		System.out.println("Type: " + bag6.type);
		System.out.println("Waterproof: " + bag6.waterproof);
		System.out.println("Laptop Compartment: " + bag6.laptopCompartment);
		System.out.println("Weight In Grams: " + bag6.weightInGrams);
		System.out.println("Width: " + bag6.width);
		System.out.println("Height: " + bag6.height);
		System.out.println("Depth: " + bag6.depth);
		System.out.println("Country Of Origin: " + bag6.countryOfOrigin);
		System.out.println("Warranty: " + bag6.warranty);
		System.out.println("Model Number: " + bag6.modelNumber);
		System.out.println("Expandable: " + bag6.expandable);
		System.out.println("Recyclable Material: " + bag6.recyclableMaterial);


		// Initialization

		bag6.bagName = "OfficeBag";
		bag6.brand = "Dell";
		bag6.rating = 4.4;
		bag6.discountPercentage = 8.0;
		bag6.manufacturer = "Dell Pvt Ltd";
		bag6.price = 3000;
		bag6.capacityInLiters = 32;
		bag6.color = "Grey";
		bag6.numberOfCompartments = 3;
		bag6.numberOfPockets = 5;
		bag6.material = "Leather";
		bag6.type = "Laptop";
		bag6.waterproof = true;
		bag6.laptopCompartment = true;
		bag6.weightInGrams = 850;
		bag6.width = 30;
		bag6.height = 44;
		bag6.depth = 16;
		bag6.countryOfOrigin = "USA";
		bag6.warranty = "1 Year";
		bag6.modelNumber = "DL404";
		bag6.expandable = false;
		bag6.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag6.bagName);
		System.out.println("Brand: " + bag6.brand);
		System.out.println("Rating: " + bag6.rating);
		System.out.println("Discount Percentage: " + bag6.discountPercentage);
		System.out.println("Manufacturer: " + bag6.manufacturer);
		System.out.println("Price: " + bag6.price);
		System.out.println("Capacity In Liters: " + bag6.capacityInLiters);
		System.out.println("Color: " + bag6.color);
		System.out.println("Number Of Compartments: " + bag6.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag6.numberOfPockets);
		System.out.println("Material: " + bag6.material);
		System.out.println("Type: " + bag6.type);
		System.out.println("Waterproof: " + bag6.waterproof);
		System.out.println("Laptop Compartment: " + bag6.laptopCompartment);
		System.out.println("Weight In Grams: " + bag6.weightInGrams);
		System.out.println("Width: " + bag6.width);
		System.out.println("Height: " + bag6.height);
		System.out.println("Depth: " + bag6.depth);
		System.out.println("Country Of Origin: " + bag6.countryOfOrigin);
		System.out.println("Warranty: " + bag6.warranty);
		System.out.println("Model Number: " + bag6.modelNumber);
		System.out.println("Expandable: " + bag6.expandable);
		System.out.println("Recyclable Material: " + bag6.recyclableMaterial);	
		
		System.out.println("the 8th copy");
		
		 Bags bag7 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag7.bagName);
		System.out.println("Brand: " + bag7.brand);
		System.out.println("Rating: " + bag7.rating);
		System.out.println("Discount Percentage: " + bag7.discountPercentage);
		System.out.println("Manufacturer: " + bag7.manufacturer);
		System.out.println("Price: " + bag7.price);
		System.out.println("Capacity In Liters: " + bag7.capacityInLiters);
		System.out.println("Color: " + bag7.color);
		System.out.println("Number Of Compartments: " + bag7.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag7.numberOfPockets);
		System.out.println("Material: " + bag7.material);
		System.out.println("Type: " + bag7.type);
		System.out.println("Waterproof: " + bag7.waterproof);
		System.out.println("Laptop Compartment: " + bag7.laptopCompartment);
		System.out.println("Weight In Grams: " + bag7.weightInGrams);
		System.out.println("Width: " + bag7.width);
		System.out.println("Height: " + bag7.height);
		System.out.println("Depth: " + bag7.depth);
		System.out.println("Country Of Origin: " + bag7.countryOfOrigin);
		System.out.println("Warranty: " + bag7.warranty);
		System.out.println("Model Number: " + bag7.modelNumber);
		System.out.println("Expandable: " + bag7.expandable);
		System.out.println("Recyclable Material: " + bag7.recyclableMaterial);


		// Initialization

		bag7.bagName = "TrekkingBag";
		bag7.brand = "Decathlon";
		bag7.rating = 4.6;
		bag7.discountPercentage = 14.0;
		bag7.manufacturer = "Decathlon Sports";
		bag7.price = 4200;
		bag7.capacityInLiters = 60;
		bag7.color = "Orange";
		bag7.numberOfCompartments = 5;
		bag7.numberOfPockets = 6;
		bag7.material = "Polyester";
		bag7.type = "Adventure";
		bag7.waterproof = true;
		bag7.laptopCompartment = false;
		bag7.weightInGrams = 1500;
		bag7.width = 38;
		bag7.height = 60;
		bag7.depth = 25;
		bag7.countryOfOrigin = "France";
		bag7.warranty = "2 Years";
		bag7.modelNumber = "DC505";
		bag7.expandable = true;
		bag7.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag7.bagName);
		System.out.println("Brand: " + bag7.brand);
		System.out.println("Rating: " + bag7.rating);
		System.out.println("Discount Percentage: " + bag7.discountPercentage);
		System.out.println("Manufacturer: " + bag7.manufacturer);
		System.out.println("Price: " + bag7.price);
		System.out.println("Capacity In Liters: " + bag7.capacityInLiters);
		System.out.println("Color: " + bag7.color);
		System.out.println("Number Of Compartments: " + bag7.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag7.numberOfPockets);
		System.out.println("Material: " + bag7.material);
		System.out.println("Type: " + bag7.type);
		System.out.println("Waterproof: " + bag7.waterproof);
		System.out.println("Laptop Compartment: " + bag7.laptopCompartment);
		System.out.println("Weight In Grams: " + bag7.weightInGrams);
		System.out.println("Width: " + bag7.width);
		System.out.println("Height: " + bag7.height);
		System.out.println("Depth: " + bag7.depth);
		System.out.println("Country Of Origin: " + bag7.countryOfOrigin);
		System.out.println("Warranty: " + bag7.warranty);
		System.out.println("Model Number: " + bag7.modelNumber);
		System.out.println("Expandable: " + bag7.expandable);
		System.out.println("Recyclable Material: " + bag7.recyclableMaterial);



				System.out.println("the 9th copy");
				Bags bag8 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag8.bagName);
		System.out.println("Brand: " + bag8.brand);
		System.out.println("Rating: " + bag8.rating);
		System.out.println("Discount Percentage: " + bag8.discountPercentage);
		System.out.println("Manufacturer: " + bag8.manufacturer);
		System.out.println("Price: " + bag8.price);
		System.out.println("Capacity In Liters: " + bag8.capacityInLiters);
		System.out.println("Color: " + bag8.color);
		System.out.println("Number Of Compartments: " + bag8.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag8.numberOfPockets);
		System.out.println("Material: " + bag8.material);
		System.out.println("Type: " + bag8.type);
		System.out.println("Waterproof: " + bag8.waterproof);
		System.out.println("Laptop Compartment: " + bag8.laptopCompartment);
		System.out.println("Weight In Grams: " + bag8.weightInGrams);
		System.out.println("Width: " + bag8.width);
		System.out.println("Height: " + bag8.height);
		System.out.println("Depth: " + bag8.depth);
		System.out.println("Country Of Origin: " + bag8.countryOfOrigin);
		System.out.println("Warranty: " + bag8.warranty);
		System.out.println("Model Number: " + bag8.modelNumber);
		System.out.println("Expandable: " + bag8.expandable);
		System.out.println("Recyclable Material: " + bag8.recyclableMaterial);


		// Initialization

		bag8.bagName = "HandBag";
		bag8.brand = "Lavie";
		bag8.rating = 4.3;
		bag8.discountPercentage = 9.5;
		bag8.manufacturer = "Lavie Fashion";
		bag8.price = 2200;
		bag8.capacityInLiters = 18;
		bag8.color = "Pink";
		bag8.numberOfCompartments = 2;
		bag8.numberOfPockets = 3;
		bag8.material = "Synthetic Leather";
		bag8.type = "Casual";
		bag8.waterproof = false;
		bag8.laptopCompartment = false;
		bag8.weightInGrams = 500;
		bag8.width = 24;
		bag8.height = 30;
		bag8.depth = 12;
		bag8.countryOfOrigin = "India";
		bag8.warranty = "6 Months";
		bag8.modelNumber = "LV808";
		bag8.expandable = false;
		bag8.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag8.bagName);
		System.out.println("Brand: " + bag8.brand);
		System.out.println("Rating: " + bag8.rating);
		System.out.println("Discount Percentage: " + bag8.discountPercentage);
		System.out.println("Manufacturer: " + bag8.manufacturer);
		System.out.println("Price: " + bag8.price);
		System.out.println("Capacity In Liters: " + bag8.capacityInLiters);
		System.out.println("Color: " + bag8.color);
		System.out.println("Number Of Compartments: " + bag8.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag8.numberOfPockets);
		System.out.println("Material: " + bag8.material);
		System.out.println("Type: " + bag8.type);
		System.out.println("Waterproof: " + bag8.waterproof);
		System.out.println("Laptop Compartment: " + bag8.laptopCompartment);
		System.out.println("Weight In Grams: " + bag8.weightInGrams);
		System.out.println("Width: " + bag8.width);
		System.out.println("Height: " + bag8.height);
		System.out.println("Depth: " + bag8.depth);
		System.out.println("Country Of Origin: " + bag8.countryOfOrigin);
		System.out.println("Warranty: " + bag8.warranty);
		System.out.println("Model Number: " + bag8.modelNumber);
		System.out.println("Expandable: " + bag8.expandable);
		System.out.println("Recyclable Material: " + bag8.recyclableMaterial);

				System.out.println("the 10th copy");
				Bags bag9 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag9.bagName);
		System.out.println("Brand: " + bag9.brand);
		System.out.println("Rating: " + bag9.rating);
		System.out.println("Discount Percentage: " + bag9.discountPercentage);
		System.out.println("Manufacturer: " + bag9.manufacturer);
		System.out.println("Price: " + bag9.price);
		System.out.println("Capacity In Liters: " + bag9.capacityInLiters);
		System.out.println("Color: " + bag9.color);
		System.out.println("Number Of Compartments: " + bag9.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag9.numberOfPockets);
		System.out.println("Material: " + bag9.material);
		System.out.println("Type: " + bag9.type);
		System.out.println("Waterproof: " + bag9.waterproof);
		System.out.println("Laptop Compartment: " + bag9.laptopCompartment);
		System.out.println("Weight In Grams: " + bag9.weightInGrams);
		System.out.println("Width: " + bag9.width);
		System.out.println("Height: " + bag9.height);
		System.out.println("Depth: " + bag9.depth);
		System.out.println("Country Of Origin: " + bag9.countryOfOrigin);
		System.out.println("Warranty: " + bag9.warranty);
		System.out.println("Model Number: " + bag9.modelNumber);
		System.out.println("Expandable: " + bag9.expandable);
		System.out.println("Recyclable Material: " + bag9.recyclableMaterial);


		// Initialization

		bag9.bagName = "MessengerBag";
		bag9.brand = "Fastrack";
		bag9.rating = 4.2;
		bag9.discountPercentage = 11.0;
		bag9.manufacturer = "Titan Company";
		bag9.price = 1900;
		bag9.capacityInLiters = 25;
		bag9.color = "Brown";
		bag9.numberOfCompartments = 3;
		bag9.numberOfPockets = 4;
		bag9.material = "Canvas";
		bag9.type = "Messenger";
		bag9.waterproof = false;
		bag9.laptopCompartment = true;
		bag9.weightInGrams = 650;
		bag9.width = 32;
		bag9.height = 28;
		bag9.depth = 14;
		bag9.countryOfOrigin = "India";
		bag9.warranty = "1 Year";
		bag9.modelNumber = "FT909";
		bag9.expandable = false;
		bag9.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag9.bagName);
		System.out.println("Brand: " + bag9.brand);
		System.out.println("Rating: " + bag9.rating);
		System.out.println("Discount Percentage: " + bag9.discountPercentage);
		System.out.println("Manufacturer: " + bag9.manufacturer);
		System.out.println("Price: " + bag9.price);
		System.out.println("Capacity In Liters: " + bag9.capacityInLiters);
		System.out.println("Color: " + bag9.color);
		System.out.println("Number Of Compartments: " + bag9.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag9.numberOfPockets);
		System.out.println("Material: " + bag9.material);
		System.out.println("Type: " + bag9.type);
		System.out.println("Waterproof: " + bag9.waterproof);
		System.out.println("Laptop Compartment: " + bag9.laptopCompartment);
		System.out.println("Weight In Grams: " + bag9.weightInGrams);
		System.out.println("Width: " + bag9.width);
		System.out.println("Height: " + bag9.height);
		System.out.println("Depth: " + bag9.depth);
		System.out.println("Country Of Origin: " + bag9.countryOfOrigin);
		System.out.println("Warranty: " + bag9.warranty);
		System.out.println("Model Number: " + bag9.modelNumber);
		System.out.println("Expandable: " + bag9.expandable);
		System.out.println("Recyclable Material: " + bag9.recyclableMaterial);

				System.out.println("the 11th copy");
				
				Bags bag10 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag10.bagName);
		System.out.println("Brand: " + bag10.brand);
		System.out.println("Rating: " + bag10.rating);
		System.out.println("Discount Percentage: " + bag10.discountPercentage);
		System.out.println("Manufacturer: " + bag10.manufacturer);
		System.out.println("Price: " + bag10.price);
		System.out.println("Capacity In Liters: " + bag10.capacityInLiters);
		System.out.println("Color: " + bag10.color);
		System.out.println("Number Of Compartments: " + bag10.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag10.numberOfPockets);
		System.out.println("Material: " + bag10.material);
		System.out.println("Type: " + bag10.type);
		System.out.println("Waterproof: " + bag10.waterproof);
		System.out.println("Laptop Compartment: " + bag10.laptopCompartment);
		System.out.println("Weight In Grams: " + bag10.weightInGrams);
		System.out.println("Width: " + bag10.width);
		System.out.println("Height: " + bag10.height);
		System.out.println("Depth: " + bag10.depth);
		System.out.println("Country Of Origin: " + bag10.countryOfOrigin);
		System.out.println("Warranty: " + bag10.warranty);
		System.out.println("Model Number: " + bag10.modelNumber);
		System.out.println("Expandable: " + bag10.expandable);
		System.out.println("Recyclable Material: " + bag10.recyclableMaterial);


		// Initialization

		bag10.bagName = "CollegeBag";
		bag10.brand = "Skybags";
		bag10.rating = 4.4;
		bag10.discountPercentage = 13.0;
		bag10.manufacturer = "Skybags Pvt Ltd";
		bag10.price = 2600;
		bag10.capacityInLiters = 38;
		bag10.color = "Red";
		bag10.numberOfCompartments = 3;
		bag10.numberOfPockets = 5;
		bag10.material = "Polyester";
		bag10.type = "College";
		bag10.waterproof = true;
		bag10.laptopCompartment = true;
		bag10.weightInGrams = 820;
		bag10.width = 31;
		bag10.height = 46;
		bag10.depth = 17;
		bag10.countryOfOrigin = "India";
		bag10.warranty = "1 Year";
		bag10.modelNumber = "SB1010";
		bag10.expandable = true;
		bag10.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag10.bagName);
		System.out.println("Brand: " + bag10.brand);
		System.out.println("Rating: " + bag10.rating);
		System.out.println("Discount Percentage: " + bag10.discountPercentage);
		System.out.println("Manufacturer: " + bag10.manufacturer);
		System.out.println("Price: " + bag10.price);
		System.out.println("Capacity In Liters: " + bag10.capacityInLiters);
		System.out.println("Color: " + bag10.color);
		System.out.println("Number Of Compartments: " + bag10.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag10.numberOfPockets);
		System.out.println("Material: " + bag10.material);
		System.out.println("Type: " + bag10.type);
		System.out.println("Waterproof: " + bag10.waterproof);
		System.out.println("Laptop Compartment: " + bag10.laptopCompartment);
		System.out.println("Weight In Grams: " + bag10.weightInGrams);
		System.out.println("Width: " + bag10.width);
		System.out.println("Height: " + bag10.height);
		System.out.println("Depth: " + bag10.depth);
		System.out.println("Country Of Origin: " + bag10.countryOfOrigin);
		System.out.println("Warranty: " + bag10.warranty);
		System.out.println("Model Number: " + bag10.modelNumber);
		System.out.println("Expandable: " + bag10.expandable);
		System.out.println("Recyclable Material: " + bag10.recyclableMaterial);

				
				System.out.println("the 12th copy");
				Bags bag11 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag11.bagName);
		System.out.println("Brand: " + bag11.brand);
		System.out.println("Rating: " + bag11.rating);
		System.out.println("Discount Percentage: " + bag11.discountPercentage);
		System.out.println("Manufacturer: " + bag11.manufacturer);
		System.out.println("Price: " + bag11.price);
		System.out.println("Capacity In Liters: " + bag11.capacityInLiters);
		System.out.println("Color: " + bag11.color);
		System.out.println("Number Of Compartments: " + bag11.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag11.numberOfPockets);
		System.out.println("Material: " + bag11.material);
		System.out.println("Type: " + bag11.type);
		System.out.println("Waterproof: " + bag11.waterproof);
		System.out.println("Laptop Compartment: " + bag11.laptopCompartment);
		System.out.println("Weight In Grams: " + bag11.weightInGrams);
		System.out.println("Width: " + bag11.width);
		System.out.println("Height: " + bag11.height);
		System.out.println("Depth: " + bag11.depth);
		System.out.println("Country Of Origin: " + bag11.countryOfOrigin);
		System.out.println("Warranty: " + bag11.warranty);
		System.out.println("Model Number: " + bag11.modelNumber);
		System.out.println("Expandable: " + bag11.expandable);
		System.out.println("Recyclable Material: " + bag11.recyclableMaterial);


		// Initialization

		bag11.bagName = "CameraBag";
		bag11.brand = "Canon";
		bag11.rating = 4.6;
		bag11.discountPercentage = 7.5;
		bag11.manufacturer = "Canon Inc";
		bag11.price = 3500;
		bag11.capacityInLiters = 22;
		bag11.color = "Black";
		bag11.numberOfCompartments = 4;
		bag11.numberOfPockets = 5;
		bag11.material = "Nylon";
		bag11.type = "Camera";
		bag11.waterproof = true;
		bag11.laptopCompartment = false;
		bag11.weightInGrams = 700;
		bag11.width = 29;
		bag11.height = 33;
		bag11.depth = 16;
		bag11.countryOfOrigin = "Japan";
		bag11.warranty = "1 Year";
		bag11.modelNumber = "CN1111";
		bag11.expandable = false;
		bag11.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag11.bagName);
		System.out.println("Brand: " + bag11.brand);
		System.out.println("Rating: " + bag11.rating);
		System.out.println("Discount Percentage: " + bag11.discountPercentage);
		System.out.println("Manufacturer: " + bag11.manufacturer);
		System.out.println("Price: " + bag11.price);
		System.out.println("Capacity In Liters: " + bag11.capacityInLiters);
		System.out.println("Color: " + bag11.color);
		System.out.println("Number Of Compartments: " + bag11.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag11.numberOfPockets);
		System.out.println("Material: " + bag11.material);
		System.out.println("Type: " + bag11.type);
		System.out.println("Waterproof: " + bag11.waterproof);
		System.out.println("Laptop Compartment: " + bag11.laptopCompartment);
		System.out.println("Weight In Grams: " + bag11.weightInGrams);
		System.out.println("Width: " + bag11.width);
		System.out.println("Height: " + bag11.height);
		System.out.println("Depth: " + bag11.depth);
		System.out.println("Country Of Origin: " + bag11.countryOfOrigin);
		System.out.println("Warranty: " + bag11.warranty);
		System.out.println("Model Number: " + bag11.modelNumber);
		System.out.println("Expandable: " + bag11.expandable);
		System.out.println("Recyclable Material: " + bag11.recyclableMaterial);

				System.out.println("the 13th copy");
				Bags bag12 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag12.bagName);
		System.out.println("Brand: " + bag12.brand);
		System.out.println("Rating: " + bag12.rating);
		System.out.println("Discount Percentage: " + bag12.discountPercentage);
		System.out.println("Manufacturer: " + bag12.manufacturer);
		System.out.println("Price: " + bag12.price);
		System.out.println("Capacity In Liters: " + bag12.capacityInLiters);
		System.out.println("Color: " + bag12.color);
		System.out.println("Number Of Compartments: " + bag12.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag12.numberOfPockets);
		System.out.println("Material: " + bag12.material);
		System.out.println("Type: " + bag12.type);
		System.out.println("Waterproof: " + bag12.waterproof);
		System.out.println("Laptop Compartment: " + bag12.laptopCompartment);
		System.out.println("Weight In Grams: " + bag12.weightInGrams);
		System.out.println("Width: " + bag12.width);
		System.out.println("Height: " + bag12.height);
		System.out.println("Depth: " + bag12.depth);
		System.out.println("Country Of Origin: " + bag12.countryOfOrigin);
		System.out.println("Warranty: " + bag12.warranty);
		System.out.println("Model Number: " + bag12.modelNumber);
		System.out.println("Expandable: " + bag12.expandable);
		System.out.println("Recyclable Material: " + bag12.recyclableMaterial);


		// Initialization

		bag12.bagName = "ShoppingBag";
		bag12.brand = "AmazonBasics";
		bag12.rating = 4.1;
		bag12.discountPercentage = 15.0;
		bag12.manufacturer = "Amazon Pvt Ltd";
		bag12.price = 1200;
		bag12.capacityInLiters = 28;
		bag12.color = "Yellow";
		bag12.numberOfCompartments = 2;
		bag12.numberOfPockets = 2;
		bag12.material = "Cloth";
		bag12.type = "Shopping";
		bag12.waterproof = false;
		bag12.laptopCompartment = false;
		bag12.weightInGrams = 450;
		bag12.width = 34;
		bag12.height = 38;
		bag12.depth = 14;
		bag12.countryOfOrigin = "India";
		bag12.warranty = "3 Months";
		bag12.modelNumber = "AM1212";
		bag12.expandable = true;
		bag12.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag12.bagName);
		System.out.println("Brand: " + bag12.brand);
		System.out.println("Rating: " + bag12.rating);
		System.out.println("Discount Percentage: " + bag12.discountPercentage);
		System.out.println("Manufacturer: " + bag12.manufacturer);
		System.out.println("Price: " + bag12.price);
		System.out.println("Capacity In Liters: " + bag12.capacityInLiters);
		System.out.println("Color: " + bag12.color);
		System.out.println("Number Of Compartments: " + bag12.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag12.numberOfPockets);
		System.out.println("Material: " + bag12.material);
		System.out.println("Type: " + bag12.type);
		System.out.println("Waterproof: " + bag12.waterproof);
		System.out.println("Laptop Compartment: " + bag12.laptopCompartment);
		System.out.println("Weight In Grams: " + bag12.weightInGrams);
		System.out.println("Width: " + bag12.width);
		System.out.println("Height: " + bag12.height);
		System.out.println("Depth: " + bag12.depth);
		System.out.println("Country Of Origin: " + bag12.countryOfOrigin);
		System.out.println("Warranty: " + bag12.warranty);
		System.out.println("Model Number: " + bag12.modelNumber);
		System.out.println("Expandable: " + bag12.expandable);
		System.out.println("Recyclable Material: " + bag12.recyclableMaterial);

				System.out.println("the 14th copy");
				Bags bag13 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag13.bagName);
		System.out.println("Brand: " + bag13.brand);
		System.out.println("Rating: " + bag13.rating);
		System.out.println("Discount Percentage: " + bag13.discountPercentage);
		System.out.println("Manufacturer: " + bag13.manufacturer);
		System.out.println("Price: " + bag13.price);
		System.out.println("Capacity In Liters: " + bag13.capacityInLiters);
		System.out.println("Color: " + bag13.color);
		System.out.println("Number Of Compartments: " + bag13.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag13.numberOfPockets);
		System.out.println("Material: " + bag13.material);
		System.out.println("Type: " + bag13.type);
		System.out.println("Waterproof: " + bag13.waterproof);
		System.out.println("Laptop Compartment: " + bag13.laptopCompartment);
		System.out.println("Weight In Grams: " + bag13.weightInGrams);
		System.out.println("Width: " + bag13.width);
		System.out.println("Height: " + bag13.height);
		System.out.println("Depth: " + bag13.depth);
		System.out.println("Country Of Origin: " + bag13.countryOfOrigin);
		System.out.println("Warranty: " + bag13.warranty);
		System.out.println("Model Number: " + bag13.modelNumber);
		System.out.println("Expandable: " + bag13.expandable);
		System.out.println("Recyclable Material: " + bag13.recyclableMaterial);


		// Initialization

		bag13.bagName = "DuffelBag";
		bag13.brand = "Reebok";
		bag13.rating = 4.3;
		bag13.discountPercentage = 9.0;
		bag13.manufacturer = "Reebok Pvt Ltd";
		bag13.price = 2700;
		bag13.capacityInLiters = 45;
		bag13.color = "Grey";
		bag13.numberOfCompartments = 2;
		bag13.numberOfPockets = 3;
		bag13.material = "Polyester";
		bag13.type = "Sports";
		bag13.waterproof = true;
		bag13.laptopCompartment = false;
		bag13.weightInGrams = 950;
		bag13.width = 42;
		bag13.height = 30;
		bag13.depth = 24;
		bag13.countryOfOrigin = "USA";
		bag13.warranty = "6 Months";
		bag13.modelNumber = "RB1313";
		bag13.expandable = true;
		bag13.recyclableMaterial = false;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag13.bagName);
		System.out.println("Brand: " + bag13.brand);
		System.out.println("Rating: " + bag13.rating);
		System.out.println("Discount Percentage: " + bag13.discountPercentage);
		System.out.println("Manufacturer: " + bag13.manufacturer);
		System.out.println("Price: " + bag13.price);
		System.out.println("Capacity In Liters: " + bag13.capacityInLiters);
		System.out.println("Color: " + bag13.color);
		System.out.println("Number Of Compartments: " + bag13.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag13.numberOfPockets);
		System.out.println("Material: " + bag13.material);
		System.out.println("Type: " + bag13.type);
		System.out.println("Waterproof: " + bag13.waterproof);
		System.out.println("Laptop Compartment: " + bag13.laptopCompartment);
		System.out.println("Weight In Grams: " + bag13.weightInGrams);
		System.out.println("Width: " + bag13.width);
		System.out.println("Height: " + bag13.height);
		System.out.println("Depth: " + bag13.depth);
		System.out.println("Country Of Origin: " + bag13.countryOfOrigin);
		System.out.println("Warranty: " + bag13.warranty);
		System.out.println("Model Number: " + bag13.modelNumber);
		System.out.println("Expandable: " + bag13.expandable);
		System.out.println("Recyclable Material: " + bag13.recyclableMaterial);

				
				System.out.println("the 15th copy");
				Bags bag14 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag14.bagName);
		System.out.println("Brand: " + bag14.brand);
		System.out.println("Rating: " + bag14.rating);
		System.out.println("Discount Percentage: " + bag14.discountPercentage);
		System.out.println("Manufacturer: " + bag14.manufacturer);
		System.out.println("Price: " + bag14.price);
		System.out.println("Capacity In Liters: " + bag14.capacityInLiters);
		System.out.println("Color: " + bag14.color);
		System.out.println("Number Of Compartments: " + bag14.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag14.numberOfPockets);
		System.out.println("Material: " + bag14.material);
		System.out.println("Type: " + bag14.type);
		System.out.println("Waterproof: " + bag14.waterproof);
		System.out.println("Laptop Compartment: " + bag14.laptopCompartment);
		System.out.println("Weight In Grams: " + bag14.weightInGrams);
		System.out.println("Width: " + bag14.width);
		System.out.println("Height: " + bag14.height);
		System.out.println("Depth: " + bag14.depth);
		System.out.println("Country Of Origin: " + bag14.countryOfOrigin);
		System.out.println("Warranty: " + bag14.warranty);
		System.out.println("Model Number: " + bag14.modelNumber);
		System.out.println("Expandable: " + bag14.expandable);
		System.out.println("Recyclable Material: " + bag14.recyclableMaterial);


		// Initialization

		bag14.bagName = "MiniBag";
		bag14.brand = "Zara";
		bag14.rating = 4.0;
		bag14.discountPercentage = 6.5;
		bag14.manufacturer = "Zara Fashion";
		bag14.price = 2400;
		bag14.capacityInLiters = 12;
		bag14.color = "White";
		bag14.numberOfCompartments = 1;
		bag14.numberOfPockets = 2;
		bag14.material = "Leather";
		bag14.type = "Fashion";
		bag14.waterproof = false;
		bag14.laptopCompartment = false;
		bag14.weightInGrams = 400;
		bag14.width = 20;
		bag14.height = 22;
		bag14.depth = 10;
		bag14.countryOfOrigin = "Spain";
		bag14.warranty = "3 Months";
		bag14.modelNumber = "ZR1414";
		bag14.expandable = false;
		bag14.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag14.bagName);
		System.out.println("Brand: " + bag14.brand);
		System.out.println("Rating: " + bag14.rating);
		System.out.println("Discount Percentage: " + bag14.discountPercentage);
		System.out.println("Manufacturer: " + bag14.manufacturer);
		System.out.println("Price: " + bag14.price);
		System.out.println("Capacity In Liters: " + bag14.capacityInLiters);
		System.out.println("Color: " + bag14.color);
		System.out.println("Number Of Compartments: " + bag14.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag14.numberOfPockets);
		System.out.println("Material: " + bag14.material);
		System.out.println("Type: " + bag14.type);
		System.out.println("Waterproof: " + bag14.waterproof);
		System.out.println("Laptop Compartment: " + bag14.laptopCompartment);
		System.out.println("Weight In Grams: " + bag14.weightInGrams);
		System.out.println("Width: " + bag14.width);
		System.out.println("Height: " + bag14.height);
		System.out.println("Depth: " + bag14.depth);
		System.out.println("Country Of Origin: " + bag14.countryOfOrigin);
		System.out.println("Warranty: " + bag14.warranty);
		System.out.println("Model Number: " + bag14.modelNumber);
		System.out.println("Expandable: " + bag14.expandable);
		System.out.println("Recyclable Material: " + bag14.recyclableMaterial);


				System.out.println("the 16th copy");
				Bags bag15 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag15.bagName);
		System.out.println("Brand: " + bag15.brand);
		System.out.println("Rating: " + bag15.rating);
		System.out.println("Discount Percentage: " + bag15.discountPercentage);
		System.out.println("Manufacturer: " + bag15.manufacturer);
		System.out.println("Price: " + bag15.price);
		System.out.println("Capacity In Liters: " + bag15.capacityInLiters);
		System.out.println("Color: " + bag15.color);
		System.out.println("Number Of Compartments: " + bag15.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag15.numberOfPockets);
		System.out.println("Material: " + bag15.material);
		System.out.println("Type: " + bag15.type);
		System.out.println("Waterproof: " + bag15.waterproof);
		System.out.println("Laptop Compartment: " + bag15.laptopCompartment);
		System.out.println("Weight In Grams: " + bag15.weightInGrams);
		System.out.println("Width: " + bag15.width);
		System.out.println("Height: " + bag15.height);
		System.out.println("Depth: " + bag15.depth);
		System.out.println("Country Of Origin: " + bag15.countryOfOrigin);
		System.out.println("Warranty: " + bag15.warranty);
		System.out.println("Model Number: " + bag15.modelNumber);
		System.out.println("Expandable: " + bag15.expandable);
		System.out.println("Recyclable Material: " + bag15.recyclableMaterial);


		// Initialization

		bag15.bagName = "ToteBag";
		bag15.brand = "H&M";
		bag15.rating = 4.2;
		bag15.discountPercentage = 8.5;
		bag15.manufacturer = "H&M Fashion";
		bag15.price = 2100;
		bag15.capacityInLiters = 20;
		bag15.color = "Beige";
		bag15.numberOfCompartments = 2;
		bag15.numberOfPockets = 2;
		bag15.material = "Canvas";
		bag15.type = "Casual";
		bag15.waterproof = false;
		bag15.laptopCompartment = false;
		bag15.weightInGrams = 500;
		bag15.width = 30;
		bag15.height = 35;
		bag15.depth = 12;
		bag15.countryOfOrigin = "Sweden";
		bag15.warranty = "3 Months";
		bag15.modelNumber = "HM1515";
		bag15.expandable = true;
		bag15.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag15.bagName);
		System.out.println("Brand: " + bag15.brand);
		System.out.println("Rating: " + bag15.rating);
		System.out.println("Discount Percentage: " + bag15.discountPercentage);
		System.out.println("Manufacturer: " + bag15.manufacturer);
		System.out.println("Price: " + bag15.price);
		System.out.println("Capacity In Liters: " + bag15.capacityInLiters);
		System.out.println("Color: " + bag15.color);
		System.out.println("Number Of Compartments: " + bag15.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag15.numberOfPockets);
		System.out.println("Material: " + bag15.material);
		System.out.println("Type: " + bag15.type);
		System.out.println("Waterproof: " + bag15.waterproof);
		System.out.println("Laptop Compartment: " + bag15.laptopCompartment);
		System.out.println("Weight In Grams: " + bag15.weightInGrams);
		System.out.println("Width: " + bag15.width);
		System.out.println("Height: " + bag15.height);
		System.out.println("Depth: " + bag15.depth);
		System.out.println("Country Of Origin: " + bag15.countryOfOrigin);
		System.out.println("Warranty: " + bag15.warranty);
		System.out.println("Model Number: " + bag15.modelNumber);
		System.out.println("Expandable: " + bag15.expandable);
		System.out.println("Recyclable Material: " + bag15.recyclableMaterial);
		  
				System.out.println("the 17th copy");
				Bags bag16 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag16.bagName);
		System.out.println("Brand: " + bag16.brand);
		System.out.println("Rating: " + bag16.rating);
		System.out.println("Discount Percentage: " + bag16.discountPercentage);
		System.out.println("Manufacturer: " + bag16.manufacturer);
		System.out.println("Price: " + bag16.price);
		System.out.println("Capacity In Liters: " + bag16.capacityInLiters);
		System.out.println("Color: " + bag16.color);
		System.out.println("Number Of Compartments: " + bag16.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag16.numberOfPockets);
		System.out.println("Material: " + bag16.material);
		System.out.println("Type: " + bag16.type);
		System.out.println("Waterproof: " + bag16.waterproof);
		System.out.println("Laptop Compartment: " + bag16.laptopCompartment);
		System.out.println("Weight In Grams: " + bag16.weightInGrams);
		System.out.println("Width: " + bag16.width);
		System.out.println("Height: " + bag16.height);
		System.out.println("Depth: " + bag16.depth);
		System.out.println("Country Of Origin: " + bag16.countryOfOrigin);
		System.out.println("Warranty: " + bag16.warranty);
		System.out.println("Model Number: " + bag16.modelNumber);
		System.out.println("Expandable: " + bag16.expandable);
		System.out.println("Recyclable Material: " + bag16.recyclableMaterial);


		// Initialization

		bag16.bagName = "LaptopSleeve";
		bag16.brand = "HP";
		bag16.rating = 4.5;
		bag16.discountPercentage = 10.0;
		bag16.manufacturer = "HP Pvt Ltd";
		bag16.price = 1500;
		bag16.capacityInLiters = 15;
		bag16.color = "Black";
		bag16.numberOfCompartments = 1;
		bag16.numberOfPockets = 2;
		bag16.material = "Neoprene";
		bag16.type = "Laptop Sleeve";
		bag16.waterproof = true;
		bag16.laptopCompartment = true;
		bag16.weightInGrams = 400;
		bag16.width = 34;
		bag16.height = 26;
		bag16.depth = 5;
		bag16.countryOfOrigin = "USA";
		bag16.warranty = "6 Months";
		bag16.modelNumber = "HP1616";
		bag16.expandable = false;
		bag16.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag16.bagName);
		System.out.println("Brand: " + bag16.brand);
		System.out.println("Rating: " + bag16.rating);
		System.out.println("Discount Percentage: " + bag16.discountPercentage);
		System.out.println("Manufacturer: " + bag16.manufacturer);
		System.out.println("Price: " + bag16.price);
		System.out.println("Capacity In Liters: " + bag16.capacityInLiters);
		System.out.println("Color: " + bag16.color);
		System.out.println("Number Of Compartments: " + bag16.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag16.numberOfPockets);
		System.out.println("Material: " + bag16.material);
		System.out.println("Type: " + bag16.type);
		System.out.println("Waterproof: " + bag16.waterproof);
		System.out.println("Laptop Compartment: " + bag16.laptopCompartment);
		System.out.println("Weight In Grams: " + bag16.weightInGrams);
		System.out.println("Width: " + bag16.width);
		System.out.println("Height: " + bag16.height);
		System.out.println("Depth: " + bag16.depth);
		System.out.println("Country Of Origin: " + bag16.countryOfOrigin);
		System.out.println("Warranty: " + bag16.warranty);
		System.out.println("Model Number: " + bag16.modelNumber);
		System.out.println("Expandable: " + bag16.expandable);
		System.out.println("Recyclable Material: " + bag16.recyclableMaterial);
				
				System.out.println("the 18th copy");
				
				Bags bag17 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag17.bagName);
		System.out.println("Brand: " + bag17.brand);
		System.out.println("Rating: " + bag17.rating);
		System.out.println("Discount Percentage: " + bag17.discountPercentage);
		System.out.println("Manufacturer: " + bag17.manufacturer);
		System.out.println("Price: " + bag17.price);
		System.out.println("Capacity In Liters: " + bag17.capacityInLiters);
		System.out.println("Color: " + bag17.color);
		System.out.println("Number Of Compartments: " + bag17.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag17.numberOfPockets);
		System.out.println("Material: " + bag17.material);
		System.out.println("Type: " + bag17.type);
		System.out.println("Waterproof: " + bag17.waterproof);
		System.out.println("Laptop Compartment: " + bag17.laptopCompartment);
		System.out.println("Weight In Grams: " + bag17.weightInGrams);
		System.out.println("Width: " + bag17.width);
		System.out.println("Height: " + bag17.height);
		System.out.println("Depth: " + bag17.depth);
		System.out.println("Country Of Origin: " + bag17.countryOfOrigin);
		System.out.println("Warranty: " + bag17.warranty);
		System.out.println("Model Number: " + bag17.modelNumber);
		System.out.println("Expandable: " + bag17.expandable);
		System.out.println("Recyclable Material: " + bag17.recyclableMaterial);


		// Initialization

		bag17.bagName = "TravelBackpack";
		bag17.brand = "Safari";
		bag17.rating = 4.4;
		bag17.discountPercentage = 12.5;
		bag17.manufacturer = "Safari Industries";
		bag17.price = 3200;
		bag17.capacityInLiters = 55;
		bag17.color = "Dark Blue";
		bag17.numberOfCompartments = 4;
		bag17.numberOfPockets = 6;
		bag17.material = "Polyester";
		bag17.type = "Travel";
		bag17.waterproof = true;
		bag17.laptopCompartment = true;
		bag17.weightInGrams = 1100;
		bag17.width = 36;
		bag17.height = 52;
		bag17.depth = 22;
		bag17.countryOfOrigin = "India";
		bag17.warranty = "1 Year";
		bag17.modelNumber = "SF1717";
		bag17.expandable = true;
		bag17.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag17.bagName);
		System.out.println("Brand: " + bag17.brand);
		System.out.println("Rating: " + bag17.rating);
		System.out.println("Discount Percentage: " + bag17.discountPercentage);
		System.out.println("Manufacturer: " + bag17.manufacturer);
		System.out.println("Price: " + bag17.price);
		System.out.println("Capacity In Liters: " + bag17.capacityInLiters);
		System.out.println("Color: " + bag17.color);
		System.out.println("Number Of Compartments: " + bag17.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag17.numberOfPockets);
		System.out.println("Material: " + bag17.material);
		System.out.println("Type: " + bag17.type);
		System.out.println("Waterproof: " + bag17.waterproof);
		System.out.println("Laptop Compartment: " + bag17.laptopCompartment);
		System.out.println("Weight In Grams: " + bag17.weightInGrams);
		System.out.println("Width: " + bag17.width);
		System.out.println("Height: " + bag17.height);
		System.out.println("Depth: " + bag17.depth);
		System.out.println("Country Of Origin: " + bag17.countryOfOrigin);
		System.out.println("Warranty: " + bag17.warranty);
		System.out.println("Model Number: " + bag17.modelNumber);
		System.out.println("Expandable: " + bag17.expandable);
		System.out.println("Recyclable Material: " + bag17.recyclableMaterial);


					System.out.println("the 19th copy");
					
					 Bags bag18 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag18.bagName);
		System.out.println("Brand: " + bag18.brand);
		System.out.println("Rating: " + bag18.rating);
		System.out.println("Discount Percentage: " + bag18.discountPercentage);
		System.out.println("Manufacturer: " + bag18.manufacturer);
		System.out.println("Price: " + bag18.price);
		System.out.println("Capacity In Liters: " + bag18.capacityInLiters);
		System.out.println("Color: " + bag18.color);
		System.out.println("Number Of Compartments: " + bag18.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag18.numberOfPockets);
		System.out.println("Material: " + bag18.material);
		System.out.println("Type: " + bag18.type);
		System.out.println("Waterproof: " + bag18.waterproof);
		System.out.println("Laptop Compartment: " + bag18.laptopCompartment);
		System.out.println("Weight In Grams: " + bag18.weightInGrams);
		System.out.println("Width: " + bag18.width);
		System.out.println("Height: " + bag18.height);
		System.out.println("Depth: " + bag18.depth);
		System.out.println("Country Of Origin: " + bag18.countryOfOrigin);
		System.out.println("Warranty: " + bag18.warranty);
		System.out.println("Model Number: " + bag18.modelNumber);
		System.out.println("Expandable: " + bag18.expandable);
		System.out.println("Recyclable Material: " + bag18.recyclableMaterial);


		// Initialization

		bag18.bagName = "HikingBag";
		bag18.brand = "Quechua";
		bag18.rating = 4.6;
		bag18.discountPercentage = 14.0;
		bag18.manufacturer = "Decathlon";
		bag18.price = 3900;
		bag18.capacityInLiters = 65;
		bag18.color = "Green";
		bag18.numberOfCompartments = 5;
		bag18.numberOfPockets = 7;
		bag18.material = "Nylon";
		bag18.type = "Hiking";
		bag18.waterproof = true;
		bag18.laptopCompartment = false;
		bag18.weightInGrams = 1400;
		bag18.width = 40;
		bag18.height = 60;
		bag18.depth = 26;
		bag18.countryOfOrigin = "France";
		bag18.warranty = "2 Years";
		bag18.modelNumber = "QH1818";
		bag18.expandable = true;
		bag18.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag18.bagName);
		System.out.println("Brand: " + bag18.brand);
		System.out.println("Rating: " + bag18.rating);
		System.out.println("Discount Percentage: " + bag18.discountPercentage);
		System.out.println("Manufacturer: " + bag18.manufacturer);
		System.out.println("Price: " + bag18.price);
		System.out.println("Capacity In Liters: " + bag18.capacityInLiters);
		System.out.println("Color: " + bag18.color);
		System.out.println("Number Of Compartments: " + bag18.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag18.numberOfPockets);
		System.out.println("Material: " + bag18.material);
		System.out.println("Type: " + bag18.type);
		System.out.println("Waterproof: " + bag18.waterproof);
		System.out.println("Laptop Compartment: " + bag18.laptopCompartment);
		System.out.println("Weight In Grams: " + bag18.weightInGrams);
		System.out.println("Width: " + bag18.width);
		System.out.println("Height: " + bag18.height);
		System.out.println("Depth: " + bag18.depth);
		System.out.println("Country Of Origin: " + bag18.countryOfOrigin);
		System.out.println("Warranty: " + bag18.warranty);
		System.out.println("Model Number: " + bag18.modelNumber);
		System.out.println("Expandable: " + bag18.expandable);
		System.out.println("Recyclable Material: " + bag18.recyclableMaterial);

			System.out.println(" the 20th copy");
			Bags bag19 = new Bags();

		System.out.println("\nBefore Initialization");

		System.out.println("Bag Name: " + bag19.bagName);
		System.out.println("Brand: " + bag19.brand);
		System.out.println("Rating: " + bag19.rating);
		System.out.println("Discount Percentage: " + bag19.discountPercentage);
		System.out.println("Manufacturer: " + bag19.manufacturer);
		System.out.println("Price: " + bag19.price);
		System.out.println("Capacity In Liters: " + bag19.capacityInLiters);
		System.out.println("Color: " + bag19.color);
		System.out.println("Number Of Compartments: " + bag19.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag19.numberOfPockets);
		System.out.println("Material: " + bag19.material);
		System.out.println("Type: " + bag19.type);
		System.out.println("Waterproof: " + bag19.waterproof);
		System.out.println("Laptop Compartment: " + bag19.laptopCompartment);
		System.out.println("Weight In Grams: " + bag19.weightInGrams);
		System.out.println("Width: " + bag19.width);
		System.out.println("Height: " + bag19.height);
		System.out.println("Depth: " + bag19.depth);
		System.out.println("Country Of Origin: " + bag19.countryOfOrigin);
		System.out.println("Warranty: " + bag19.warranty);
		System.out.println("Model Number: " + bag19.modelNumber);
		System.out.println("Expandable: " + bag19.expandable);
		System.out.println("Recyclable Material: " + bag19.recyclableMaterial);


		// Initialization

		bag19.bagName = "DesignerBag";
		bag19.brand = "Gucci";
		bag19.rating = 4.8;
		bag19.discountPercentage = 5.0;
		bag19.manufacturer = "Gucci Fashion House";
		bag19.price = 8500;
		bag19.capacityInLiters = 18;
		bag19.color = "Maroon";
		bag19.numberOfCompartments = 2;
		bag19.numberOfPockets = 3;
		bag19.material = "Premium Leather";
		bag19.type = "Luxury";
		bag19.waterproof = false;
		bag19.laptopCompartment = false;
		bag19.weightInGrams = 650;
		bag19.width = 28;
		bag19.height = 30;
		bag19.depth = 14;
		bag19.countryOfOrigin = "Italy";
		bag19.warranty = "1 Year";
		bag19.modelNumber = "GC1919";
		bag19.expandable = false;
		bag19.recyclableMaterial = true;


		System.out.println("\nAfter Initialization");

		System.out.println("Bag Name: " + bag19.bagName);
		System.out.println("Brand: " + bag19.brand);
		System.out.println("Rating: " + bag19.rating);
		System.out.println("Discount Percentage: " + bag19.discountPercentage);
		System.out.println("Manufacturer: " + bag19.manufacturer);
		System.out.println("Price: " + bag19.price);
		System.out.println("Capacity In Liters: " + bag19.capacityInLiters);
		System.out.println("Color: " + bag19.color);
		System.out.println("Number Of Compartments: " + bag19.numberOfCompartments);
		System.out.println("Number Of Pockets: " + bag19.numberOfPockets);
		System.out.println("Material: " + bag19.material);
		System.out.println("Type: " + bag19.type);
		System.out.println("Waterproof: " + bag19.waterproof);
		System.out.println("Laptop Compartment: " + bag19.laptopCompartment);
		System.out.println("Weight In Grams: " + bag19.weightInGrams);
		System.out.println("Width: " + bag19.width);
		System.out.println("Height: " + bag19.height);
		System.out.println("Depth: " + bag19.depth);
		System.out.println("Country Of Origin: " + bag19.countryOfOrigin);
		System.out.println("Warranty: " + bag19.warranty);
		System.out.println("Model Number: " + bag19.modelNumber);
		System.out.println("Expandable: " + bag19.expandable);
		System.out.println("Recyclable Material: " + bag19.recyclableMaterial);
	}
}
			
				
				