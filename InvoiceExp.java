import java.io.*;
import java.util.Scanner;
class Invoice{
        //Define instance variables here
        private String partNumber;
        private String partDescription;
        private int quantity;
        private double unitPrice;
        
        public Invoice(){}
        //Define parameterized constructor here
        public Invoice(String partNumber,String partDescription,int quantity,double unitPrice){
                 this.partNumber=partNumber;
                 this.partDescription=partDescription;
                 this.quantity=quantity;
                 this.unitPrice=unitPrice;
        
            
        }
        
       // Setters
       public void setPartNumber(String n) {partNumber=n;}
       public void setDescription(String d) {partDescription=d;}
       public void setQuantity(int q) {quantity=q;}
       public void setUnitPrice(double p) {unitPrice=p;}
       // Getters
       public String getPartNumber(){
                 return partNumber;
       }
        
       public String getDescription(){
                 return partDescription;
       }
       public int getQuantity(){
           return quantity;
       }
       public double getUnitPrice(){
           return unitPrice;
       }
        
       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                if (quantity<0){quantity=0;}
                if(unitPrice<0){unitPrice=0.0;}
                invoiceAmount=quantity*unitPrice;
                return invoiceAmount;
       }
}
public class InvoiceExp{
        public static void main(String []args){
                   Invoice myInvoice=new Invoice("1","key board",20,210.00);
                   myInvoice.setPartNumber("1");
                   myInvoice.setDescription("key board");
                   myInvoice.setQuantity(20);
                   myInvoice.setUnitPrice(210);
                   System.out.println(myInvoice.getInvoiceAmount());
                   //Write your code here              
         }
}
