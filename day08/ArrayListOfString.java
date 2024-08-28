
public class ArrayListOfString {

    /**
     * The default capacity for new ArrayLists.
     */
    private static final int DEFAULT_CAPACITY = 16;

    /**
     * The number of elements in this list.
     * 
     * @serial the list size
     */
    private int size;

    /**
     * Where the data is stored.
     */
    private String[] data;

    /**
     * Construct a new ArrayList with the default capacity (16).
     */
    public ArrayListOfString() {
        data = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public void add(int index, String string) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();        

        if (index != size)
            for (int i = size; i > index; i--) 
                data[i] = data[i - 1];    
            

        data[index] = string;
        size++;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the list size
     */
    public int size() {
        return size;
    }

    /**
     * Retrieves the element at the user-supplied index.
     *
     * @param index the index of the element we are fetching
     * @throws IndexOutOfBoundsException if index &lt; 0 || index &gt;= size()
     */
    public String get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return data[index];
    }

    public void remove(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    /**
     * Removes the element at the user-supplied index.
     *
     * @param index the index of the element to be removed
     * @return the removed Object
     * @throws IndexOutOfBoundsException if index &lt; 0 || index &gt;= size()
     */
    public String remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        String s = data[index];
        if (index != --size)
            for (int i = index; i < size; i++)
                data[i] = data[i + 1];
        data[size] = null;
        return s;
    }

    public boolean contains(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

}
