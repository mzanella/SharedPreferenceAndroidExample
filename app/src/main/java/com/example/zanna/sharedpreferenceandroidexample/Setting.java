package com.example.zanna.sharedpreferenceandroidexample;

import android.content.SharedPreferences;

/**
 * Created by zanna on 01/04/16.
 */
public interface Setting {

    PathPreference getPathPreference();

    InstructionPreference getInstructionPreference();

    boolean isDeveloper();

    void setPathPreference(PathPreference pathPreference);

    boolean unlockDeveloper(String code);

    void setIstructionPreference(InstructionPreference instructionPreference);

    SharedPreferences getSharedPreference();
}
