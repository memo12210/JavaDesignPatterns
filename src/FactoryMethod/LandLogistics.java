package FactoryMethod;

public class LandLogistics extends Logistics
{
    @Override
    public Transport createTransport()
    {
        return new Truck();
    }
}
