package mawashi.alex.dagger2testalessandro.Model;

public class PC implements Computer {
    String name;
    Processor cpu;
    Memory ram;
    PowerSupply psu;
    MotherBoard mb;

    public PC(Processor cpu, Memory ram, PowerSupply psu, MotherBoard mb){
        this.cpu = cpu;
        this.ram = ram;
        this.psu = psu;
        this.mb = mb;
    }

    @Override
    public void setComputerName(String name){
        this.name = name;
    }

    @Override
    public String getFeatures(){
        String features = "";
        if(!name.equals("") || !name.equals(null))
            features = "PC name: " + name + ", /n";
        features = features + "Features: /n";
        features = features + "CPU: " + cpu.getProcessorName() + ", /n";
        features = features + "RAM: " + ram.getMemoryName() + " of " + ram.getMemoryMega() + " Mb, /n";
        features = features + "PSU: " + psu.getPowerSupplyName() + ", /n";
        features = features + "MOTHERBOARD: " + mb.getMotherBoardName() + " with these features: /n";
        features = features + "  " + mb.getMotherBoardFeatures() + ".";
        return features;
    }


}
