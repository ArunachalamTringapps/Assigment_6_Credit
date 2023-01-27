package org.example;
import java.util.*;
import java.util.logging.*;
class Card implements Cloneable{
    String name;
    String  no1;
    String date;
    Card(String name,String no1,String date){
     this.name=name;
     this.date=date;
     this.no1=no1;
    }
    public boolean equalling(String no2){
        return no1.equals(no2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Credit {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc=new Scanner(System.in);
        Logger l=Logger.getLogger("com.api.jar");
        l.info("welcome guys");
        l.info("Enter the cardholders name: ");
        String name=sc.nextLine();
        l.info("Enter the card number:");
        String no1=sc.nextLine();
        l.info("Enter the card Expiration date:");
        String date=sc.nextLine();
        Card c1=new Card(name,no1,date);
        l.info("Enter the card number to check given card number is available:");
        String no2=sc.nextLine();
        Card c2=(Card) c1.clone();
        l.log(Level.INFO, () -> "The result is: " +c2.equalling(no2));
    }
}