package com.llele.mvpmaster.bean;

import java.io.Serializable;

/**
 * Author： huanglele on 2017/11/21.
 */

public class  TrailersPhotosBean implements Serializable{
    String img_url;
    String resource_url;
    String type;
    public TrailersPhotosBean(String img_url, String resource_url) {
        this.img_url = img_url;
        this.resource_url = resource_url;
    }


    public TrailersPhotosBean(String img_url, String resource_url, String type) {
        this.img_url = img_url;
        this.resource_url = resource_url;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getResource_url() {
        return resource_url;
    }

    public void setResource_url(String resource_url) {
        this.resource_url = resource_url;
    }
}
