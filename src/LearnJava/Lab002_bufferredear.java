package LearnJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab002_bufferredear {
   public static void main(String args[]) throws IOException {
       BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the name");
       String name = buffy.readLine();
       System.out.println("Enter the marks");
       String sc = buffy.readLine();
       int sciencemarks = Integer.parseInt(sc);
       String soc = buffy.readLine();
      int socialmarks = Integer.parseInt(soc);
       System.out.println("Enter the gender");
       String gender = buffy.readLine();
       System.out.println("My name is "+ name);
       System.out.println(" My science marks is "+ sciencemarks );
       System.out.println("My social marks is "+soc );
       int totalmarks = sciencemarks + socialmarks;
       double average = totalmarks/2;
       System.out.println("Average is "+ average);







    }
}
