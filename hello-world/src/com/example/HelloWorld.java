package com.example;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

public class HelloWorld {
	 public static void main(String[] args) throws InterruptedException {
		 
	      String key = "k1";
	      String value = "Hello World!";
	      CacheFactory.ensureCluster();
	      NamedCache cache = CacheFactory.getCache("hello-example");
	      cache.put(key, value);
	      System.out.println("######################################");
	      System.out.println((String)cache.get(key));
	      System.out.println("sleeping");
	      Thread.sleep(10000);
	      CacheFactory.shutdown();
	   }
}
