/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojectuas;

/**
 *
 * @author satri
 */
public class printTable {
    public static void printTable(String[][] data) {
        // Calculate column widths
        int[] columnWidths = new int[data[0].length];
        for (String[] row : data) {
            for (int i = 0; i < row.length; i++) {
                if (row[i].length() > columnWidths[i]) {
                    columnWidths[i] = row[i].length();
                }
            }
        }
        
        // Print table headers
        for (int i = 0; i < data[0].length; i++) {
            System.out.printf("%-" + (columnWidths[i] + 2) + "s", data[0][i]);
        }
        System.out.println();
        
        // Print table data
        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-" + (columnWidths[j] + 2) + "s", data[i][j]);
            }
            System.out.println();
        }
    }
}
