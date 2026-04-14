class ChatgptAccount {

    private String userName;
    private String email;
    private String password;
    private String planType;
    private int promptsUsed;
    private String lastQuery;
    private String responseType;
    private boolean isActive;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getPlanType() {
        return this.planType;
    }

    public void setPromptsUsed(int promptsUsed) {
        this.promptsUsed = promptsUsed;
    }

    public int getPromptsUsed() {
        return this.promptsUsed;
    }

    public void setLastQuery(String lastQuery) {
        this.lastQuery = lastQuery;
    }

    public String getLastQuery() {
        return this.lastQuery;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getResponseType() {
        return this.responseType;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }
}