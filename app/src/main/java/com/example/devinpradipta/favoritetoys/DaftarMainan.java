package com.example.devinpradipta.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DaftarMainan extends AppCompatActivity {
    // TODO (1) Declare a TextView variable called mToysListTextView
    TextView mToysListTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mainan);

        // TODO (3) Use findViewById to get a reference to the TextView from the layout
        mToysListTextView = (TextView) findViewById(R.id.textView);
        // TODO (4) Use the static ToyBox.getToyNames method and store the names in a String array
        String [] toyNames = ToyBox.getToyNames();
        // TODO (5) Loop through each toy and append the name to the TextView (add \n for spacing)
        for(String toyName : toyNames){
            mToysListTextView.append(toyName+ "\n\n\n");
        }
    }
}
