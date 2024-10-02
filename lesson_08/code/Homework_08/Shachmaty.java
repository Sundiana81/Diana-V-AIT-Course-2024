package Homework_08;
// Напечатайте на экране шахматную доску размером 8х8. 0 - белая клеточка, 1 - черная.
// Левая верхняя клеточка должна быть 0, левая нижняя - 1.
public class Shachmaty {
        public static void main(String[] args) {
            int size = 8; // razmer doski

                // vyzyvaem cikl dlia sozdanija doski  (horizontalno)
            for (int hor = 0; hor < size; hor++) { // FOR imeet tri ""pozicii"" hor++ - eto + edinica

                // hor++ uvelicivaet cifru na edinicu
                // vyzyvaem cikl dlia sozdanija doski  (vertikalno)
                for (int ver = 0; ver < size; ver++) {

                    // DANNAYA FORMULA V IF  OBOZNACIAET GDE BUDUT KLETKI NA DOSKE CEREZ MODULO
                    // MODULO RABOTAET S OSTATKOM; ESLI OSTATOK 0 RABOTAET IF; ESLI OSTATOK NE 0 RABOTAET ELSE
                    // % est MODULO - eto ostatok
                    if ((hor + ver) % 2 == 0) {
                        System.out.print("0 "); // belaya kletka
                    } else {
                        System.out.print("1 "); // cernaya kletka
                    }
                }
                //
                System.out.println(); // PEREMECHAET KLETKI 0 i 1 posle 8 na stroku nizhe dlja togo chtobi sformulirovalas doska 8x8
            }
        }
    }
