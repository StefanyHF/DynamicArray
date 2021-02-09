public class DynamicArray<T> {

    private Object[] array = new Object[10];

    public void add(T num) {
        if (isFull()) {
            Object[] array2 = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = num;
                break;
            }
        }
    }

    public void remove(T num) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == num) {
                array[i] = null;
                break;
            }
        }
        for (int j = i; j < array.length - 1; j++) {
            if (array[j + 1] != null) {
                array[j] = array[j + 1];
                array[j + 1] = null;

            }
        }
    }

    public T getAT(int index) throws Exception {
        if (index < 0 || index > array.length) {
            throw new ArrayIndexOutOfBoundsException("Index invalido");
        }
        return (T) array[index];
    }

    public int size() {
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            String result = "[";
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    if (array[i + 1] == null) {
                        result += array[i];
                    } else {
                        result += array[i] + " , ";
                    }
                }
            }
            return result + "]";
        }
    }

    private boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                return false;
            }
        }
        return true;
    }

    private boolean isFull() {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                contador++;
            }
        }
        if (contador == array.length - 1) {
            return true;
        }
        return false;
    }
}

