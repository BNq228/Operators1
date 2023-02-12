public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int yearSold = 17;
        if (yearSold >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        }
        if (yearSold < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно ещё подождать!");
        }
        //Задание 2
        System.out.println("Задание 2");
        int airTemp = 4;
        if (airTemp < 5) {
            System.out.println("На улице " + airTemp + " градусов, нужно надеть шапку");
            System.out.println("На улице " + airTemp + " градусов, можно ходить без шапки");
        }
        //Задание 3
        System.out.println("Задание 3");
        int carSpeed = 61;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + ",км/ч то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + ",км/ч то можно ездить спокойно");
        }
        //Задание 4
        System.out.println("Задание 4");
        int yearsold = 13;
        if (yearsold >= 2 && yearsold <=6) {
            System.out.println("Если возраст человека равен " + yearsold + ", то ему нужно ходить в десткий сад");
        } else if (yearsold > 6 && yearsold <= 18) {
            System.out.println("Если возраст человека равен " + yearsold + ", то ему нужно ходить в школу");
        } else if (yearsold > 18 && yearsold <= 24) {
            System.out.println("Если возраст человека равен " + yearsold + ", то ему нужно ходить в университет");
        } else if (yearsold > 24) {
            System.out.println("Если возраст человека равен " + yearsold + ", то ему нужно ходить на работу");
        }
        // Задание 5
        System.out.println("Задание 5");
        if (yearsold<5){
            System.out.println("Ребёнок не может кататься на аттракционе");
        } else if (yearsold < 14) {
            System.out.println("Ребёнок не может кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Ребёнок может кататься на аттракционе");
        }
        // Задание 6
        System.out.println("Задание 6");
        int totalCapacity = 102;
        int seatCapacity = 60;
        int busy = 62;
        if (busy <= totalCapacity) {
            if (busy <= seatCapacity) {
                System.out.println("Есть сидячее место!");
            } else {
                System.out.println("Только стоя!");
            }
        } else {
            System.out.println("Мест нет!");
        }
        // Задание 7
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;

        int max;
        if (one > two) {
            max = one;
        } else {
            max = two;
        }
        if (max < three) {
            max = three;
        }
        System.out.println("Большее число " + max);
    }




}