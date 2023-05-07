public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenWork(boolean brew, boolean ice, boolean dishes){
        brewMaster.setHasWorkToDO(brew);
        iceBox.setHasWorkToDO(ice);
        dishWasher.setHasWorkToDO(dishes);

        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class Refrigerator {
    private boolean hasWorkToDO;

    public void setHasWorkToDO(boolean hasWorkToDO) {
        this.hasWorkToDO = hasWorkToDO;
    }

    public void orderFood(){
        if(!hasWorkToDO) return;

        System.out.println("Ordering food");
        hasWorkToDO = false;
    }
}

class DishWasher {
    private boolean hasWorkToDO;

    public void setHasWorkToDO(boolean hasWorkToDO) {
        this.hasWorkToDO = hasWorkToDO;
    }

    public void doDishes() {
        if(!hasWorkToDO) return;

        System.out.println("Doing dishes");
        hasWorkToDO = false;
    }
}

class CoffeeMaker{
    private boolean hasWorkToDO;

    public void setHasWorkToDO(boolean hasWorkToDO) {
        this.hasWorkToDO = hasWorkToDO;
    }

    public void brewCoffee(){
        if(!hasWorkToDO) return;

        System.out.println("Brewing coffee");
        hasWorkToDO = false;
    }
}