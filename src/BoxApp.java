public class BoxApp {
    public static void main(String[] args) {
        Box<Apple> greenAppleBox = new Box<>();
        Box<Orange> greenOrangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Fruit> fruitBox = new Box<>();

        Apple apple = new Apple();
        Orange orange = new Orange();

        orangeBox.add(orange);
        orangeBox.add(orange, 5);
        System.out.println(orangeBox);
        System.out.println(orangeBox.getWeight());

        fruitBox.add(apple, 6);
        fruitBox.add(orange, 7);
        System.out.println(fruitBox);
        System.out.println(fruitBox.getWeight());

        appleBox.add(apple);
        appleBox.add(apple, 2);
        appleBox.add(apple, 3);
        appleBox.add(apple, 3);

        System.out.println(appleBox);
        System.out.println(appleBox.getWeight());


        greenOrangeBox.add(orange);
        System.out.println("compare1 " + greenAppleBox.compare(greenOrangeBox));


        System.out.println("compare2 " + orangeBox.compare(appleBox));
        System.out.println("compare3 " + appleBox.compare(appleBox));

        System.out.println(appleBox);
        greenAppleBox.add(apple, 11);
        appleBox.merge(greenAppleBox);
        System.out.println(appleBox);
    }
}
