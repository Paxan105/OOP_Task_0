/**
 * Created by Pasha on 19.01.2016.
 */
public class Bus {

    private String driver;

    private int number_bus;

    private int route_number;

    private String mark;

    private int year_operation;

    private int mileage;

    public Bus(){
        this.driver = "";
        this.number_bus = 0;
        this.route_number = 0;
        this.mark = "";
        this.year_operation = 0;
        this.mileage = 0;
    }

    public Bus(String driver, int number_bus, int route_number, String mark, int year_operation, int mileage) {
        this.driver = driver;
        this.number_bus = number_bus;
        this.route_number = route_number;
        this.mark = mark;
        this.year_operation = year_operation;
        this.mileage = mileage;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String surname) {
        this.driver = surname;
    }

    public int getNumber_bus() {
        return number_bus;
    }

    public void setNumber_bus(int number_bus) {
        this.number_bus = number_bus;
    }

    public int getRoute_number() {
        return route_number;
    }

    public void setRoute_number(int route_number) {
        if(route_number>0) {
            this.route_number = route_number;
        } else System.out.println("Номер маршрута не может быть отрицательным или нулевым!");
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear_operation() {
        return year_operation;
    }

    public void setYear_operation(int year_operation) {
        if(year_operation>0) {
            this.year_operation = year_operation;
        } else  System.out.println("Год начала эксплуатации не может быть отрицательным или нулевым!");
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if(mileage>=0) {
            this.mileage = mileage;
        } else  System.out.println("Пробег не может быть отрицательным!");
    }

    @Override
    public String toString() {
        return "Автобус --- " +
                "Водитель=" + driver +
                ", Номер автобуса=" + number_bus +
                ", Номер маршрута=" + route_number +
                ", Марка=" + mark +
                ", Год начала эксплуатации=" + year_operation +
                ", Пробег=" + mileage;
    }
}
