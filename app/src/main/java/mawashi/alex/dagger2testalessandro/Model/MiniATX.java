package mawashi.alex.dagger2testalessandro.Model;


public class MiniATX implements MotherBoard {
    String name;
    Processor cpu;
    Memory ram;

    public MiniATX(Processor cpu, Memory ram){
        this.cpu = cpu;
        this.ram = ram;
        this.name = "MiniATX";
    }

    @Override
    public String getMotherBoardName(){
        return this.name;
    }

    @Override
    public String getMotherBoardFeatures(){
        return "CPU: " + cpu.getProcessorName() + ", with RAM: " + ram.getMemoryName() + " of " + ram.getMemoryMega() + " Mb";
    }
}
