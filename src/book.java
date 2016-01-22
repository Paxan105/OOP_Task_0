import java.util.Arrays;

/**
 * Created by Pasha on 14.01.2016.
 */
public class book {

    private int id;

    private String name;

    private String[] autor;

    private String publisher;

    private int year;

    private int pages;

    private int price;

    private String cover;

    public book(){
        this.id = 0;
        this.name = "";
        this.autor = new String[0];
        this.publisher = "";
        this.year = 0;
        this.pages = 0;
        this.price = 0;
        this.cover = "";
    }

    public book(int id,String name, String[] autor, String publisher, int year, int pages, int price, String cover) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.cover = cover;
    }

    void setId(int id){
        this.id = id;
    }

    int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void setAutor(String[] autor){
        this.autor = autor;
    }

    String[] getAutor(){
        return autor;
    }

    void setPublisher(String publisher){
        this.publisher = publisher;
    }

    String getPublisher(){
        return publisher;
    }

    void setYear(int year){
        this.year = year;
    }

    int getYear(){
        return year;
    }

    void setPages(int pages){
        if(pages>0) {
            this.pages = pages;
        } else System.out.println("Количестов не может быть меньше 1!");
    }

    int getPages(){
        return pages;
    }

    void setPrice(int price){
        if(price>0) {
            this.price = price;
        } else System.out.println("Цена неможет быть отрицательной и нулевой!");
    }

    int getPrice(){
        return price;
    }

    void setCover(String cover){
        this.cover = cover;
    }

    String getCover(){
        return cover;
    }

    @Override
    public String toString() {
        return "Книга --- " +
                "id=" + id +
                ", Название=" + name +
                ", Автор(ы)=" + Arrays.toString(autor) +
                ", Издатель=" + publisher +
                ", Год издания=" + year +
                ", Количество страниц=" + pages +
                ", Цена=" + price +
                ", Переплет=" + cover;
    }
}
