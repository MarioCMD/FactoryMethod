import domain.IInsurance;
import domain.ResidentialInsurance;
import domain.VehicleInsurance;

public class ResidentialInsuranceCreator extends InsureCreator{
    @Override
    protected IInsurance createInsurance(Object any) {
        return new ResidentialInsurance((String) any);
    }
}
