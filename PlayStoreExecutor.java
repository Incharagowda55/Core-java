class PlayStoreExecutor{
    public static void main(String[] args){
        Application app=new Application("WhatsApp","Communication",5);
        PlayStore store=new PlayStore(1,"Google Play",app);
        store.getPlayStoreDetails();
    }
}