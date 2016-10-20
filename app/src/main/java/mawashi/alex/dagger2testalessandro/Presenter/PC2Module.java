package mawashi.alex.dagger2testalessandro.Presenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mawashi.alex.dagger2testalessandro.Model.ATX;
import mawashi.alex.dagger2testalessandro.Model.Computer;
import mawashi.alex.dagger2testalessandro.Model.DDR3;
import mawashi.alex.dagger2testalessandro.Model.GoldPSU;
import mawashi.alex.dagger2testalessandro.Model.Memory;
import mawashi.alex.dagger2testalessandro.Model.MotherBoard;
import mawashi.alex.dagger2testalessandro.Model.PC;
import mawashi.alex.dagger2testalessandro.Model.PowerSupply;
import mawashi.alex.dagger2testalessandro.Model.Processor;
import mawashi.alex.dagger2testalessandro.Model.x64CPU;

@Module
public class PC2Module {
    private final int memorySize;

    public PC2Module(int memorySize){
        this.memorySize = memorySize;
    }

    @Provides @Singleton
    Processor provideCPU(){
        return new x64CPU();
    }

   @Provides @Singleton
    Memory provideRAM(){
        return new DDR3(memorySize);
    }

    @Provides @Singleton
    PowerSupply providepowerSupply(){
        return new GoldPSU();
    }

    @Provides @Singleton
    MotherBoard provideMB(Processor cpu, Memory ram){ //Dagger2 will satisfy these dependencies
        return new ATX(cpu, ram);
    }

    @Provides @Singleton
    Computer provideComputer(Processor cpu, Memory ram, PowerSupply psu, MotherBoard mb){
        Computer pc = new PC(cpu, ram, psu, mb);
        pc.setComputerName("PC2");
        return pc;
    }
}