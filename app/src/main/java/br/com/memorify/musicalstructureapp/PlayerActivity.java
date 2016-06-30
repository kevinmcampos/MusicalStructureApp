package br.com.memorify.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PlayerActivity extends AppCompatActivity {

    private View detailsButton;

    public static void startPlayer(Activity activity) {
        activity.startActivity(new Intent(activity, PlayerActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        bindViews();
        setupViews();
    }

    private void bindViews() {
        detailsButton = findViewById(R.id.details_content);
    }

    private void setupViews() {
        detailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailActivity.startDetail(PlayerActivity.this);
            }
        });
    }
}
