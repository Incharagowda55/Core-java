class FitnessAccount {

    private String name;
    private int age;
    private double weight;
    private double height;
    private String goal;        // weight loss / muscle gain
    private String planType;    // basic / premium
    private String trainerName;
    private boolean isActive;

    // SETTERS & GETTERS

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getGoal() {
        return this.goal;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getPlanType() {
        return this.planType;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerName() {
        return this.trainerName;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }
}