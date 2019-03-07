package com.eastop.ehcache;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EhCache2 {
	
	public static void main(String[] args) {
		//创建缓存管理器
		CacheManager cacheManager = new CacheManager();
		// 创建一个缓存实例（在配置文件中获取一个缓存实例）
		final Cache cache1 = cacheManager.getCache("helloworld1");
		
		final String chcheStr = "testVal";
		
		File file = new File("D://test/益签合同协议.pdf");
		byte[] filebyte = null;
		try {
			filebyte = IOUtils.toByteArray(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//他建一个数据容器
		final Element element = new Element(chcheStr, filebyte);
		//将数据放入到缓存实例中
		cache1.put(element);
		
		//取值
        final Cache cache2 = cacheManager.getCache("helloworld1");
        final Element getGreeting = cache2.get(chcheStr);
 
        // Print the value
        System.out.println("value======//========"+getGreeting.getObjectValue());
	}
	
	
	
}
