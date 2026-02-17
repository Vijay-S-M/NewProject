package Practice;

import java.io.File;
import java.util.Scanner;

public class CSVFileHandling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Customer.csv"));
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = null;
                line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
    }
}
