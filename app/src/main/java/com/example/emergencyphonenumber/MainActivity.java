package com.example.emergencyphonenumber;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.emergencyphonenumber.db.LoginDbHelper;

public class MainActivity extends AppCompatActivity {

    private LoginDbHelper mdbHelper;
    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cracker(View view) {

        mdbHelper = new LoginDbHelper(this);
        mDb = mdbHelper.getReadableDatabase();

        final Context context = getApplicationContext();
        final EditText usre = findViewById(R.id.editUser);
        final EditText pass = findViewById(R.id.editPass);
        Button kod = findViewById(R.id.Login);

        if (mdbHelper.check(usre.getText().toString(), pass.getText().toString())) {
            Toast toast = Toast.makeText(context, "YES", Toast.LENGTH_SHORT);
            toast.show();
            Intent intent = new Intent(MainActivity.this, ListTaleActivity.class);
            intent.putExtra("position", 0);
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(context, "NO", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
