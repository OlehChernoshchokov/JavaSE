package pkgswitch;

import java.util.Scanner;

public class Day {

    public void displayDay() {
        String day;
        
        //Ввод числа
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        //Преобразовуем sc в int и присваиваем значение sc в переменную dayNumber
        int dayNumber = Integer.parseInt(sc.nextLine());
        //тут все понятно
        switch (dayNumber) {
            case 1:
                day = "Понедельник";
                System.out.println(day);
                break;
            case 2:
                day = "Вторник";
                System.out.println(day);
                break;
            case 3:
                day = "Среда";
                System.out.println(day);
                break;
            case 4:
                day = "Четверг";
                System.out.println(day);
                break;
            case 5:
                day = "Пятница";
                System.out.println(day);
                break;
            case 6:
                day = "Суббота";
                System.out.println(day);
                break;
            case 7:
                day = "Воскресенье";
                System.out.println(day);
                break;
            default:
                System.out.println("Серьёзно? В неделе 7 дней, а ты вводишь число " + dayNumber + "?!");
                break;
        }
    }

    public static void main(String[] args) {
        
        Day numberOfDay = new Day();
        numberOfDay.displayDay();

    }
    
}
