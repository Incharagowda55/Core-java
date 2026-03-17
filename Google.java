class Google {

    String companyName;
    String founder;
    int foundedYear;
    String headquarters;
    int employees;
    String ceo;
    String searchEngine;
    String cloudService;
    String operatingSystem;
    String browser;
    String aiProject;
    String videoPlatform;
    String emailService;
    String mapService;
    String appStore;
    String programmingLanguage;
    String revenue;
    String parentCompany;
    String famousProduct;
    String slogan;

    public Google(String companyName,String founder,int foundedYear,String headquarters,int employees,String ceo,String searchEngine,String cloudService,String operatingSystem,String browser,String aiProject,String videoPlatform,String emailService,String mapService,String appStore,String programmingLanguage,String revenue,String parentCompany,String famousProduct,String slogan){

        this.companyName = companyName;
        this.founder = founder;
        this.foundedYear = foundedYear;
        this.headquarters = headquarters;
        this.employees = employees;
        this.ceo = ceo;
        this.searchEngine = searchEngine;
        this.cloudService = cloudService;
        this.operatingSystem = operatingSystem;
        this.browser = browser;
        this.aiProject = aiProject;
        this.videoPlatform = videoPlatform;
        this.emailService = emailService;
        this.mapService = mapService;
        this.appStore = appStore;
        this.programmingLanguage = programmingLanguage;
        this.revenue = revenue;
        this.parentCompany = parentCompany;
        this.famousProduct = famousProduct;
        this.slogan = slogan;
    }

    public void displayDetails(){

        System.out.println(companyName);
        System.out.println(founder);
        System.out.println(foundedYear);
        System.out.println(headquarters);
        System.out.println(employees);
        System.out.println(ceo);
        System.out.println(searchEngine);
        System.out.println(cloudService);
        System.out.println(operatingSystem);
        System.out.println(browser);
        System.out.println(aiProject);
        System.out.println(videoPlatform);
        System.out.println(emailService);
        System.out.println(mapService);
        System.out.println(appStore);
        System.out.println(programmingLanguage);
        System.out.println(revenue);
        System.out.println(parentCompany);
        System.out.println(famousProduct);
        System.out.println(slogan);
        System.out.println("-----------------------");
    }
}