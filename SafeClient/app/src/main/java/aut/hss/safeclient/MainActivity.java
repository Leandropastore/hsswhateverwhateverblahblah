package aut.hss.safeclient;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    EditText username, aes, phonenum, user2;
    Button firstcontact, register, getPubKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        aes = (EditText) findViewById(R.id.aes);
        phonenum = (EditText) findViewById(R.id.phone_num);
        user2 = (EditText) findViewById(R.id.user2);

        firstcontact = (Button) findViewById(R.id.first_contact);
        register = (Button) findViewById(R.id.register);
        getPubKey = (Button) findViewById(R.id.get_public_key);

        firstcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.getText();
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
