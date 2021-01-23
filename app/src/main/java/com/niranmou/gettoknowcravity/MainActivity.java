package com.niranmou.gettoknowcravity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button profile;
    Button member;
    Button myubi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // untuk menampilkan activity_main
        profile = (Button) findViewById(R.id.btn_profile);
        profile.setOnClickListener(this);
        // untuk menampilkan activity_cravity_profile setelah mengklik button btn_profile
        member = (Button) findViewById(R.id.btn_member);
        member.setOnClickListener(this);
        // untuk menampilkan activity_cravity_member setelah mengklik button btn_member
        myubi = (Button) findViewById(R.id.btn_myturn);
        myubi.setOnClickListener(this);
        // untuk menampilkan link mv setelah mengklik button btn_myturn
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.btn_profile:
                Intent profile = new Intent(MainActivity.this, CravityProfileActivity.class);
                startActivity(profile);
                break;
                // menggunakan intent explicit untuk menampilkan activity CravityProfileActivity
            case R.id.btn_member:
                Intent member = new Intent(MainActivity.this, CravityMemberActivity.class);
                startActivity(member);
                break;
                // menggunakan intent explicit untuk menampilkan activity CravityMemberActivity
            case R.id.btn_myturn:
                Intent myturn = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/IrnhtBxHDBY"));
                startActivity(myturn);
                break;
                // menggunakan intent implicit dengan ACTION_VIEW untuk membuka link
            default:
                break;
        }
    }
}