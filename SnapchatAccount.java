class SnapchatAccount {

    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private int snapScore;
    private int streak;
    private String status;   
    private boolean isPrivate;

   

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setSnapScore(int snapScore) {
        this.snapScore = snapScore;
    }

    public int getSnapScore() {
        return this.snapScore;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getStreak() {
        return this.streak;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public boolean getIsPrivate() {
        return this.isPrivate;
    }
}