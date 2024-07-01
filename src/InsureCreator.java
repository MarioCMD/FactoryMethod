import domain.IInsurance;

public abstract class InsureCreator {

    void startInsurance(Object any){
        IInsurance insurance = createInsurance(any);
        insurance.addInsurance();
    }

    protected abstract IInsurance createInsurance(Object any);

}
