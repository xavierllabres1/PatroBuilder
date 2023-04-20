package builder.simple;

public class BurgerBuilder extends AbstractBurgerBuilder {

    private Burger burger;

    private BurgerBuilder(){
        this.burger = new Burger();
    }

    public static BurgerBuilder burger(){
        return new BurgerBuilder();
    }

    @Override
    public Burger build() {
        return burger;
    }

    @Override
    public AbstractBurgerBuilder withLettuce() {
        this.burger.setHasLettuce(true);
        return this;
    }

    @Override
    public AbstractBurgerBuilder withBeef() {
        this.burger.setHasBeef(true);
        return this;
    }

    @Override
    public AbstractBurgerBuilder withPork() {
        this.burger.setHasPork(true);
        return this;    }

    @Override
    public AbstractBurgerBuilder withChicken() {
        this.burger.setHasChicken(true);
        return this;    }

    @Override
    public AbstractBurgerBuilder addTomate(int ammount) {
        this.burger.setAmmountTomato(ammount);
        return this;
    }

    @Override
    public AbstractBurgerBuilder addOnion(int ammount) {
        this.burger.setAmmountOnion(ammount);
        return this;
    }

    @Override
    public AbstractBurgerBuilder addSlicesOfCheese(int ammount) {
        this.burger.setAmmountSlicesOfCheese(ammount);
        return this;
    }
}
