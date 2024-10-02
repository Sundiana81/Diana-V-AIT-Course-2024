package classworck_02;

public class Circus {

    public static void main(String[] args) {

        lightOn();
        entertainer();
        lightsOff();

    } // end of main

    public static void lightOn(){
        System.out.println("Lights ONNNN!!!");
    }

    public static void lightsOff(){
        System.out.println("Lights OFF... ");
    }

    public static void entertainer(){
        jogger();
        cloun();
        singer();
    }

    public static void jogger(){
        System.out.println("I'm jogging...");
    }

    public static void cloun(){
        System.out.println("I'm jocking...");
    }

    public static void singer(){
        System.out.println("I'm singing...");
    }


} // end of class



