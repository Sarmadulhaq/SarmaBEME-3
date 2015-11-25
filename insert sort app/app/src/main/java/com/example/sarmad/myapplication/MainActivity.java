package com.example.sarmad.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button InsertSort;
    public EditText Edit;
    public TextView Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        InsertSort = (Button) findViewById(R.id.button);
        Text = (TextView) findViewById(R.id.textView2);
        InsertSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
		int[] num =new int[] {2,78,4,3};
		int x= num.length;
		String S=",";

		for(int u=0;u<x;u++)
		{
			for(int y=0;y<x;y++)
			{
				for(int z=y+1;z<x;z++)
				{
					if(num[y]>num[z])
					{
					int temp= num[y+u];
					num[y+u]=num[z];
					num[z]=temp;
					}
				
				}
			
			}
			S=S+num[u];
                    Text.setText(S);
			
		}
            
            }



        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
