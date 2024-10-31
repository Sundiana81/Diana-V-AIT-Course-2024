package classwork_36.ilist.model;

import java.util.Arrays;
import java.util.Iterator;



public class IListImpl implements IList {

    Object[] elements;
    public int size;

    public IListImpl(int initialCapacity) {  // сами завели
        elements = new Object[initialCapacity];
        if(initialCapacity < 0){
            throw new IllegalArgumentException("Illegal capacity" + initialCapacity);
            // ОБРАЩАЕМСЯ К КЛАССУ Illegal... если пришлют отрицательную длинну
        }  //обрабатывает ошибку
        elements = new Object[initialCapacity];

    }
    public IListImpl(){//
        this(10);  //  начальный massiv na 10

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
            size = 0;

        }

    }

    @Override
    public boolean add(Object element) {
        ensureCapacity(); // раздвигание границ
        elements[size] = element;

        return true;

    }

    private void ensureCapacity(){
        if (size == elements.length){
            if(size == Integer.MIN_VALUE){
                throw new OutOfMemoryError();
            }  //увеличили в полтора раза
            int newCapacity = elements.length + elements.length / 2;
            if(newCapacity < 0){
                newCapacity = Integer.MIN_VALUE; // закончились положительные числа
            }
            elements = Arrays.copyOf(elements, newCapacity);


        }
    }

    @Override
    public boolean add(int index, Object element) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
