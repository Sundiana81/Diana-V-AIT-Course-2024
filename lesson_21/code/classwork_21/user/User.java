package classwork_21.user;

public class User {

    private String email;
    private String password;


    // constructor
    public User(String email, String password) {
        setEmail(email); // meniaem set email, zadajem rukami
        setPassword(password);
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(isEmailValid(email)){
            this.email = email;
        }else {
            System.out.println(email + " NOT valid");
        }
    }

    private boolean isEmailValid(String email) {
        int indexAt = email.indexOf('@'); // index where @ placed
        if(indexAt == -1 || indexAt != email.lastIndexOf('@')){
            return false;
        }
        if(email.indexOf('.', indexAt) == -1){  //Эта строка проверяет, есть ли точка (.)
                                                    // в части email после символа @.
                                                    // Вот как это работает:
            return false;
        }
        if(email.lastIndexOf('.') >= email.length() - 2) { //Эта строка проверяет, где находится последняя точка (.)
                                                              // в email-адресе, чтобы убедиться,
                                                              // что она не слишком близко к концу строки.
                                                                // Вот как это работает:
            return false;
        }
        //Этот цикл проверяет каждый символ в строке email, чтобы убедиться, что он допустим.
        // Если встречается недопустимый символ, функция возвращает false, и email считается некорректным.
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if(!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '.' || c == '@')){
                return false; // ± / |\
            }
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
