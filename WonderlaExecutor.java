
class WonderlaExecutor{
    public static void main(String[] args){
        LazyPool pool=new LazyPool(1,5,"Wave");
        Wonderla park=new Wonderla(10,"Bangalore",pool);
        park.getWonderlaDetails();
    }
}