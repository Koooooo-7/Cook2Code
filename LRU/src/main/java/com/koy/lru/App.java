package com.koy.lru;

import com.koy.lru.core.LRUCache;
import com.koy.lru.core.Node;

import java.util.LinkedList;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/04/18
 */
public class App {
    public static void main(String[] args) {

        LRUCache lrUcache = new LRUCache(2);
        lrUcache.put(1, 2);
        lrUcache.put(3, 2);
        lrUcache.put(5, 2);
        System.out.println(lrUcache);
        lrUcache.get(3);
        System.out.println(lrUcache);
    }

}
