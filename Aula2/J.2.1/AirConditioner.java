public class AirConditioner {
    // --Atributos
    char mode;
    String brand;
    int BTU;
    float consumption;
    boolean on;
    int temperature;
    // --Fim dos Atributos

    // --Métodos----------
    void turnItOn() {
        on = true;
        System.out.printf("Air conditioner is turned on at %d°C", temperature);
    }

    void turnItOf() {
        on = false;
        System.out.println("Air conditioner turned off");
    }

    void changeMode(char newMode) {
        mode = newMode;
    }

    void increaseTemperature(int tempUp) {
        for (int i = 0; i < tempUp; i++) {
            temperature++;
        }
    }

    void decreaseTemperatura(int tempDown) {
        for (int i = 0; i < tempDown; i++) {
            temperature--;
        }
    }
    // --Fim dos Métodos
}
