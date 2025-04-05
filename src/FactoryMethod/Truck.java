package FactoryMethod;

public class Truck extends Transport
{
    @Override
    public void deliver()
    {
        System.out.println("Delivering by land in a truck.");
    }
}
