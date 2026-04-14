class TiktokAccount {

    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private int followers;
    private int following;
    private int likes;
    private boolean isVerified;

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

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowers() {
        return this.followers;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getFollowing() {
        return this.following;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public boolean getIsVerified() {
        return this.isVerified;
    }
}