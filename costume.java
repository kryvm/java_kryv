package hw6;

public class costume extends clothes{
    double cost;

    public costume(String mat, double c){
        this.material = mat;
        this.cost = c;
    }

    @Override
    public void getMaterial() {
        System.out.println("Material: " + material);
    }

    public double getCost() {
        return cost;
    }
}
