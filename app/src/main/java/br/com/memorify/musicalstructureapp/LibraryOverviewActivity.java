package br.com.memorify.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LibraryOverviewActivity extends AppCompatActivity {

    private View seeMoreButton;
    private View albumsContent;
    private View playerContent;
    private View playPauseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libraryoverview);
        bindViews();
        setupViews();
    }

    private void bindViews() {
        seeMoreButton = findViewById(R.id.see_more_button);
        albumsContent = findViewById(R.id.albums_content);
        playerContent = findViewById(R.id.now_playing_content);
        playPauseButton = findViewById(R.id.play_pause_button);
    }

    private void setupViews() {
        seeMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LibraryOverviewActivity.this, "Not implemented", Toast.LENGTH_SHORT).show();
            }
        });
        albumsContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailActivity.startDetail(LibraryOverviewActivity.this);
            }
        });
        playerContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerActivity.startPlayer(LibraryOverviewActivity.this);
            }
        });
        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LibraryOverviewActivity.this, "Should play or pause music", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
