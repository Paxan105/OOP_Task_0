/**
 * Created by Pasha on 17.01.2016.
 */
public class House {

    private int id;

    private int number_of_apartment;

    private int area;

    private int floor;

    private int number_of_rooms;

    private String street;

    private String type_of_building;

    private int life_of_building;

    House(){
        this.id = 0;
        this.life_of_building = 0;
        this.type_of_building = "";
        this.street = "";
        this.number_of_rooms = 0;
        this.area = 0;
        this.floor = 0;
        this.number_of_apartment = 0;
    }

    public House(int id, int number_of_apartment, int area,int floor, int number_of_rooms, String street, String type_of_building, int life_of_building) {
        this.id = id;
        this.life_of_building = life_of_building;
        this.type_of_building = type_of_building;
        this.street = street;
        this.number_of_rooms = number_of_rooms;
        this.area = area;
        this.floor = floor;
        this.number_of_apartment = number_of_apartment;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber_of_apartment() {
        return number_of_apartment;
    }

    public void setNumber_of_apartment(int number_of_apartment) {
        if(number_of_apartment>0) {
            this.number_of_apartment = number_of_apartment;
        } else System.out.println("Номер квартиры не может быть отрицательным или нулевым!");
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if(area>0){
        this.area = area;
        }else System.out.println("Площадь не может быть отрицательной или нулевой!");
    }

    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setNumber_of_rooms(int number_of_rooms) {
        if(number_of_rooms>0) {
            this.number_of_rooms = number_of_rooms;
        } else System.out.println("Количество комнат не может быть отрицательным или нулевым!");
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getType_of_building() {
        return type_of_building;
    }

    public void setType_of_building(String type_of_building) {
        this.type_of_building = type_of_building;
    }

    public int getLife_of_building() {
        return life_of_building;
    }

    public void setLife_of_building(int life_of_building) {
        if(life_of_building>0) {
            this.life_of_building = life_of_building;
        }else System.out.println("Срок эксплуатации не может быть отрицательным или нулевым!");
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if(floor>0) {
            this.floor = floor;
        } else System.out.println("Этаж не может быть отрицательным или нулевым!");
    }

    @Override
    public String toString() {
        return "Дом --- " +
                "id=" + id +
                ", Номер квартиры=" + number_of_apartment +
                ", Площадь=" + area +
                ", Этаж=" + floor +
                ", Количество комнат=" + number_of_rooms +
                ", Улица='" + street  +
                ", Тип здания='" + type_of_building  +
                ", Срок эксплуатации=" + life_of_building;
    }
}
