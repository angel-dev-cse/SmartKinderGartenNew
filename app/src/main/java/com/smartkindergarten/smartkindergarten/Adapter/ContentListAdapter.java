package com.smartkindergarten.smartkindergarten.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.smartkindergarten.smartkindergarten.Model.Content;
import com.smartkindergarten.smartkindergarten.R;
import java.util.ArrayList;

public class ContentListAdapter extends RecyclerView.Adapter<ContentListAdapter.ViewHolder> {
    private ArrayList<Content> data;
    private ItemClickListener itemClickListener;

    public ContentListAdapter(ArrayList<Content> mData) {
        this.data = mData;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setItemClickListener(ItemClickListener mClickListener) {
        this.itemClickListener = mClickListener;
    }

    @Override
    public ContentListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_list_row_elements, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContentListAdapter.ViewHolder holder, int position) {
        Content content = data.get(position);

        holder.listContentTitleTv.setText(content.getTitle());
        holder.listContentAuthorTV.setText(content.getAuthor());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void updateData(ArrayList<Content> mData) {
        if (this.data != mData) {
            this.data = mData;
        }

        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements RecyclerView.OnClickListener{
        private TextView listContentTitleTv, listContentAuthorTV;

        public ViewHolder(View itemView) {
            super(itemView);
            listContentTitleTv = itemView.findViewById(R.id.list_content_title_TV);
            listContentAuthorTV = itemView.findViewById(R.id.list_content_author_TV);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (itemClickListener != null) {
                itemClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }
}
