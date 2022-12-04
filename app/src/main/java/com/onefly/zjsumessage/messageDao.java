package com.onefly.zjsumessage;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface messageDao {
    @Query("SELECT * FROM message")
    List<message> getAll();

    @Query("SELECT * FROM message WHERE mid IN (:messageIds)")
    List<message> loadAllByIds(int[] messageIds);

    @Query("SELECT * FROM message WHERE username LIKE :username LIMIT 1")
    message findByName(String username);

    @Query("SELECT * FROM message WHERE username_del LIKE :username LIMIT 1")
    message findByName_del(String username);

    @Insert
    void insertAll(message... messages);

    @Delete
    void delete(message message);
}
