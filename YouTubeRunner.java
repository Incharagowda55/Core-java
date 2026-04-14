class YouTubeRunner {
    public static void main(String[] args) {

        System.out.println("YouTube App Started");

        YouTube app = new YouTube();

        YouTubeAccount u1 = new YouTubeAccount();
        u1.setChannelName("Inchara Vlogs");
        u1.setOwnerName("Inchara");
        u1.setEmail("inchara@gmail.com");
        u1.setPassword("1234@yt");
        u1.setSubscribers(1000);
        u1.setCategory("Vlogs");
        u1.setAppName("YouTube");

        System.out.println(app.createAccount(u1));
        app.getAccountDetails();

        System.out.println("------------------");

        YouTubeAccount u2 = new YouTubeAccount();
        u2.setChannelName("Tech Rahul");
        u2.setOwnerName("Rahul");
        u2.setEmail("rahul@gmail.com");
        u2.setPassword("rahul@123");
        u2.setSubscribers(5000);
        u2.setCategory("Technology");
        u2.setAppName("YouTube");

        System.out.println(app.createAccount(u2));
        app.getAccountDetails();

        System.out.println("------------------");

        YouTubeAccount u3 = new YouTubeAccount();
        u3.setChannelName("Priya Cooking");
        u3.setOwnerName("Priya");
        u3.setEmail("priya@gmail.com");
        u3.setPassword("priya@456");
        u3.setSubscribers(2000);
        u3.setCategory("Cooking");
        u3.setAppName("YouTube");

        System.out.println(app.createAccount(u3));
        app.getAccountDetails();

        System.out.println("------------------");

        YouTubeAccount u4 = new YouTubeAccount();
        u4.setChannelName("Arjun Fitness");
        u4.setOwnerName("Arjun");
        u4.setEmail("arjun@gmail.com");
        u4.setPassword("arjun@789");
        u4.setSubscribers(3000);
        u4.setCategory("Fitness");
        u4.setAppName("YouTube");

        System.out.println(app.createAccount(u4));
        app.getAccountDetails();
    }
}