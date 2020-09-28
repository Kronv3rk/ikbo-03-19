package ru;

public class IDNumber {

    private Student[] arr;
    private int size = 0;

    public IDNumber(int s) {
        this.arr = new Student[s];
    }

    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            Student val = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (val.getId() < arr[j].getId()) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = val;
        }
    }

    public void add(Student student) {
        arr[size] = student;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            out.append(arr[i].getName()).append("#").append(arr[i].getId());
            if (i != size - 1) {
                out.append(", ");
            }
        }
        out.append("]");
        return out.toString();
    }
}
