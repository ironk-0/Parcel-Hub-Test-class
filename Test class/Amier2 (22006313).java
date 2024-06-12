class Clients {
    private List<Client> clients;

    public Clients() {
        clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public List<Client> getClients() {
        return clients;
    }
}
