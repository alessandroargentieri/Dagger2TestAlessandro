package mawashi.alex.dagger2testalessandro.Model;


public class DDR3 implements Memory{

    int megabytes;
    String name;

    public DDR3(int Megabites){
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

