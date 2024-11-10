package classwork_04;



    public class Methods {

        public static void main(String[] args) {

// перевод долларов в евро
            double money = 500; // dollars
            double euro = exchangeDollarsToEuro(money);
            System.out.println("Euro: " + euro);

// количество съеденных калорий
            double weight = 200; // gramm
            double calorage = 50; // calorie on 100 gramm

            double energy = calculateCalorie(weight, calorage);
            System.out.println("Полученные калории = " + energy);

// расход топлива и стоимости на поездку


        } // end of main

        private static double calculateCalorie(double weight, double calorage) {
            return weight * calorage / 100;
        }

        private static double exchangeDollarsToEuro(double money) {
            double rate = 0.9;
            return money * rate;
        }

    } // end of class

