package homework_45.dao;



    import java.util.*;
import java.util.stream.Collectors;

    public class Computer {
        private String brand;
        private int ram;
        private int ssd;

        public Computer(String brand, int ram, int ssd) {
            this.brand = brand;
            this.ram = ram;
            this.ssd = ssd;
        }

        public String getBrand() {
            return brand;
        }

        public int getRam() {
            return ram;
        }

        public int getSsd() {
            return ssd;
        }

        @Override
        public String toString() {
            return "Computer{" +
                    "brand='" + brand + '\'' +
                    ", ram=" + ram +
                    ", ssd=" + ssd +
                    '}';
        }
    }


