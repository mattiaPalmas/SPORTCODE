package com.exerciseapp.mattiapalmas.sportcode;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by mattia palmas on 2017-09-06.
 */

public class ExpandableMenuAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> menuDataHeader;
    private HashMap<String,List<String>> listHashMap;

    public ExpandableMenuAdapter(Context context, List<String> menuDataHeader, HashMap<String, List<String>> listHashMap) {
        this.context = context;
        this.menuDataHeader = menuDataHeader;
        this.listHashMap = listHashMap;
    }

    @Override
    public int getGroupCount() {
        return menuDataHeader.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listHashMap.get(menuDataHeader.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return menuDataHeader.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listHashMap.get(menuDataHeader.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String headertitle = (String) getGroup(i);

        if(view==null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.menu_group, null);
        }
            TextView menuListHeader = (TextView) view.findViewById(R.id.titleHeader);
            menuListHeader.setTypeface(null, Typeface.BOLD);
            menuListHeader.setText(headertitle);
            return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        final String childText = (String) getChild(i,i1);

        if(view==null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.menu_item, null);
        }

        TextView txtListChild = (TextView) view.findViewById(R.id.list_item);
        TextView txtListChild2 = (TextView) view.findViewById(R.id.list_item2);
        txtListChild.setText(childText);
        switch (i){
            case 0 :
                txtListChild2.setText("Exemple that i can add more rows if i need");
                break;
            case 1 :
                txtListChild2.setText("here i'm changeinf the history");
                break;
        }
        return view;

    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
