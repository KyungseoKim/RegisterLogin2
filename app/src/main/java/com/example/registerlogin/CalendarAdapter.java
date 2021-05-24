package com.example.registerlogin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.registerlogin.R;

import java.util.ArrayList;

public class CalendarAdapter extends RecyclerView.Adapter<com.example.registerlogin.CalendarViewHolder>
{
    private final ArrayList<String> daysOfMonth;
    private final OnItemListener OnItemListener;

    public CalendarAdapter(ArrayList<String> daysOfMonth, CalendarAdapter.OnItemListener onItemListener)
    {
        this.daysOfMonth = daysOfMonth;
        OnItemListener = onItemListener;
    }

    @NonNull
    @Override
    public com.example.registerlogin.CalendarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.calendar_cell, parent, false);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (parent.getHeight() * 0.16666666);
        return new com.example.registerlogin.CalendarViewHolder(view, OnItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.registerlogin.CalendarViewHolder holder, int position)
    {
        holder.dayOfMonth.setText(daysOfMonth.get(position));
    }

    @Override
    public int getItemCount()
    {
        return daysOfMonth.size();
    }

    public interface OnItemListener
    {
        void onItemClick(int position, String dayText);
    }
}
