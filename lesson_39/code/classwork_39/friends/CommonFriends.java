package classwork_39.friends;
//- Поиск общих друзей у двух пользователей соц.сети.
//  В социальной сети у каждого пользователя есть список друзей. Напишите программу, которая определяет общих друзей для двух заданных пользователей.
//  Пример:
//  Список друзей пользователя A: ["Иван", "Мария", "Анна", "Петр"]
//  Список друзей пользователя B: ["Анна", "Елена", "Петр", "Дмитрий"]
//  Выход: ["Анна", "Петр"]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CommonFriends {
    public static void main(String[] args) {

        List<String> friendsA = Arrays.asList("Иван", "Мария", "Анна", "Петр");
        List<String> friendsB = Arrays.asList("Анна", "Елена", "Петр", "Дмитрий");

        System.out.println("Common friends:" + findCommonFriends(friendsA, friendsB));

    }

    private static Object findCommonFriends(List<String> friendsA, List<String> friendsB) {
        HashSet<String> setA = new HashSet<>( friendsA);

        List<String> commonFriend = new ArrayList<>();

        // одойдем setA и по ходу будем сравнивать со списком friendsB

        for (String f : friendsB){
            if(setA.contains(f)){
                commonFriend.add(f);
            }
        }
        // а если их нет?
        if(commonFriend.isEmpty()){
            System.out.println("There is no any common friend! ");
            return null;
        }
        return commonFriend;
    }
}
