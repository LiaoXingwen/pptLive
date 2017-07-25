package com.lxw.domain;

import javax.persistence.*;

/**
 * Created by lxw on 2017/7/25.
 */
@Entity
@Table(name = "t_atpdata")
public class ATDData {
    @Id
    @GeneratedValue
    private int atpid;
    @Column(nullable = false)
    private int audioid;
    @Column(nullable = false)
    private int classid;
    @Column(nullable = false)
    private String json;
    @Column(nullable = false)
    private long beginTime;
    @Column(nullable = false)
    private long length;
    @Column(nullable = false)
    private int uid;

    public ATDData() {
    }

    public ATDData(int audioid, int classid, String json, long beginTime, long length, int uid) {
        this.audioid = audioid;
        this.classid = classid;
        this.json = json;
        this.beginTime = beginTime;
        this.length = length;
        this.uid = uid;
    }

    public int getAtpid() {
        return atpid;
    }

    public void setAtpid(int atpid) {
        this.atpid = atpid;
    }

    public int getAudioid() {
        return audioid;
    }

    public void setAudioid(int audioid) {
        this.audioid = audioid;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
