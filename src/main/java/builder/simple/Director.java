package builder.simple;

import static builder.simple.BurgerBuilder.burger;

public class Director {
    public static void main(String[] args) {
        burgerByDefault();
        burgerExample();

    }

    private static void burgerExample() {
        Burger burgerExample = burger()
                                .withPork()
                                .withBeef()
                                .addSlicesOfCheese(2)
                                .build();

        showBurger("Burger Example", burgerExample);
    }

    private static void burgerByDefault() {
        Burger burgerByDefault = burger().build();
        showBurger("Burger by default", burgerByDefault);

    }

    private static void showBurger(String mensaje, Burger burger) {
        System.out.println("\n" + mensaje + "\n" + burger.toString());
    }
}
