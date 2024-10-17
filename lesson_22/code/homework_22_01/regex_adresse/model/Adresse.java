package homework_22_01.regex_adresse.model;

public class Adresse {

    private String city;
   private String postalCode;

    public Adresse(String city, String postalCode) {
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    // Проверка: город с большой буквы
    public static boolean isValidCity(String city) {
        return city.matches("^[A-Z][a-zA-Z]*$");
        // ^ — начало строки. Это означает, что проверка будет начинаться с самого начала.
//[A-Z] — первая часть, которая требует, чтобы первый символ был заглавной буквой (от A до Z).
//[a-zA-Z]* — вторая часть, которая указывает,
// что после первой буквы могут следовать ноль или более букв, как строчных (от a до z),
// так и заглавных (от A до Z).//
    }

    // Проверка: индекс содержит 5 цифр
    public static boolean isValidPostalCode(String postalCode) {
        return postalCode.matches("^\\d{5}$");
        //  ^ — обозначает начало строки. Указывает, что проверка начинается с самого начала.
        // \\d — представляет любую цифру от 0 до 9. В Java используется двойной обратный слэш (\\) для экранирования, чтобы \d был распознан как специальный символ, представляющий цифры.
        // {5} — указывает, что предыдущий элемент (в данном случае \\d) должен появиться ровно 5 раз.
        // То есть строка должна содержать именно 5 цифр.
        // $ — обозначает конец строки.
        // Указывает, что проверка должна закончиться в конце строки, что значит, что после 5 цифр не должно быть никаких других символов.
    }


}
