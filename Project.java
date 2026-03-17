class Project{
    int projectId;
    String projectName;
    int duration;

    public Project(int projectId,String projectName,int duration){
        this.projectId=projectId;
        this.projectName=projectName;
        this.duration=duration;
    }

    public void getProjectDetails(){
        System.out.println("Project Id: "+this.projectId);
        System.out.println("Project Name: "+this.projectName);
        System.out.println("Duration: "+this.duration);
    }
}