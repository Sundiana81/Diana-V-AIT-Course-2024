package classwork_33.seasons;
//Задать ENUM seasons - времена года (Summer, Autumn, Winter, Spring)
//Опробовать на нем методы:
//.values() - извлекает данные в масив
//.toString
//.ordinal()
//.valueOf()
public class SaesonAppl {

    public static void main(String[] args) {

        Season[] seasons = Season.values();
        System.out.println("...............values of Enum.......");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
            System.out.println(seasons[i].getNumber() + " : " + seasons[i].getName());
        }
    // for each  // iter
        for (Season s : seasons) { // s переменная season перебират Season
            System.out.println(s.getName());
            System.out.println(s.getDuration());



        }
        System.out.println("...............toStrong.........");
        String str = Season.AUTUMN.toString();
        System.out.println(str);

        System.out.println("................ordinal()............." );

        int num = Season.AUTUMN.ordinal();  // 3 or 4 ?
        System.out.println(num);
        num = Season.WINTER.ordinal();
        System.out.println(num);

        System.out.println(".............valueOf............");

       Season s = Season.valueOf("SUMMER");  // ПИШЕМ КАК УКАЗАНА БОЛЬШИМИ БУКШАМИ
        System.out.println(s);


        }

    }
