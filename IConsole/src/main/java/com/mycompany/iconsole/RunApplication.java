import com.mycompany.iconsole.ConsoleSales;
import java.util.Scanner;
public class RunApplication {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter ConsoleType: ");
 String a = input.nextLine();
 System.out.print("Enter TotalSales: ");
 String b = input.nextLine();
 System.out.print("Enter getStore: ");
 int c = input.nextInt();
ConsoleSales report = new ConsoleSales(a, b, c);
 report.printConsoleSales();

 