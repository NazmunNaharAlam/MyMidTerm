package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;


public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
		//String actualpath = System.getProperty("/Users/mdalam/Desktop/MidtermJuly2017/src/data/self-driving-car");


		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/Users/mdalam/Desktop/MidtermJuly2017/src/data/self-driving-car"))

			System.out.println("Reading the file using readLine()method");
			String contentLine = br.readLine();
			while ( contentLine != null){
				System.out.println(contentLine);
				contentLine = br.readLine();
			}

		}
		catch (IOException ioe)
		{

			ioe.printStackTrace();
		}
		finally {
			try {
				if (br != null)
					br.close();
			}
			catch (IOException ioe)
			{
				System.out.println("Error in closing the BufferedReader");
			}
			}
		}
		}






