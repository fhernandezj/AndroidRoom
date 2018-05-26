package com.fhernandezj.databaseexample;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by fhernandez on 26/05/2018.
 */

@Database(entities = User.class, version = 3)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
