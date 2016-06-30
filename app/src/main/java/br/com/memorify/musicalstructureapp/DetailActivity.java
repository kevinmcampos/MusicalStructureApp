package br.com.memorify.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DetailActivity extends AppCompatActivity {

    private View songList;

    public static void startDetail(Activity activity) {
        activity.startActivity(new Intent(activity, DetailActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        bindViews();
        setupViews();
    }

    private void bindViews() {
        songList = findViewById(R.id.song_list);
    }

    private void setupViews() {
        songList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerActivity.startPlayer(DetailActivity.this);
            }
        });
    }
}
