package com.example.MusicMp3.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.MusicMp3.Activity.DangKyActivity;
import com.example.MusicMp3.R;


public class Dialog_Forget_Password extends AppCompatActivity {

    ImageView imgclose;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_forget_password);
        imgclose = findViewById(R.id.imageCloseqmk);
        overridePendingTransition(R.anim.anim_intent_in, R.anim.anim_intent_out);
        imgclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dialog_Forget_Password.this, DangKyActivity.class);
                startActivity(intent);
            }
        });
    }

}
