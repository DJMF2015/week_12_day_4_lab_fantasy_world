import java.util.ArrayList;

public class Ranger extends Fighter {

    private ArrayList<IWeapon> weapons;
    private IWeapon weapon;
    private String name;
    private int healthPoints;

    public Ranger(IWeapon weapon, String name, int healthPoints) {
        super(weapon);
        this.name = name;
        this.healthPoints = healthPoints;
        weapons = new ArrayList<>();
    }

    public void addToWeapons(IWeapon weapon){
        weapons.add(weapon);
    }

    public String getName() {
        return name;
    }

    public IWeapon getWeapon() {
        return super.getWeapon();
    }

    public void setWeapon(IWeapon iWeapon) {
        super.setWeapon(iWeapon);
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
