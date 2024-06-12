class Parcel {
    private int id;
    private Client sender;
    private Client receiver;
    private double weight;
    private String status;

    public Parcel(int id, Client sender, Client receiver, double weight, String status) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
        this.status = status;
    }

    public Parcel(int senderId, int receiverId, Name senderName, Address senderAddress,
                  Name receiverName, Address receiverAddress, double weight, String status) {
        this.id = 0; // Assign a default ID or use a unique ID generation mechanism
        this.sender = new Client(senderId, senderName, senderAddress);
        this.receiver = new Client(receiverId, receiverName, receiverAddress);
        this.weight = weight;
        this.status = status;
    }

    public int getParcelId() {
        return id;
    }

    public Client getSender() {
        return sender;
    }

    public Client getReceiver() {
        return receiver;
    }

    public double getWeight() {
        return weight;
    }

    public String getStatus() {
        return status;
    }
}

