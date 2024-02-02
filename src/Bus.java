public class Bus extends Vehicle {
    private boolean frontDoor;
    private boolean backDoor;
    private boolean frontDoorOpened;
    private boolean backDoorOpened;

    public Bus(boolean frontDoor, boolean backDoor) {
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
    }

    public Bus(String colour, int capacity, String licencePlateNo, String year, String model, String make,
            boolean frontDoor, boolean backDoor) {
        super(colour, capacity, licencePlateNo, year, model, make);
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (frontDoor ? 1231 : 1237);
        result = prime * result + (backDoor ? 1231 : 1237);
        result = prime * result + (frontDoorOpened ? 1231 : 1237);
        result = prime * result + (backDoorOpened ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bus other = (Bus) obj;
        if (frontDoor != other.frontDoor)
            return false;
        if (backDoor != other.backDoor)
            return false;
        if (frontDoorOpened != other.frontDoorOpened)
            return false;
        if (backDoorOpened != other.backDoorOpened)
            return false;
        return true;
    }

    public boolean isFrontDoor() {
        return frontDoor;
    }

    public void setFrontDoor(boolean frontDoor) {
        this.frontDoor = frontDoor;
    }

    public boolean isBackDoor() {
        return backDoor;
    }

    public void setBackDoor(boolean backDoor) {
        this.backDoor = backDoor;
    }

    public boolean isFrontDoorOpened() {
        return frontDoorOpened;
    }

    public void setFrontDoorOpened(boolean frontDoorOpened) {
        this.frontDoorOpened = frontDoorOpened;
    }

    public boolean isBackDoorOpened() {
        return backDoorOpened;
    }

    public void setBackDoorOpened(boolean backDoorOpened) {
        this.backDoorOpened = backDoorOpened;
    }

    @Override
    public String toString() {
        return "Bus [frontDoor=" + frontDoor + ", backDoor=" + backDoor + ", frontDoorOpened=" + frontDoorOpened
                + ", backDoorOpened=" + backDoorOpened + "model= " + this.getModel() + "]";
    }

    @Override
    public void honk() {
        System.out.println("Boonk boonk bus");
    }

}
