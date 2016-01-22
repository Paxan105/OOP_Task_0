import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Какой пример запусить?");
        System.out.println("1) Student");
        System.out.println("2) Customer");
        System.out.println("3) Patient");
        System.out.println("4) Abiturient");
        System.out.println("5) Book");
        System.out.println("6) House");
        System.out.println("7) Phone");
        System.out.println("8) Car");
        System.out.println("9) Product");
        System.out.println("10) Train");
        System.out.println("11) Bus");
        System.out.println("12) Airline");
        System.out.println();
        System.out.print("Введите номер примера: ");

        int n = scanner.nextInt();


        switch (n){
            case 1:                                             ////////////////++++++++++++

               // Student[] stud_list=stu();                ////// автозаполнение
                Student[] stud_list=students_list();        ///// ручное заполнение
                System.out.println("-------------a)Вывести список студентов заданного факультета.");
                System.out.print("Введите факультет: ");
                faculty(stud_list,scanner.next());

                System.out.println("----------b)Вывести списки студентов для каждого факультета и курса.");
                student_check_faculty_and_cours(stud_list);

                System.out.println("----------c)Вывести список студентов, родившихся после заданного года.");
                System.out.print("Введите год: ");
                year(stud_list,scanner.nextInt());

                System.out.println("----------d)Вывести список учебной группы:");
                System.out.print("Введите группу: ");
                list_group(stud_list,scanner.next());
                break;
            case 2:                                  ////////////////++++++++++++
                Customer[] customers_list = customers_list();   ///// ручное заполнение
                //Customer[] customers_list = cust();         ////// автозаполнение
                System.out.println("----------a)Вывести список покупателей в алфавитном порядке.");
                customer_buyers_list(customers_list);

                System.out.println("----------b)Вывести список покупателей, у которых номер кредитной карточки находится в заданном интервале.");
                System.out.print("Введите интервал дя поиска номера кредитной кврты \n От: ");
                int n1=scanner.nextInt();
                System.out.print(" До: ");
                customer_check_credit_card(customers_list,n1,scanner.nextInt());
                break;
            case 3:                                  ////////////////++++++++++++
                Patient[] patients_list = patients_list();      ///// ручное заполнение
                //Patient[] patients_list = pat();          ////// автозаполнение
                System.out.print("----------а)Введите диагноз для поиска пациентов: ");
                String diagnosis= scanner.next();
                check_diagnosis(patients_list,diagnosis);
                System.out.println("----------b)Введите диапазон для поиска по номеру мед. карты");
                System.out.print("От ");
                int a = scanner.nextInt();
                System.out.print("До ");
                int b = scanner.nextInt();
                check_med_card(patients_list,a,b);
                break;
            case 4:                                  ////////////////++++++++++++
                Abiturient[] abiturients_list = abiturients_list();           ///// ручное заполнение
               // Abiturient[] abiturients_list=abit();                      ////// автозаполнение
                System.out.println("----------a)Вывести список абитуриентов, имеющих неудовлетворительные оценки.(2 и 1)");
                abiturient_check_bad_evaluation(abiturients_list);

                System.out.println("----------b)Вывести список абитуриентов, у которых сумма баллов выше заданной;");
                System.out.print("Введите сумму балов: ");
                abiturient_check_evaluation_sum(abiturients_list,scanner.nextInt());

                System.out.println("");

                System.out.println("----------c)Выбрать заданное число n-абитуриентов, имеющих самую высокую сумму баллов (вывести также полный список абитуриентов, имеющих полупроходную сумму).");
                System.out.print("Введите число абитуриентов(n): ");
                n = scanner.nextInt();
                System.out.print("Введите полупроходную сумму: ");
                abiturient_check_evaluation(abiturients_list,n,scanner.nextInt());
                break;
            case 5:                                 ////////////////++++++++++++
                book[] book_list = books();                   ///// ручное заполнение
                //book[] book_list = bo();           ////// автозаполнение
                System.out.println("----------a)Вывести список книг заданного автора;");
                System.out.print("Введите автора: ");
                check_autor(book_list,scanner.next());

                System.out.println("----------b)Вывести список книг, выпущенных заданным издательством;");
                System.out.print("Введите издателя: ");
                check_publisher(book_list,scanner.next());

                System.out.println("----------c)Вывести список книг, выпущенных после заданного года.");
                System.out.print("Введите год: ");
                check_year(book_list,scanner.nextInt());
                break;
            case 6:                                 ////////////////++++++++++++
                House[] houses_list = houses_list();          ///// ручное заполнение
                //House[] houses_list = ho();             ////// автозаполнение
                System.out.println("----------a)Вывести список квартир, имеющих заданное число комнат");
                System.out.print("Введите количество комнат: ");
                int rooms=scanner.nextInt();
                check_rooms(houses_list,rooms);

                System.out.println("----------b)Вывести список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке.");
                System.out.print("Введите количество комнат: ");
                rooms=scanner.nextInt();
                System.out.print("Введите промежуток этажей \n От ");
                int floor_min=scanner.nextInt();
                System.out.print(" До ");
                int floor_max=scanner.nextInt();
                check_rooms_on_floor(houses_list,rooms,floor_min,floor_max);

                System.out.println("----------c)Вывести список квартир, имеющих площадь, превосходящую заданную.");
                System.out.print("Введите площадь: ");
                check_area(houses_list,scanner.nextInt());
                break;
            case 7:                                 ////////////////++++++++++++
                Phone[] phones_list = phones_list();          ///// ручное заполнение
                // Phone[] phones_list = phones();             ////// автозаполнение
                System.out.println("----------a)Вывести сведения об абонентах, у которых время внутригородских разговоров превышает заданное.");
                System.out.print("Введите время внутригородских разговоров: ");
                phone_check_time_town_calls(phones_list,scanner.nextInt());

                System.out.println("----------b)Вывести сведения об абонентах, которые пользовались междугородной связью.");
                phone_check_long_distance_calls(phones_list);

                System.out.println("----------c)Вывести сведения об абонентах в алфавитном порядке.");
                phone_subscribers(phones_list);
                break;
            case 8:                                ////////////////++++++++++++
                Car[] cars_list = cars_list();          ///// ручное заполнение
                //Car[] cars_list = car();             ////// автозаполнение
                System.out.println("----------a)Вывести список автомобилей заданной марки.");
                System.out.print("Введите марку автомобиля: ");
                check_mark(cars_list, scanner.next());

                System.out.println("----------b)Введите список автомобилей заданной модели, которые эксплуатируются больше n лет.");
                System.out.print("Введите модель автомобиля: ");
                String model = scanner.next();
                System.out.print("Введите количетво лет эксплуатации: ");
                check_model(cars_list,model,scanner.nextInt());

                System.out.println("----------c)Вывести список автомобилей заданного года выпуска, цена которых больше указанной.");
                System.out.print("Введите год выпуска: ");
                int year = scanner.nextInt();
                System.out.print("Введите цену: ");
                check_year(cars_list,year,scanner.nextInt());
                break;
            case 9:                                ////////////////++++++++++++
                Product[] products_list = products_list();          ///// ручное заполнение
                //Product[] products_list = prod();             ////// автозаполнение
                System.out.println("----------a)Вывести список товаров для заданного наименования.");
                System.out.print("Введите наименование продукта:");
                String name = scanner.next();
                product_check_name(products_list,name);

                System.out.println("----------b)Вывести список товаров для заданного наименования, цена которых не превосходит заданную.");
                System.out.print("Введите наименование продукта: ");
                name = scanner.next();
                System.out.print("Введите цену: ");
                product_check_name_and_price(products_list,name,scanner.nextInt());

                System.out.println("----------c)Вывести список товаров, срок хранения которых больше заданного.");
                System.out.print("Введите срок хранения: ");
                product_check_shelf_life(products_list,scanner.nextInt());

                break;
            case 10:                                                //////////////////++++++++++++++
                Train[] trains_list=trains_list();          ///// ручное заполнение
               // Train[] trains_list = train();             ////// автозаполнение
                System.out.println("----------a)Вывести список поездов, следующих до заданного пункта назначения.");
                System.out.print("Введите пунк назначения: ");
                name=scanner.next();
                train_check_destination(trains_list,name);

                System.out.println("----------b)Вывести список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа.");
                System.out.print("Введите пунк назначения: ");
                name=scanner.next();
                System.out.print("Введите время отправления: ");
                train_check__destination_and_time(trains_list,name,scanner.nextDouble());

                System.out.println("----------c)Вывести список поездов, отправляющихся до заданного пункта назначения и имеющих общие места.");
                System.out.print("Введите пунк назначения: ");
                name=scanner.next();
                train_check__destination_and_common_seats(trains_list,name);
                break;
            case 11:                                                     /////////////////////////////////++++++++++++++++++++++++++++
                Bus[] buses_list = busese_list();          ///// ручное заполнение
                //Bus[] buses_list = bus();             ////// автозаполнение
                System.out.println("----------a)Вывести список автобусов для заданного номера маршрута.");
                System.out.print("Введите номер маршрута: ");
                bus_check_route(buses_list,scanner.nextInt());

                System.out.println("----------b)Вывести список автобусов, которые эксплуатируются больше заданного срока.");
                System.out.print("Введите срок эксплуатации: ");
                bus_check_year(buses_list,scanner.nextInt());

                System.out.println("----------c)Вывести список автобусов, пробег у которых больше заданного расстояния.");
                System.out.print("Введите пробег: ");
                bus_check_mileage(buses_list,scanner.nextInt());
                break;
            case 12:                                            ///////////////////////+++++++++++++++++
                Airline[] airline_list = airlines_list();
                //Airline[] airline_list = a();
                System.out.println("----------a)Вывести список рейсов для заданного пункта назначения.");
                System.out.print("Введите пунк назначения: ");
                airline_check_destination(airline_list,scanner.next());

                System.out.println("----------b)Вывести список рейсов для заданного дня недели.");
                airline_check_day(airline_list);

                System.out.println("----------c)Вывести список рейсов для заданного дня недели, время вылета для которых больше заданного.");
                airline_check_day_and_time(airline_list);

                break;
            default:
                System.out.println("Введено не верное число!");
                break;
        }

        scanner.close();


    }

    /////////     1      Student

    static Student[] stu(){
        Student mass[] = new Student[3];
        mass[0] = new Student(0,"Иван","Иванич","Иванов",14,12,1962,"Петрова 17","0684512473","Биология",6,"Б-12");
        mass[1] = new Student(1,"Степан","Иванич","Жуков",02,06,1986,"Сумская 16","0964511247","Танкостроение",3,"Т-26");
        mass[2] = new Student(2,"Николай","Петрович","Иванов",16,01,1973,"Пушкаря 2","0665712837","Биология",6,"Б-12");

        return mass;
    }

    static Student[] students_list(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
    Student[] students = new Student[scanner.nextInt()];
        for (int i=0; i<students.length; i++) {
            students[i]=new Student();
            System.out.println();
            System.out.print("Введите id: ");
            students[i].setId(scanner.nextInt());
            System.out.print("Введите имя: ");
            students[i].setName(scanner.next());
            System.out.print("Введите отчество: ");
            students[i].setMiddle_name(scanner.next());
            System.out.print("Введите фамилию: ");
            students[i].setSurname(scanner.next());
            System.out.println("Введите Дату рождения");
            System.out.print("Введите день рождения(число): ");
            students[i].setBirthday(scanner.nextInt());
            System.out.print("Введите месяц рождения(номер месяца): ");
            students[i].setMonth_of_birth(scanner.nextInt());
            System.out.print("Введите год рождения: ");
            students[i].setYear_of_birth(scanner.nextInt());
            System.out.print("Введите адрес: ");
            students[i].setAddress(scanner.next());
            System.out.print("Введите номер телефона: ");
            students[i].setPhone_number(scanner.next());
            System.out.print("Введите факультет: ");
            students[i].setFaculty(scanner.next());
            System.out.print("Введите курс: ");
            students[i].setCourse(scanner.nextInt());
            System.out.print("Введите название группы: ");
            students[i].setGroup(scanner.next());
            //scanner.close();
        }

        return students;
    }

    static void faculty(Student[] students,String faculty){
        System.out.println("Студенты на факультете "+faculty+":");
        for(Student student:students){
            if(student.getFaculty().equals(faculty)) {
                System.out.println(student.toString());
            }
        }
        System.out.println();
    }

    static void student_check_faculty_and_cours(Student[] students){
        System.out.println("Список студенитов по курсам");
        System.out.println();
        for(int i=0; i<6; i++){
            System.out.println(i+1+"курс:");
            for (Student student : students) {
                if (student.getCourse()==i+1)
                    System.out.println(student.toString());
            }
            System.out.println();
        }
        System.out.println();


        String[] faculty = new String[students.length];
        int k=0;
        faculty[k] = students[0].getFaculty();
        k++;

        for (Student student : students) {
            boolean fl=true;
            for (String s : faculty) {
                if(student.getFaculty().equals(s)){
                    fl=false;
                    break;
                }
            }

            if(fl){
                faculty[k]=student.getFaculty();
                k++;
            }
        }

        if(k<students.length){
            String[] mass= new String[k];
            for (int i=k; i<faculty.length;i++) {
                faculty[i]="";
            }

            System.arraycopy(faculty,0,mass,0,k);
            faculty=mass;
        }

        Arrays.sort(faculty);


        for (String s : faculty) {
            System.out.println("Факультет "+s+":");
            for (Student student : students) {
                if(student.getFaculty().equals(s)){
                    System.out.println(student.toString());
                }
            }
            System.out.println();
        }
    }


    static void year(Student[] students, int year){
        System.out.println("Список студентов, родившихся после "+year+":");
        for(Student student: students){
            if(student.getYear_of_birth()>year){
                System.out.println(student.toString());
            }
        }
        System.out.println();
    }


    static  void list_group(Student[] students,String group) {
        System.out.println("Cписок учебной группы " + group + ":");
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student.toString());
            }
        }
    }


    ///////////// 2 Customer

    static Customer[] customers_list(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество покупателей: ");
        Customer[] customers = new Customer[scanner1.nextInt()];
        for (int i=0; i<customers.length; i++) {
            customers[i]=new Customer();
            System.out.println();
            System.out.print("Введите id: ");
            customers[i].setId(scanner1.nextInt());
            System.out.print("Введите фамилию: ");
            customers[i].setSurname(scanner1.next());
            System.out.print("Введите имя: ");
            customers[i].setName(scanner1.next());
            System.out.print("Введите отчество: ");
            customers[i].setMiddle_name(scanner1.next());
            System.out.print("Введите адрес: ");
            customers[i].setAddress(scanner1.next());
            System.out.print("Введите номер кредитной карты: ");
            customers[i].setCredit_card_number(scanner1.nextInt());
            System.out.print("Введите номер банковского счета: ");
            customers[i].setBank_account_number(scanner1.nextInt());
        }
        return customers;
    }

    static Customer[] cust(){
        Customer[] customers = new Customer[3];

        customers[0]=new Customer(0,"Богда","Иванович","Семенчуков","Озерная 5",1423,14562148);
        customers[1]=new Customer(1,"Иван","Николаевич","Гагарин","Озерная 5",3612,4236568);
        customers[2]=new Customer(2,"Антон","Иванович","Толстой","Озерная 5",4578,1863848);

        return customers;
    }

    static void customer_buyers_list(Customer[] customers){
        String[] surnames = new String[customers.length];
        int k=0;
        surnames[k]=customers[0].getSurname();                  ////// Создаем массив для куда запишем фамилии
        k++;
        for (Customer customer : customers) {
            boolean fl = true;
            for (int i = 0; i < surnames.length; i++) {
                if (customer.getSurname().equals(surnames[i])) {    /////// в этом цыкле отсеиваем поворяющиеся фамилии
                    fl = false;
                    break;
                }
            }

            if (fl) {                                                ////// если этой фамилии нет в масива а тогда добавляем его в массив
                surnames[k] = customer.getSurname();
                k++;
            }
        }
            if(k<surnames.length){                               //// если масив а не полный тогда в нем есть null, а метод Arrays.sort() неработает с null, поэтому мы их убираем
                String[] names2 =new String[k];

                for (int i=k; i<surnames.length; i++){
                    surnames[i]="";
                }

                System.arraycopy(surnames,0,names2,0,k);
                surnames=names2;
            }

        Arrays.sort(surnames);

            for (String name : surnames) {                           ///// выводи по алфавиту
                for (Customer customer : customers) {
                    if(name.equals(customer.getSurname()))
                        System.out.println(customer.toString());
                }
            }


    }

    static void customer_check_credit_card(Customer[] customers, int n, int b){
        for (Customer customer : customers) {
            if(customer.getCredit_card_number()>=n  &&  customer.getCredit_card_number()<=b)
                System.out.println(customer.toString());
        }
    }


    /////////      3     Patient

    static Patient[] patients_list(){

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество пациентов: ");
        Patient[] patients = new Patient[scanner1.nextInt()];
        for (int i=0; i<patients.length; i++) {
            patients[i]=new Patient();
            System.out.println();
            System.out.print("Введите id: ");
            patients[i].setId(scanner1.nextInt());
            System.out.print("Введите фамилию: ");
            patients[i].setSurname(scanner1.next());
            System.out.print("Введите имя: ");
            patients[i].setName(scanner1.next());
            System.out.print("Введите отчество: ");
            patients[i].setMiddle_name(scanner1.next());
            System.out.print("Введите адрес: ");
            patients[i].setAddress(scanner1.next());
            System.out.print("Введите номер телефона: ");
            patients[i].setPhone_number(scanner1.next());
            System.out.print("Введите номер медицінской карты: ");
            patients[i].setMed_card(scanner1.nextInt());
            System.out.print("Введите диагноз: ");
            patients[i].setDiagnosis(scanner1.next());
        }
        return patients;
    }

    static Patient[] pat(){
        Patient[] mass= new Patient[3];

        mass[0]= new Patient(0,"Вова","Иванович","Петров","Пушкинська 15","0665432410",47541,"Простуда");
        mass[1]= new Patient(1,"Антон","Сидорович","Беляков","Пушкинська 45","0698544210",14267,"Воспаление");
        mass[2]= new Patient(2,"Коля","Иванович","Ковальов","Сумская 2","0995421302",02475,"Простуда");

        return mass;
    }

    static void check_diagnosis(Patient[] patients,String diagnosis){
        for(Patient patient:patients){
            if(patient.getDiagnosis().equals(diagnosis)){
                System.out.println(patient.toString());
            }
        }
        System.out.println();
    }

    static void check_med_card(Patient[] patients,int a, int b){
        for(Patient patient:patients){
            if(patient.getMed_card()>=a && patient.getMed_card()<=b){
                System.out.println(patient.toString());
            }
        }
    }


    /////////////////// 4 Abiturient

    static Abiturient[] abiturients_list(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество абитуриентов: ");
        Abiturient[] abiturients = new Abiturient[scanner1.nextInt()];
        for (int i=0; i<abiturients.length; i++) {
            abiturients[i]=new Abiturient();
            System.out.println();
            System.out.print("Введите id: ");
            abiturients[i].setId(scanner1.nextInt());
            System.out.print("Введите фамилию: ");
            abiturients[i].setSurname(scanner1.next());
            System.out.print("Введите имя: ");
            abiturients[i].setName(scanner1.next());
            System.out.print("Введите отчество: ");
            abiturients[i].setMiddle_name(scanner1.next());
            System.out.print("Введите адрес: ");
            abiturients[i].setAddress(scanner1.next());
            System.out.print("Введите номер телефона: ");
            abiturients[i].setPhone_number(scanner1.next());
            System.out.print("Введите количество оценок: ");
            int summa=0,n=scanner1.nextInt();
            int[] mass=new int[n];
            for (int j=0; j<n;j++){
                System.out.print("Введите оценку номер " + (j+1) + ": ");
                mass[j]=scanner1.nextInt();
            }
            abiturients[i].setEvaluation(mass);
            for (int mas : mass) {
                summa+=mas;
            }
            abiturients[i].setEvaluation_sum(summa);
        }
        return abiturients;
    }

    static Abiturient[] abit(){
        Abiturient[] abiturients = new Abiturient[3];
        int[] mass = {1,2,3,4,3};
        abiturients[0] = new Abiturient(0,"Петро","Иванов","Семенович","Сумская 14","0965423571",mass);
        mass = new int[]{4, 5, 5, 4, 5};
        abiturients[1] = new Abiturient(1,"Степан","Семенов","Иванов","Сумская 56","066452351",mass);
        mass = new int[]{2, 3, 4, 3, 2};
        abiturients[2] = new Abiturient(2,"Иван","Иванов","Иванов","Сумская 25","099541235",mass);

        return abiturients;
    }

    static void abiturient_check_bad_evaluation(Abiturient[] abiturients){
        for (Abiturient abiturient : abiturients) {
            for (int i : abiturient.getEvaluation()) {
                if(i<3) {
                    System.out.println(abiturient.toString());
                    break;
                }
            }
        }
        System.out.println();
    }

    static void abiturient_check_evaluation_sum(Abiturient[] abiturients,int summa){
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getEvaluation_sum()>summa)
                System.out.println(abiturient.toString());
        }
        System.out.println();
    }

    /*
           Сначала мы сортируем масов по убыванию суммы балов(Evaluation_sum),  а потом просто выводим по порядку
           студентов имеющих самую высокую сумму балов
    */

    static void abiturient_check_evaluation(Abiturient[] abiturients, int n,int b){
        for (int i =0; i<abiturients.length;i++) {
                for (int j = i; j < abiturients.length; j++) {
                if(abiturients[i].getEvaluation_sum()<abiturients[j].getEvaluation_sum()){
                    Abiturient abiturient = abiturients[j];
                    abiturients[j] = abiturients[i];
                    abiturients[i] = abiturient;
                }
            }
        }
        System.out.println();
        System.out.println("1)Список из n-абитуриентов, имеющих самую высокую сумму баллов:");
        for (int i=0; i<n; i++) {
            System.out.println(abiturients[i].toString());
        }
        System.out.println();

        System.out.println("2)Список абитуриентов, имеющих полупроходную сумму:");
        for (Abiturient abiturient : abiturients) {
            if(abiturient.getEvaluation_sum()>b)
                System.out.println(abiturient.toString());
        }

    }




    ///////////////// 5 Book

    static book[] books() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество книг: ");
        book[] books = new book[scanner1.nextInt()];
        for (int i = 0; i < books.length; i++) {
            books[i] = new book();
            System.out.println();
            System.out.print("Введите id: ");
            books[i].setId(scanner1.nextInt());
            System.out.print("Введите название книги: ");
            books[i].setName(scanner1.next());
            System.out.print("Введите количество авторов: ");
            int n = scanner1.nextInt();
            String[] mass = new String[n];
            for (int j=0; j<n; j++) {
                System.out.print("Введите автора: ");
                mass[j] = scanner1.next();
            }
            books[i].setAutor(mass);

            System.out.print("Введите издательство: ");
            books[i].setPublisher(scanner1.next());
            System.out.print("Введите год издания: ");
            books[i].setYear(scanner1.nextInt());
            System.out.print("Введите количество страниц: ");
            books[i].setPages(scanner1.nextInt());
            System.out.print("Введите цену: ");
            books[i].setPrice(scanner1.nextInt());
            System.out.print("Введите тип переплета: ");
            books[i].setCover(scanner1.next());
        }

        return books;
    }

    static book[] bo(){
        book[] book_list = new book[3];
        String[] autors = {"Толкин"};
        book_list[0]= new book(0,"Хоббит",autors,"Единорог",1976,322,560,"Твердый переплет");
        String[] autors1 = {"Пупкин"};
        book_list[1]= new book(1,"Книга",autors1,"Общество Атеистов",1994,752,1260,"Твердый переплет");
        String[] autors2 = {"Пупкин","Семенов"};
        book_list[2]= new book(2,"Мифы",autors2,"Единорог",1960,152,320,"Твердый переплет");

        return book_list;
    }

    static void check_autor(book[] books,String autor){
        for (book book : books) {
            String[] autors = book.getAutor();

            for (String s : autors) {
                if(s.equals(autor)){
                    System.out.println(book.toString());
                    break;
                }
            }
        }
    }

    static void check_publisher(book[] books, String publisher){
        for (book book : books) {
            if(book.getPublisher().equals(publisher)){
                System.out.println(book.toString());
            }
        }
    }

    static void check_year(book[] books, int year){
        for (book book : books) {
            if(year<book.getYear()){
                System.out.println(book.toString());
            }
        }
    }



    ///////////////  6 House

    static House[] houses_list() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество квартир: ");
        House[] houses = new House[scanner1.nextInt()];
        for (int i = 0; i < houses.length; i++) {
            houses[i] = new House();
            System.out.println();
            System.out.print("Введите id: ");
            houses[i].setId(scanner1.nextInt());
            System.out.print("Введите номер квартиры: ");
            houses[i].setNumber_of_apartment(scanner1.nextInt());
            System.out.print("Введите площадь: ");
            houses[i].setArea(scanner1.nextInt());
            System.out.print("Введите этаж: ");
            houses[i].setFloor(scanner1.nextInt());
            System.out.print("Введите количество комнат: ");
            houses[i].setNumber_of_rooms(scanner1.nextInt());
            System.out.print("Введите улицу: ");
            houses[i].setStreet(scanner1.next());
            System.out.print("Введите тип здания: ");
            houses[i].setType_of_building(scanner1.next());
            System.out.print("Введите срок эксплуатации: ");
            houses[i].setLife_of_building(scanner1.nextInt());
        }

        return houses;
    }

    static House[] ho(){
        House[] houses = new House[3];
        houses[0] = new House(0,23,45,4,2,"Сумская","Жылой дом",100);
        houses[1] = new House(1,13,65,5,3,"Сумская","Жылой дом",100);
        houses[2] = new House(2,2,36,1,1,"Пушкинская","Жылой дом",100);


        return houses;
    }

    static void check_rooms(House[] houses,int rooms){
        for (House house : houses) {
            if(house.getNumber_of_rooms()==rooms){
                System.out.println(house.toString());
            }
        }
        System.out.println();
    }

    static void check_rooms_on_floor(House[] houses,int rooms, int flor_min,int flor_max){
        for (House house : houses) {
            if(house.getNumber_of_rooms()==rooms && house.getFloor()>=flor_min && house.getFloor()<=flor_max){
                System.out.println(house.toString());
            }
        }
        System.out.println();
    }

    static void check_area(House[] houses, int area){
        for (House house : houses) {
            if (house.getArea()>area){
                System.out.println(house.toString());
            }
        }
    }



    ///////////////////  7 Phone

    static Phone[] phones_list(){
        {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введите количество абонентов: ");
            Phone[] phones = new Phone[scanner1.nextInt()];
            for (int i = 0; i < phones.length; i++) {
                phones[i] = new Phone();
                System.out.println();
                System.out.print("Введите id: ");
                phones[i].setId(scanner1.nextInt());
                System.out.print("Введите фамилию: ");
                phones[i].setSurname(scanner1.next());
                System.out.print("Введите имя: ");
                phones[i].setName(scanner1.next());
                System.out.print("Введите отчество: ");
                phones[i].setMiddle_name(scanner1.next());
                System.out.print("Введите адрес: ");
                phones[i].setAddress(scanner1.next());
                System.out.print("Введите номер кредитной карты: ");
                phones[i].setCredit_card_number(scanner1.nextInt());
                System.out.print("Введите дебет: ");
                phones[i].setDebit(scanner1.nextInt());
                System.out.print("Введите кредит: ");
                phones[i].setCredit(scanner1.nextInt());
                System.out.print("Введите время городских разговоров: ");
                phones[i].setTime_town_calls(scanner1.nextInt());
                System.out.print("Введите время междугородских разговоров: ");
                phones[i].setTime_long_distance_calls(scanner1.nextInt());
            }

            return phones;
        }
    }

    static Phone[] phones(){
        Phone[] phones = new Phone[5];

        phones[0]=new Phone(0,"Иван","Иванович","Иванов","Сумская 14",14563275,120,110,142,12);
        phones[1]=new Phone(1,"Богдан","Иванович","Семенов","Сумская 14",48321567,230,170,26,38);
        phones[2]=new Phone(2,"Антон","Иванович","Петров","Сумская 14",853249,0,10,321,0);
        phones[3]=new Phone(3,"Богдан","Иванович","Петров","Сумская 14",4558456,0,100,253,10);
        phones[4]=new Phone(4,"Антон","Иванович","Петров","Сумская 14",4213568,0,70,561,0);

        return  phones;
    }

    static  void phone_check_time_town_calls(Phone[] phones,int time){
        for (Phone phone : phones) {
            if(phone.getTime_town_calls()>time)
                System.out.println(phone.toString());
        }
        System.out.println();
    }

    static void  phone_check_long_distance_calls(Phone[] phones){
        for (Phone phone : phones) {
            if(phone.getTime_long_distance_calls()>0){
                System.out.println(phone.toString());
            }
        }
        System.out.println();
    }

    static void phone_subscribers(Phone[] phones){

        boolean fl;
        String[] a = new String[phones.length];           ////// Создаем массив для куда запишем фамилии
        int k=0;
        a[0]=phones[0].getSurname();
        k++;
        for (Phone phone : phones) {
            fl = true;
            for (int i = 0; i < k; i++) {               /////// в этом цыкле отсеиваем поворяющиеся фамилии
                if (phone.getSurname().equals(a[i])) {
                    fl = false;
                    break;
                }
            }
            if(fl){                                     ////// если этой фамилии нет в масива а тогда добавляем его в массив
                a[k]=phone.getSurname();
                k++;
            }
        }


        if(k<a.length){                       //// если масив а не полный тогда в нем есть null, а метод Arrays.sort() неработает с null, поэтому мы их убираем
            String[] a1 = new String[k];
            for(int i=k;i<a.length;i++)
            {
                a[i]="";
            }
            System.arraycopy(a,0,a1,0,3);
            a=a1;
        }

        Arrays.sort(a);

        for (int i=0; i<a.length;i++){          ///// выводи по алфавиту
            for (Phone phone : phones) {
                if(a[i].equals(phone.getSurname())){
                    System.out.println(phone.toString());
                }
            }
        }

    }





    /////////////////  8 Car

    static Car[] cars_list(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество автомобилей: ");
        Car[] cars = new Car[scanner1.nextInt()];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println();
            System.out.print("Введите id: ");
            cars[i].setId(scanner1.nextInt());
            System.out.print("Введите марку: ");
            cars[i].setMarka(scanner1.next());
            System.out.print("Введите модель: ");
            cars[i].setModel(scanner1.next());
            System.out.print("Введите год выпуска: ");
            cars[i].setYear(scanner1.nextInt());
            System.out.print("Введите цвет: ");
            cars[i].setColor(scanner1.next());
            System.out.print("Введите цену: ");
            cars[i].setPrice(scanner1.nextInt());
            System.out.print("Введите регистрационный номер: ");
            cars[i].setRegistration_number(scanner1.nextInt());
        }

        return cars;
    }

    static Car[] car(){
        Car[] cars = new Car[3];
        cars[0]= new Car(0,"BMV","X5",2005,"black",2100,2134);
        cars[1]= new Car(1,"Mazda","X2",2001,"white",1500,1649);
        cars[2]= new Car(2,"Toyota","X2",2009,"blue",2990,3452);


        return cars;
    }

    static void check_mark(Car[] cars,String marka){
        for (Car car : cars) {
            if(car.getMarka().equals(marka))
                System.out.println(car.toString());
        }
        System.out.println();
    }

    static void check_model(Car[] cars,String model,int n){
        for (Car car : cars) {
            if(car.getModel().equals(model) && (2016-car.getYear())>n){
                System.out.println(car.toString());
            }
        }
        System.out.println();
    }

    static void check_year(Car[] cars,int year, int price){
        for (Car car : cars) {
            if(car.getYear()==year && car.getPrice()>price)
                System.out.println(car.toString());
        }
    }


    ////////////////  9 Product

    static Product[] products_list(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество товаров: ");
        Product[] products = new Product[scanner1.nextInt()];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            System.out.println();
            System.out.print("Введите id: ");
            products[i].setId(scanner1.nextInt());
            System.out.print("Введите название товара: ");
            products[i].setName(scanner1.next());
            System.out.print("Введите UPC: ");
            products[i].setUPC(scanner1.nextInt());
            System.out.print("Введите производителя: ");
            products[i].setManufacturer(scanner1.next());
            System.out.print("Введите цену: ");
            products[i].setPrice(scanner1.nextDouble());
            System.out.print("Введите срок хранения: ");
            products[i].setShelf_life(scanner1.nextInt());
            System.out.print("Введите количестов: ");
            products[i].setNumber(scanner1.nextInt());
        }

        return products;

    }

    static Product[] prod(){
        Product[] products = new Product[4];

        products[0]=new Product(0,"Торт",1275,"Рошен",143.75,5,6);
        products[1]=new Product(1,"Торт",1276,"Рошен",212.50,5,2);
        products[2]=new Product(2,"Чай",2437,"Индия",38.45,120,32);
        products[3]=new Product(2,"Конфеты",2437,"Конти",29.5,60,86);

        return products;
    }

    static void product_check_name(Product[] products, String name){
        for (Product product : products) {
            if(product.getName().equals(name))
                System.out.println(product.toString());
        }
        System.out.println();
    }

    static void product_check_name_and_price(Product[] products, String name,double price){
        for (Product product : products) {
            if (product.getName().equals(name) && product.getPrice()<=price){
                System.out.println(product.toString());
            }
        }
        System.out.println();
    }

    static void product_check_shelf_life(Product[] products,int shelf_life){
        for (Product product : products) {
            if (product.getShelf_life()>shelf_life)
                System.out.println(product.toString());
        }
    }


    /////////////////// 10 Train

    static Train[] trains_list(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество поездов: ");
        Train[] trains = new Train[scanner1.nextInt()];
        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train();
            System.out.println();;
            System.out.print("Введите пункт назначения: ");
            trains[i].setDestination(scanner1.next());
            System.out.print("Введите номер поезда: ");
            trains[i].setNumber_of_train(scanner1.nextInt());
            System.out.print("Введите время оправления: ");
            trains[i].setDeparture_time(scanner1.nextDouble());
            System.out.print("Введите количество общих мест: ");
            trains[i].setNumber_of_common_seats(scanner1.nextInt());
            System.out.print("Введите количество купе мест: ");
            trains[i].setNumber_of_seats_in_coupe(scanner1.nextInt());
            System.out.print("Введите количество плацкарт мест: ");
            trains[i].setNumber_of_seats_in_reserved_seats(scanner1.nextInt());
            System.out.print("Введите количество мест люкс: ");
            trains[i].setNumber_of_seats_in_suite(scanner1.nextInt());
        }

        return trains;

    }


    static Train[] train(){
        Train[] trains = new Train[3];

        trains[0] = new Train("Москва",5,12.45,24,48,8,0);
        trains[1] = new Train("Одеса",10,8.30,48,56,18,36);
        trains[2] = new Train("Киев",2,14.10,0,48,12,24);

        return trains;
    }

    static void train_check_destination(Train[] trains,String destination){
        for (Train train : trains) {
            if(train.getDestination().equals(destination))
                System.out.println(train.toString());
        }
        System.out.println();
    }

    static void train_check__destination_and_time(Train[] trains,String destination,double time){
        for (Train train : trains) {
            if(train.getDestination().equals(destination) && train.getDeparture_time()> time)
                System.out.println(train.toString());
        }
        System.out.println();
    }

    static void train_check__destination_and_common_seats(Train[] trains,String destination){
        for (Train train : trains) {
            if(train.getDestination().equals(destination) && train.getNumber_of_common_seats()>0)
                System.out.println(train.toString());
        }

    }

    //////////////////// 11 Bus

    static Bus[] busese_list(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество автобусов: ");
        Bus[] buses = new Bus[scanner1.nextInt()];
        for (int i = 0; i < buses.length; i++) {
            buses[i] = new Bus();
            System.out.println();
            ;
            System.out.print("Введите фамилию водителя: ");
            buses[i].setDriver(scanner1.next());
            System.out.print("Введите номер автобуса: ");
            buses[i].setNumber_bus(scanner1.nextInt());
            System.out.print("Введите номер маршрута: ");
            buses[i].setRoute_number(scanner1.nextInt());
            System.out.print("Введите марку автобуса: ");
            buses[i].setMark(scanner1.next());
            System.out.print("Введите год начала эксплуатации: ");
            buses[i].setYear_operation(scanner1.nextInt());
            System.out.print("Введите пробег атобуса: ");
            buses[i].setMileage(scanner1.nextInt());
        }

        return buses;

    }

    static Bus[] bus(){
        Bus[] buses = new Bus[3];

        buses[0] = new Bus("Петров А.С.", 651, 45, "Mercedes", 1996, 216023);
        buses[1] = new Bus("Семенов П.С.", 651, 12, "Mercedes", 1995, 226540);
        buses[2] = new Bus("Иванов Н.В.", 651, 45, "Mazda", 2003, 186234);

        return buses;
    }

    static void bus_check_route(Bus[] buses, int route){
        for (Bus bus : buses) {
            if(bus.getRoute_number()==route)
                System.out.println(bus.toString());
        }
        System.out.println();
    }

    static void bus_check_year(Bus[] buses,int n){
        for (Bus bus : buses) {
            if((2016-bus.getYear_operation())>n)
                System.out.println(bus.toString());
        }
        System.out.println();
    }

    static void  bus_check_mileage(Bus[] buses, int mileage){
        for (Bus bus : buses) {
            if(bus.getMileage()>mileage)
                System.out.println(bus.toString());
        }
    }

    //////////////////////  12 Airline

    static Airline[] airlines_list(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество авиарейсов: ");
        Airline[] airlines = new Airline[scanner1.nextInt()];
        for (int i = 0; i < airlines.length; i++) {
            airlines[i] = new Airline();
            System.out.println();
            System.out.print("Введите пункт назначения: ");
            airlines[i].setDestination(scanner1.next());
            System.out.print("Введите номер рейса: ");
            airlines[i].setFlight_number(scanner1.nextInt());
            System.out.print("Введите тип самолета: ");
            airlines[i].setType_plane(scanner1.next());
            System.out.print("Введите время вылета: ");
            airlines[i].setTime(scanner1.nextDouble());
            System.out.println("Выберите день недели ");


            System.out.println("1)Понедельник");
            System.out.println("2)Вторник");
            System.out.println("3)Среда");
            System.out.println("4)Четверг");
            System.out.println("5)Пятниц");
            System.out.println("6)Субота");
            System.out.println("7)Воскресенье");
            System.out.println("Введите число дня недели: ");

            switch (scanner1.nextInt()){
                case 1:
                    airlines[i].setDay("Понедельник");
                    break;
                case 2:
                    airlines[i].setDay("Вторник");
                    break;
                case 3:
                    airlines[i].setDay("Среда");
                    break;
                case 4:
                    airlines[i].setDay("Четверг");
                    break;
                case 5:
                    airlines[i].setDay("Пятниц");
                    break;
                case 6:
                    airlines[i].setDay("Субота");
                    break;
                case 7:
                    airlines[i].setDay("Воскресенье");
                    break;
            }
        }

        return airlines;
    }

    static Airline[] a(){
        Airline[] airline = new Airline[3];

        airline[0] = new Airline("Токио",42,"Пассажирский",12.50,"Вторник");
        airline[1] = new Airline("Берлин",12,"Грузовой",12.50,"Вторник");
        airline[2] = new Airline("Париж",29,"Пассажирский",12.50,"Вторник");

        return airline;
    }

    static void airline_check_destination(Airline[] airlines, String destination){
        for (Airline airline : airlines) {
            if(airline.getDestination().equals(destination)){
                System.out.println(airline.toString());
            }
        }
        System.out.println();
    }

    static void airline_check_day(Airline[] airlines){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Выберите день недели: ");

        System.out.println("1)Понедельник");
        System.out.println("2)Вторник");
        System.out.println("3)Среда");
        System.out.println("4)Четверг");
        System.out.println("5)Пятниц");
        System.out.println("6)Субота");
        System.out.println("7)Воскресенье");
        System.out.print("Введите число дня недели: ");

        String day = null;

        switch (scanner1.nextInt()){
            case 1:
                day="Понедельник";
                break;
            case 2:
                day="Вторник";
                break;
            case 3:
                day="Среда";
                break;
            case 4:
                day="Четверг";
                break;
            case 5:
                day="Пятниц";
                break;
            case 6:
                day="Субота";
                break;
            case 7:
                day="Воскресенье";
                break;
            default:
                System.out.println("Введено не верное число!!");
        }

        for (Airline airline : airlines) {
            if(airline.getDay().equals(day))
                System.out.println(airline.toString());
        }
        System.out.println();
    }

    static void airline_check_day_and_time(Airline[] airlines){

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Выберите день недели: ");

        System.out.println("1)Понедельник");
        System.out.println("2)Вторник");
        System.out.println("3)Среда");
        System.out.println("4)Четверг");
        System.out.println("5)Пятниц");
        System.out.println("6)Субота");
        System.out.println("7)Воскресенье");
        System.out.print("Введите число дня недели: ");

        String day = null;

        switch (scanner1.nextInt()){
            case 1:
                day="Понедельник";
                break;
            case 2:
                day="Вторник";
                break;
            case 3:
                day="Среда";
                break;
            case 4:
                day="Четверг";
                break;
            case 5:
                day="Пятниц";
                break;
            case 6:
                day="Субота";
                break;
            case 7:
                day="Воскресенье";
                break;
            default:
                System.out.println("Введено не верное число!!");
        }

        System.out.print("Введите время вылета: ");
        double time = scanner1.nextDouble();


        for (Airline airline : airlines) {
            if(airline.getDay().equals(day) && airline.getTime()>time)
                System.out.println(airline.toString());
        }
    }

}



