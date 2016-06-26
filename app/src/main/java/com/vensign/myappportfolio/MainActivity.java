package com.vensign.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnPopularMovies;
    private Button btnStockHawk;
    private Button btnBuildBigger;
    private Button btnAppMaterial;
    private Button btnUbiquitous;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPopularMovies = (Button) findViewById(R.id.btn_popular_movies);
        btnStockHawk = (Button) findViewById(R.id.btn_stock_hawk);
        btnBuildBigger = (Button) findViewById(R.id.btn_build_bigger);
        btnAppMaterial = (Button) findViewById(R.id.btn_app_material);
        btnUbiquitous = (Button) findViewById(R.id.btn_go_ubiquitous);
        btnCapstone = (Button) findViewById(R.id.btn_capstone);

        btnPopularMovies.setOnClickListener(this);
        btnStockHawk.setOnClickListener(this);
        btnBuildBigger.setOnClickListener(this);
        btnAppMaterial.setOnClickListener(this);
        btnUbiquitous.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        goToast(v);
    }

    private void goToast(View v) {
        //From Stackoverflow http://stackoverflow.com/questions/5620772/get-text-from-pressed-button
        Button b = (Button) v;
        String buttonText = b.getText().toString();
        String showText = "This button will launch my " + buttonText + " app!";
        Toast toast = Toast.makeText(getApplicationContext(), showText, Toast.LENGTH_SHORT);
        toast.show();
    }
}
