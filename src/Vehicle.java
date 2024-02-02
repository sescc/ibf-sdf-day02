public class Vehicle {
    private String colour;
    private int capacity;
    private String licencePlateNo;
    private String year;
    private String model;
    private String make;
    private boolean started;
    private boolean wiperSwipe;
    
    // Start auto-gen from Source Action
    public Vehicle() {
    }

    public Vehicle(String colour, int capacity, String licencePlateNo, String year, String model, String make) {
        this.colour = colour;
        this.capacity = capacity;
        this.licencePlateNo = licencePlateNo;
        this.year = year;
        this.model = model;
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLicencePlateNo() {
        return licencePlateNo;
    }

    public void setLicencePlateNo(String licencePlateNo) {
        this.licencePlateNo = licencePlateNo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Vehicle [colour=" + colour + ", capacity=" + capacity + ", licencePlateNo=" + licencePlateNo + ", year="
                + year + ", model=" + model + ", make=" + make + "]";
    }

    public boolean isStarted() {
        return started;
    }

    public boolean isWiperSwipe() {
        return wiperSwipe;
    }
    // End auto-gen from Source Action

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public void honk() {
        System.out.println("Beep beep vehicle");
    }

    public void startSwipe() {
        this.wiperSwipe = true;
    }
    public void stopSwipe() {
        this.wiperSwipe = false;
    }
    
}
