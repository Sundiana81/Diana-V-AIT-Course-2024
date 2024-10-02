package classwork_16.car_object;

import classwork_16.car_object.model.Car;

public class CarApp {

    public static void main(String[] args) {

  // Car indifikator , maCar eto objekt

        Car myCar = new Car("VW", 2014, 15000, "silver", false); // create objekt
        myCar.toString();
        System.out.println(myCar);// dobovliaem sout i poluciaetsia peciat

        myCar.move();
        myCar.stop();
    }
    // INKOPSULIACIJA; DOLZDA BYJ V TOM KLASSE KTO ZA NEGO OTVECIAET


}
