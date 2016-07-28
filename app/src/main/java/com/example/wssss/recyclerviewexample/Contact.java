package com.example.wssss.recyclerviewexample;

import java.util.ArrayList;

/**
 * Created by wssss on 28/07/16.
 */
public class Contact {
    private String mName;
    private boolean mOnline;

    public Contact(String name, boolean online) {
        mName = name;
        mOnline = online;
    }

    public String getmName() {
        return mName;
    }

    public boolean ismOnline() {
        return mOnline;
    }

    private static int lastContractId = 0;

    public static ArrayList<Contact> createContactsList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<>();

        for (int i = 0; i < numContacts; i ++ ) {
            contacts.add(new Contact("Persion " + ++lastContractId, i <= numContacts/2));
        }

        return contacts;
    }
}
