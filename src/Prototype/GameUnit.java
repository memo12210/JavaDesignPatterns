package Prototype;
import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable
{
    private Point3D position;

    public GameUnit()
    {
        position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z)
    {
        position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance)
    {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException
    {
        // we can shallow copy since Point3D is immutable.
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    /**
     * For initializing the GameUnit after cloning.
     */
    protected void initialize()
    {
        this.position = Point3D.ZERO;
        reset();
    }

    /**
     * Child classes should implement this class to
     * reset their state after cloning.
     */
    protected abstract void reset();

    public Point3D getPosition()
    {
        return position;
    }
}
