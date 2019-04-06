package com.mylinkedlist;

import java.util.*;

public class TestCollectionClass {

    class TestOfLists {
        List<Circle> arrayList = new ArrayList();
        List<Circle> linkedList = new LinkedList();

        public void addingOfLists() {
            for (int i = 0; i < 100000; i++) {
                arrayList.add(new Circle(i + 100));
                linkedList.add(new Circle(i + 100));
            }
        }

        public void addingCompareOfLists() {

            long startTimeIndexOfArr = System.nanoTime();
            arrayList.add(50000, new Circle(123456));
            long estimatedTimeIndexofArr = System.nanoTime() - startTimeIndexOfArr;
            System.out.println("Time spent for addArrayList is: " + estimatedTimeIndexofArr + "ns");

            long startTimeIndexOfLink = System.nanoTime();
            linkedList.add(50000, new Circle(123456));
            long estimatedTimeIndexofLink = System.nanoTime() - startTimeIndexOfLink;
            System.out.println("Time spent for addLinkedList is: " + estimatedTimeIndexofLink + "ns");
        }

        public void removingCompareOfLists() {

            long startTimeIndexOfArr = System.nanoTime();
            arrayList.remove(50000);
            long estimatedTimeIndexofArr = System.nanoTime() - startTimeIndexOfArr;
            System.out.println("Time spent for removeArrayList is: " + estimatedTimeIndexofArr + "ns");

            long startTimeIndexOfLink = System.nanoTime();
            linkedList.remove(50000);
            long estimatedTimeIndexofLink = System.nanoTime() - startTimeIndexOfLink;
            System.out.println("Time spent for removeLinkedList is: " + estimatedTimeIndexofLink + "ns");
        }

        public void indexOfCompareOfLists() {

            long startTimeIndexOfArr = System.nanoTime();
            arrayList.indexOf(50000);
            long estimatedTimeIndexofArr = System.nanoTime() - startTimeIndexOfArr;
            System.out.println("Time spent for indexOfArrayList is: " + estimatedTimeIndexofArr + "ns");

            long startTimeIndexOfLink = System.nanoTime();
            linkedList.indexOf(50000);
            long estimatedTimeIndexofLink = System.nanoTime() - startTimeIndexOfLink;
            System.out.println("Time spent for indexOfLinkedList is: " + estimatedTimeIndexofLink + "ns");
        }
    }

    class TestOfSets {

        Set<Circle> hashSet = new HashSet<>();
        Set<Circle> linkedhashSet = new LinkedHashSet<>();
        Set<Circle> treeSet = new TreeSet<>();

        public void addingOfSets() {
            for (int i = 0; i < 100000; i++) {
                hashSet.add(new Circle(i + 100));
                linkedhashSet.add(new Circle(i + 100));
                treeSet.add(new Circle(i + 100));
            }
        }

        public void addingCompareOfSets() {

            long startTimeIndexOfHash = System.nanoTime();
            hashSet.add(new Circle(123456));
            long estimatedTimeIndexofHash = System.nanoTime() - startTimeIndexOfHash;
            System.out.println("Time spent for addHash is: " + estimatedTimeIndexofHash + "ns");

            long startTimeIndexOfLinkHash = System.nanoTime();
            linkedhashSet.add(new Circle(123456));
            long estimatedTimeIndexofLinkHash = System.nanoTime() - startTimeIndexOfLinkHash;
            System.out.println("Time spent for addLinkedHash is: " + estimatedTimeIndexofLinkHash + "ns");

            long startTimeIndexOfTree = System.nanoTime();
            treeSet.add(new Circle(123456));
            long estimatedTimeIndexofTree = System.nanoTime() - startTimeIndexOfTree;
            System.out.println("Time spent for addTree is: " + estimatedTimeIndexofTree + "ns");
        }

        public void removingCompareOfSets() {

            long startTimeIndexOfHash = System.nanoTime();
            hashSet.remove(new Circle(5000));
            long estimatedTimeIndexofHash = System.nanoTime() - startTimeIndexOfHash;
            System.out.println("Time spent for removeHash is: " + estimatedTimeIndexofHash + "ns");

            long startTimeIndexOfLinkHash = System.nanoTime();
            linkedhashSet.remove(new Circle(5000));
            long estimatedTimeIndexofLinkHash = System.nanoTime() - startTimeIndexOfLinkHash;
            System.out.println("Time spent for removeLinkedHash is: " + estimatedTimeIndexofLinkHash + "ns");

            long startTimeIndexOfTree = System.nanoTime();
            treeSet.remove(new Circle(5000));
            long estimatedTimeIndexofTree = System.nanoTime() - startTimeIndexOfTree;
            System.out.println("Time spent for removeTree is: " + estimatedTimeIndexofTree + "ns");
        }

