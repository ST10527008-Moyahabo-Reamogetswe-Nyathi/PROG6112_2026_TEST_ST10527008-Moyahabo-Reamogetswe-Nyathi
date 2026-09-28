package com.mycompany.number1electronics;
import java.util.Scanner;

public class Number1Electronics {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //Declare Arrays 
        String[] labels = {"PS5", "XBOX", "NINTENDO"};
        String[] cols = {"Cape Town", "Port Elizabeth", "Pretoria"};
        int [][] data = new int [labels.length][cols.length];
        
        for (int i = 0; i < labels.length; i++);
        {
            for (int j = 0 ; j < cols.length; j++);
            {
                System.out.print("Enter" + cols[j] + "for" + labels[i] + ":" );
                data[i][j] = input.nextInt();
            }
        }
    System.out.println("--------------------------------------------");
    System.out.println("Gaming Console Report");
    System.out.println("--------------------------------------------");
    System.out.printf("%-12s", "");
    for (String c : cols) System.out.printf("%-10s", c);
    System.out.println();
    for (int i = 0; i < labels.length; i++)
    {
        System.out.printf("% -12s", labels[i]);
        for (int j = 0; j < cols.length; j++)
        {
            System.out.printf("%-10d", data[i][j]);
        }
        System.out.println();
    }
    System.out.println("--------------------------------------------");
    System.out.println("Console Sales Totals for each city");
    System.out.println("--------------------------------------------");
    int overallMax = data[0][0], overallMin = data[0][0], overallTotal = 0;
    int bestRowIndex = 0, bestRowTotal = 0;
    
    for (int i = 0, i < labels.length, i++)
    {
        int rowTotal = 0;
        for(int j =0, j < cols.length, j++)
        {
          rowTotal += data[i][j];
          if (data[i][j] > overallMax) overallMax = data[i][j];
          if (data[i][j] < overallMin) overallMin = data[i][j];
        }
        overallTotal += rowTotal;
        }
    System.out.println("--------------------------------------------");
     System.out.println("Total: " + overallTotal);
     System.out.println("Max: " + overallMax);
 
     System.out.println("Min: " + overallMin);

     System.out.println("Row with greatest total: " + labels[bestRowIndex]);

    
    }

    }

