package builder.simple;

import builder.Builder;

abstract class AbstractBurgerBuilder implements Builder<Burger> {

    public abstract AbstractBurgerBuilder withLettuce();
    public abstract AbstractBurgerBuilder withBeef();
    public abstract AbstractBurgerBuilder withPork();
    public abstract AbstractBurgerBuilder withChicken();
    public abstract AbstractBurgerBuilder addTomate(int ammount);
    public abstract AbstractBurgerBuilder addOnion(int ammount);
    public abstract AbstractBurgerBuilder addSlicesOfCheese(int ammount);
}
