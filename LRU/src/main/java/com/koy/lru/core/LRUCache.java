package com.koy.lru.core;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Description LRU implementation
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/04/18
 */
public class LRUCache {

    private HashMap<Integer, Node> map;

    private LinkedList<Node> cache;

    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        cache = new LinkedList<>();

    }


    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        int val = node.getVal();
        cache.remove(node);
        cache.addFirst(node);
        return val;
    }

    public void put(int key, int val) {
        Node node = new Node(key, val);
        if (map.containsKey(key)) {
            cache.remove(node);
            cache.addFirst(node);
            return;
        }

        if (cache.size() == capacity) {
            Node last = cache.removeLast();
            map.remove(last.getKey());
        }
        map.put(key, node);
        cache.addFirst(node);
    }

    public int size() {
        return cache.size();
    }

    @Override
    public String toString() {
        return "LRUCache{" +
                "cache=" + cache +
                '}';
    }
}
