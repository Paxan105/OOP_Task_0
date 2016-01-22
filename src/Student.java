import java.util.Date;

/**
 * Created by Pasha on 12.01.2016.
 */
public class Student {

    private int id;

    private String name;

    private String surname;

    private String middle_name;

    private int birthday;

    private int month_of_birth;

    private int year_of_birth;

    private String address;

    private String phone_number;

    private String faculty;

    private int course;

    private String group;

    public Student(){
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.middle_name = "";
        this.birthday = 0;
        this.month_of_birth = 0;
        this.year_of_birth = 0;
        this.address = "";
        this.phone_number = "";
        this.faculty = "";
        this.course = 1;
        this.group = "";
    }

    public Student(int id, String name, String middle_name, String surname, int birthday, int month_of_birth, int year_of_birth, String address, String phone_number, String faculty, int course, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middle_name = middle_name;
        this.birthday = birthday;
        this.month_of_birth = month_of_birth;
        this.year_of_birth = year_of_birth;
        this.address = address;
        this.phone_number = phone_number;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    void setId(int id){
        this.id =id;
    }

    int getId(){
        return id;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setSurname(String surname){
        this.surname = surname;
    }

    String getSurname(){
        return  surname;
    }

    void setMiddle_name(String middle_name){
        this.middle_name = middle_name;
    }

    String getMiddle_name(){
        return middle_name;
    }

    void setBirthday(int birthday){
        if(birthday>0 && birthday<=31) {
            this.birthday = birthday;
        } else System.out.println("Введено не верное число!!");
    }

    int getBirthday(){
        return birthday;
    }

    public int getMonth_of_birth() {
        return month_of_birth;
    }

    public void setMonth_of_birth(int month_of_birth) {
        if(month_of_birth>0 && month_of_birth<=12) {
            this.month_of_birth = month_of_birth;
        }else System.out.println("Введено не верный месяц!!");
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        if(year_of_birth>0) {
            this.year_of_birth = year_of_birth;
        }else System.out.println("Год рождения не может быть отрицательным или нулевым!!");
    }

    void setAddress(String address){
        this.address = address;
    }

    String getAddress(){
        return address;
    }

    void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }

    String getPhone_number(){
        return phone_number;
    }

    void setFaculty(String faculty){
        this.faculty = faculty;
    }

    String getFaculty(){
        return faculty;
    }

    void setCourse(int course){
        if(course>0 && course<=6) {
            this.course = course;
        }else System.out.println("Курс введен не верно!!");
    }

    int getCourse(){
        return course;
    }

    void setGroup(String group){
        this.group =group;
    }

    String getGroup(){
        return group;
    }

    @Override
    public String toString() {
        return  "Іd=" + id +
                ", Фамилия=" + surname +
                ", Имя=" + name +
                ", Отчество=" + middle_name  +
                ", Дата рождение=" + birthday +
                "." + month_of_birth +
                "." + year_of_birth +
                ", Адрес=" + address  +
                ", Номер телефона=" + phone_number  +
                ", Факультет=" + faculty  +
                ", Курс=" + course +
                ", Група=" + group;
    }
}
