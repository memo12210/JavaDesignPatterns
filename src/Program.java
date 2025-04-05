import Builder.*;
import FactoryMethod.LandLogistics;
import FactoryMethod.Logistics;
import Prototype.*;
import SimpleFactory.*;
import javafx.geometry.Point3D;

public class Program
{
    public static void main(String[] args)
    {
        // BUILDER PATTERN USAGE
        System.out.println("### BUILDER PATTERN EXAMPLE ###");
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(nutritionFacts.toString());

        System.out.println("\n\n");
        // SIMPLE FACTORY PATTERN USAGE
        System.out.println("### SIMPLE FACTORY PATTERN EXAMPLE ###");
        Coffee coffee = CoffeeFactory.createCoffee("latte", "large");
        coffee.prepare();
        coffee.serve();

        System.out.println("\n\n");
        // FACTORY METHOD PATTERN USAGE
        System.out.println("### FACTORY METHOD PATTERN EXAMPLE ###");
        Logistics logistics = new LandLogistics();
        logistics.planDelivery();

        System.out.println("\n\n");
        // PROTOTYPE PATTERN USAGE
        System.out.println("### PROTOTYPE PATTERN EXAMPLE ###");
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10, 0, 0), 20);
        s1.attack();
        System.out.println(s1);

        try // no issue since Swordsman supports cloning
        {
            Swordsman s2 = (Swordsman) s1.clone();
            System.out.println(s2);
        } catch (CloneNotSupportedException e)
        {
            throw new RuntimeException(e);
        }

        General g1 = new General();
        g1.move(new Point3D(10, 0, 0), 20);
        g1.boostMorale();
        System.out.println(g1);

        try // will throw CloneNotSupportedException
        {
            General g2 = (General) g1.clone();
            System.out.println(g2);
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        System.out.println("\n\n");
    }
}
