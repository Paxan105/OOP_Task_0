/**
 * Created by Pasha on 14.01.2016.
 */
public class Patient {

    private int id;

    private String name;

    private String surname;

    private String middle_name;

    private String address;

    private String phone_number;

    private int med_card;

    private String diagnosis;

    public Patient(){
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.middle_name = "";
        this.address = "";
        this.med_card = 0;
        this.phone_number = "";
        this.diagnosis = "";
    }

    public Patient(int id, String name, String middle_name, String surname,String address, String phone_number, int med_card, String diagnosis) {
            this.id = id;
        this.name = name;
        this.surname = surname;
        this.middle_name = middle_name;
        this.address = address;
        this.med_card = med_card;
        this.phone_number = phone_number;
        this.diagnosis = diagnosis;
    }

    void setId(int id){
        this.id = id;
    }

    int getId(){
        return id;
    }

    void setName(String name){
        this.name =name;
    }

    String getName(){
        return name;
    }

    void setSurname(String surname){
        this.surname = surname;
    }

    String getSurname(){
        return surname;
    }

    void setMiddle_name(String middle_name){
        this.middle_name = middle_name;
    }

    String getMiddle_name(){
        return middle_name;
    }

    void setAddress(String address){
        this.address =address;
    }

    String getAddress(){
        return address;
    }

    void setPhone_number(String phone_number){
        this.phone_number =phone_number;
    }

    String getPhone_number(){
        return phone_number;
    }

    void setMed_card(int med_card){
        if(med_card>0) {
            this.med_card = med_card;
        } else System.out.println("Номер медицинской карты не может быть отрицательным или нулевым!");
    }

    int getMed_card(){
        return med_card;
    }

    void setDiagnosis(String diagnosis){
        this.diagnosis =diagnosis;
    }

    String getDiagnosis(){
        return diagnosis;
    }

    @Override
    public String toString() {
        return "Пациент --- " +
                "id=" + id +
                ", Фамилия='" + surname +
                ", Имя=" + name  +
                ", Отчество=" + middle_name +
                ", Адрес='" + address +
                ", Номер телефона='" + phone_number +
                ", Номер медицинской карты=" + med_card +
                ", Диагноз='" + diagnosis;
    }
}
