/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Collections
 * CONCEPT: ArrayList versus LinkedList
 *
 * What is it?
 * ArrayList uses a resizable array while LinkedList uses linked nodes.
 *
 * Why do we need it?
 * Their internal structures create different performance and memory tradeoffs.
 *
 * Key points:
 * - ArrayList gives fast indexed access; LinkedList needs traversal for indexed access and stores link references.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * For most general-purpose list use, start with ArrayList unless a measured need suggests otherwise.
 */

import java.util.ArrayList;
import java.util.LinkedList;
class Concept02_ArrayListVsLinkedList {
    public static void main(String[] args) {
        var arrayList = new ArrayList<Integer>();
        var linkedList = new LinkedList<Integer>();
        for (int i = 1; i <= 3; i++) { arrayList.add(i); linkedList.add(i); }
        System.out.println(arrayList.get(1));
        System.out.println(linkedList.getFirst());
    }
}
