package com.mylinkedlist;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {

        //////////////////////////////////////////Test MyLinkedList
        MyLinkedList<Circle> myLinkedList = new MyLinkedList<>();
        MyLinkedList.Node node = new MyLinkedList.Node(null,null,null);
        Iterator it = myLinkedList.iterator();


        for (int i = 0; i < 10000; i++) {
            myLinkedList.add(new Circle(i));
        }
        while(it.hasNext()){
            System.out.println(it.next());
        }

        myLinkedList.remove(9999);
        myLinkedList.add(9997, new Circle(77777));
        myLinkedList.indexOf(new Circle(77777, "red"));
        //System.out.println(myLinkedList.toString());

        ////////////////////////////compute time;

        // indexOf
        long startTimeIndexOf = System.nanoTime();
        System.out.println(myLinkedList.indexOf(new Circle(5000)));
        long estimatedTimeIndexof = System.nanoTime() - startTimeIndexOf;
        System.out.println("Time spent for indexOf is: " + estimatedTimeIndexof + "ns");

        //add
        long startTimeAdd = System.nanoTime();
        myLinkedList.add(4500, new Circle(500000));
        long estimatedTimeAdd = System.nanoTime() - startTimeAdd;
        System.out.println("Time spent for add is: " + estimatedTimeAdd + "ns");

        //remove
        long startTimeRemove = System.nanoTime();
        myLinkedList.remove(4500);
        long estimatedTimeRemove = System.nanoTime() - startTimeRemove;
        System.out.println("Time spent for remove is: " + estimatedTimeRemove + "ns");


        ////////////////////////////////////////// linkedList
        LinkedList<Circle> linkedList = new LinkedList();

        for (int i = 0; i < 10000; i++) {
            linkedList.add(new Circle(i));
        }

        // indexOf
        long startTimeIndexOfJavaUtil = System.nanoTime();
        System.out.println(linkedList.indexOf(new Circle(6000)));
        long estimatedTimeIndexofJavaUtil = System.nanoTime() - startTimeIndexOfJavaUtil;
        System.out.println("Time spent for indexOfJavaUtil is: " + estimatedTimeIndexofJavaUtil + "ns");

        //add
        long startTimeAddJavaUtil = System.nanoTime();
        linkedList.add(4500, new Circle(500));
        long estimatedTimeAddJavaUtil = System.nanoTime() - startTimeAddJavaUtil;
        System.out.println("Time spent for addJavaUtil is: " + estimatedTimeAddJavaUtil + "ns");

        //remove
        long startTimeRemoveJavaUtil = System.nanoTime();
        linkedList.remove(4500);
        long estimatedTimeRemoveJavaUtil = System.nanoTime() - startTimeRemoveJavaUtil;
        System.out.println("Time spent for removeJavaUtil is: " + estimatedTimeRemoveJavaUtil + "ns");


        //________________________________________________________________
        //TestCollectionClass


        //TestOfLists
        /*System.out.println("Lists:");
        com.mylinkedlist.TestCollectionClass.TestOfLists testOfLists = new TestCollectionClass().new TestOfLists();
        testOfLists.addingOfLists();
        testOfLists.addingCompareOfLists();
        testOfLists.removingCompareOfLists();
        testOfLists.indexOfCompareOfLists();
        System.out.println(testOfLists.arrayList.size());
        System.out.println(testOfLists.linkedList.size());
        System.out.println("");


        //TestOfSets
        System.out.println("Sets:");
        com.mylinkedlist.TestCollectionClass.TestOfSets testOfSets = new TestCollectionClass().new TestOfSets();
        testOfSets.addingOfSets();
        testOfSets.addingCompareOfSets();
        testOfSets.removingCompareOfSets();
        testOfSets.containsCompareOfSets();
        System.out.println(testOfSets.hashSet.size());
        System.out.println(testOfSets.linkedhashSet.size());
        System.out.println(testOfSets.treeSet.size());
        System.out.println("");


        //Maps
        System.out.println("Maps:");
        com.mylinkedlist.TestCollectionClass.TestOfMaps testOfMaps = new TestCollectionClass().new TestOfMaps();
        testOfMaps.addingOfMaps();
        testOfMaps.addingCompareOfMaps();
        testOfMaps.removingCompareOfSets();
        //System.out.println(testOfMaps.hashMap.get(5000));
        testOfMaps.getCompareOfSets();
        System.out.println(testOfMaps.hashMap.size());
        System.out.println(testOfMaps.linkedHashMap.size());
        System.out.println(testOfMaps.treeMap.size());
        System.out.println("");

        //Conclusion
        System.out.println("В результате выполнения программы, ориентируясь, на полученные результаты можно сказать, что:\n" +
                "- Связанный список и Список лучше использовать при работе с небольшими объемами данных. Связанный лучше использовать\n" +
                "  когда в приоритете операция вставки (не могу объяснить почему результаты для LinkedList  получаются такими)\n" +
                "  ArrayList используется, когда в приоритете доступ по индексу, так выполняется за время O(1)).\n" +
                "- Сеты реализуют такую структуру данных, как хеш-таблицы, TreeSet - бинарное дерево. Время выполнения основных оперцаций,\n" +
                "  за исключением перербора O(logN) однако требуются дополнительные расходы памяти. Также должен быть известен хотя бы относительный\n" +
                "  объем хранимых данных, так как в качестве базовой структуры даннхы исползуется массив. Так как в Sets все значения уникальны, удобно\n " +
                "  использовать в математике или там где требуется уникальность данных.\n" +
                "- Maps реализует структуру данных хеш-таблицыб TreeMap - красно-черное дерево. Время выполнения основных операций, за исключением перебора \n" +
                "  константное O(1), перебор невозможен. Maps не гарантирует порядок элементов. Эту коллекцию эффективно использовать, для хранения парных данных.\n" +
                "  Например: логин - пароль");*/
        /*MyLinkedList<Circle> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(new Circle(1));
        myLinkedList.add(new Circle(2, "black"));
        myLinkedList.add(new Circle(3,  "green"));
        myLinkedList.add(new Circle(4, "blue"));
        System.out.println(myLinkedList.toString());*/
    }
}
