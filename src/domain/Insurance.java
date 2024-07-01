package domain;

public class Insurance implements IInsurance{

    private String id;

    @Override
    public void addInsurance() {
        System.out.println("Insurance created Successfully");
        startInsurance();
    }

    @Override
    public void startInsurance() {
        System.out.println("Insurance started successfully");
    }
}
