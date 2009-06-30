package com.threestarchina.urlgetter;

import java.util.Observer;
import java.util.Observable;

public class ProgressObserver implements Observer {
	private Download download;
	public ProgressObserver(Download download) {
		this.download = download;
		download.addObserver(this);
	}
	
	public void update(Observable obj, Object arg) {
		if(arg instanceof String) {
			System.out.println(arg);
		}
	}
}
