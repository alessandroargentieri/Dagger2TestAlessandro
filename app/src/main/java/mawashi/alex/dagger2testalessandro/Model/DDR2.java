package mawashi.alex.dagger2testalessandro.Model;


public class DDR2 implements Memory{

    int megabytes;
    String name;

    public DDR2(int Megabites){
        this.megabytes = Megabites;
    }

    @Override
    public String getMemoryName(){
        return this.name;
    }

    @Override
    public int getMemoryMega(){
        return this.megabytes;
    }

}
