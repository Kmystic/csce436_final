package com.example.renscan;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Welcome extends Activity {

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);  
        Button b3 = (Button) findViewById(R.id.button3);  
        TextView t1 = (TextView) findViewById(R.id.textView1);  
        Typeface font = Typeface.createFromAsset(getAssets(), "Chantelli_Antiqua.ttf");  
        b1.setTypeface(font);  
        b2.setTypeface(font);  
        b3.setTypeface(font);  
        t1.setTypeface(font);  
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_welcome, menu);
        return true;
    }
    
    public void startScanActivity(View view) {
    	Intent intent = new Intent(this, ScanActivity.class);
    	startActivity(intent);
    }
    
    public void startInventoryActivity(View view) {
    	Intent intent = new Intent(this, InventoryActivity.class);
    	startActivity(intent);
    }
    /* Testing my page - Kira*/
    public void startNewItemActivity(View view) {
    	Intent intent = new Intent(this, NewItemActivity.class);
    	startActivity(intent);
    }
    
    

}