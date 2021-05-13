package com.example.firstapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView; // bottom_navigation view

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 오버플로우 메뉴
        switch (item.getItemId()) {
            case R.id.account:
                playBtn();
                return true;
            case R.id.logout:
                stopBtn();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void stopBtn() {
    }

    private void playBtn() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavi);

        //처음화면
        getSupportFragmentManager().beginTransaction().add(R.id.main_frame, new Fragment1()).commit(); //Framelayout에 fragment.xml띄우기

        //바텀 네비게이션 뷰 안의 아이템 설정
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    //item 클릭시 id값을 가져와 Framelayout에 fragment.xml 띄우기
                    case R.id.item_fragment1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Fragment1()).commit();
                        break;
                    case R.id.item_fragment2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Fragment2()).commit();
                        break;
                    case R.id.item_fragment3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Fragment3()).commit();
                        break;
                    case R.id.item_fragment4:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Fragment4()).commit();
                        break;
                    case R.id.item_fragment5:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Fragment5()).commit();
                        break;
                }
                return true;
            }
        });

    }

}