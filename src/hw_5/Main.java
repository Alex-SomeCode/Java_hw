package hw_5;


import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {


//        Даний проект має такі сутності:

//        Days, Time, Movie, Seance, Schedule, Cinema.
//        enum Days:
//        -прописати дні тижня;
//
//        Time:
//        - int min, int hour;
//        -передбачити межі для цих полів (для min 0. .59, для hour 0. .23);
//
//        Movie:
//        -String title, Time duration;
//
//        Seance:
//        -Movie movie, Time startTime, Time endTime;
//        -в конструктор має надходити параметрами значення для перших двох полів, третє поле повинне
//        обчислюватись(start + duration);
//
//        Schedule:
//        -TreeSet < Seance > (в полі пишемо Set<Seance>,а в конструкторі вже = new TreeSet<Seance>() );
//        -Сортування по startTime.
//        -методи:addSeance(Seance), removeSeance(Seance);
//
//        Cinema:
//        -TreeMap < Days, Schedule >, Time open, Time close;
//        -врахувати час відкриття і закриття при формуванні сеансів !
//        -методи:addSeances(String day, Seance...seance)(додає набір сеансів в конкретний день),
//        addSeance(Seance, String) (додає один сеанс в конкретний день),removeMovie(Movie) (повністю видаляє усі
//        сеанси вказаного фільму з розкладу),removeSeance(Seance, String) (видаляє конкретний сеанс фільму в
//        конкретний день, який задається параметром String).
//
//        Main class:
//        -створення об 'єкту Cinema;
//                - викликаємо всі методи Cinema
//
//        Для кожного класу зробити адекватний toString, щоб все було читабельно і доступно.Там де потрібно, зробити
//        compareTo().Маєте якісь власні ідеї для розробки - будь - ласка.Це моделювання роботи кінотеатру, тому все що
//        наблизить програму до реальності вітається.


        Time timeOpen = new Time(8, 0);
        Time timeClose = new Time(23, 30);

//        System.out.println(schedule.toString());

        Time duration_1 = new Time(15, 30);
        Time duration_2 = new Time(18, 30);
        Time duration_3 = new Time(3, 30);
        Time duration_4 = new Time(5, 30);
        Time duration_5 = new Time(2, 10);
        Time duration_6 = new Time(1, 2);


        Movie movie_1 = new Movie("JS", duration_1);
        Movie movie_2 = new Movie("Java", duration_2);
        Movie movie_3 = new Movie("MySql", duration_3);
        Movie movie_4 = new Movie("HTML", duration_4);
        Movie movie_5 = new Movie("Consultation", duration_5);
        Movie movie_6 = new Movie("Scrum", duration_6);


        Time startTimeMovie_1 = new Time(7, 0);
        Time startTimeMovie_2 = new Time(5, 0);
        Time startTimeMovie_3 = new Time(13, 0);
        Time startTimeMovie_4 = new Time(10, 0);
        Time startTimeMovie_5 = new Time(10, 30);
        Time startTimeMovie_6 = new Time(10, 10);


        Seance seance_1 = new Seance(movie_1, startTimeMovie_1);
        Seance seance_2 = new Seance(movie_2, startTimeMovie_2);
        Seance seance_3 = new Seance(movie_3, startTimeMovie_3);
        Seance seance_4 = new Seance(movie_4, startTimeMovie_4);
        Seance seance_5 = new Seance(movie_5, startTimeMovie_5);
        Seance seance_6 = new Seance(movie_6, startTimeMovie_6);


        Schedule scheduleMon = new Schedule();
        scheduleMon.addSeance(seance_1);
        scheduleMon.addSeance(seance_2);
        scheduleMon.addSeance(seance_3);
        scheduleMon.addSeance(seance_4);

//        Map map = new TreeMap;
       TreeMap<Days, Schedule> scheduleOnDays = new TreeMap<>();
       scheduleOnDays.put(Days.MONDAY, scheduleMon);

        Cinema cinema = new Cinema(
                timeOpen,
                timeClose, scheduleOnDays);

        System.out.println(scheduleMon.toString());
        System.out.println(cinema.toString());

        cinema.addSeance("MONDAY", seance_5);

        System.out.println(cinema.toString());

        Seance[] arraySeance = {seance_1, seance_2, seance_3, seance_4, seance_5, seance_6};
        cinema.addSeances("MONDAY", arraySeance);


        System.out.println(cinema.toString());

        cinema.removeMovie(movie_1);
        cinema.removeMovie(movie_1);

//        System.out.println(cinema.toString());

        cinema.removeSeance(seance_3, "MONDAY");

        System.out.println(cinema.toString());


    } // main
} // Main
