import java.util.Scanner;
  public class IT24610825Lab3Q1 {
     public static void main(String[] args) {
              double priceof1kgrice;
              double numberofkgwanttobuy;
              double amountyouhavetopay;

          Scanner sc = new Scanner(System.in);

              System.out.println("price of 1kg of rice:");
                priceof1kgrice= sc.nextDouble();

              System.out.println("number of kg want to buy:");
                numberofkgwanttobuy= sc.nextDouble();

        amountyouhavetopay = priceof1kgrice*numberofkgwanttobuy;
       
         System.out.println("Amount you have to pay:" +amountyouhavetopay);
    }
}



     