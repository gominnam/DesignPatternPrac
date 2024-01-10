package Builder;

public class Apartment {
    private String brandName;
    private int floor;
    private int room;
    private int bathroom;
    private int kitchen;
    private int balcony;

    public Apartment(String brandName, int floor, int room, int bathroom, int kitchen, int balcony) {
        this.brandName = brandName;
        this.floor = floor;
        this.room = room;
        this.bathroom = bathroom;
        this.kitchen = kitchen;
        this.balcony = balcony;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getFloor() {
        return floor;
    }

    public int getRoom() {
        return room;
    }

    public int getBathroom() {
        return bathroom;
    }

    public int getKitchen() {
        return kitchen;
    }

    public int getBalcony() {
        return balcony;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "brand=" + brandName +
                ", floor=" + floor +
                ", room=" + room +
                ", bathroom=" + bathroom +
                ", kitchen=" + kitchen +
                ", balcony=" + balcony +
                '}';
    }

    public static class Builder{
        private String brandName;
        private int floor;
        private int room;
        private int bathroom;
        private int kitchen;
        private int balcony;

        public Builder setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public Builder setFloor(int floor) {
            this.floor = floor;
            return this;
        }

        public Builder setRoom(int room) {
            this.room = room;
            return this;
        }

        public Builder setBathroom(int bathroom) {
            this.bathroom = bathroom;
            return this;
        }

        public Builder setKitchen(int kitchen) {
            this.kitchen = kitchen;
            return this;
        }

        public Builder setBalcony(int balcony) {
            this.balcony = balcony;
            return this;
        }

        public Apartment build(){
            return new Apartment(this.brandName, this.floor, this.room, this.bathroom, this.kitchen, this.balcony);
        }
    }
}
