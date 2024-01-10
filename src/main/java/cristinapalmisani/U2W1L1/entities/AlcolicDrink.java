package cristinapalmisani.U2W1L1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class AlcolicDrink extends Drinks{

    private double alcoolperc;

    public AlcolicDrink(String name, int calories, double price, double litre, double alcoolperc) {
        super(name, calories, price, litre);
        this.alcoolperc = alcoolperc;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "name='" + getName() + '\'' +
                ", calories=" + getCalories() +
                ", price=" + getPrice() +
                ", litre=" + getLitre() + "l" + ", alcool=" + getAlcoolperc() + "%" +
                '}';
    }
}
