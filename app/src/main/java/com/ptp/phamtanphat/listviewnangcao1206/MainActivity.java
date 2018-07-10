package com.ptp.phamtanphat.listviewnangcao1206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvMonan;
    ArrayList<Monan> monanArrayList;
    MonanAdapter monanAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonan = findViewById(R.id.listview);

        monanArrayList = new ArrayList<>();

        monanArrayList.add(new Monan("Com tron",50000,R.drawable.moncomtron));
        monanArrayList.add(new Monan("Banh gao",20000,R.drawable.monbanhgao));
        monanArrayList.add(new Monan("Kim chi",45000,R.drawable.monkimchi));
        monanArrayList.add(new Monan("Mi Han Quoc",65000,R.drawable.monmihanquoc));
        monanArrayList.add(new Monan("Sushi",30000,R.drawable.monsushi));


        monanAdapter = new MonanAdapter(MainActivity.this,R.layout.dong_item_monan,monanArrayList);
        lvMonan.setAdapter(monanAdapter);
    }

}
