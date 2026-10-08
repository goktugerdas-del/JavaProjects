
package scannercomand;

import java.util.Scanner;//Call library under package name.

public class ScannerComand {

    public static void main(String[] args) {
    
        //Create scanner object to get input from keybord.
        Scanner scanner = new Scanner(System.in);
        
        //Reading String.
        System.out.print("Enter Student's name-->");
        String Student = scanner.nextLine();
        
        //Reading Int.
        System.out.print("Enter Student's age-->");
        int Age = scanner.nextInt();
        
         //Reading Double.
        System.out.print("Enter Student's GPA-->");
        double userName = scanner.nextDouble();
        
    }
    
}
