class GoogleMeetArray {

    GoogleMeetAccount[] meetings = new GoogleMeetAccount[20];
    int index;

    public boolean createMeeting(GoogleMeetAccount acc) {

        boolean isCreated = false;

        boolean isIdValid = false;
        boolean isHostValid = false;
        boolean isEmailValid = false;
        boolean isParticipantValid = false;
        boolean isTopicValid = false;
        boolean isTimeValid = false;
        boolean isDurationValid = false;

        if (acc.getMeetingId() != null && !acc.getMeetingId().isEmpty())
            isIdValid = true;
        else System.out.println("Invalid ID");

        if (acc.getHostName() != null && !acc.getHostName().isEmpty())
            isHostValid = true;
        else System.out.println("Invalid Host");

        if (acc.getEmail() != null && !acc.getEmail().isEmpty())
            isEmailValid = true;
        else System.out.println("Invalid Email");

        if (acc.getParticipants() >= 0)
            isParticipantValid = true;
        else System.out.println("Invalid Participants");

        if (acc.getMeetingTopic() != null && !acc.getMeetingTopic().isEmpty())
            isTopicValid = true;
        else System.out.println("Invalid Topic");

        if (acc.getMeetingTime() != null && !acc.getMeetingTime().isEmpty())
            isTimeValid = true;
        else System.out.println("Invalid Time");

        if (acc.getDuration() > 0)
            isDurationValid = true;
        else System.out.println("Invalid Duration");

        if (isIdValid && isHostValid && isEmailValid &&
            isParticipantValid && isTopicValid && isTimeValid && isDurationValid) {

            if (index < meetings.length) {
                meetings[index++] = acc;
                isCreated = true;
            } else {
                System.out.println("Storage Full");
            }
        }

        return isCreated;
    }

    public void getAllMeetings() {

        for (int i = 0; i < index; i++) {

            GoogleMeetAccount acc = meetings[i];

            System.out.println("----------------");
            System.out.println(acc.getMeetingId());
            System.out.println(acc.getHostName());
            System.out.println(acc.getEmail());
            System.out.println(acc.getParticipants());
            System.out.println(acc.getMeetingTopic());
            System.out.println(acc.getMeetingTime());
            System.out.println(acc.getDuration());
            System.out.println(acc.getIsActive());
        }
    }
}