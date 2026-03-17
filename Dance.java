class Dance{
    int danceId;
    String danceName;
    Form form;

    public Dance(int danceId,String danceName,Form form){
        this.danceId=danceId;
        this.danceName=danceName;
        this.form=form;
    }

    public void getDanceDetails(){
        System.out.println("Dance Id: "+this.danceId);
        System.out.println("Dance Name: "+this.danceName);
        this.form.getFormDetails();
    }
}