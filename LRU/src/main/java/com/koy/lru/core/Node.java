package com.koy.lru.core;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/04/18
 */
public class Node {

    // assume all the element is int
    private int key;
    private int val;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }


    public int getKey() {
        return key;
    }

    int getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", val=" + val +
                '}';
    }

    // make linked list can remove the node as same when they have same key and val
    @Override
    public boolean equals(Object obj) {
        return ((Node)obj).val == val && ((Node) obj).key == key;
    }

    @Override
    public int hashCode() {
        return this.val<<4+this.key>>4;
    }
}
