package builder.simple;

public class Burger {

    private static final int AMMOUNT_BREADS = 2;

    private boolean hasLettuce;
    private boolean hasBeef;
    private boolean hasPork;
    private boolean hasChicken;
    private int ammountTomato;
    private int ammountOnion;
    private int ammountSlicesOfCheese;

    public boolean isHasLettuce() {
        return hasLettuce;
    }

    public void setHasLettuce(boolean hasLettuce) {
        this.hasLettuce = hasLettuce;
    }

    public boolean isHasBeef() {
        return hasBeef;
    }

    public void setHasBeef(boolean hasBeef) {
        this.hasBeef = hasBeef;
    }

    public boolean isHasPork() {
        return hasPork;
    }

    public void setHasPork(boolean hasPork) {
        this.hasPork = hasPork;
    }

    public boolean isHasChicken() {
        return hasChicken;
    }

    public void setHasChicken(boolean hasChicken) {
        this.hasChicken = hasChicken;
    }

    public int getAmmountTomato() {
        return ammountTomato;
    }

    public void setAmmountTomato(int ammountTomato) {
        this.ammountTomato = ammountTomato;
    }

    public int getAmmountOnion() {
        return ammountOnion;
    }

    public void setAmmountOnion(int ammountOnion) {
        this.ammountOnion = ammountOnion;
    }

    public int getAmmountSlicesOfCheese() {
        return ammountSlicesOfCheese;
    }

    public void setAmmountSlicesOfCheese(int ammountSlicesOfCheese) {
        this.ammountSlicesOfCheese = ammountSlicesOfCheese;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "ammountBreads=" + AMMOUNT_BREADS +
                "hasLettuce=" + hasLettuce +
                ", hasBeef=" + hasBeef +
                ", hasPork=" + hasPork +
                ", hasChicken=" + hasChicken +
                ", ammountTomato=" + ammountTomato +
                ", ammountOnion=" + ammountOnion +
                ", ammountSlicesOfCheese=" + ammountSlicesOfCheese +
                '}';
    }
}