        public void containsCompareOfSets() {

            long startTimeIndexOfHash = System.nanoTime();
            hashSet.contains(new Circle(5000));
            long estimatedTimeIndexofHash = System.nanoTime() - startTimeIndexOfHash;
            System.out.println("Time spent for containsHash is: " + estimatedTimeIndexofHash + "ns");

            long startTimeIndexOfLinkHash = System.nanoTime();
            linkedhashSet.contains(new Circle(5000));
            long estimatedTimeIndexofLinkHash = System.nanoTime() - startTimeIndexOfLinkHash;
            System.out.println("Time spent for containsLinkHash is: " + estimatedTimeIndexofLinkHash + "ns");

            long startTimeIndexOfTree = System.nanoTime();
            treeSet.contains(new Circle(5000));
            long estimatedTimeIndexofTree = System.nanoTime() - startTimeIndexOfTree;
            System.out.println("Time spent for containsTree is: " + estimatedTimeIndexofTree + "ns");
        }
    }


    class TestOfMaps {

        Map<Integer, Circle> hashMap = new HashMap();
        Map<Integer, Circle> linkedHashMap = new LinkedHashMap();
        Map<Integer, Circle> treeMap = new TreeMap();

        public void addingOfMaps() {
            for (int i = 0; i < 100000; i++) {
                hashMap.put(i, new Circle(i + 100));
                linkedHashMap.put(i, new Circle(i + 100));
                treeMap.put(i, new Circle(i + 100));
            }
        }

        public void addingCompareOfMaps() {

            long startTimeIndexOfHash = System.nanoTime();
            hashMap.put(5000, new Circle(123456));
            long estimatedTimeIndexofHash = System.nanoTime() - startTimeIndexOfHash;
            System.out.println("Time spent for addHash is: " + estimatedTimeIndexofHash + "ns");

            long startTimeIndexOfLinkHash = System.nanoTime();
            linkedHashMap.put(5000, new Circle(123456));
            long estimatedTimeIndexofLinkHash = System.nanoTime() - startTimeIndexOfLinkHash;
            System.out.println("Time spent for addLinkedHash is: " + estimatedTimeIndexofLinkHash + "ns");

            long startTimeIndexOfTree = System.nanoTime();
            treeMap.put(5000, new Circle(123456));
            long estimatedTimeIndexofTree = System.nanoTime() - startTimeIndexOfTree;
            System.out.println("Time spent for addTree is: " + estimatedTimeIndexofTree + "ns");
        }

        public void removingCompareOfSets() {

            long startTimeIndexOfHash = System.nanoTime();
            hashMap.remove(5000);
            long estimatedTimeIndexofHash = System.nanoTime() - startTimeIndexOfHash;
            System.out.println("Time spent for removeHash is: " + estimatedTimeIndexofHash + "ns");

            long startTimeIndexOfLinkHash = System.nanoTime();
            linkedHashMap.remove(5000);
            long estimatedTimeIndexofLinkHash = System.nanoTime() - startTimeIndexOfLinkHash;
            System.out.println("Time spent for removeLinkedHash is: " + estimatedTimeIndexofLinkHash + "ns");

            long startTimeIndexOfTree = System.nanoTime();
            treeMap.remove(5000);
            long estimatedTimeIndexofTree = System.nanoTime() - startTimeIndexOfTree;
            System.out.println("Time spent for removeTree is: " + estimatedTimeIndexofTree + "ns");
        }

        public void getCompareOfSets() {

            long startTimeIndexOfHash = System.nanoTime();
            hashMap.get(5000);
            long estimatedTimeIndexofHash = System.nanoTime() - startTimeIndexOfHash;
            System.out.println("Time spent for getHash is: " + estimatedTimeIndexofHash + "ns");

            long startTimeIndexOfLinkHash = System.nanoTime();
            linkedHashMap.get(5000);
            long estimatedTimeIndexofLinkHash = System.nanoTime() - startTimeIndexOfLinkHash;
            System.out.println("Time spent for getLinkHash is: " + estimatedTimeIndexofLinkHash + "ns");

            long startTimeIndexOfTree = System.nanoTime();
            treeMap.get(5000);
            long estimatedTimeIndexofTree = System.nanoTime() - startTimeIndexOfTree;
            System.out.println("Time spent for getTree is: " + estimatedTimeIndexofTree + "ns");

        }
    }
}
