package co.edu.unipiloto.signaltype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindSignActivity extends AppCompatActivity {

    private SignExpert expert = new SignExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindSign(View view){
        TextView signs = (TextView) findViewById(R.id.signs);
        Spinner typeSign = (Spinner) findViewById(R.id.typeSignal);
        String SelectedSignType = String.valueOf(typeSign.getSelectedItem());

        List<String> signsList = expert.getSigns(SelectedSignType);
        StringBuilder signsFormatted = new StringBuilder();
            for (String sign : signsList){
                signsFormatted.append(sign).append('\n');
            }

        signs.setText(signsFormatted);
    }
}