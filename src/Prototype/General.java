package Prototype;

public final class General extends GameUnit
{
    private String state = "idle";

    public void boostMorale()
    {
        this.state = "MoralBoost";
    }

    @Override
    public String toString()
    {
        return "General " + state + " @ " + getPosition();
    }

    // throw exception to prevent cloning
    @Override
    public GameUnit clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException("Cannot clone generals!");
    }

    @Override
    protected void reset()
    {
        throw new UnsupportedOperationException("Reset not supported for General!");
    }
}
