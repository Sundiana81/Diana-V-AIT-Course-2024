package homework_40.treeSet;


    import java.util.TreeSet;

    public class TreeSetExample {
        public static void main(String[] args) {
            // Create a TreeSet of integers
            TreeSet<Integer> numbers = new TreeSet<>();

            // Add elements to the TreeSet
            numbers.add(35);
            numbers.add(76);
            numbers.add(20);
            numbers.add(40);
            numbers.add(56);

            System.out.println("TreeSet elements: " + numbers); // [20, 35, 40, 56, 76]

            // Using TreeSet methods
            System.out.println("Smallest element: " + numbers.first()); // 20
            System.out.println("Largest element: " + numbers.last()); // 76
            System.out.println("Element greater than or equal to 50: " + numbers.ceiling(50)); // 56
            System.out.println("Element less than or equal to 50: " + numbers.floor(50)); // 40
            System.out.println("Subset from 35 (inclusive) to 76 (exclusive): " + numbers.subSet(35, 76)); // [35, 40, 56]
            System.out.println("HeadSet up to 40 (exclusive): " + numbers.headSet(40)); // [20, 35]
            System.out.println("TailSet from 40 (inclusive): " + numbers.tailSet(40)); // [40, 56, 76]

            // Remove an element and check TreeSet
            numbers.remove(35);
            System.out.println("After removing 35: " + numbers); // [20, 40, 56, 76]

            // Check if TreeSet contains specific elements
            // Проверяем, содержит ли множество элемент
            System.out.println("Contains 40? " + numbers.contains(40)); // true
            System.out.println("Contains 35? " + numbers.contains(35)); // false

            // Polling elements
            // удаляет и возвращает первый и последний элимент
            System.out.println("Polling first element: " + numbers.pollFirst()); // 20
            System.out.println("Polling last element: " + numbers.pollLast()); // 76
            System.out.println("TreeSet after polling: " + numbers); // [40, 56]
        }
    }


