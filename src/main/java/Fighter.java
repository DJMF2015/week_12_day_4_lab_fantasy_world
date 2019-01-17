import java.util.ArrayList;

public abstract class Fighter {

    private IWeapon weapon;

    public Fighter(IWeapon weapon){
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){}
}
