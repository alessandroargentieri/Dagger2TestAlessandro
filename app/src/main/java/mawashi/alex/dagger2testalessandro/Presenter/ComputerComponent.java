package mawashi.alex.dagger2testalessandro.Presenter;

import dagger.Component;
import mawashi.alex.dagger2testalessandro.View.Main2Activity;
import mawashi.alex.dagger2testalessandro.View.MainActivity;

@Component(modules={PC1Module.class, PC2Module.class})
public interface ComputerComponent {
    //void injectInActivity1(MainActivity myActivity);
    //void injectInActivity2(Main2Activity myActivity);
    void inject(MainActivity myActivity);
    void inject(Main2Activity myActivity);

}
