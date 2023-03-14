import java.util.ArrayList;
import java.util.List;

public class WashingMachine {
    private String brand;
    private int maxWeight;
    private boolean isPaused;
    private boolean isBlocked;

    private List<Clothes>clothes;

    public WashingMachine(String brand, int maxWeight) {
        this.brand = brand;
        this.maxWeight = maxWeight;
        this.clothes=new ArrayList<>();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isPaused() {
        return isPaused;
    }

    public void setPaused(boolean paused) {
        isPaused = paused;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public List<Clothes> getClothes() {
        return clothes;
    }

    public void setClothes(List<Clothes> clothes) {
        this.clothes = clothes;
    }

    public void start(){
        if (isBlocked){
            System.out.println("Стиральная машина заблокирована");
            return;
        }
        if (isPaused){
            System.out.println("Стиральная машина стоит на паузе");
            isPaused=false;
            return;
        }
        if (clothes.size()==0){
            System.out.println("Ничего стирать");
            return;
        }
        int totalWeight=0;
        for(Clothes c:clothes){
            totalWeight+=c.getWeight();
        }
        if (totalWeight>maxWeight){
            System.out.println("Вес белья превышает максимальный (" + maxWeight + " кг).");
            return;
        }
        for (Clothes c:clothes) {
            c.wash();
        }
        System.out.println("Стирка завершена");

    }
    public void pause(){
        isPaused=true;
    }
    public void addClothes(Clothes clothes){
        this.clothes.add(clothes);
    }
    public void printClothes(){
        for(Clothes c: clothes){
            System.out.println(c.toString());
        }
    }

}
