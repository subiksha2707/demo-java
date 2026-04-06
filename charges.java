import java.util.Scanner;

public class charges {
    public static void main(String[] args) {
    	 System.out.println("Enter the unit:");
        Scanner s = new Scanner(System.in);
        int unitcharges = s.nextInt();
       
        if(unitcharges >= 0 && unitcharges <=100) {
            System.out.println(0);
        }
        else if(unitcharges >= 101 && unitcharges <=200){
            System.out.println(unitcharges * 0.8);
        }
        else if(unitcharges >= 201 && unitcharges <= 300) {
            System.out.println(unitcharges * 1.5);
        }
        else {
            System.out.println(unitcharges * 3);
        }
    }
}


