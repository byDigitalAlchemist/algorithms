package com.dc.algorithms.sort;

import com.dc.algorithms.sort.strategy.BubbleSort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] data = {6, 1, 2, 3, 4, 5};
        
        SortStrategy.sort(data, new BubbleSort());
    }
}
