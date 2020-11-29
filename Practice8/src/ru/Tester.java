package ru;

public class Tester {
    public static void main(String[] args) {

        System.out.println("Test1");

        WaitList<Integer> list = new WaitList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Empty\t" + list.isEmpty());

        System.out.println(list);

        list.remove();
        list.remove();

        System.out.println(list);

        System.out.println("Test2");

        BoundedWaitList<Integer> list2 = new BoundedWaitList<>(5);


        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println("Empty\t" + list2.isEmpty());

        System.out.println(list2);

        list2.remove();

        System.out.println(list2);

        System.out.println("Test3");

        UnfairWaitList<Integer> list3 = new UnfairWaitList<>();


        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(6);

        System.out.println("Empty\t" + list3.isEmpty());

        System.out.println(list3);

        list3.remove(4);
        list3.moveToBack(3);

        System.out.println(list3);
    }
}
