package com.llele.mvpmaster.bean;

/**
 * Author： huanglele on 2017/11/16.
 */


public class FilmmakersBean {
    private String id;
    private String name;
    private String alt;
    public AvatarsBean mAvatarsBean;
    private String type;



    public FilmmakersBean() {
    }

    public FilmmakersBean(String type,String id, String name, String alt, AvatarsBean avatarsBean) {
        this.id = id;
        this.name = name;
        this.alt = alt;
        mAvatarsBean = avatarsBean;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public AvatarsBean getAvatarsBean() {
        return mAvatarsBean;
    }

    public void setAvatarsBean(AvatarsBean avatarsBean) {
        mAvatarsBean = avatarsBean;
    }

     public static class AvatarsBean {
        public String small;
        public String large;
        public String medium;

        public AvatarsBean(String small, String large, String medium) {
            this.small = small;
            this.large = large;
            this.medium = medium;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }
}
