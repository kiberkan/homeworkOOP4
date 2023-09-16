public class Program {

        public static void main(String[] args) {

                Box<Orange> orangeBox = new Box<>();
                Box<Orange> orangeBox2 = new Box<>();
                Box<Apple> appleBox = new Box<>();
                Box<Apple> appleBox2 = new Box<>();
                System.out.println("Создадим\n " +
                                "orangeBox"+ "\n " +
                                "orangeBox2" + "\n " +
                                "appleBox" + "\n " +
                                "appleBox2" + "\n ");

                System.out.println("Положим в " + "orangeBox" + " - 10 апельсинов");
                orangeBox.addFruit(new Orange(),10);
                System.out.println("Положим в " + "orangeBox2" + " - 12 апельсинов");
                orangeBox2.addFruit(new Orange(),12);
                System.out.println("Положим в " + "appleBox" + " - 8 яблок");
                appleBox.addFruit(new Apple(),8);
                System.out.println("Положим в " + "appleBox2" + " - 4 яблока");
                appleBox2.addFruit(new Apple(),4);
                System.out.println();

                System.out.println("Вeс " + "orangeBox - "  + orangeBox.getWeight());
                System.out.println("Вес " +  "orangeBox2 - "  + orangeBox2.getWeight());
                System.out.println("Вес " +  "appleBox - "  + appleBox.getWeight());
                System.out.println("Вес " +  "appleBox2 - "  + appleBox2.getWeight());
                System.out.println();

                System.out.println("Сравниваем коробки по весу - независимо от их содержимого");

                System.out.println("orangeBox == appleBox? "+orangeBox.compare(appleBox));
                System.out.println("orangeBox2 == appleBox2? "+orangeBox2.compare(appleBox2));
                System.out.println();

                System.out.println("Пересыпаем фрукты из |orangeBox| в |orangeBox2|");
                orangeBox.pourTo(orangeBox2);
                System.out.println("Пересыпаем фрукты из |appleBox| в |appleBox2|");
                appleBox.pourTo(appleBox2);
                System.out.println();

                System.out.println("Вес коробок после пересыпания фруктов:");
                System.out.println("Вес " + "orangeBox - " +  orangeBox.getWeight());
                System.out.println("Вес " + "orangeBox2 - "  +  orangeBox2.getWeight());
                System.out.println("Вес " + "appleBox - " +  appleBox.getWeight());
                System.out.println("Вес " + "appleBox2 - "  +  appleBox2.getWeight());

        }
}