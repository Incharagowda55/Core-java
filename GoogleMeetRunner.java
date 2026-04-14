class GoogleMeetRunner {

    public static void main(String[] args) {

        GoogleMeetArray meetArr = new GoogleMeetArray();

        GoogleMeetAccount g1 = new GoogleMeetAccount();
        g1.setMeetingId("abc-123");
        g1.setHostName("Inch");
        g1.setEmail("inch@gmail.com");
        g1.setParticipants(10);
        g1.setMeetingTopic("Java Class");
        g1.setMeetingTime("10:00 AM");
        g1.setDuration(60);
        g1.setIsActive(true);

        meetArr.createMeeting(g1);

        GoogleMeetAccount g2 = new GoogleMeetAccount();
        g2.setMeetingId("xyz-456");
        g2.setHostName("Anu");
        g2.setEmail("anu@gmail.com");
        g2.setParticipants(5);
        g2.setMeetingTopic("Project Discussion");
        g2.setMeetingTime("2:00 PM");
        g2.setDuration(45);
        g2.setIsActive(true);

        meetArr.createMeeting(g2);

        meetArr.getAllMeetings();
    }
}