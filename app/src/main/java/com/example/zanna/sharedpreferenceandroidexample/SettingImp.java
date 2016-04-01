package com.example.zanna.sharedpreferenceandroidexample;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by zanna on 01/04/16.
 */
public class SettingImp implements Setting {

    SharedPreferences s;

    public SettingImp(Context context){
        s = context.getSharedPreferences("userSettings", Context.MODE_PRIVATE);
    }

    @Override
    public PathPreference getPathPreference() {
        PathPreference p = PathPreference.values()[s.getInt("PathPreference", 0)];
        return p;
    }

    @Override
    public InstructionPreference getInstructionPreference() {
        return null;
    }

    @Override
    public boolean isDeveloper() {
        return false;
    }

    @Override
    public void setPathPreference(PathPreference pathPreference) {
        s.edit().putInt("PathPreference", pathPreference.getValue()).apply();
    }

    @Override
    public boolean unlockDeveloper(String code) {
        return false;
    }

    @Override
    public void setIstructionPreference(InstructionPreference istrucrionPreference) {

    }

    @Override
    public SharedPreferences getSharedPreference() {
        return s;
    }
}
