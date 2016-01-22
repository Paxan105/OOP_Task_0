/**
 * Created by Pasha on 20.01.2016.
 */
public class Phone {

    private int id;

    private String name;

    private String middle_name;

    private String surname;

    private String address;

    private int credit_card_number;

    private int debit;

    private int credit;

    private int time_town_calls;

    private int time_long_distance_calls;

    public Phone() {   this.id = id;
        this.name = "";
        this.middle_name = "";
        this.surname = "";
        this.address = "";
        this.credit_card_number = 0;
        this.debit = 0;
        this.credit = 0;
        this.time_town_calls = 0;
        this.time_long_distance_calls = 0;

    }

    public Phone(int id, String name, String middle_name, String surname, String address, int credit_card_number, int debit, int credit, int time_town_calls, int time_long_distance_calls) {
        this.id = id;
        this.name = name;
        this.middle_name = middle_name;
        this.surname = surname;
        this.address = address;
        this.credit_card_number = credit_card_number;
        this.debit = debit;
        this.credit = credit;
        this.time_town_calls = time_town_calls;
        this.time_long_distance_calls = time_long_distance_calls;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCredit_card_number() {
        return credit_card_number;
    }

    public void setCredit_card_number(int credit_card_number) {
        if(credit_card_number>0) {
            this.credit_card_number = credit_card_number;
        } else System.out.println("Номер кредитной карты не может быть отрицательным или нулевым!");
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        if(debit>=0) {
            this.debit = debit;
        } else System.out.println("Дебат не может быть отрицательным!");
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        if(credit>=0) {
            this.credit = credit;
        } else System.out.println("Кредит не может быть отрицательным!");
    }

    public int getTime_town_calls() {
        return time_town_calls;
    }

    public void setTime_town_calls(int time_town_calls) {
        if (time_town_calls>=0) {
            this.time_town_calls = time_town_calls;
        } else System.out.println("Время городских разговоров не может быть отрицательным!");
    }

    public int getTime_long_distance_calls() {
        return time_long_distance_calls;
    }

    public void setTime_long_distance_calls(int time_long_distance_calls) {
        if (time_long_distance_calls>=0) {
            this.time_long_distance_calls = time_long_distance_calls;
        }else System.out.println("Время межгородских разговоров не может быть отрицательным или нулевым!");
    }


    @Override
    public String toString() {
        return "Телефон --- " +
                "id=" + id +
                ", Фамилия=" + surname +
                ", Имя=" + name +
                ", Отчество=" + middle_name +
                ", Адрес=" + address  +
                ", Номер кредитной карты=" + credit_card_number +
                ", Дебет=" + debit +
                ", Кредит=" + credit +
                ", Время городских разговоров=" + time_town_calls +
                ", Время междугородских разговоров=" + time_long_distance_calls;
    }
}
