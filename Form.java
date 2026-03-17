class Form{
    int formId;
    String participantName;
    String style;

    public Form(int formId,String participantName,String style){
        this.formId=formId;
        this.participantName=participantName;
        this.style=style;
    }

    public void getFormDetails(){
        System.out.println("Form Id: "+this.formId);
        System.out.println("Participant Name: "+this.participantName);
        System.out.println("Style: "+this.style);
    }
}
