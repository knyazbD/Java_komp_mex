package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void e1_7(){
        Phone[] pers = new Phone[];
        Phone dany = new Phone();
        dany.id = 1324356;
        dany.surname = "dfds";
        dany.name = "dany";
        dany.adress = "adrs";
        dany.telnumber = 456;
        dany.creditcard = 456;
        dany.debit = 456;
        dany.kredit = 456;
        dany.time_ = 456;
        pers[0] = dany;

        for(Phone i: pers){
            if(i.kredit != 0){
                i.getId();
                i.getSurname();
                i.getName();
                i.getAdress();
                i.getTelnumber();
                i.getCreditcard();
            }
        }
        for(Phone i: pers){
            if(i.time_ != 0){
                i.getId();
                i.getSurname();
                i.getName();
                i.getAdress();
                i.getTelnumber();
                i.getCreditcard();}
        }
    }
    public static void e2_7{
        Triangle[] t = new Triangle[];
        Triangle ABC = new Triangle();
        ABC.a = 5;
        ABC.b = 5;
        ABC.c = 5;
        ABC.q1 = 5;
        ABC.q2 = 5;
        ABC.q3 = 5;
        t[0]= ABC;



    }
}
