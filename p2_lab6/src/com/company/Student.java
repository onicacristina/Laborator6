package com.company;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Student {
    String nume;
    String prenume;
    String grupa;
    int n=0,i=0;
    Student s [] =new Student[1000];

    public void readStudents()
    {

        try
        {
            File myObj =new File("an.txt");
            Scanner reader = new Scanner(myObj);
            Scanner scanner = new Scanner(System.in);

            while(reader.hasNext())
            {
                s[i]= new Student();
                s[i].nume = reader.next();
                //System.out.println(s[i].nume);
                s[i].prenume= reader.next();
               // System.out.println(s[i].prenume);
                s[i].grupa=reader.next();
                //System.out.println(s[i].grupa);
                i++;
                n++;

            }
            reader.close();
        } catch (IOException e)
        {
            System.out.println("A aparut o eroare.");
            e.printStackTrace();
        }
    }

    public void printStudents()
    {
        for (int i = 0; i <n ; i++) {
            System.out.print("numele: "); System.out.println(s[i].nume);
            System.out.print("prenumele: ");System.out.println(s[i].prenume);
            System.out.print("grupa: "); System.out.println(s[i].grupa);
            System.out.println();

        }
    }

    public void sortByName()
    {
        Student aux;
        int  ok;
        do {
            ok=0;
            for (int i = 0; i <n-1 ; i++) {
                //int result = (s[i].nume).compareTo((s[i+1].nume));
                if((s[i].nume).compareTo(s[i+1].nume)>0)
                {
                    aux=s[i];
                    s[i]=s[i+1];
                    s[i+1]=aux;
                    ok=1;
                }
            }
        }while(ok==1);

    }
    public void writeStudents()
    {
        try
        {
            FileWriter writer = new FileWriter("an_sort.txt");
            for (int i = 0; i <n ; i++) {
                writer.write(s[i].nume +"   ");
                writer.write(s[i].prenume +"   ");
                writer.write(s[i].grupa +"\n");
            }
            writer.close();
            System.out.println("Studentii au fost scrisi in ordine alfabetica in fisierul <<an_sort.txt>>.");
        } catch (IOException e)
        {
            System.out.println("A aparut o eroare.");
            e.printStackTrace();
        }
    }
}
