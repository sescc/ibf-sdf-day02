public class Car extends Vehicle {
    private String bodyType;

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void honk() {
        System.out.println(getLicencePlateNo() + " Tuuu tuuu car");
    }

    public Car(String bodyType) {
        this.bodyType = bodyType;
    }

    public Car(String colour, int capacity, String licencePlateNo, String year, String model, String make,
            String bodyType) {
        super(colour, capacity, licencePlateNo, year, model, make);
        this.bodyType = bodyType;
    }

}
