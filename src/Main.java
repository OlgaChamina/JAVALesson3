
public class Main {
    public static void main(String[] args) {
        int amount = 20_000; // стоимость билета
        int mili = 20;      // стоимость 1 мили
        int bonus = amount / mili; // количество полученных за покупку миль


        System.out.printf("Количество начисленных миль: " + bonus + " миль(и)");

    }
}