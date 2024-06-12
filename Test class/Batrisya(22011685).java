class Client {
    private int id;
    private Name name;
    private Address address;

    public Client(int id, Name name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getClientId() {
        return id;
    }

    public Name getClientName() {
        return name;
    }

    public Address getClientAddress() {
        return address;
    }
}
