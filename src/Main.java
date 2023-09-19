import java.math.RoundingMode; // needed for decimals to be properly rounded
import java.text.DecimalFormat; // used to round decimals to 2 decimal places
import java.util.Scanner;
public class Main {
   //rounding will be done to 2 decimal places in all cases where df.format is used
   private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        // Input Values
       System.out.print("How much is your bill? ");
       String billStr = s.nextLine();
       System.out.print("what percent will you be paying in tips? (as a whole number) ");
       String tipStr = s.nextLine();
       System.out.print("how large is your party? ");
       String partyStr = s.nextLine();
       // Changing Data Types for inputs
       double bill = Double.parseDouble(df.format(Double.parseDouble(billStr)));
       int tipPercent = Integer.parseInt(tipStr);
       int numOfPeople = Integer.parseInt(partyStr);
       // Calculated Values
       // df.format returns string value
       String tips = df.format(bill * (tipPercent/100.0));
       String tippedBill = df.format(bill + Double.parseDouble(tips));
       String tipPerPerson = df.format(Double.parseDouble(tips) / numOfPeople);
       String billPerPerson = df.format(Double.parseDouble(tippedBill)/numOfPeople);
       // Output
       System.out.println("For a party of " + numOfPeople + " billed $" + bill + ", paying " + tipPercent + "% of tips, the party will pay $" + tippedBill + ", $" + tips + " of which are tips.\nEach person will be paying $" + billPerPerson + ", $" + tipPerPerson + " of which are tips."  );
    }
}