package com.dc.algorithms.technical;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.dc.algorithms.technical.array.MoveZerosToEnd;

public class MoveZerosToEndTest {

	private Integer[] userArray;
	private int totalTestCases;
	private int sizeArray;
	
	@Before
	public void setup(){
		String location = "src/main/resources/movezerostoend.data";
		BufferedReader reader = null;
		String line = "";
		String csvSplitter = ",";
		
		
		try {

            reader = new BufferedReader(new FileReader(location));
            while ((line = reader.readLine()) != null) {
            	System.out.println(" >>> " + line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

	}
	
	
	@Test
	public void move(){

		System.out.println(" +++++++ data1 +++++++");
		
		Integer[] data =  {3,5,0,0,4};
		MoveZerosToEnd.move(data,0);
		MoveZerosToEnd.print(data);
		
		System.out.println(" +++++++ data2 +++++++");
		
		Integer[] data2 =  {3,5,0,0,0};
		MoveZerosToEnd.move(data2,0);
		MoveZerosToEnd.print(data2);

		System.out.println(" +++++++ data3 +++++++");
		
		Integer[] data3 =  {0,5,0,0,0};
		MoveZerosToEnd.move(data3,0);
		MoveZerosToEnd.print(data3);
	
		
		System.out.println(" +++++++ data4 +++++++");
		Integer[] data4 =  {0,0,0,0,0};
		MoveZerosToEnd.move(data4,0);
		MoveZerosToEnd.print(data4);

		

		System.out.println(" +++++++ data5 +++++++");
		Integer[] data5 =  {1,2,3,4,0,0,0,5,6,0,7,8,9};
		MoveZerosToEnd.move(data5,0);
		MoveZerosToEnd.print(data5);

		System.out.println(" +++++++ data6 +++++++");
		Integer[] data6 =  {1,0};
		MoveZerosToEnd.move(data6,0);
		MoveZerosToEnd.print(data6);
		
		System.out.println(" +++++++ data7 +++++++");
		Integer[] data7 =  {0};
		MoveZerosToEnd.move(data7,0);
		MoveZerosToEnd.print(data7);

		System.out.println(" +++++++ data8 +++++++");
		Integer[] data8 =  {0,1};
		MoveZerosToEnd.move(data8,0);
		MoveZerosToEnd.print(data8);
		
		System.out.println(" +++++++ data9 +++++++");
		Integer[] data9 =  {};
		MoveZerosToEnd.move(data9,0);
		MoveZerosToEnd.print(data9);

	}


}
