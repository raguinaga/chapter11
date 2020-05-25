package chapter11;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String file = "SalesData.txt";
        int months = 0;
        double oneMonth ;
        double totalSales = 0;
        double averageSales;

        Scanner inputFile = BadFileDemo.openFile(file);

        while (inputFile == null) {
            file = JOptionPane.showInputDialog("Error: "+
                    file + " does not exist.\n Enter another file name: ");
            inputFile = BadFileDemo.openFile(file);
        }
        while (inputFile.hasNext()) {
            try {
                // Get a month's sales amount
                oneMonth = inputFile.nextDouble();

                // Sum up all monthly sales
                totalSales += oneMonth;

                //Increment the months counter
                months++;
            } catch (Exception e){
                // Display an error message
                JOptionPane.showMessageDialog(null,
                        "Non-numeric data found in the file.\n" +
                "The invalid record will be skipped");
                // Skip past the invalid data
                inputFile.nextLine();
            }
        }
        // Close the file and scanner
        inputFile.close();

        averageSales = totalSales / months;

        //Display the resutls
        JOptionPane.showMessageDialog(null,
                String.format("Number of months: %d\n"+
                        "Total sales: $%.2f\n" +
                        "Average sales: $%.2f\n",
                        months, totalSales, averageSales));

        System.exit(0);
    }
}
