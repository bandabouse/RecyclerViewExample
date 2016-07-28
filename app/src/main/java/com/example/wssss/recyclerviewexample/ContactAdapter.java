package com.example.wssss.recyclerviewexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wssss on 28/07/16.
 */

// The adapter's role is to convert an object at a position into a list row item

// create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder with give us access to our views
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public Button messageButton;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
            messageButton = (Button) itemView.findViewById(R.id.message_button);
        }
    }

    private List<Contact> mContacts;
    private Context mContext;

    public ContactAdapter(MainActivity mContext, ArrayList<Contact> mContacts) {
        this.mContacts = mContacts;
        this.mContext = mContext;
    }

    public Context getmContext() {
        return mContext;
    }

    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // to inflate the item layout and create the holder
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.row_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(contactView);

        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ContactAdapter.ViewHolder holder, int position) {
        // Get the data model based on position
        Contact contact = mContacts.get(position);

        TextView textView = holder.nameTextView;
        textView.setText(contact.getmName());
        Button button = holder.messageButton;
        button.setText("Message");
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
