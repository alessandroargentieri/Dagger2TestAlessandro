package mawashi.alex.dagger2testalessandro.Model;

public class BronzePSU implements PowerSupply{

    String name;

    public BronzePSU(){
        this.name = "BronzePSU";
    }

    @Override
    public String getPowerSupplyName(){
        return this.name;
    }

}
