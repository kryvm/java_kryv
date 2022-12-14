package hw6;

import java.util.Arrays;

public class Salad {
    Vegetable[] vegs;
    public Salad(Vegetable[] v){
        this.vegs = v;
    }
    public void addVeg(Vegetable v){
        int n = this.vegs.length;
        Vegetable[] tmp = Arrays.copyOf(this.vegs, n);
        this.vegs = new Vegetable[n + 1];
        System.arraycopy(tmp, 0, vegs, 0, n);
        this.vegs[n] = v;
    }

    public float getWeight(){
        float res = 0;
        for (int i = 0; i < this.vegs.length; i++) {
            res += this.vegs[i].weight;
        }
        return res;
    }

    public float getCalories(){
        float res = 0;
        for (int i = 0; i < this.vegs.length; i++) {
            res += this.vegs[i].calories;
        }
        return res;
    }

    public float getPrice(){
        float res = 0;
        for (int i = 0; i < this.vegs.length; i++) {
            res += this.vegs[i].price;
        }
        return res;
    }

    public void sortByCalories(){
        Vegetable[] res = this.vegs;
        Arrays.sort(res, new Sortbycal());
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public void displayInInterval(int a,int b){
        System.out.println("from "+a+ " to "+b);
        for (int i = 0; i < this.vegs.length; i++) {
            if (this.vegs[i].calories > a && this.vegs[i].calories < b){
                System.out.println(this.vegs[i]);
            }
        }
    }

    public static void main(String[] args) {
        Vegetable a = new Onion(20,15,5);
        Vegetable b = new Cucumber(20,40,5);
        Vegetable c = new Tomato(20,20,5);
        Vegetable d = new Onion(20,60,5);
        Salad res = new Salad(new Vegetable[]{a, b, c});
        res.addVeg(d);
        res.sortByCalories();
        res.displayInInterval(18,42);
    }
}
