package com.threestarchina.urlgetter;

import java.net.URL;

public class Downloader {
	public static void main(String args[]) {
		for(String address : args) {
			
			URL url = verifyUrl(address);
			if (url != null) {
				Download download = new Download(url);
				ProgressObserver observer  = new ProgressObserver(download);
			} else {
				System.err.println("Invalid URL: " + address);
			}
		}
	}
	
	private static URL verifyUrl(String url) {
		if (!url.toLowerCase().startsWith("http://")) {
			return null;
		}
		
		URL verified = null;
		
		try {
			verified = new URL(url);
		} catch (Exception e) {
			return null;
		}
		return verified;
	}
	                                       
}
