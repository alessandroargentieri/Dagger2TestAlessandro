package mawashi.alex.dagger2testalessandro.Model;

public class x64CPU implements Processor {
    String name;

    public x64CPU(){
        name = "x64CPU";
    }

    @Override
    public String getProcessorName(){
        return this.name;
    }
}
