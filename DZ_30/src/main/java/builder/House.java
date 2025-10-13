package builder;

public class House {
    private final String address;
    private final int room;
    private final boolean swimmingPool;
    private final boolean garden;

    private House(HouseBuilder houseBuilder) {
        address = houseBuilder.address;
        room = houseBuilder.room;
        swimmingPool = houseBuilder.swimmingPool;
        garden = houseBuilder.garden;
    }

    public String getAddress() {
        return address;
    }

    public int getRoom() {
        return room;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public boolean isGarden() {
        return garden;
    }

    public static class HouseBuilder {
        private final String address;
        private final int room;
        private boolean swimmingPool;
        private boolean garden;

        public HouseBuilder(String address, int room) {
            this.address = address;
            this.room = room;
        }

        public HouseBuilder setSwimmingPool(boolean swimmingPool) {
            this.swimmingPool = swimmingPool;
            return this;
        }

        public HouseBuilder setGarden(boolean garden) {
            this.garden = garden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", room='" + room + '\'' +
                ", swimming pool='" + swimmingPool + '\'' +
                ", garden='" + garden + '\'' +
                '}';
    }
}
