class DynamicArray {
    private int size; // point to the next available index ot of arr
    private int capacity;
    private int[] arr;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        
        arr[i] = n;
        return;
    }

    private void resize () {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];

        for ( int i = 0; i < size; i++ ) {
            newArr[i] = arr[i];
        }
        this.arr = newArr;
    }
    public void pushback(int n) {

        if (size >= capacity) {
            resize();
        }
        arr[size] = n;
        size ++;
        return;
    }

    public int popback() {
        
        size--;
        int ret = arr[size];
        arr[size] = 0;
        return ret;
    }



    public int getSize() {
        return size;

    }

    public int getCapacity() {
        return capacity;
    }
}
