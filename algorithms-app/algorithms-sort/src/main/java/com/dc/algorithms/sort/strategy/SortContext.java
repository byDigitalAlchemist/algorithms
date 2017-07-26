package com.dc.algorithms.sort.strategy;

public class SortContext {
	
	private ISortStrategy strategy;
	
	public void setSortStrategy(ISortStrategy sortStrategy){
		this.strategy = sortStrategy;
	}
	
	public void sort(Integer[] data){
		this.strategy.sort(data);
	}
	
}
