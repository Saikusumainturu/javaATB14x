package LearnJava;

import java.io.*;

class Lab001_HelloWorld {
public static void main(String[] args) throws IOException {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the radius");
    String r = input.readLine();
    double r1 = Double.parseDouble(r);
    double area = 3.14 * r1 * r1;
    System.out.println("Area ="+ area);

}

}