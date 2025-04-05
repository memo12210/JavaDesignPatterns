package FactoryMethod;

public abstract class Logistics
{
    public void planDelivery()
    {
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}
