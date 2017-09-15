package com.example.lucas.recyclerview;

import android.view.View;

/**
 * Created by Lucas on 14/09/2017.
 */

public interface ClickListener {
    void onClick(View view, int position);
    void onLongClick(View view, int position);
}