package com.example.root.aboutus;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 30/3/18.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<ModelSponser> mlist;
    FoodAdapter(Context context, ArrayList<ModelSponser> list){
        mContext=context;
        mlist=list;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.rl_sponser_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ModelSponser modelSponser = mlist.get(position);

        ImageView image=holder.imageView;
        TextView text, subtext;
        text=holder.textView1;
        subtext=holder.textView2;

        image.setImageResource(modelSponser.getImage());

        text.setText(modelSponser.getName());
        subtext.setText(modelSponser.getSubname());

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView1, textView2;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.relative_image);
            textView1=itemView.findViewById(R.id.relative_text);
            textView2=itemView.findViewById(R.id.relative_subtext);
        }
    }

}
