package com.example.orion.agendapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Orion on 10/04/2017.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder>{

    public  static class EventViewHolder extends  RecyclerView.ViewHolder{

        public EventViewHolder(View itemView) {
            super(itemView);
        }
    }
    @Override
    public EventAdapter.EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(EventAdapter.EventViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
