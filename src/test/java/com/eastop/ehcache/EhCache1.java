package com.eastop.ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EhCache1 {
	public static void main(String[] args) {
		//创建一个缓存管理器
		CacheManager cacheManager = CacheManager.create();
		//建立一个缓存实例
		Cache cache = new Cache("testCache", 5000, false, false, 1, 1);
		//在内存管理器中添加缓存实例
		cacheManager.addCache(cache);
		 //在缓存管理器中获取一个缓存实例
        Cache cache1 = cacheManager.getCache("testCache");
        //使用获取到的缓存实例
        Element element = new Element("key1", "value1");
        cache1.put(element);//添加缓存值
        cache1.put(new Element("key2", "value2"));//添加缓存值
        
        int elementsInMemory = cache1.getSize();//获取缓存个数
        System.out.println("缓存个数======="+elementsInMemory);

        Cache cache2 = cacheManager.getCache("testCache");
        Element element1 = cache2.get("key2");
        System.out.println(element1.getObjectValue());
        
	}
}
