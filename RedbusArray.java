class RedbusArray {

    RedbusAccount[] tickets = new RedbusAccount[20];
    int index;

    public boolean bookTicket(RedbusAccount acc) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isSourceValid = false;
        boolean isDestinationValid = false;
        boolean isBusValid = false;
        boolean isPriceValid = false;

        if (acc.getPassengerName() != null && !acc.getPassengerName().isEmpty())
            isNameValid = true;
        else System.out.println("Invalid Name");

        if (acc.getEmail() != null && !acc.getEmail().isEmpty())
            isEmailValid = true;
        else System.out.println("Invalid Email");

        if (acc.getPhoneNumber() != null && !acc.getPhoneNumber().isEmpty())
            isPhoneValid = true;
        else System.out.println("Invalid Phone");

        if (acc.getSource() != null && !acc.getSource().isEmpty())
            isSourceValid = true;
        else System.out.println("Invalid Source");

        if (acc.getDestination() != null && !acc.getDestination().isEmpty())
            isDestinationValid = true;
        else System.out.println("Invalid Destination");

        if (acc.getBusType() != null && !acc.getBusType().isEmpty())
            isBusValid = true;
        else System.out.println("Invalid Bus Type");

        if (acc.getTicketPrice() > 0)
            isPriceValid = true;
        else System.out.println("Invalid Price");

        if (isNameValid && isEmailValid && isPhoneValid &&
            isSourceValid && isDestinationValid && isBusValid && isPriceValid) {

            if (index < tickets.length) {
                tickets[index++] = acc;
                isCreated = true;
            } else {
                System.out.println("Storage Full");
            }
        }

        return isCreated;
    }

    public void getAllTickets() {

        for (int i = 0; i < index; i++) {

            RedbusAccount acc = tickets[i];

            System.out.println("----------------");
            System.out.println(acc.getPassengerName());
            System.out.println(acc.getEmail());
            System.out.println(acc.getPhoneNumber());
            System.out.println(acc.getSource());
            System.out.println(acc.getDestination());
            System.out.println(acc.getBusType());
            System.out.println(acc.getTicketPrice());
            System.out.println(acc.getIsBooked());
        }
    }
}