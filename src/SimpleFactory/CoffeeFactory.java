package SimpleFactory;

public class CoffeeFactory
{
    public static Coffee createCoffee(String type, String size)
    {
        switch (type.toLowerCase())
        {
            case "espresso":
                return new Espresso(size);
            case "latte":
                return new Latte(size);
            default:
                throw new IllegalArgumentException("Unknown coffee type, cannot create coffee!");
        }
    }
}
