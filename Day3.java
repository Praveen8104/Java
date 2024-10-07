class Day3_1 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Day3 obj = new Day3();
        System.out.println(obj.add(10, 20));
    }
}

class Car{
    public void getCarName(){
        System.out.println("Car Name is Audi");
    }

    public String getCarModel(){
        return "Car Model is A6";
    }
}

public class Day3 {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result;
        result = a > b ? 10 : 20;
        System.out.println(result);

        Car car = new Car();
        car.getCarName();
        String str = car.getCarModel();
        System.out.println(str);
        System.out.println(car.getCarModel());

    }
}
