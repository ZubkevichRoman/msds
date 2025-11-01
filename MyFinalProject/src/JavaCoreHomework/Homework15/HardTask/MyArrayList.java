package JavaCoreHomework.Homework15.HardTask;

public class MyArrayList<T> {
    /**
     * Задача *:
     * Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
     * работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
     * основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
     * классов(т.е. это generic).
     * Предусмотреть операции(методы):
     * 1. добавления элемента
     * 2. удаления элемента
     * 3. получение элемента по индексу
     * 4. проверка есть ли элемент в коллекции
     * 5. очистка всей коллекции
     * Предусмотреть конструктор без параметров - создает массив размером
     * по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
     * массива. Предусмотреть возможность автоматического расширения коллекции при
     * добавлении элемента в том случае, когда коллекция уже заполнена
     */
    private int countOfElements = 0;
    private T[] array;
    private int pointer = 0;
    private int CUT_RATE = 4;
    private int DEFAULT_SIZE = 16;

    public MyArrayList() {
        this.array = (T[]) new Object[DEFAULT_SIZE];
    }

    // add добавляет новый элемент в список если
    // список заполнен полностью увеличивает в 2 раза
    public void add(T item) {
        if (pointer == array.length - 1)
            resize(array.length * 2); // увеличивает в 2 раза, если достигнет границ
        array[pointer++] = item;
    }

    //метод удаления
    public void remove(int index) {
        for (int i = index; i < pointer; i++) {
            array[i] = array[i + 1];
            array[pointer] = null;
            pointer--;
            if (array.length > DEFAULT_SIZE && pointer < array.length / CUT_RATE)
                resize(array.length / 2); // если элементов в CUT_RATE раз меньше

        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //метод очистки всей коллекции заменой на null
    public void clear() {
        for (int i = 0; i < pointer; i++) {
            array[i] = null;
        }
    }

    public boolean contains(T element) {
        for (int i = 0; i < pointer; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public int getCountOfElements() {
        return countOfElements;
    }

    public void setCountOfElements(int countOfElements) {
        this.countOfElements = countOfElements;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int getPointer() {
        return pointer;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    public int getCUT_RATE() {
        return CUT_RATE;
    }

    public void setCUT_RATE(int CUT_RATE) {
        this.CUT_RATE = CUT_RATE;
    }

    public int getDEFAULT_SIZE() {
        return DEFAULT_SIZE;
    }

    public void setDEFAULT_SIZE(int DEFAULT_SIZE) {
        this.DEFAULT_SIZE = DEFAULT_SIZE;
    }

    private T returningAnElementByIndex(int index) {
        return (T) array[index];
    }

    private int size() {
        return pointer;
    }

    private void resize(int i) {
        Object[] newArray = new Object[i];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = (T[]) newArray;
    }
}
