package ru;

public enum DrinkTypeEnum {
    BEER("alcohol"),
    WINE("alcohol"),
    VODKA("alcohol"),
    BRANDY("alcohol"),
    CHAMPAGNE("alcohol"),
    WHISKEY("alcohol"),
    TEQUILA("alcohol"),
    RUM("alcohol"),
    VERMUTH("alcohol"),
    LIQUOR("alcohol"),
    JAGERMEISTER("alcohol"),
    JUICE("non-alcohol"),
    COFFEE("non-alcohol"),
    GREEN_TEA("non-alcohol"),
    BLACK_TEA("non-alcohol"),
    MILK("non-alcohol"),
    WATER("non-alcohol"),
    SODA("non-alcohol");

    private final String drinkType;

    DrinkTypeEnum(String drinkType) {
        this.drinkType = drinkType;
    }

    public boolean isAlcohol() {
        return drinkType.equals("alcohol");
    }
}
