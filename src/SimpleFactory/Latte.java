package SimpleFactory;

public class Latte extends Coffee
{
    public Latte(String size)
    {
        this.size = size;
        this.price = size.equals("small") ? 3.0 :
                size.equals("medium") ? 3.5 : 4.0;
    }

    @Override
    public void prepare()
    {
        System.out.println("Steaming milk and for a creamy latte...");
    }
}
