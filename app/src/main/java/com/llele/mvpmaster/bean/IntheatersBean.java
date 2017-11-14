package com.llele.mvpmaster.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Author： huanglele on 2017/11/7.
 */

public class IntheatersBean {


    public int count;
    public int start;
    public int total;
    public String title;


    public List<SubjectsBean> subjects;

    public static class SubjectsBean {
        /**
         * max : 10
         * average : 7.6
         * details : {"1":154,"3":7294,"2":887,"5":4509,"4":10710}
         * stars : 40
         * min : 0
         */

        public RatingBean rating;
        public String title;
        public int collect_count;
        public String mainland_pubdate;
        public boolean has_video;
        public String original_title;
        public String subtype;
        public String year;
        /**
         * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2500451074.webp
         * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2500451074.webp
         * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2500451074.webp
         */

        public ImagesBean images;
        public String alt;
        public String id;
        public List<String> genres;
        /**
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.webp"}
         * name_en : Chris Hemsworth
         * name : 克里斯·海姆斯沃斯
         * alt : https://movie.douban.com/celebrity/1021959/
         * id : 1021959
         */

        public List<CastsBean> casts;
        public List<String> durations;
        /**
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1423172662.31.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1423172662.31.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1423172662.31.webp"}
         * name_en : Taika Waititi
         * name : 塔伊加·维迪提
         * alt : https://movie.douban.com/celebrity/1076354/
         * id : 1076354
         */

        public List<DirectorsBean> directors;
        public List<String> pubdates;

        public static class RatingBean {
            public int max;
            public double average;
            /**
             * 1 : 154
             * 3 : 7294
             * 2 : 887
             * 5 : 4509
             * 4 : 10710
             */

            public DetailsBean details;
            public String stars;
            public int min;

            public static class DetailsBean {
                @SerializedName("1")
                public int value1;
                @SerializedName("3")
                public int value3;
                @SerializedName("2")
                public int value2;
                @SerializedName("5")
                public int value5;
                @SerializedName("4")
                public int value4;
            }
        }

        public static class ImagesBean {
            public String small;
            public String large;
            public String medium;
        }

        public static class CastsBean {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4053.webp
             */

            public AvatarsBean avatars;
            public String name_en;
            public String name;
            public String alt;
            public String id;

            public static class AvatarsBean {
                public String small;
                public String large;
                public String medium;
            }
        }

        public static class DirectorsBean {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1423172662.31.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1423172662.31.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1423172662.31.webp
             */

            public AvatarsBean avatars;
            public String name_en;
            public String name;
            public String alt;
            public String id;

            public static class AvatarsBean {
                public String small;
                public String large;
                public String medium;
            }
        }
    }
}
