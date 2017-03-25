package com.example.administrator.beatbox;

/**
 * Created by Administrator on 2017/3/23.
 */

public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;
public Sound(String assetPath){
    mAssetPath=assetPath;
    String [] components=assetPath.split("/");
    String filename=components[components.length-1];
    mName=filename.replace(".wav","");
}
    public String getName() {
        return mName;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public String getAssetPath() {
        return mAssetPath;
    }
}
