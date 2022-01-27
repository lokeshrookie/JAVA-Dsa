package SourceCode.CollecionFrameWork;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class Introduction {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(" ArrayList Elements : " + arrayList.toString());
        arrayList.iterator();

        LinkedList<Object> l = new LinkedList<>();
        l.add(6);
        l.addFirst(5);
        l.add(7);
        l.addLast(8);
        l.removeFirst();
        System.out.println(l.size());
        System.out.println("LinkedList Elements :" + l);
        Stack<Object> stack = new Stack<>();
        Queue<Object> queue = new LinkedList<>();
        Queue<Object> q = new ArrayDeque<>();
        TreeSet<String> treeSet = new TreeSet<>();
        TreeMap<String, String> treeMap = new TreeMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> qu = new PriorityBlockingQueue<>();

    }
}
