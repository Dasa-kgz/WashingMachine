public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine=new WashingMachine("LG",5);
        Textile textile;
        Temperature temperature;
        MachineEnumColor machineEnumColor;
        Clothes clothes=new Clothes();
        washingMachine.start();
        washingMachine.isPaused();
        clothes.wash();
        
    }
}