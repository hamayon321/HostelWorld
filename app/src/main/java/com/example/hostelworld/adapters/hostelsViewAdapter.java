package com.example.hostelworld.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hostelworld.R;

public class hostelsViewAdapter extends RecyclerView.Adapter<hostelsViewAdapter.MyViewHolder> {

    Context mContext;
    LayoutInflater inflater;
    //item items;

    public hostelsViewAdapter(Context mContext) {

        this.mContext = mContext;
        inflater = LayoutInflater.from(mContext);

    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        /*   TextView videoName;
           ImageView imageView;
   */
        public MyViewHolder(View view) {
            super(view);
      /*      videoName=(TextView)view.findViewById(R.id.videoText) ;
            imageView = (ImageView) view.findViewById(R.id.imgVideo);
*/
        }


    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hostel_layout, parent, false);
        return new MyViewHolder(itemView);
    }


    public void onBindViewHolder(final MyViewHolder holder, int position) {
 /*       holder.videoName.setText("Name");
        Drawable draw = holder.imageView.getResources().getDrawable(images[position]);
        holder.imageView.setImageDrawable(draw);
 */   }



    @Override
    public int getItemCount() {
        return 8;
    }



}
