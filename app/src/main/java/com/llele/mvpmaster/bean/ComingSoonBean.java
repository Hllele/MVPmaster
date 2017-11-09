package com.llele.mvpmaster.bean;

import java.util.List;

/**
 * Author： huanglele on 2017/11/8.
 */

public class ComingSoonBean {

    public int count;
    public int start;
    public int total;
    public String title;

    public List<SubjectsBean> subjects;

    public static class SubjectsBean {
        /**
         * max : 10
         * average : 0
         * stars : 00
         * min : 0
         */

        public RatingBean rating;
        public String title;
        public int collect_count;
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
         * alt : https://movie.douban.com/celebrity/1036342/
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp"}
         * name : 肯尼思·布拉纳
         * id : 1036342
         */

        public List<CastsBean> casts;
        /**
         * alt : https://movie.douban.com/celebrity/1036342/
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp"}
         * name : 肯尼思·布拉纳
         * id : 1036342
         */

        public List<DirectorsBean> directors;

        public static class RatingBean {
            public int max;
            public double average;
            public String stars;
            public int min;
        }

        public static class ImagesBean {
            public String small;
            public String large;
            public String medium;
        }

        public static class CastsBean {
            public String alt;
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
             */

            public AvatarsBean avatars;
            public String name;
            public String id;

            public static class AvatarsBean {
                public String small;
                public String large;
                public String medium;
            }
        }

        public static class DirectorsBean {
            public String alt;
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43581.webp
             */

            public AvatarsBean avatars;
            public String name;
            public String id;

            public static class AvatarsBean {
                public String small;
                public String large;
                public String medium;
            }
        }
    }
}
