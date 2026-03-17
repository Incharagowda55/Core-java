class Element{
    int atomicNumber;
    String elementName;
    String symbol;

    public Element(int atomicNumber,String elementName,String symbol){
        this.atomicNumber=atomicNumber;
        this.elementName=elementName;
        this.symbol=symbol;
    }

    public void getElementDetails(){
        System.out.println("Atomic Number: "+this.atomicNumber);
        System.out.println("Element Name: "+this.elementName);
        System.out.println("Symbol: "+this.symbol);
    }
}