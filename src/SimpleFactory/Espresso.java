package SimpleFactory;

public class Espresso extends Coffee
{
    public Espresso(String size)
    {
        this.size = size;
        this.price = size.equals("small") ? 2.5 :
                size.equals("medium") ? 3.0 : 3.5;
    }

    @Override
    public void prepare()
    {
        System.out.println("Preparing a strong shot of espresso...");
    }
}