public class Main {
    public static void main(String[] args) {
        //счет в копейках
        int bill = 10000;
        //сумма пополнения счета в копейках
        int payment = 109001;
        int bonus = 0;
        if (payment>100000) {
            bonus = payment / 10000;
        }

        System.out.println("Размер бонуса составит " + bonus + " рублей");
    }
}
