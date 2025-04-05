package Builder;


/**
 * Class containing nutritional values for food products.
 * Builder pattern is used instead of telescoping constructors.
 */
public class NutritionFacts
{
    public final int servingSize;
    public final int servings;
    public final int calories;
    public final int fat;
    public final int sodium;
    public final int carbohydrate;

    public static class Builder
    {
        // required fields
        private final int servingSize;
        private final int servings;

        // optional fields - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings)
        {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val)
        {
            calories = val;
            return this;
        }
        public Builder fat(int val)
        {
            fat = val;
            return this;
        }
        public Builder sodium(int val)
        {
            sodium = val;
            return this;
        }
        public Builder carbohydrate(int val)
        {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build()
        {
            return new NutritionFacts(this);
        }
    }

    public NutritionFacts(Builder builder)
    {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString()
    {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
