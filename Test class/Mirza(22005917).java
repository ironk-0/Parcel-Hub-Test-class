class Parcels {
    private List<Parcel> parcels;

    public Parcels() {
        parcels = new ArrayList<>();
    }

    public void addParcel(Parcel parcel) {
        parcels.add(parcel);
    }

    public void removeParcel(Parcel parcel) {
        parcels.remove(parcel);
    }

    public List<Parcel> getParcels() {
        return parcels;
    }
}
