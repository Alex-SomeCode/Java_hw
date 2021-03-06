package hw_4;


public class Main {

    public static void main(String[] arg) {

        //  Створити клас Product (назва, ціна, тип (для цього можете створити енум) і ще 1-3 поля за власним бажанням).
        //      Приватні поля, гетери-сетери, констркутор, туСтрінг, equals&hashcode.

        //  Створити клас Store, який матиме поле - List продуктів. Конструктор класу store не має жодних параметрів,
        //      в тілі просто ініціалізує List (new ArrayList<>).

        //      В класі Store створити, і в мейні викликати, наступні методи:
        //        1. Додати продукт в магазин. Але перш ніж додати його в ліст, здійснити валідацію (чи ціна не від'ємна,
        //              чи в назві товару не присутні цифри).
        //        2. Видалити продукт з магазину по назві.
        //        3. Збільшити ціну для вказаного у параметрі типу продуктів удвічі
        //        4. Усі товари, дорожчі вказаної суми, записати у окремий ліст і вивести його на екран
        //              (наприклад "В нашому магазині продаються такі преміум товари:...)
        //        5. Порахувати загальну суму усіх товарів вказаного у вхідному параметрі типу і вивести її на екран
        //        6. Порахувати середню вартість усіх товарів в магазині і вивести це число на екран

        // Для роботи з колекцією варто ще створити метод, який наповнить наш магазин одразу же ж певною кількістю продуктів


        Store store = new Store();
        store.addReadyProducts();

        store.addProduct(new Product(1, "$23$Pfasdf", -1, Type.FRUITS, "Kiwik", 11));

//        System.out.println(store.getProductList().size());
//        System.out.println(store.toString());
//        System.out.println(store.getProductList().size());
//        System.out.println("-----------");
//        store.removeProduct("Грецький горіх");
//        store.removeProduct("Грецький горіх");
//        System.out.println("-----------");
//        System.out.println(store.toString());
//        System.out.println(store.getProductList().size());

//        store.increasePrice(Type.NUT);
//        System.out.println(store.toString());

//        store.setPremiumProducts(100);

//        store.sumPriceOfType(Type.NUT);


//        store.averagePrice_Of_All_Products();

//        System.out.println(store.toString());


    } // main

} // Main
