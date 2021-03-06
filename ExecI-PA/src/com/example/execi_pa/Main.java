package com.example.execi_pa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {

	Button btCLickMe, btPushMe;
	
	TextView text, text1, text2;
	
	BotoesUtilFacade util;
	
	int contadorClick = 0, contadorPush = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		btCLickMe = (Button) findViewById(R.id.clickMe);
		
		btPushMe = (Button) findViewById(R.id.pushMe);
		
		text = (TextView) findViewById(R.id.texto);
		
		text1 = (TextView) findViewById(R.id.text1);
		
		text2 = (TextView) findViewById(R.id.text2);
		
		btCLickMe.setText("Click Me!");

		btPushMe.setText("Push Me!");
		
		text.setText("This is a text!!");
		
		text1.setText("Click Me:"+contadorClick);
		
		text2.setText("Push Me:"+contadorPush);
		
		util = new BotoesUtil();
		
		btCLickMe.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				btCLickMe.setBackgroundColor(util.randomizerColorButton());
				
				contadorClick++;
				
				text1.setText("Click Me:"+contadorClick);
			}
		});
		
		btPushMe.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				util = new BotoesUtil();
				
				btPushMe.setBackgroundColor(util.randomizerColorButton());
				
				contadorPush++;
				
				text2.setText("Push Me:"+contadorPush);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
