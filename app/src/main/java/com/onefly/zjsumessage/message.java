package com.onefly.zjsumessage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class message {
    //@PrimaryKey(autoGenerate = true)
    public int mid;

    @ColumnInfo(name = "username")
    public String username;

    @ColumnInfo(name = "username_del")
    public String username_del;

    @ColumnInfo(name = "message_send")
    public String message_send;
}