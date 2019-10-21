package com.example.ntaskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button2);

        // add the event listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View event) {
                System.out.println("clicked");
                // Grab what the text should be
                EditText editText = findViewById(R.id.wanttobuy);
                String typedText = editText.getText().toString();
                // set the text to be that
                TextView textView = findViewById(R.id.itemtobuy);
                textView.setText(typedText);
                MainActivity.this.findViewById(R.id.itemtobuy).setVisibility(View.VISIBLE);

            }
        });

        Button buyButton = findViewById((R.id.buyit));

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View event) {
                // go to the other activity
                // create the intent to go to that activity and start it!
                // must use MainActivity.this to reference this
                // not something to memorize, just refresh when you need it
//                Intent goToBuyActivityIntent = new Intent(MainActivity.this, BuyItem.class);
//                MainActivity.this.startActivity(goToBuyActivityIntent);

                // Adventure into opening another app
                
            }
        });

    }
}
