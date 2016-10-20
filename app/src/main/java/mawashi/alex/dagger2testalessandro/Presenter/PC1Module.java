package mawashi.alex.dagger2testalessandro.Presenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mawashi.alex.dagger2testalessandro.Model.BronzePSU;
import mawashi.alex.dagger2testalessandro.Model.Computer;
import mawashi.alex.dagger2testalessandro.Model.DDR2;
import mawashi.alex.dagger2testalessandro.Model.Memory;
import mawashi.alex.dagger2testalessandro.Model.MiniATX;
import mawashi.alex.dagger2testalessandro.Model.MotherBoard;
import mawashi.alex.dagger2testalessandro.Model.PC;
import mawashi.alex.dagger2testalessandro.Model.PowerSupply;
import mawashi.alex.dagger2testalessandro.Model.Processor;
import mawashi.alex.dagger2testalessandro.Model.x32CPU;

@Module
public class PC1Module {
    private final int memorySize;

    public PC1Module(int memorySize){
        this.memorySize = memorySize;
    }

    @Provides @Singleton
    Processor provideCPU(){
        return new x32CPU();
    }

    @Provides @Singleton
    Memory provideRAM(){
        return new DDR2(memorySize);
    }

    @Provides @Singleton
    PowerSupply providepowerSupply(){
        return new BronzePSU();
    }

    @Provides @Singleton
    MotherBoard provideMB(Processor cpu, Memory ram){ //Dagger2 will satisfy these dependencies
        return new MiniATX(cpu, ram);
    }

    @Provides @Singleton
    Computer provideComputer(Processor cpu, Memory ram, PowerSupply psu, MotherBoard mb){
        Computer pc = new PC(cpu, ram, psu, mb);
        pc.setComputerName("PC1");
        return pc;
    }
}