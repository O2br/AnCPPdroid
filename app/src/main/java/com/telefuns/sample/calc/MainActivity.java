

package com.telefuns.sample.calc;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.telefuns.sample.clac.R;

public class MainActivity extends Activity {
    TextView result;
    EditText number1;
    EditText number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.statusView);
        number1   = (EditText)findViewById(R.id.number1);
        number2   = (EditText)findViewById(R.id.number2);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void doAdd(View view) {

        int a = Integer.valueOf(number1.getText().toString());
        int b = Integer.valueOf(number2.getText().toString());

        Integer r= add(a, b);

        Log.i("Morteza", "mylog " + a + " + " + b + " =" + r);
        result.setText("Result is " + r.toString() + "\n");
    }


    static {
        System.loadLibrary("calcUtil");
    }

    public static native int add(int a, int b);

}
