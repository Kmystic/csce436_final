package com.example.renscan;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class NewItemActivity extends Activity {
	private Spinner spinner1, spinner2, spinner3, spinner4;
	private Button submit;
	private String imagePath;
	private ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.category);
		
		//getActionBar().setDisplayHomeAsUpEnabled(true);
		
		
		//addImage();
		
		addListenerOnButton();
		addListenerOnSpinnerItemSelection();
		 //Show the Up button in the action bar.
		
		
		// get the intent to get the image path
		//Intent intent = getIntent();
		//imagePath = intent.getExtras().getString("imagePath");
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_new_item, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	 public void addImage() {
		 	int res = getResources().getIdentifier(imagePath, "drawable", this.getPackageName());
			image = (ImageView) findViewById(R.id.imageView1);
			image.setImageResource(res);
		  }

	public void addListenerOnSpinnerItemSelection() {
    	spinner1 = (Spinner) findViewById(R.id.spinner1);
    	spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    	spinner2 = (Spinner) findViewById(R.id.spinner2);
    	spinner2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    	spinner3 = (Spinner) findViewById(R.id.spinner3);
    	spinner3.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    	spinner4 = (Spinner) findViewById(R.id.spinner4);
    	spinner4.setOnItemSelectedListener(new CustomOnItemSelectedListener());
      }
     
      // get the selected dropdown list value
	  public void addListenerOnButton() {
	 
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		spinner3 = (Spinner) findViewById(R.id.spinner3);
		spinner4 = (Spinner) findViewById(R.id.spinner4);
		submit = (Button) findViewById(R.id.submit);
	 
		submit.setOnClickListener(new OnClickListener() {
	 
		  @Override
		  public void onClick(View v) {
	 
		    Toast.makeText(NewItemActivity.this,
			"OnClickListener : " + 
	            "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()) + 
	            "\nSpinner 2 : "+ String.valueOf(spinner2.getSelectedItem()) +
	            "\nSpinner 3 : "+ String.valueOf(spinner3.getSelectedItem()) +
	            "\nSpinner 4 : "+ String.valueOf(spinner4.getSelectedItem()),
				Toast.LENGTH_SHORT).show();
		  }
	 
		});
	  }

}
