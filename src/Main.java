import java.util.Scanner;
import java.util.Set;
//Сюжет
//персонаж
//механика
//код
//вышло так что он там застрял. Ракета сломалась.
//внезапно на него напали инопланетяне
//условия, переменные, функции.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Альберт всегда мечтал стать летчиком. И однажды, в пятницу,на запойке он нашел свастливый билет и полетел на луну.");
        System.out.println("Альберт немного умеет сражаться. Надо победить инопланетян!!!");
        String personName = "Альберт";
        int personHP = 50;
        int personDamage = 25;
        String monster = "синий инопланетян";
        int monsterHP = 26;
        int monsterDamage = 50;
        System.out.println("После приземления на луну(очень сильно трясло) Альберта выкинуло из ракеты. Его отключило.........после пары минут он очнулся и в дали увидел свой корабль(базу)");
        System.out.println("После того, как Альберт дошел до базы, \n" + "на него напали 2 синих монстра");
        System.out.println("Нажмите \n 1 чтобы напасть на монстров \n 2 чтобы сбежать и снарядиться");
        int answer1 = in.nextInt();
        if (answer1 == 1) {
            System.out.println("Напав на монстров, без оружия, Альберт погиб" + " " + (personHP - monsterDamage) + " " + "хп");
        }
        if (answer1 == 2) {
            System.out.println("Пришло время отвоевать базу! В АТАКУ!!!");
            personHP = fight(personHP, personDamage + monsterDamage, personName, monsterHP, monsterDamage, monster);
            if (personHP <= 0) {
                System.out.println("Альбрет помер");
            }
            System.out.println("Альберт снарядился и пошел сражаться с синими монстрами.");
            System.out.println("сражение проошло успешно! Ваня победил!!!");
            System.out.println("у него осталось" + " " + personHP + "хп \n Отлично Альбрет победил и отвоевал базу!! \n Ух ты, что это за шум за горой?");
            System.out.println("Это какое то красное существо, оно очень огромное");
            String redmonster = "красный монстр";
            int redmonsterHP = 50;
            int redmonsterDamage = 20;
            System.out.println("Нажмите \n 3 чтобы напасть на монстра \n 4 чтобы сбежать (отдать базу)");
            int answer2 = in.nextInt();
            if (answer2 == 3) {
                System.out.println("Это было опасно, но ты справился, поздравляю!" + " " + personHP + " " + "хп." + " " + "Вперед к новым битвам!");
                personDamage = personDamage + 25;
                System.out.println("Дамаг альберта поднился!" + " " + personDamage);
            } else if (answer2 == 4) {
                System.out.println("bye bye) ты потерял базу и умер от не достатка кислорода");
                return;
            }
            System.out.println("отвоевав базу Альберт незамедлительно выпил пару бытолок самогона и покрепчал! \n Теперь его хп" + " " + (personHP + 10));
            System.out.println("Неожиданно Альберту в глаза старик, который предложил ему на выбор 3 оружия");
            System.out.println("Введите \n 11 для ружье \n 22 для щит \n 33 дл старик- ты сумасшедший? ");
            int answer3 = in.nextInt();
            if (answer3 == 11) {
                System.out.println("Хороший выбор" + " " + (personDamage *= 2) + " " + "урон Альберта");
            }
            if (answer3 == 22) {
                System.out.println("Этот выбор не плох, но терпит крушения далее" + " " + (personHP + 1)+ " хп");
            }
            if (answer3 == 33) {
                System.out.println("Старик обиделся и превратился в черта (наслал на Альберта проклятие)" + " " + (personHP - personHP) + " хп");
            }
        }
    }
    public static int fight(int personHP, int personDamage, String personName, int monsterHP, int monsterDamage, String monster) {
        while (personHP > 0 && monsterHP > 0) {
            personHP -= monsterDamage;
            monsterHP -= personDamage;
        }
        return personHP + 30;
    }
}