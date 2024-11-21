 public class IT24610825Lab3Q1 { 

     public static void main(String[] args) { 

              double priceof1kgrice; 

              double numberofkgwanttobuy; 

              double amountyouhavetopay; 

             

              double discountamount; 

              double finalamountyouhavetopay; 

 

          Scanner sc = new Scanner(System.in); 

 

              System.out.println("price of 1kg of rice:"); 

                priceof1kgrice= sc.nextDouble(); 

 

              System.out.println("number of kg want to buy:"); 

                numberofkgwanttobuy= sc.nextDouble(); 

 

              amountyouhavetopay = priceof1kgrice*numberofkgwanttobuy; 

        

              System.out.println("Amount you have to pay:" +amountyouhavetopay); 

               

              doublediscount=(10/100); 

              discountamount=amountyouhavetopay*discount; 

              System.out.println("Discount amount:" +discountamount); 

               

 

  

               

             finalamountyouhavetopay=amountyouhavetopay-discountamount; 

              System.out.println("Final amount you have to pay:" +finalamountyouhavetopay);       

              

 

    } 

} 