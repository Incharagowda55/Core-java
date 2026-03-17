class Application{
    String appName;
    String category;
    int rating;

    public Application(String appName,String category,int rating){
        this.appName=appName;
        this.category=category;
        this.rating=rating;
    }

    public void getApplicationDetails(){
        System.out.println("App Name: "+this.appName);
        System.out.println("Category: "+this.category);
        System.out.println("Rating: "+this.rating);
    }
}
