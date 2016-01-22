/**
 * Created by Pasha on 19.01.2016.
 */
public class Airline {

    private String destination;

    private int flight_number;

    private String type_plane;

    private double time;

    private String day;

    public Airline(){
        this.destination = "";
        this.flight_number = 0;
        this.type_plane = "";
        this.time = 0;
        this.day = "";}

    public Airline(String destination, int flight_number, String type_plane, double time, String day) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.type_plane = type_plane;
        this.time = time;
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        if(flight_number>0) {
            this.flight_number = flight_number;
        } else System.out.println("Номер авиарейса немот быто меньше 1!");
    }

    public String getType_plane() {
        return type_plane;
    }

    public void setType_plane(String type_plane) {
        this.type_plane = type_plane;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        if(time>=0 && time<23.59) {
            this.time = time;
        } else System.out.println("Введено не правельное время!");
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Авиарейс --- " +
                "Пункт назначения=" + destination+
                ", Номер рейса=" + flight_number +
                ", Тип самолета=" + type_plane +
                ", Время полета=" + time +
                ", День недели=" + day;
    }
}
