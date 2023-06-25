public class Main {
    public static void main(String[] args) {

        int account = 310; //Количество денег на текущем счету клиента
        int deposit = 2000; // сумма пополнения

        //     int bonus;
        //     if (deposit > 1000) {
        //         bonus = deposit / 100;
        //      } else {
        //          bonus = 0;
        //       }
        int bonus = (deposit > 1000) ? (deposit / 100) : 0;


        System.out.println("На вашем счету: " + (account + deposit + bonus) + " рублей");
        System.out.println("Вам начислено: " + bonus + " бонусов");
    }

}
