/**
 * Created by Pasha on 19.01.2016.
 */
public class Train {

    private String destination;

    private int number_of_train;

    private double departure_time;

    private int number_of_seats_in_coupe;               /////Купе

    private int number_of_seats_in_reserved_seats;      /////Плацкарт

    private int number_of_seats_in_suite;               //////Люкс

    private int number_of_common_seats;                 /////Общие места

    public Train(){
        this.destination = "";
        this.number_of_train = 0;
        this.departure_time = 0;
        this.number_of_seats_in_coupe = 0;
        this.number_of_seats_in_reserved_seats = 0;
        this.number_of_seats_in_suite = 0;
        this.number_of_common_seats = 0;}

    public Train(String destination, int number_of_train, double departure_time, int number_of_seats_in_coupe, int number_of_seats_in_reserved_seats, int number_of_seats_in_suite, int number_of_common_seats) {
        this.destination = destination;
        this.number_of_train = number_of_train;
        this.departure_time = departure_time;
        this.number_of_seats_in_coupe = number_of_seats_in_coupe;
        this.number_of_seats_in_reserved_seats = number_of_seats_in_reserved_seats;
        this.number_of_seats_in_suite = number_of_seats_in_suite;
        this.number_of_common_seats = number_of_common_seats;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber_of_train() {
        return number_of_train;
    }

    public void setNumber_of_train(int number_of_train) {
        if(number_of_train>0) {
            this.number_of_train = number_of_train;
        }else System.out.println("Номер поезда не может быть отрицательным или нулевым!!");
    }

    public double getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(double departure_time) {
        if (departure_time>=0 && departure_time<23.59)
        this.departure_time = departure_time;
        else System.out.println("Не правельно указано время!");
    }

    public int getNumber_of_seats_in_coupe() {
        return number_of_seats_in_coupe;
    }

    public void setNumber_of_seats_in_coupe(int number_of_seats_in_coupe) {
        if(number_of_seats_in_coupe>=0) {
            this.number_of_seats_in_coupe = number_of_seats_in_coupe;
        }else System.out.println("Количество мест в купе не может быть отрицательным!!");
    }

    public int getNumber_of_seats_in_reserved_seats() {
        return number_of_seats_in_reserved_seats;
    }

    public void setNumber_of_seats_in_reserved_seats(int number_of_seats_in_reserved_seats) {
        if(number_of_seats_in_reserved_seats>=0) {
            this.number_of_seats_in_reserved_seats = number_of_seats_in_reserved_seats;
        }else System.out.println("Количество мест плацкарт  не может быть отрицательным!!");
    }

    public int getNumber_of_seats_in_suite() {
        return number_of_seats_in_suite;
    }

    public void setNumber_of_seats_in_suite(int number_of_seats_in_suite) {
        if (number_of_seats_in_suite>=0) {
            this.number_of_seats_in_suite = number_of_seats_in_suite;
        } else System.out.println("Количество мест люкс  не может быть отрицательным!!");
    }

    public int getNumber_of_common_seats() {
        return number_of_common_seats;
    }

    public void setNumber_of_common_seats(int number_of_common_seats) {
        if(number_of_common_seats>=0) {
            this.number_of_common_seats = number_of_common_seats;
        }else System.out.println("Количество общих мест не может быть отрицательным!!");
    }

    @Override
    public String toString() {
        return "Поезд --- " +
                "Пункт назначния=" + destination +
                ", Номер поезда=" + number_of_train +
                ", Время отравления=" + departure_time +
                ", Количество мест в купе=" + number_of_seats_in_coupe +
                ", Количество мест в плацкарте=" + number_of_seats_in_reserved_seats +
                ", Количество мест в люксе=" + number_of_seats_in_suite +
                ", Количество общих мест  =" + number_of_common_seats;
    }
}
