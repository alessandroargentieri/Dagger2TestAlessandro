package mawashi.alex.dagger2testalessandro.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import javax.inject.Inject;

import mawashi.alex.dagger2testalessandro.Application.WholeApplication;
import mawashi.alex.dagger2testalessandro.Model.PC;
import mawashi.alex.dagger2testalessandro.R;

import static android.R.id.text1;

public class Main2Activity extends AppCompatActivity {

//    @Inject PC pc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // WholeApplication.getComponent().inject(this);
    }

    public void NewPC2(View v){
       TextView PC2Features = (TextView)findViewById(R.id.text2);
  //     PC2Features.setText(pc2.getFeatures());
    }
}
