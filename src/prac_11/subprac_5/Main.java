package prac_11.subprac_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Операция\tArrayList\tLinkedList");
        long distance;

        // Вставка элементов
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        distance = endTime - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("вставка\t\t" + distance + "\t\t\t" + (endTime - startTime));

        // Удаление элементов
        Random random = new Random();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE / 2; i++) {
            int index = random.nextInt(arrayList.size());
            arrayList.remove(index);
        }
        endTime = System.currentTimeMillis();
        distance = endTime - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE / 2; i++) {
            int index = random.nextInt(linkedList.size());
            linkedList.remove(index);
        }
        endTime = System.currentTimeMillis();
        System.out.println("удаление\t" + distance + "\t\t\t" + (endTime - startTime));

        // Добавление элементов
        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE / 2; i++) {
            int index = random.nextInt(arrayList.size());
            arrayList.add(index, -1);
        }
        endTime = System.currentTimeMillis();
        distance = endTime - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE / 2; i++) {
            int index = random.nextInt(linkedList.size());
            linkedList.add(index, -1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("добавление\t" + distance + "\t\t\t" + (endTime - startTime));

        // Поиск по образцу
        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE / 10; i++) {
            int index = random.nextInt(arrayList.size());
            int element = arrayList.get(index);
        }
        endTime = System.currentTimeMillis();
        distance = endTime - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE / 10; i++) {
            int index = random.nextInt(linkedList.size());
            int element = linkedList.get(index);
        }
        endTime = System.currentTimeMillis();
        System.out.println("поиск\t\t" + distance + "\t\t\t" + (endTime - startTime));
    }
}
