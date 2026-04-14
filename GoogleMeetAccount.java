class GoogleMeetAccount {

    private String meetingId;
    private String hostName;
    private String email;
    private int participants;
    private String meetingTopic;
    private String meetingTime;
    private int duration;
    private boolean isActive;

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingId() {
        return this.meetingId;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostName() {
        return this.hostName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public int getParticipants() {
        return this.participants;
    }

    public void setMeetingTopic(String meetingTopic) {
        this.meetingTopic = meetingTopic;
    }

    public String getMeetingTopic() {
        return this.meetingTopic;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }

    public String getMeetingTime() {
        return this.meetingTime;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }
}