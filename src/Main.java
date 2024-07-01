//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static InsureCreator insureCreator;

    public static void main(String[] args) {
        configure(args);

        if(insureCreator != null){
            try {
                insureCreator.startInsurance(args[1]);
            }catch (Exception e){
                System.out.println("detalhe do objeto segurado vazio.");
            }
        }
    }

    private static void configure(String[] arg) {
        switch (arg[0]){
            case "car":
                insureCreator = new VehicleInsuranceCreator();
                break;
            case "home":
                insureCreator = new ResidentialInsuranceCreator();
                break;
            default:
                System.out.println("tipo de seguro nao identificado.");
        }
    }
}