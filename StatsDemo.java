/*
  Name:  <Daniel Hanson>
  Prog:  Lab 4 - StatsDemo
  Date:  <10/04/19>
*/
package statsdemo;

import java.util.Scanner;
import java.io.*;
import java.util.*;
/*
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
  
   public static void main(String[] args)throws IOException
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line;         // To hold a line from the file
      double difference;   // The value and mean difference
      ArrayList<Double> values = new ArrayList<>();
      
      
      // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      // The user input file name
      String filename;     

      // Prompt the user and read in the file name
      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();
      
      
      // ADD LINES FOR TASK #4 HERE
      // Create a FileReader object passing it the filename
      // Create a BufferedReader object passing FileReader
      // object
      // Perform a priming read to read the first line of
      // the file
      // Loop until you are at the end of the file
      // Convert the line to a double value and add the
      // value to sum
      // Increment the counter
      // Read a new line from the file
      // Close the input file
      // Store the calculated mean
      
      
      FileReader file = new FileReader(filename);
      BufferedReader readFile = new BufferedReader(file);
      line = readFile.readLine();
      while(true){
    	  line = readFile.readLine();
    	  if(line == null)
    		  break;
    	  else{
    		  values.add(Double.parseDouble(line));
    		  sum += Double.valueOf(line);
        	 count += 1; 
    	  }	
      }
      readFile.close();
      //System.out.println(count);
      mean = sum / count;
      
      
      // ADD LINES FOR TASK #5 HERE
      // Reconnect FileReader object passing it the
      // filename
      // Reconnect BufferedReader object passing
      // FileReader object
      // Reinitialize the sum of the numbers
      // Reinitialize the number of numbers added
      // Perform a priming read to read the first line of
      // the file
      // Loop until you are at the end of the file
      // Convert the line into a double value and
      // subtract the mean
      // Add the square of the difference to the sum
      // Increment the counter
      // Read a new line from the file
      // Close the input file
      // Store the calculated standard deviation
      
      
      FileReader file2 = new FileReader(filename);            
        BufferedReader input2 = new BufferedReader(file2);      
        sum = 0;                                               
        count = 0;                                             
        line = input2.readLine();                               
        while (line != null)                                    
        {
            difference = Double.parseDouble(line) - mean;      
            sum += Math.pow(difference, 2);                     
            count++;                                            
            line = input2.readLine();                           
        }
        input2.close();                                        
        stdDev = Math.sqrt((sum / count));      
                       

      // ADD LINES FOR TASK #3 HERE
      // Create a FileWriter object using "Results.txt"
      // Create a PrintWriter object passing the
      // FileWriter object
      // Print the results to the output file
      // Close the output file
      
      
      FileWriter write = new FileWriter("Result.txt");
      PrintWriter output = new PrintWriter(write);
      output.printf("Mean of %s = %.3f.\n\n", values.toString(), mean);
      output.printf("Standard Deviation of %s  = %.3f.",values.toString(), stdDev);
      output.close();
      
   }
  
}