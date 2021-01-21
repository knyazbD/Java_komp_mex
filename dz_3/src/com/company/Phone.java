package com.company;

public class Phone {

    int id;
    String surname;
    String name;
    String patronymic;
    String adress;
    int telnumber;
    int creditcard;
    int debit;
    int kredit;
    int time_;
    public Phone(int id, String surname, String name, String patronymic, String adress, int telnumber, int creditcard, int debit, int kredit, int time )
    {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.telnumber = telnumber;
        this.creditcard = creditcard;
        this.debit = debit;
        this.kredit =kredit;
        this.time_ = time_;
    }
    public int getId() { return id; }

    public void setId(int id)
    {
        this.id = id;
    }
    public String getSurname() { return surname; }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getName() {return name;}

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPatronymic() {return patronymic;}

    public void setPatronymic(String patronymic)
    {
        this.patronymic = patronymic;
    }

    public String getAdress() {return adress;}

    public void setAdress(String adress)
    {
        this.adress = adress;
    }

    public int getTelnumber() { return telnumber; }

    public void setTelnumber(int telnumber)
    {
        this.telnumber = telnumber;
    }

    public int getCreditcard() { return creditcard; }

    public void setCreditcard(int creditcard)
    {
        this.creditcard = creditcard;
    }

    public int getDiagnosis() {return debit;}

    public void setDiagnosis(int debit) {
        this.debit = debit;
    }
    public int getDiagnosis() {return kredit;}

    public void setDiagnosis(int kredit) {
        this.kredit = kredit;
    }
    public int getDiagnosis() {return time_;}

    public void setDiagnosis(int time_) {
        this.time_ = time_;
    }

}
