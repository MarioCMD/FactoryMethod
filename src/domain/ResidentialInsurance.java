package domain;

public class ResidentialInsurance extends Insurance implements IInsurance {

    private String address;

    public ResidentialInsurance(String address) {
        this.address = address;
    }

    @Override
    public void addInsurance() {
        System.out.println("Insurance created Successfully");
        startInsurance();
    }

    @Override
    public void startInsurance() {
        System.out.println("Insurance started successfully with addres: "+ address);
    }

}
