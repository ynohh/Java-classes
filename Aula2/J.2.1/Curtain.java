public class Curtain {
    // --Atributos
    float width;
    float height;
    int price;
    String color;
    boolean openCurtain;

    // --Métodos;
    String isTheCurtainOpened(boolean isOpen) {
        openCurtain = isOpen;
        String result;
        
        if(openCurtain) {
            result = "opened!";
        } else {
            result = "closed!";
        }

        return result;
    }

    String changeColor(String newColor) {
        return color = newColor;
    }

    void price(int newPrice) {
        price = newPrice;
    }

    void info() {
        System.out.printf("Your curtain has %f of height and %f of width", height, width);
        System.out.printf("\nIt will cost R$%d", price);
        System.out.printf("\nThe color will you chosed was: %s", changeColor(color));
        System.out.printf("\nAnd the curtain is currently %s", isTheCurtainOpened(openCurtain));
    }
}
