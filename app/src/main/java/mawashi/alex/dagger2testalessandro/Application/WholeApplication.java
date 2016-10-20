package mawashi.alex.dagger2testalessandro.Application;

import android.app.Application;
import android.content.Context;

import mawashi.alex.dagger2testalessandro.Presenter.ComputerComponent;
//import mawashi.alex.dagger2testalessandro.Presenter.DaggerComputerComponent;
import mawashi.alex.dagger2testalessandro.Presenter.PC1Module;
import mawashi.alex.dagger2testalessandro.Presenter.PC2Module;

public class WholeApplication extends Application {
    private static Context appContext;
    static ComputerComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
        //component = new DaggerComputerComponent.builder().pC1Module(new PC1Module(256)).pC2Module(new PC2Module(16384)).build();


    }

    public static ComputerComponent getComponent(){

        return component;
    }

    //essendo statico sia il metodo che il contesto dichiarato, per richiamarlo non ho bisogno di istanziare WholeApplication
    public static Context getContext() {
        return appContext;
    }

}
