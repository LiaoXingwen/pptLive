package com.lxw.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lxw on 2017/7/25.
 */
@Entity
@Table(name = "t_image_mapping")
public class ImageMapping {
    @Id
    @GeneratedValue
    private Integer imageid;
    @Column(nullable = false)
    private String url;

    private String path;
    @Column(nullable = false)
    private long size; //kb
    //用户关联关系的需要不是强，所以不关联
    @Column(nullable = false)
    private int uid;

    private Date createTiem ;

    public ImageMapping() {
        createTiem = new Date( ) ;
    }

    public ImageMapping(String url, String path, long size, int uid, Date createTiem) {
        this();
        this.url = url;
        this.path = path;
        this.size = size;
        this.uid = uid;
        this.createTiem = createTiem;
    }

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Date getCreateTiem() {
        return createTiem;
    }

    public void setCreateTiem(Date createTiem) {
        this.createTiem = createTiem;
    }

}
