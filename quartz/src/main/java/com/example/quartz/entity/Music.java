package com.example.quartz.entity;

public class Music {
    //音乐标题
    private String Title;
    //音乐描述
    private String Description;
    //音乐链接
    private String MusicUrl;
    //高品质音乐链接，Wi-Fi环境优先使用该链接播放音乐
    private String HQMusicUrl;
    //缩略图的媒体ID，通过上传多媒体文件得到的ID
    private String ThumbMediaId;

    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public String getMusicUrl() {
        return MusicUrl;
    }
    public void setMusicUrl(String musicUrl) {
        MusicUrl = musicUrl;
    }
    public String getHQMusicUrl() {
        return HQMusicUrl;
    }
    public void setHQMusicUrl(String hQMusicUrl) {
        HQMusicUrl = hQMusicUrl;
    }
    public String getThumbMediaId() {
        return ThumbMediaId;
    }
    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
