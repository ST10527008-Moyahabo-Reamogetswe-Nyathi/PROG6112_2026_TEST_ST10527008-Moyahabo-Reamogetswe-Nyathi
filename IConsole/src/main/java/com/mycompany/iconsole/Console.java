package com.mycompany.iconsole;

public class Console implements IConsole
{
    private String ConsoleType;
    private String getStore;
   private int TotalSales;
   
   public Console(String ConsoleType, String getStore, int TotalSales)
   {
       this.ConsoleType = ConsoleType;
       this.TotalSales = TotalSales;
       this.getStore = getStore;
   }
    @Override public String getConsoleType() { return ConsoleType; }
 @Override public String getTotalSlaes() { return TotalSales; }
 @Override public int getgetStore() { return getStore; }
}
public class ConsoleSales extends Console {
 public ConsoleSales(String ConsoleType, String TotalSales, int getStore) {
 super(ConsoleType, TotalSales, getStore);
 }
 public void printConsoleSales() {
 System.out.println("ConsoleSales");
 System.out.println(getConsoleType() + " - " + getTotalSales() + ": " + getgetStore());
 }
}
    

