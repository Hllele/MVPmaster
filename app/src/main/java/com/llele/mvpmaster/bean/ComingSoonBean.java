package com.llele.mvpmaster.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Author： huanglele on 2017/11/8.
 */

public class ComingSoonBean {



    public int count;
    public int start;
    public int total;
    public String title;
    /**
     * rating : {"max":10,"average":7.1,"details":{"1":2,"3":75,"2":14,"5":32,"4":58},"stars":"35","min":0}
     * genres : ["剧情","犯罪","悬疑"]
     * title : 东方快车谋杀案
     * casts : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp"},"name_en":"Kenneth Branagh","name":"肯尼思·布拉纳","alt":"https://movie.douban.com/celebrity/1036342/","id":"1036342"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2373.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2373.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2373.webp"},"name_en":"Penélope Cruz","name":"佩内洛佩·克鲁斯","alt":"https://movie.douban.com/celebrity/1005774/","id":"1005774"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9206.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9206.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9206.webp"},"name_en":"Willem Dafoe","name":"威廉·达福","alt":"https://movie.douban.com/celebrity/1010539/","id":"1010539"}]
     * durations : ["114分钟"]
     * collect_count : 543
     * mainland_pubdate : 2017-11-10
     * has_video : false
     * original_title : Murder on the Orient Express
     * subtype : movie
     * directors : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp"},"name_en":"Kenneth Branagh","name":"肯尼思·布拉纳","alt":"https://movie.douban.com/celebrity/1036342/","id":"1036342"}]
     * pubdates : ["2017-11-03(英国)","2017-11-10(美国)","2017-11-10(中国大陆)"]
     * year : 2017
     * images : {"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504371024.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504371024.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504371024.webp"}
     * alt : https://movie.douban.com/subject/25790761/
     * id : 25790761
     */

    public List<SubjectsBean> subjects;

    public static class SubjectsBean {
        /**
         * max : 10
         * average : 7.1
         * details : {"1":2,"3":75,"2":14,"5":32,"4":58}
         * stars : 35
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
         * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504371024.webp
         * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504371024.webp
         * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504371024.webp
         */

        public ImagesBean images;
        public String alt;
        public String id;
        public List<String> genres;
        /**
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp"}
         * name_en : Kenneth Branagh
         * name : 肯尼思·布拉纳
         * alt : https://movie.douban.com/celebrity/1036342/
         * id : 1036342
         */

        public List<CastsBean> casts;
        public List<String> durations;
        /**
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp"}
         * name_en : Kenneth Branagh
         * name : 肯尼思·布拉纳
         * alt : https://movie.douban.com/celebrity/1036342/
         * id : 1036342
         */

        public List<DirectorsBean> directors;
        public List<String> pubdates;

        public static class RatingBean {
            public int max;
            public double average;
            /**
             * 1 : 2
             * 3 : 75
             * 2 : 14
             * 5 : 32
             * 4 : 58
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
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
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
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
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
