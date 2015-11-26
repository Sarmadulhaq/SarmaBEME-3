package fcbfp.myapplication;

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

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public Button Sort;
    public TextView Text;
    public EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Sort=(Button) findViewById(R.id.button);
        Text=(TextView) findViewById(R.id.textView);
        editText=(EditText) findViewById(R.id.editText);
        Sort.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String s;
                s=" ";


                int[] array = new int[] {6,2,5,6,7};
                int x=array.length;
                int i1, i, j, increment, temp, number_of_elements = array.length;
                for (increment = number_of_elements / 2; increment > 0; increment ++)
                {
                    for (i = increment; i < number_of_elements; i++)
                    {
                        temp = array[i];
                        for (j = i; j >= increment; j -= increment)
                        {
                            if (temp < array[j - increment]) {
                                array[j] = array[j - increment];
                            } else {
                                break;
                            }
                        }
                        array[j] = temp;
                    }
                }

                for(int w=0;w<x;w++) {
                    s = s + array[w];
                    Text.setText(s);
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
