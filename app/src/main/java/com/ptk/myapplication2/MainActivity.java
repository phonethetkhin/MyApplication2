package com.ptk.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*rvMusic = findViewById(R.id.rvMusic);


        MusicAdapter musicAdapter = new MusicAdapter(fetchMusicModelDummy());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rvMusic.addItemDecoration(dividerItemDecoration);
        rvMusic.setAdapter(musicAdapter);*/

        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("    I am title");
        actionBar.setSubtitle("     I am subtitle");
        actionBar.setIcon(R.drawable.baseline_backup_24);

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);


    }

    private ArrayList<MusicModel> fetchMusicModelDummy() {
        ArrayList<MusicModel> names = new ArrayList<>();

        names.add(new MusicModel("Hello","Adale","2013"));
        names.add(new MusicModel("First of the Year", "Skrillex", "2014"));
        names.add(new MusicModel("Sorry","Justin Bieber","2015"));
        names.add(new MusicModel("Perfect","Ed Sheeran","2016"));
        names.add(new MusicModel("PhotoGraph","Ed Sheeran","2017"));
        names.add(new MusicModel("As long as you love me", "Backstreet Boys","2018"));
        names.add(new MusicModel("Love me","Justin Bieber","2019"));

        return names;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.nav_upload: {
                Toast.makeText(this, "Upload Clicked", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.nav_get_direction:
                Toast.makeText(this, "Get Direction Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_setting:
                Toast.makeText(this, "Setting Clicked", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}