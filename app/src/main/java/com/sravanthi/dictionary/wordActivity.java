package com.sravanthi.dictionary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;

public class wordActivity extends AppCompatActivity {

    private int value;
    private TextView example,meaning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordactivity);
        Intent intent=getIntent();
        int value=intent.getIntExtra("value",0);
        meaning=findViewById(R.id.meaning);

        meaning=findViewById(R.id.meaning);
        if(value==0){
            meaning.setText("quiet, modest, reserved");
        }
        else if(value==1){
            meaning.setText("showing care in doing one's work");
        }
        else if(value==2){
            meaning.setText("to steal money by falsifying records");
        }
        else if(value==3){
            meaning.setText("sensitivity to another's feelings as if they were one's own");
        }
        else if(value==4){
            meaning.setText("learned or scholarly");
        }
        else if(value==5){
            meaning.setText("in an opposing direction");
        }
        else if(value==6){
            meaning.setText("chronologically misplaced");
        }
        else if(value==7){
            meaning.setText("being of questionable authenticity");
        }
        else if(value==8){
            meaning.setText("the quality of being honest and straightforward");
        }
        else if(value==9){
            meaning.setText("surround so as to force to give up");
        }
        else if(value==10){
            meaning.setText("a feeling of deep regret, usually for some misdeed");
        }
        else if(value==11){
            meaning.setText("go against, as of rules and laws");
        }
        else if(value==12){
            meaning.setText("so thin as to transmit light");
        }
        else if(value==13){
            meaning.setText("conspicuously and outrageously bad or reprehensible");
        }
        else if(value==14){
            meaning.setText("anything short-lived, as an insect that lives only for a day");
        }
        else if(value==15){
            meaning.setText("appropriate to a purpose");
        }
        else if(value==16){
            meaning.setText("a shackle for the ankles or feet");
        }
        else if(value==17){
            meaning.setText("someone who attacks cherished ideas or institutions");
        }
        else if(value==18){
            meaning.setText("lacking moral discipline");
        }
        else if(value==19){
            meaning.setText("the lowest point of anything");
        }
    }
}



