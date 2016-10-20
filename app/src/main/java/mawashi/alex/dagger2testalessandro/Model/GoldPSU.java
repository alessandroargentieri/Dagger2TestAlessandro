package mawashi.alex.dagger2testalessandro.Model;


public class GoldPSU implements PowerSupply{

    String name;

    public GoldPSU(){
        this.name = "GoldPSU";
    }

    @Override
    public String getPowerSupplyName(){
        return this.name;
    }

}
