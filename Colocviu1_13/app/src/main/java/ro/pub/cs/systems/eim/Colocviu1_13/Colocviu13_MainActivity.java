package ro.pub.cs.systems.eim.Colocviu1_13;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class Colocviu13_MainActivity extends AppCompatActivity {

    private Button north, south, west, east;
    TextView text_counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        north = (Button)findViewById(R.id.button);
        west = (Button)findViewById(R.id.button2);
        east = (Button)findViewById(R.id.button3);
        south = (Button)findViewById(R.id.button4);

        north.setOnClickListener(buttonClickListener);
        east.setOnClickListener(buttonClickListener);
        west.setOnClickListener(buttonClickListener);
        south.setOnClickListener(buttonClickListener);
    }

    private ButtonClickListener buttonClickListener = new ButtonClickListener();

    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String text = text_counter.getText().toString();


            if(view.getId() == R.id.button) {
                text += "NORTH";
            }

            if(view.getId() == R.id.button2) {
                text += "WEST";
            }

            if(view.getId() == R.id.button3) {
                text += "EAST";
            }

            if(view.getId() == R.id.button4) {
                text += "SOUTH";
            }

            if (text != "" && text != "\n")
            {
                text += ",";
            }

            text_counter.setText(text);
        }
    }

}
