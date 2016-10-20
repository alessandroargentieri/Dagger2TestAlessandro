package mawashi.alex.dagger2testalessandro.Model;


public class x32CPU implements Processor {
    String name;

    public x32CPU(){
        name = "x32CPU";
    }

    @Override
    public String getProcessorName(){
        return this.name;
    }
}
