package com.ptp.phamtanphat.listviewnangcao1206;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;

import java.util.ArrayList;

//Bo khung de tao ra 1 ban ve cho listview
public class MonanAdapter extends BaseAdapter{
    // 3 du lieu can thiet cho qua trinh xay dung adapter
    Context context;
    int layout;
    ArrayList<Monan> mangmonan;

    public MonanAdapter(Context context, int layout, ArrayList<Monan> mangmonan) {
        this.context = context;
        this.layout = layout;
        this.mangmonan = mangmonan;
    }

    // So luong dong item duoc ve trong listview
    @Override
    public int getCount() {
        return mangmonan.size();
    }

    //Tra ve du lieu cho moi item
    @Override
    public Object getItem(int position) {
        return mangmonan.get(position);
    }

    //Bo qua
    @Override
    public long getItemId(int position) {
        return 0;
    }
//
//    item1 - layoutnhanban1 = converTViewnhanban1
//    item2 - layoutnhanban2 = converTViewnhanban2
//    item3 - layoutnhanban3 = converTViewnhanban3
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Dinh nghia lai layout cho moi item
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //convertView se la con tro cho moi layoutnhanban
        convertView = layoutInflater.inflate(layout,null);
        //
        return null;
    }
}
