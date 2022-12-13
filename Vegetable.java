package hw6;

import java.util.Comparator;

public class Vegetable {
    public float price;
    public float weight;
    public int calories;

    public Vegetable(float p, int c, float l) {
        this.price = p;
        this.calories = c;
        this.weight = l;
    }

}
class Sortbycal implements Comparator<Vegetable> {

    public int compare(Vegetable a, Vegetable b)
    {
        return a.calories - b.calories;
    }
}
