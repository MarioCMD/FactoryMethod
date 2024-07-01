import domain.IInsurance;
import domain.VehicleInsurance;

public class VehicleInsuranceCreator extends InsureCreator{

    @Override
    protected IInsurance createInsurance(Object any) {
        return new VehicleInsurance((String) any);
    }
}
