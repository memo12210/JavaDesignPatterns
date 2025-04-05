package FactoryMethod;

public class Ship extends Transport
{
    @Override
    public void deliver()
    {
        System.out.println("Delivering by sea in a ship.");
    }
}
