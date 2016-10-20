package mawashi.alex.dagger2testalessandro.View;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import javax.inject.Inject;

import mawashi.alex.dagger2testalessandro.Application.WholeApplication;
import mawashi.alex.dagger2testalessandro.Model.PC;
import mawashi.alex.dagger2testalessandro.Presenter.ComputerComponent;
//import mawashi.alex.dagger2testalessandro.Presenter.DaggerComputerComponent;
import mawashi.alex.dagger2testalessandro.R;

import static android.R.id.text1;

public class MainActivity extends AppCompatActivity {

 //   @Inject PC pc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //    WholeApplication.getComponent().inject(this);

    }

    public void NewPC1(View v){
        TextView PC1Features = (TextView)findViewById(R.id.text1);
  //      PC1Features.setText(pc1.getFeatures());
    }
}
