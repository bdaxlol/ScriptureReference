package com.example.ducks.scripturereference;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_BOOK = "com.example.ScriptureReference.BOOK";
    public final static String EXTRA_CHAP = "com.example.ScriptureReference.CHAP";
    public final static String EXTRA_VERSE = "com.example.ScriptureReference.VERSE";

    /*

    Button btn = (Button)findViewById(R.id.shareButton);
    btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    startActivity(new Intent(MainActivty.this, DisplayActivity.class));
    }
    });

    */

    public void nextActivity(View v) {
        Intent intent = new Intent(this, DisplayActivity.class);
        EditText editBookText = (EditText) findViewById(R.id.bookField);
        EditText editChapText = (EditText) findViewById(R.id.chapField);
        EditText editVerseText = (EditText) findViewById(R.id.verseField);
        String theBook = editBookText.getText().toString();
        String theChap = editChapText.getText().toString();
        String theVerse = editVerseText.getText().toString();
        intent.putExtra(EXTRA_BOOK, theBook);
        intent.putExtra(EXTRA_CHAP, theChap);
        intent.putExtra(EXTRA_VERSE, theVerse);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
