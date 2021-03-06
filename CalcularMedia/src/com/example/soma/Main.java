package com.example.soma;

import android.os.Bundle;
import android.view.Menu;
import android.widget.*;
import android.view.*;
import android.app.*;

public class Main extends Activity {

	EditText ednumero1,ednumero2, ednumero3;	
	
	Button btCalcular;
	
	CalcularMedia calc;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ednumero1 = (EditText) findViewById(R.id.numero1);
		ednumero2 = (EditText) findViewById(R.id.numero2);
		ednumero3 = (EditText) findViewById(R.id.numero3);
		
		btCalcular = (Button) findViewById(R.id.btCalcular);
		
		
		btCalcular.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				double num1 = Double.parseDouble(ednumero1.getText().toString());
				double num2 = Double.parseDouble(ednumero2.getText().toString());
				double num3 = Double.parseDouble(ednumero3.getText().toString());
				
				double[] resultNum = new double[3];
				
				resultNum[0] = num1;
				resultNum[1] = num2;
				resultNum[2] = num3;
				
				calc =  new GeCalcularMedia();
				
				String result = calc.calcNumeros(resultNum);
				
//				Toast t = Toast.makeText(Main.this, result, Toast.LENGTH_SHORT);
//				t.setText("blablabla");
//				t.show();
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(Main.this);
				dialogo.setTitle("Resultado");
				dialogo.setMessage(result);
				dialogo.setNeutralButton("Voltar", null);
				dialogo.show();
				
				ednumero1.setText("");
				ednumero2.setText("");
				ednumero3.setText("");
			
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
