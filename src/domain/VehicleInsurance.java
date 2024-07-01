package domain;

public class VehicleInsurance extends Insurance implements IInsurance{

    private String carModel;

    public VehicleInsurance(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public void addInsurance() {
        System.out.println("Insurance created Successfully");
        startInsurance();
    }

    @Override
    public void startInsurance() {
        System.out.println("Insurance started successfully with car model: "+ carModel);
    }

}
