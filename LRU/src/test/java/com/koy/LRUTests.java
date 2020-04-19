package com.koy;

import com.koy.lru.core.LRUCache;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2020/04/19
 */
public class LRUTests {

    @Test
    public void lruTest() {
        LRUCache lrUcache = new LRUCache(2);
        lrUcache.put(1, 2);
        lrUcache.put(3, 2);
        lrUcache.put(5, 2);
        Assert.assertEquals(lrUcache.size(), 2);
    }
}
