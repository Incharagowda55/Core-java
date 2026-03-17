class PeriodicTable{
    int tableId;
    String version;
    Element element;

    public PeriodicTable(int tableId,String version,Element element){
        this.tableId=tableId;
        this.version=version;
        this.element=element;
    }

    public void getTableDetails(){
        System.out.println("Table Id: "+this.tableId);
        System.out.println("Version: "+this.version);
        this.element.getElementDetails();
    }
}

