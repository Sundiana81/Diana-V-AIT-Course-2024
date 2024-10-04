package homework_17_03IBAN;
// Номер счета в банке IBAN состоит из букв латинского алфавита и цифр, имеет строго регламентированную длину (в Германии - 22 символа). Создать класс IbanCode, в котором определить необходимые поля и реализовать методы:
//
//    lengthCode(String code), который возвращает количество символов в счете
//    controlCode(String code), который возвращает сумму ASCII-кодов первых двух символов
//    isValid(String code), который проверяет штрих-код на правильное количество символов

    public class IbanCode {

        private String code;

        // Конструктор
        public IbanCode(String code) {
            this.code = code;
        }

        // Метод для возврата количества символов в счете
        public int lengthCode() {
            return code.length();
        }

        // Метод для возврата суммы ASCII-кодов первых двух символов
        public int controlCode() {
            if (code.length() < 2) {
                throw new IllegalArgumentException("IBAN код должен содержать минимум 2 символа.");
            }
            char firstChar = code.charAt(0);
            char secondChar = code.charAt(1);
            return (int) firstChar + (int) secondChar;
        }

        // Метод для проверки правильного количества символов (22 символа для Германии)
        public boolean isValid() {
            return code.length() == 22;
        }

        // Метод для вывода информации о IBAN
        public void display() {
            System.out.println("IBAN Code: " + code);
            System.out.println("Length of Code: " + lengthCode());
            System.out.println("Control Code (sum of ASCII codes of first two characters): " + controlCode());
            System.out.println("Is valid (22 characters): " + (isValid() ? "Yes" : "No"));
        }

        public static void main(String[] args) {
            // Пример использования класса
            IbanCode iban1 = new IbanCode("DE89370400440532013000");  // Пример IBAN для Германии

            // Вызов методов и вывод результатов
            iban1.display();
        }
    }

