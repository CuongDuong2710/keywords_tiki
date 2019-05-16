package cuongduong.developer.android.keywordstiki.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cuongduong.developer.android.keywordstiki.R;

public class KeywordAdapter extends RecyclerView.Adapter<KeywordAdapter.MyViewHolder> {

    int[] arrayColors = {Color.GREEN, Color.RED, Color.BLUE, Color.DKGRAY, Color.GRAY};

    Context context;
    List<String> keywords;

    public KeywordAdapter(Context context, List<String> keywords) {
        this.context = context;
        this.keywords = keywords;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.layout_keyword, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        int randomColor = (int) Math.round(Math.random() * 4);
        myViewHolder.txtViewKeyword.setText(keywords.get(i));
        myViewHolder.cardViewKeyword.setBackgroundColor(arrayColors[randomColor]);
    }

    @Override
    public int getItemCount() {
        return keywords.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtViewKeyword;
        CardView cardViewKeyword;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtViewKeyword = itemView.findViewById(R.id.txt_keyword);
            cardViewKeyword = itemView.findViewById(R.id.card_view_keyword);
        }
    }
}
