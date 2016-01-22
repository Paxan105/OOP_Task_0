/**
 * Created by Pasha on 17.01.2016.
 */
public class Customer {

    private int id;

    private String name;

    private String surname;

    private String middle_name;

    private String address;

    private int credit_card_number;

    private int bank_account_number;


    public Customer() {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.middle_name = "";
        this.address = "";
        this.credit_card_number = 0;
        this.bank_account_number = 0;
    }

    public Customer(int id, String name, String middle_name, String surname, String address, int credit_card_number, int bank_account_number) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middle_name = middle_name;
        this.address = address;
        this.credit_card_number = credit_card_number;
        this.bank_account_number = bank_account_number;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBank_account_number() {
        return bank_account_number;
    }

    public void setBank_account_number(int bank_account_number) {
        if(bank_account_number>0) {
            this.bank_account_number = bank_account_number;
        } else System.out.println("Номер банковского счета не может быть отрицательным или нулевым!");
    }

    public int getCredit_card_number() {
        return credit_card_number;
    }

    public void setCredit_card_number(int credit_card_number) {
        if(credit_card_number>0) {
            this.credit_card_number = credit_card_number;
        } else System.out.println("Номер кредитной карты не может быть отрицательным или нулевым!");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Покупатель --- "+
                "id=" + id +
                ", Фамилия=" + surname +
                ", Имя=" + name  +
                ", Отчество='" + middle_name +
                ", Адрес=" + address +
                ", Номер кредитной карты=" + credit_card_number +
                ", Номер банкоского счета=" + bank_account_number ;
    }
}
