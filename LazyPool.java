class LazyPool{
    int poolId;
    int depth;
    String type;

    public LazyPool(int poolId,int depth,String type){
        this.poolId=poolId;
        this.depth=depth;
        this.type=type;
    }

    public void getLazyPoolDetails(){
        System.out.println("Pool Id: "+this.poolId);
        System.out.println("Depth: "+this.depth);
        System.out.println("Type: "+this.type);
    }
}