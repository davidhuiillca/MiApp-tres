package com.example.david;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	Toast.makeText(this,"sale abriendo  la aplicacion", Toast.LENGTH_LONG).show();
    	super.onStart();
    }
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	Toast.makeText(this,"sale pausando la aplicacion", Toast.LENGTH_LONG).show();
    	super.onResume();
    }
    @Override
    protected void onRestart() {
    	// TODO Auto-generated method stub
    	Toast.makeText(this,"sale restaurando la aplicacion", Toast.LENGTH_LONG).show();
    	super.onRestart();
    }
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	Toast.makeText(this,"sale stop parando al aplicacion", Toast.LENGTH_LONG).show();
    	super.onStop();
    }
   
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	Toast.makeText(this,"acabando la aplicacion", Toast.LENGTH_LONG).show();
    	super.onDestroy();
    }
 
    
}
