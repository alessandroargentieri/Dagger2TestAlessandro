package mawashi.alex.dagger2testalessandro.Model;


public class ATX implements MotherBoard {
    String name;
    Processor cpu;
    Memory ram;

    public ATX(Processor cpu, Memory ram){
        this.cpu = cpu;
        this.ram = ram;
        this.name = "ATX";
    }

    @Override
    public String getMotherBoardName(){
        return this.name;
    }

    @Override
    public String getMotherBoardFeatures(){
        return " with CPU: " + cpu.getProcessorName() + ", with RAM: " + ram.getMemoryName() + " of " + ram.getMemoryMega() + " Mb";
    }
}
