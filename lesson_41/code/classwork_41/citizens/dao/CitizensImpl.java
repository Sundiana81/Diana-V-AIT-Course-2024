package classwork_41.citizens.dao;

import classwork_41.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements Citizens {

    // статические переменные класса
    private static Comparator<Person> lastNameComparator;
    private static Comparator<Person> ageComparator;

    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    // Метод добавления человека по различным критериям
    // Сложность: O(log n) для вставки в отсортированный список (binarySearch + add)
    @Override
    public boolean add(Person person) {
       // Здесь проверяется, что параметр person не является null.
        //Проверка гарантирует, что код не попытается работать с null.
        if (person == null) {
            return false;// добовление не происходит
        }
        //Здесь выполняется бинарный поиск для объекта person в списке idList,
        // который должен быть отсортирован по идентификаторам.
        // Метод binarySearch возвращает индекс найденного элемента, если он уже присутствует,
        // или отрицательное значение, если его нет. Поскольку idList отсортирован по идентификаторам,
        // бинарный поиск выполняется с логарифмической сложностью O(log⁡n)O(logn)
        //Если результат (index) положительный, значит person уже есть в idList на позиции index.
        //Если результат отрицательный, его можно преобразовать для вычисления позиции,
        // на которую person следует вставить, чтобы поддерживать сортировку.
        int index = Collections.binarySearch(idList, person);
        if (index >= 0) {
            return false;
        }//Операция -index - 1 преобразует это отрицательное значение в правильный индекс вставки.
        //После преобразования index указывает на ту позицию, куда можно вставить person,
        // чтобы сохранить порядок в idList.
        index = -index - 1;
        idList.add(index, person); //Метод add(index, element) вставляет объект person в список idList
        // на конкретную позицию index.
        //Все элементы, находящиеся после index, сдвигаются на одну позицию вправо,
        // чтобы освободить место для нового элемента.
        //......................................................
        //Этот код использует binarySearch для поиска объекта person в ageList
        // с использованием ageComparator
        // (который сортирует по возрасту и, если возраст совпадает, по ID).
        //Если person не найден (index < 0), то значение индекса преобразуется
        // в позицию для вставки, как мы обсуждали ранее.
        index = Collections.binarySearch(ageList, person, ageComparator);
        index = index >= 0 ? index : - index - 1;
        //Метод add(index, person) вставляет person в список ageList на
        // вычисленную позицию index, чтобы сохранить сортировку списка.
        ageList.add(index, person);
        //Здесь снова выполняется binarySearch, но уже в списке lastNameList и с использованием lastNameComparator
        // (который сортирует по фамилии и, если фамилия совпадает, по ID).
        //Индекс преобразуется, если person не найден, чтобы определить, куда его нужно вставить.
        index = Collections.binarySearch(lastNameList, person, lastNameComparator);
        index = index >= 0 ? index : -index - 1;
        //Вставка person в lastNameList на рассчитанную позицию index сохраняет
        // сортировку списка по фамилии.
        lastNameList.add(index, person);
        return true;
    }


    @Override
    public boolean remove(int id) {
        // Ищем объект Person по id
        //Метод find(id) использует бинарный поиск через Collections.binarySearch, что дает
        // вычислительную сложность O(log⁡n)O(logn), где nn — количество элементов в списке idList.
        Person victim = find(id);// O(log n) - бинарный поиск по idList
        if (victim == null) {//Проверка на null выполняется за O(1), так как это простая операция сравнения
            return false;// O(1) - возврат результата
        }//Удаляем объект из трех списков
        //Операция remove(victim) в списке ArrayList имеет сложность O(n) в худшем случае,
        // когда элемент находится в начале списка (и все элементы должны быть сдвинуты).
        //Основной вклад в сложность метода дает операция удаления из списка, которая выполняется трижды, что в худшем случае дает общую сложность O(3n)=O(n)O(3n)=O(n), где nn — количество элементов в списке.
        //
        //Таким образом, общая вычислительная сложность метода remove(int id) — это O(n+log⁡n)=O(n),
        // где nn — количество элементов в списке.
        idList.remove(victim);// O(n) - удаление из списка (в худшем случае, когда элемент в начале списка)
        ageList.remove(victim); // O(n) - удаление из списка (в худшем случае)
        lastNameList.remove(victim);// O(n) - удаление из списка (в худшем случае)
        return true;// O(1) - возврат результата
    }


    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(idList, pattern);//время работы O(log n), где n — количество элементов в списке.
        return index < 0 ? null : idList.get(index);//get(index), которая имеет сложность O(1),
        // так как доступ к элементу по индексу в списке происходит за константное время.
    }  //сложность метода find(int id) составляет O(log n)

    //Два бинарных поиска: O(log n) и O(log n).
    //Операция subList: O(k), где k — количество элементов в результатах поиска
    //(может быть до n, если все элементы удовлетворяют условию).
    // Таким образом, общая вычислительная сложность метода find(int minAge, int maxAge) — это O(log n + k),
    //где k — количество элементов, подходящих под диапазон возрастов.
    //В худшем случае, когда все элементы подходят, сложность будет O(n).

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {// O(log n + k)
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;//O(log n)
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        return ageList.subList(from, to);//0 (1)
    }


    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        // O(log n), где n — количество элементов в lastNameList
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        return lastNameList.subList(from, to);//O(1) — для subList.
    }

    //O(1) — так как метод лишь возвращает ссылку на уже существующий
    // список без дополнительной обработки данных.
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    //  0(1)Аналогично предыдущему методу, getAllPersonSortedByLastName()
    // просто возвращает ссылку на список lastNameList,
    // который, как предполагается, уже отсортирован по фамилии.
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList;
    }

    // 0 (1) Метод getAllPersonSortedByAge()
    // возвращает ссылку на список ageList, который, по всей видимости,
    // уже отсортирован по возрасту.
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    // 0 (1) Метод size() возвращает количество элементов в списке idList с
    // помощью вызова idList.size().
    @Override
    public int size() {
        return idList.size();
    }
    //Вычислительная сложность (или сложность алгоритма) — это мера того, сколько ресурсов
    // (время или память) потребуется для выполнения алгоритма в зависимости от размера входных данных.
    // Сложность позволяет оценить, как алгоритм будет вести себя при увеличении объема данных.
    // Обычно оценивают:
    // Временная сложность (или сложность по времени) — сколько времени нужно алгоритму для
    // выполнения задачи в зависимости от объема входных данных.
    // Пространственная сложность (или сложность по памяти) — сколько памяти потребуется алгоритму
    // в зависимости от объема входных данных.
    // Виды сложности:
    // O(1) — Константная сложность:
    // Операция выполняется за постоянное время, независимо от объема данных.
    // Пример: доступ к элементу массива по индексу.
    // O(log n) — Логарифмическая сложность:
    // Время выполнения увеличивается медленно по мере увеличения объема данных.
    // Пример: бинарный поиск в отсортированном массиве.
    // O(n) — Линейная сложность:
    // Время выполнения увеличивается пропорционально объему данных.
    // Пример: перебор элементов массива
    // O(n log n) — Логарифмически-линейная сложность:
    // Время выполнения увеличивается быстрее, чем при линейной сложности, но медленнее, чем при квадратичной.
    // Пример: алгоритмы сортировки, такие как сортировка слиянием или быстрая сортировка.
    // O(n^2) — Квадратичная сложность:
    // Время выполнения пропорционально квадрату размера входных данных.
    // Пример: сортировка пузырьком, или алгоритмы с двумя вложенными циклами.
    // O(2^n) — Экспоненциальная сложность:
    // Время выполнения растет экспоненциально с увеличением входных данных.
    // Пример: решение задач методом полного перебора (например, задача о рюкзаке в своей наивной форме).
    // O(n!) — Факториальная сложность:
    // Время выполнения растет очень быстро.
    // Пример: задача о перестановках всех элементов множества.
}

