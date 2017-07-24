package com.example.qthjen.popupmenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMenuPopup();
            }
        });

    }

    private void showMenuPopup() {

        PopupMenu popupMenu = new PopupMenu(this, bt); // tham số thứ 2 là view cần tác động để hiện popup
        popupMenu.getMenuInflater().inflate(R.menu.activity_menu_popup, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch ( item.getItemId() ) {

                    case R.id.mnAdd: bt.setText("Add");break;
                    case R.id.mnInsert: bt.setText("Insert");break;
                    case R.id.mnDelete: bt.setText("Delete");break;

                }

                return false;
            }
        });

        popupMenu.show();

    }

}
