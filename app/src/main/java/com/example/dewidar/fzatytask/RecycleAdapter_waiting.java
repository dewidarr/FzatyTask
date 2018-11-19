package com.example.dewidar.fzatytask;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleAdapter_waiting extends RecyclerView.Adapter<RecycleAdapter_waiting.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView status,post_time,gender,faza_type,faza_number;
        ImageView imagetype;
        Button canclebutton;
        public ViewHolder(View itemView) {
            super(itemView);
            imagetype=(ImageView) itemView.findViewById(R.id.typeoffaza);
            status=(TextView) itemView.findViewById(R.id.fazastatus);
            post_time=(TextView) itemView.findViewById(R.id.timeoffaza);
            gender=(TextView) itemView.findViewById(R.id.genderof_faza);
            faza_type=(TextView) itemView.findViewById(R.id.typeof_faza);
            faza_number=(TextView) itemView.findViewById(R.id.numberof_faza);
            canclebutton=(Button)itemView.findViewById(R.id.button_cancle);

        }
    }
    private Context context;
    private List<waitinglist> posts;
    public RecycleAdapter_waiting(Context c, List<waitinglist> postlist) {
        this.context = c;
        posts = postlist;
    }

    @Override
    public RecycleAdapter_waiting.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=  LayoutInflater.from(context).inflate(R.layout.waiting_requst_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final RecycleAdapter_waiting.ViewHolder holder, int position) {
        waitinglist p =posts.get(position);
        holder.status.setText(p.getStatus());
        holder.post_time.setText(p.getTime());
        holder.gender.setText(p.getGender());
        holder.faza_type.setText(p.getFaza_type());
        holder.faza_number.setText(p.getFaza_number());
        holder.imagetype.setImageResource(p.getImgtype());

        holder.canclebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.canclebutton.getText() == "الغاء"){
                    holder.canclebutton.setText("تم الالغاء");
                }else {
                    holder.canclebutton.setText("تم الالغاء");
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}
