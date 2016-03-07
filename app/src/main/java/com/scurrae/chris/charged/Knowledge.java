package com.scurrae.chris.charged;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by chris on 3/7/16.
 */
public class Knowledge extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knowledge);
        String[] categ = {"Fashion", "Entertainment", "Sports", "Travelling", "Shopping", "Science", "Technologies", "Finances" };
        ArrayAdapter adapte = new ArrayAdapter<String>(this, R.layout.knowledge, categ);

        final ListView listView = (ListView) findViewById(R.id.lsview);
        listView.setAdapter(adapte);
    }
}
