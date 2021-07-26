package com.example;

import com.tangosol.net.DefaultCacheServer;

public class CacheServer {
	public static void main(String args[]) {
         String[] arg = {"tangosol-coherence-override.xml","5"};
         DefaultCacheServer.main(args);
	}
}
