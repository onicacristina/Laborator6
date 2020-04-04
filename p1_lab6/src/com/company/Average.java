package com.company;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {

    float s=0,average;
    float x;
    public void readFile()
        {
            try {
                File myObj = new File("examene.txt");
                Scanner myReader = new Scanner(myObj);

                for (int i = 0; i <6 && myReader.hasNextLine() ; i++) {
                    x = myReader.nextInt();
                    s += x;
                }
                myReader.close();
            }catch (FileNotFoundException e)
            {
                System.out.println("A aparut o eroare.");
                e.printStackTrace();
            }

        }

        public void printAverage()
        {
            try{
                FileWriter myWriter= new FileWriter("media.txt");
                average= s/6;
                DecimalFormat df = new DecimalFormat("#.##");
                myWriter.write(df.format(average)+"");

                myWriter.close();
                System.out.println("Media notelor a fost scrisa cu succes in fisier!");
            } catch (IOException e)
            {
                System.out.println("A aparut o eroare.");
                e.printStackTrace();
            }
        }

}
