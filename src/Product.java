/**
 * Created by Pasha on 19.01.2016.
 */
public class Product {

    private int id;

    private String name;

    private int UPC;

    private String manufacturer;

    private double price;

    private int shelf_life;

    private int number;


    public Product(){
        this.id = 0;
        this.name = "";
        this.UPC = 0;
        this.manufacturer = "";
        this.price = 0;
        this.shelf_life = 0;
        this.number = 0;
    }

    public Product(int id, String name, int UPC, String manufacturer, double price, int shelf_life, int number) {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelf_life = shelf_life;
        this.number = number;
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

    public int getUPC() {
        return UPC;
    }

    public void setUPC(int UPC) {
        if(UPC>0) {
            this.UPC = UPC;
        } else System.out.println("UPC не может быть отрицательным или нулевым!!");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0) {
            this.price = price;
        } else System.out.println("Цена не может быть отрицательной или нулевой!!");
    }

    public int getShelf_life() {
        return shelf_life;
    }

    public void setShelf_life(int shelf_life) {
        if(shelf_life>0) {
            this.shelf_life = shelf_life;
        } else System.out.println("Срок хранения не может быть отрицательным или нулевым!!");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number>0) {
            this.number = number;
        } else System.out.println("Количество товара не может быть отрицательным или нулевым!!");
    }

    @Override
    public String toString() {
        return "Продукт --- " +
                "id=" + id +
                ", Имя=" + name +
                ", UPC=" + UPC +
                ", Производитель=" + manufacturer  +
                ", Цена=" + price +
                ", Срок годности=" + shelf_life +
                ", Количество=" + number;
    }
}
