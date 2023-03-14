public class Clothes {
    private MachineEnumColor color;
    private int weight;
    private Textile textile;
    private Temperature temperature;

    public Clothes() {
    }

    public Clothes(MachineEnumColor color, int weight, Textile textile, Temperature temperature) {
        this.color = color;
        this.weight = weight;
        this.textile = textile;
        this.temperature = temperature;
    }

    public MachineEnumColor getColor() {
        return color;
    }
    public int getWeight(){
        return weight;
    }
    public Textile getTextile() {
        return textile;
    }

    public Temperature getTemperature() {
        return temperature;
    }
    public void wash(){
        String message="Стирка началась";

        if (textile==Textile.WOOL) {
            throw new IllegalArgumentException("Штапель садится при стирке в температуре выше 60 градусов.");
        }
        if (weight>5){
            throw new IllegalArgumentException("Вес белья превышает максимальный (" + 5 + " кг).");
            }
        if (color==MachineEnumColor.MIXED){
            throw new IllegalArgumentException("Стираем белье разных цветов: рубашка будет розовой.");
        }
        if (textile == Textile.DIRTY) {
            throw new IllegalArgumentException("Белье уже слишком грязное для стирки в холодной воде.");
        }
        System.out.println(message);
    }

    @Override
    public String toString() {
        return
                "Цвет=" + color +
                ", Вес=" + weight +
                ", кг.Материал=" + textile +
                ", Температура=" + temperature +
                '}';
    }
}
