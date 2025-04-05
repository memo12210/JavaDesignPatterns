package SimpleFactory;

public abstract class Coffee
{
    protected String size;
    protected double price;

    public abstract void prepare();

    public void serve()
    {
        System.out.println("Serving " + this.getClass().getSimpleName());
    }
}
