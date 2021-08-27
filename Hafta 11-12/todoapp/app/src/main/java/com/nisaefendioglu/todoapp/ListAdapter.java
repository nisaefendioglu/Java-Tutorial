package com.nisaefendioglu.todoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ListAdapter extends ArrayAdapter {

    private List<TaskActivity> mTaskList;


    ListAdapter(Context context, List<TaskActivity> taskEntries) {
        super(context, R.layout.task_layout);
        this.mTaskList = taskEntries;
    }


    @Override
    public int getCount() {
        return mTaskList.size();
    }


    @Override
    public Object getItem(int position) {
        return position;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.task_layout, parent, false);

            viewHolder.tvDescription = convertView.findViewById(R.id.taskDescription);
            viewHolder.tvUpdatedAt = convertView.findViewById(R.id.taskUpdated);
            viewHolder.tvPriority = convertView.findViewById(R.id.priorityTextView);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        TaskActivity taskEntry = mTaskList.get(position);

        viewHolder.tvDescription.setText(taskEntry.getDescription());
        viewHolder.tvUpdatedAt.setText(getTaskTime(taskEntry.getUpdatedAt()));
        viewHolder.tvPriority.setText(String.valueOf(taskEntry.getPriority()));

        return convertView;
    }


    private class ViewHolder {
        TextView tvDescription;
        TextView tvUpdatedAt;
        TextView tvPriority;
    }

    //zaman formatları
    private String getTaskTime(Date date) {
        StringBuilder builder = new StringBuilder();

        // time
        SimpleDateFormat timeFormat = new SimpleDateFormat(
                "hh:mm:ss", Locale.getDefault());
        // Date
        DateFormat dateFormat = DateFormat.
                getDateInstance(DateFormat.LONG);


        builder.append(dateFormat.format(date));
        builder.append("\tat\t");
        builder.append(timeFormat.format(date));

        return builder.toString();
    }

}
