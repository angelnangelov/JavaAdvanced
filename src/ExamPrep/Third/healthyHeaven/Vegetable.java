package ExamPrep.Third.healthyHeaven;

public class Vegetable
{
    private String name;
    private int  calories;

    public Vegetable(String name,int calories){
        this.name = name;
        this.calories = calories;
    }


    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return " - " + this.name + " have " + this.calories +" calories";
    }
}
