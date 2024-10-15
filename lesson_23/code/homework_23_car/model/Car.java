package homework_23_car.model;
// Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км. Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
//
//    марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
//    тип расходуемого топлива: d, b, d, d, b
//    стоимость 1 литра топлива: d - 1.6, b - 1.8
//    расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
//    стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49 Какой автомобиль ей следует выбрать?
public class Car {

        public static void main(String[] args) {

            String[] cars = {"Audi", "BMW", "Opel", "VW", "Mercedes"};
            char[] fuelType = {'d', 'b', 'd', 'd', 'b'}; // 'd' - дизель, 'b' - бензин
            double[] fuelCostPerLitre = {1.6, 1.8}; //Массив fuelCostPerLitre хранит стоимость топлива для дизельных (индекс 0) и бензиновых (индекс 1) автомобилей.
            double[] fuelConsumptionPer100km = {6.6, 6.8, 6.9, 6.5, 6.3};
            double[] rentalCostPerWeek = {45, 49, 45, 39, 49};

            int distance = 3000;

            double minCost = Double.MAX_VALUE;//Double.MAX_VALUE — это наибольшее возможное значение, которое может храниться в переменной типа double
            String bestCar = "";//это строка, которая будет хранить название автомобиля с наименьшей стоимостью поездки

            // Проходим по каждому автомобилю и вычисляем общую стоимость поездки
            for (int i = 0; i < cars.length; i++) {
                //Таким образом, этот код помогает автоматически определить стоимость топлива на основе его типа для каждого автомобиля.
                double fuelPrice = (fuelType[i] == 'd') ? fuelCostPerLitre[0] : fuelCostPerLitre[1];

                // Расчет необходимого количества топлива
                double fuelNeeded = (fuelConsumptionPer100km[i] / 100) * distance;

                // Расчет стоимости топлива
                double fuelCost = fuelNeeded * fuelPrice;

                // Общая стоимость поездки
                double totalCost = fuelCost + rentalCostPerWeek[i];

                // Выводим информацию по каждому автомобилю
                System.out.println(cars[i] + " - Total cost of the trip: " + totalCost + " euro");

                // Определяем автомобиль с минимальной стоимостью
                if (totalCost < minCost) {
                    minCost = totalCost;
                    bestCar = cars[i];
                }
            }

            System.out.println("Best choice for trip: " + bestCar + " with a total cost of: " + minCost + " euro");
        }
    }


