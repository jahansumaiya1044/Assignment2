package com.example.assingment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

package com.example.uiwidgets;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private RadioButton radioOption1, radioOption2;
    private RatingBar ratingBar;
    private SeekBar seekBar;
    private Switch switchToggle;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        checkBox = findViewById(R.id.checkbox_example);
        radioOption1 = findViewById(R.id.radio_option1);
        radioOption2 = findViewById(R.id.radio_option2);
        ratingBar = findViewById(R.id.rating_bar);
        seekBar = findViewById(R.id.seek_bar);
        switchToggle = findViewById(R.id.switch_toggle);
        submitButton = findViewById(R.id.submit_button);

        // Set up button click listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CheckBox state
                if (checkBox.isChecked()) {
                    Toast.makeText(MainActivity.this, "CheckBox: Agreed", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "CheckBox: Not Agreed", Toast.LENGTH_SHORT).show();
                }
                 milkCheckBox=(CheckBox) findViewdById(R.id.milkCheckBoxId);



                // RadioButton
                if (radioOption1.isChecked()) {
                    Toast.makeText(MainActivity.this, "RadioButton: Option 1", Toast.LENGTH_SHORT).show();
                } else if (radioOption2.isChecked()) {
                    Toast.makeText(MainActivity.this, "RadioButton: Option 2", Toast.LENGTH_SHORT).show();
                }

                // RatingBar
                float ratingValue = ratingBar.getRating();
                Toast.makeText(MainActivity.this, "RatingBar: " + ratingValue + " stars", Toast.LENGTH_SHORT).show();

                // SeekBar
                int seekBarValue = seekBar.getProgress();
                Toast.makeText(MainActivity.this, "SeekBar: " + seekBarValue + "%", Toast.LENGTH_SHORT).show();

                // Switch
                if (switchToggle.isChecked()) {
                    Toast.makeText(MainActivity.this, "Switch: Enabled", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Switch: Disabled", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}