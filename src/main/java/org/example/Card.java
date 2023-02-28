package org.example;

class Card {
    String name;
    int  no1;
    String date;
    Card(String name,int no1,String date){
        this.name=name;
        this.date=date;
        this.no1=no1;
    }
    public boolean equalling(int no2){
        String no4=String.valueOf(no2);
        String no3=String.valueOf(no1);
        return no3.equals(no4);
    }
    public Card cloneexample()  {
        try {
            return (Card) super.clone();
        }catch (Exception ex){
            return this;
        }

    }
}
