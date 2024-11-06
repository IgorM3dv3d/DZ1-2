package Ucheba.DZ_39_40;

public class House {
    private int floors;
    private int rooms;
    private int garage;

    public House() {
    }

//    public House(double floors, double rooms, double garage) {
//        this.floors = floors;
//        this.rooms = rooms;
//        this.garage = garage;
//    }

    private House(Builder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.garage = builder.garage;
    }

    public static class Builder {
        private int floors;
        private int rooms;
        private int garage;

        public Builder() {
        }

        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder rooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder garage(int garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "Дом {" +
                "Этажей: " + floors +
                ", комнат: " + rooms +
                ", гараж: " + garage +
                '}';
    }
}
