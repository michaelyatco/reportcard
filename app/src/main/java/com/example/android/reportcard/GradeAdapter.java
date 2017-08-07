package com.example.android.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mjyatco on 8/7/17.
 */

public class GradeAdapter extends ArrayAdapter<Grade> {

    private static final String LOG_TAG = GradeAdapter.class.getSimpleName();


    public GradeAdapter(Activity context, ArrayList<Grade> grades) {
        super(context, 0, grades);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Grade currentGrade = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.subject_name);
        nameTextView.setText(currentGrade.getSubject());

        TextView numberTextView = listItemView.findViewById(R.id.mark_number);
        numberTextView.setText(currentGrade.getMark());

        return listItemView;
    }

}

