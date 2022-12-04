package com.onefly.zjsumessage;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {message.class}, version = 1)
public abstract class messageDatabase extends RoomDatabase {
    private static volatile messageDatabase INSTANCE = null;

    public abstract messageDao messageDao();


    public static messageDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (messageDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            messageDatabase.class, "keynode.editor").allowMainThreadQueries().build();
                }
            }
        }

        return INSTANCE;
    }
}
