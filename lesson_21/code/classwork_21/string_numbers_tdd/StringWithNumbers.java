package classwork_21.string_numbers_tdd;

public class StringWithNumbers {

    // filds
   private String string;   // sozdanyj objekt

    // methods
// construktor

    public StringWithNumbers(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "StringWithNumbers{" +
                "string='" + string + '\'' +
                '}';
    }

    // 123 456 987 333
    // METOD
    public int sumOfNumbersInString(String string){
        int sum = 0;
        String[] numbers = string.split(" ");
        for (int i = 0; i < numbers.length ; i++) {
          sum += Integer.parseInt(numbers[i]);

        }
        return sum;
    }



}
