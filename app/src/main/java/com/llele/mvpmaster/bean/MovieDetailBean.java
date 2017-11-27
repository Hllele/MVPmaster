package com.llele.mvpmaster.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Author： huanglele on 2017/11/14.
 */

public class MovieDetailBean {


    /**
     * max : 10
     * average : 0
     * details : {"1":0,"3":0,"2":0,"5":0,"4":0}
     * stars : 00
     * min : 0
     */

    public RatingBean rating;
    /**
     * rating : {"max":10,"average":0,"details":{"1":0,"3":0,"2":0,"5":0,"4":0},"stars":"00","min":0}
     * reviews_count : 33
     * videos : []
     * wish_count : 33000
     * original_title : Justice League
     * blooper_urls : ["http://vt1.doubanio.com/201711151458/e63c273e480d56083cdd2abf9f12118c/view/movie/M/302230312.mp4","http://vt1.doubanio.com/201711151458/93dcdf7a6e2994667df19a041bedd911/view/movie/M/302230311.mp4","http://vt1.doubanio.com/201711151458/f3cd110d8e7ed951db66c7e9b7405e77/view/movie/M/302220999.mp4","http://vt1.doubanio.com/201711151458/1ef00e86ab3668d70869d344988878fc/view/movie/M/302220868.mp4"]
     * collect_count : 674
     * images : {"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504974903.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504974903.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504974903.webp"}
     * douban_site :
     * year : 2017
     * popular_comments : [{"rating":{"max":5,"value":3,"min":0},"useful_count":0,"author":{"uid":"161206792","avatar":"https://img3.doubanio.com/icon/u161206792-2.jpg","signature":"","alt":"https://www.douban.com/people/161206792/","id":"161206792","name":"F班的袁湘琴"},"subject_id":"2158490","content":"充电五分钟 大战两小时","created_at":"2017-11-14 12:51:17","id":"1271016012"},{"rating":{"max":5,"value":3,"min":0},"useful_count":0,"author":{"uid":"motou0328","avatar":"https://img1.doubanio.com/icon/u67168509-18.jpg","signature":"Je t'aime plusque mapropre vie","alt":"https://www.douban.com/people/motou0328/","id":"67168509","name":"Sra. Elisa"},"subject_id":"2158490","content":"抄的\u201c漫威拍电影的套路：找几个还算有名的演员，在一间布满绿色背景的大房子里，摆点pose，凹点造型，偶尔出街走两步，念几句还算经典的台词，制造几个迷之尴尬的氛围，做几个还算搞笑的表情，然后交给后期团队。一个月凹造型念台词，11个月做后期一年后上映一年半后把这些人叫回来重新凹造型\u201d","created_at":"2017-11-10 17:10:34","id":"1269249171"},{"rating":{"max":5,"value":4,"min":0},"useful_count":0,"author":{"uid":"1591741","avatar":"https://img3.doubanio.com/icon/u1591741-2.jpg","signature":"","alt":"https://www.douban.com/people/1591741/","id":"1591741","name":"HarperDie"},"subject_id":"2158490","content":"调色明亮化和笑点增加，极大提升娱乐性和观众互动。不过这也使得扎导引以为傲的仪式化感极大削弱。突出场景几乎都在加朵身上，甚至在诸多女性角色的塑造上，产生了不曾有过的女性力量。那个神秘人展现了他是位可塑性极强的演员，高光满满，希望这回能够真的火起来。p.s.好莱坞演员番位太值得琢磨～","created_at":"2017-11-13 19:22:51","id":"1270705607"},{"rating":{"max":5,"value":0,"min":0},"useful_count":0,"author":{"uid":"121381715","avatar":"https://img1.doubanio.com/icon/user_normal.jpg","signature":"","alt":"https://www.douban.com/people/121381715/","id":"121381715","name":"daisy"},"subject_id":"2158490","content":"只有克里斯托弗诺兰把蝙蝠侠拍的那么有深度，故事让人慢慢回味，脑海一丢丢闪现的背景音乐都能回味出蝙蝠侠在电影中的剧情。现在都拍成爆米花电影，都审美疲劳了。","created_at":"2017-11-15 13:54:34","id":"1271487855"}]
     * alt : https://movie.douban.com/subject/2158490/
     * id : 2158490
     * mobile_url : https://movie.douban.com/subject/2158490/mobile
     * photos_count : 1168
     * pubdate : 2017-11-17
     * title : 正义联盟
     * do_count : null
     * has_video : false
     * share_url : https://m.douban.com/movie/subject/2158490
     * seasons_count : null
     * languages : ["英语"]
     * schedule_url : https://movie.douban.com/subject/2158490/cinema/
     * writers : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp"},"name_en":"Zack Snyder","name":"扎克·施奈德","alt":"https://movie.douban.com/celebrity/1031904/","id":"1031904"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p57778.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p57778.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p57778.webp"},"name_en":"Chris Terrio","name":"克里斯·特里奥","alt":"https://movie.douban.com/celebrity/1014758/","id":"1014758"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p908.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p908.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p908.webp"},"name_en":"Joss Whedon","name":"乔斯·韦登","alt":"https://movie.douban.com/celebrity/1010552/","id":"1010552"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486948970.75.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486948970.75.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486948970.75.webp"},"name_en":"Bill Finger","name":"比尔·芬格","alt":"https://movie.douban.com/celebrity/1006536/","id":"1006536"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p31716.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p31716.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p31716.webp"},"name_en":"Bob Kane","name":"鲍勃·凯恩","alt":"https://movie.douban.com/celebrity/1041392/","id":"1041392"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486949099.04.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486949099.04.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486949099.04.webp"},"name_en":"Joe Shuster","name":"乔·舒斯特","alt":"https://movie.douban.com/celebrity/1010444/","id":"1010444"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486949029.72.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486949029.72.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1486949029.72.webp"},"name_en":"Jerry Siegel","name":"杰里·西格尔","alt":"https://movie.douban.com/celebrity/1028138/","id":"1028138"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489472396.61.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489472396.61.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489472396.61.webp"},"name_en":"William M. Marston","name":"威廉·马斯顿","alt":"https://movie.douban.com/celebrity/1046034/","id":"1046034"}]
     * pubdates : ["2017-11-17(美国)","2017-11-17(中国大陆)"]
     * website : www.justiceleaguethemovie.com
     * tags : ["DC","正义联盟","超级英雄","科幻","漫画改编","美国","2017","美国电影","动作","电影"]
     * has_schedule : true
     * durations : ["121分钟"]
     * genres : ["动作","科幻","奇幻"]
     * collection : null
     * trailers : [{"medium":"https://img3.doubanio.com/img/trailer/medium/2501500645.jpg?1510726784","title":"中国预告片 (中文字幕)","subject_id":"2158490","alt":"https://movie.douban.com/trailer/222375/","small":"https://img3.doubanio.com/img/trailer/small/2501500645.jpg?1510726784","resource_url":"http://vt1.doubanio.com/201711151458/8b11ef3eab943423693b9c6c10060573/view/movie/M/302220375.mp4","id":"222375"},{"medium":"https://img3.doubanio.com/img/trailer/medium/2503560763.jpg?1509343548","title":"中国预告片 (中文字幕)","subject_id":"2158490","alt":"https://movie.douban.com/trailer/223170/","small":"https://img3.doubanio.com/img/trailer/small/2503560763.jpg?1509343548","resource_url":"http://vt1.doubanio.com/201711151458/a8bd4d266377a25dfb84594fd07a5a54/view/movie/M/302230170.mp4","id":"223170"},{"medium":"https://img3.doubanio.com/img/trailer/medium/2501500900.jpg?","title":"台湾预告片 (中文字幕)","subject_id":"2158490","alt":"https://movie.douban.com/trailer/222357/","small":"https://img3.doubanio.com/img/trailer/small/2501500900.jpg?","resource_url":"http://vt1.doubanio.com/201711151458/f8866cf3d021bfe9e88df28bb49225ff/view/movie/M/302220357.mp4","id":"222357"},{"medium":"https://img3.doubanio.com/img/trailer/medium/2493838601.jpg?","title":"中国预告片 (中文字幕)","subject_id":"2158490","alt":"https://movie.douban.com/trailer/219613/","small":"https://img3.doubanio.com/img/trailer/small/2493838601.jpg?","resource_url":"http://vt1.doubanio.com/201711151458/aeec3e4010f0d815e02c9b14f39ecd32/view/movie/M/302190613.mp4","id":"219613"}]
     * episodes_count : null
     * trailer_urls : ["http://vt1.doubanio.com/201711151458/8b11ef3eab943423693b9c6c10060573/view/movie/M/302220375.mp4","http://vt1.doubanio.com/201711151458/a8bd4d266377a25dfb84594fd07a5a54/view/movie/M/302230170.mp4","http://vt1.doubanio.com/201711151458/f8866cf3d021bfe9e88df28bb49225ff/view/movie/M/302220357.mp4","http://vt1.doubanio.com/201711151458/aeec3e4010f0d815e02c9b14f39ecd32/view/movie/M/302190613.mp4"]
     * has_ticket : true
     * bloopers : [{"medium":"https://img3.doubanio.com/img/trailer/medium/2503663945.jpg?1509434549","title":"花絮：蝙蝠侠特辑 (中文字幕)","subject_id":"2158490","alt":"https://movie.douban.com/trailer/223312/","small":"https://img3.doubanio.com/img/trailer/small/2503663945.jpg?1509434549","resource_url":"http://vt1.doubanio.com/201711151458/e63c273e480d56083cdd2abf9f12118c/view/movie/M/302230312.mp4","id":"223312"},{"medium":"https://img3.doubanio.com/img/trailer/medium/2503663910.jpg?1509434579","title":"花絮：神奇女侠特辑 (中文字幕)","subject_id":"2158490","alt":"https://movie.douban.com/trailer/223311/","small":"https://img3.doubanio.com/img/trailer/small/2503663910.jpg?1509434579","resource_url":"http://vt1.doubanio.com/201711151458/93dcdf7a6e2994667df19a041bedd911/view/movie/M/302230311.mp4","id":"223311"},{"medium":"https://img3.doubanio.com/img/trailer/medium/2502992303.jpg?1508842668","title":"花絮：钢骨特辑 (中文字幕)","subject_id":"2158490","alt":"https://movie.douban.com/trailer/222999/","small":"https://img3.doubanio.com/img/trailer/small/2502992303.jpg?1508842668","resource_url":"http://vt1.doubanio.com/201711151458/f3cd110d8e7ed951db66c7e9b7405e77/view/movie/M/302220999.mp4","id":"222999"},{"medium":"https://img1.doubanio.com/img/trailer/medium/2502585828.jpg?1508494668","title":"花絮：闪电侠特辑 (中文字幕)","subject_id":"2158490","alt":"https://movie.douban.com/trailer/222868/","small":"https://img1.doubanio.com/img/trailer/small/2502585828.jpg?1508494668","resource_url":"http://vt1.doubanio.com/201711151458/1ef00e86ab3668d70869d344988878fc/view/movie/M/302220868.mp4","id":"222868"}]
     * clip_urls : ["http://vt1.doubanio.com/201711151458/acd474591ffb131d5fa4291823d0680d/view/movie/M/302230834.mp4","http://vt1.doubanio.com/201711151458/9f2ce09a091ea7f8a82b60dc78402df4/view/movie/M/302230645.mp4"]
     * current_season : null
     * casts : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7622.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7622.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7622.webp"},"name_en":"Ben Affleck","name":"本·阿弗莱克","alt":"https://movie.douban.com/celebrity/1054417/","id":"1054417"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1371934661.95.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1371934661.95.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1371934661.95.webp"},"name_en":"Henry Cavill","name":"亨利·卡维尔","alt":"https://movie.douban.com/celebrity/1044713/","id":"1044713"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1467908677.92.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1467908677.92.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1467908677.92.webp"},"name_en":"Gal Gadot","name":"盖尔·加朵","alt":"https://movie.douban.com/celebrity/1044996/","id":"1044996"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32853.webp"},"name_en":"Jason Momoa","name":"杰森·莫玛","alt":"https://movie.douban.com/celebrity/1022614/","id":"1022614"}]
     * countries : ["美国"]
     * mainland_pubdate : 2017-11-17
     * photos : [{"thumb":"https://img3.doubanio.com/view/photo/thumb/public/p2504033292.webp","image":"https://img3.doubanio.com/view/photo/photo/public/p2504033292.webp","cover":"https://img3.doubanio.com/view/photo/albumcover/public/p2504033292.webp","alt":"https://movie.douban.com/photos/photo/2504033292/","id":"2504033292","icon":"https://img3.doubanio.com/view/photo/icon/public/p2504033292.webp"},{"thumb":"https://img3.doubanio.com/view/photo/thumb/public/p2504033256.webp","image":"https://img3.doubanio.com/view/photo/photo/public/p2504033256.webp","cover":"https://img3.doubanio.com/view/photo/albumcover/public/p2504033256.webp","alt":"https://movie.douban.com/photos/photo/2504033256/","id":"2504033256","icon":"https://img3.doubanio.com/view/photo/icon/public/p2504033256.webp"},{"thumb":"https://img3.doubanio.com/view/photo/thumb/public/p2501478620.webp","image":"https://img3.doubanio.com/view/photo/photo/public/p2501478620.webp","cover":"https://img3.doubanio.com/view/photo/albumcover/public/p2501478620.webp","alt":"https://movie.douban.com/photos/photo/2501478620/","id":"2501478620","icon":"https://img3.doubanio.com/view/photo/icon/public/p2501478620.webp"},{"thumb":"https://img3.doubanio.com/view/photo/thumb/public/p2391455936.webp","image":"https://img3.doubanio.com/view/photo/photo/public/p2391455936.webp","cover":"https://img3.doubanio.com/view/photo/albumcover/public/p2391455936.webp","alt":"https://movie.douban.com/photos/photo/2391455936/","id":"2391455936","icon":"https://img3.doubanio.com/view/photo/icon/public/p2391455936.webp"},{"thumb":"https://img1.doubanio.com/view/photo/thumb/public/p2368928127.webp","image":"https://img1.doubanio.com/view/photo/photo/public/p2368928127.webp","cover":"https://img1.doubanio.com/view/photo/albumcover/public/p2368928127.webp","alt":"https://movie.douban.com/photos/photo/2368928127/","id":"2368928127","icon":"https://img1.doubanio.com/view/photo/icon/public/p2368928127.webp"},{"thumb":"https://img1.doubanio.com/view/photo/thumb/public/p2368782489.webp","image":"https://img1.doubanio.com/view/photo/photo/public/p2368782489.webp","cover":"https://img1.doubanio.com/view/photo/albumcover/public/p2368782489.webp","alt":"https://movie.douban.com/photos/photo/2368782489/","id":"2368782489","icon":"https://img1.doubanio.com/view/photo/icon/public/p2368782489.webp"},{"thumb":"https://img3.doubanio.com/view/photo/thumb/public/p2368776391.webp","image":"https://img3.doubanio.com/view/photo/photo/public/p2368776391.webp","cover":"https://img3.doubanio.com/view/photo/albumcover/public/p2368776391.webp","alt":"https://movie.douban.com/photos/photo/2368776391/","id":"2368776391","icon":"https://img3.doubanio.com/view/photo/icon/public/p2368776391.webp"},{"thumb":"https://img1.doubanio.com/view/photo/thumb/public/p2504817669.webp","image":"https://img1.doubanio.com/view/photo/photo/public/p2504817669.webp","cover":"https://img1.doubanio.com/view/photo/albumcover/public/p2504817669.webp","alt":"https://movie.douban.com/photos/photo/2504817669/","id":"2504817669","icon":"https://img1.doubanio.com/view/photo/icon/public/p2504817669.webp"},{"thumb":"https://img1.doubanio.com/view/photo/thumb/public/p2504568248.webp","image":"https://img1.doubanio.com/view/photo/photo/public/p2504568248.webp","cover":"https://img1.doubanio.com/view/photo/albumcover/public/p2504568248.webp","alt":"https://movie.douban.com/photos/photo/2504568248/","id":"2504568248","icon":"https://img1.doubanio.com/view/photo/icon/public/p2504568248.webp"},{"thumb":"https://img3.doubanio.com/view/photo/thumb/public/p2504070570.webp","image":"https://img3.doubanio.com/view/photo/photo/public/p2504070570.webp","cover":"https://img3.doubanio.com/view/photo/albumcover/public/p2504070570.webp","alt":"https://movie.douban.com/photos/photo/2504070570/","id":"2504070570","icon":"https://img3.doubanio.com/view/photo/icon/public/p2504070570.webp"}]
     * summary : 受到超人无私奉献的影响，蝙蝠侠重燃了对人类的信心，接受了新盟友——神奇女侠（戴安娜·普林斯）的帮助，去对抗更加强大的敌人。蝙蝠侠和神奇女侠一同寻找并招募了一支超人类联盟来抵挡新觉醒的威胁。但尽管这支队伍集结了超人、蝙蝠侠、神奇女侠、闪电侠、海王和钢骨等人，他们似乎无法阻止敌人对地球的进攻……
     * clips : [{"medium":"https://img3.doubanio.com/img/trailer/medium/2504923303.jpg?1510711615","title":"片段：神奇女侠篇 (中文字幕)","subject_id":"2158490","alt":"https://movie.douban.com/trailer/223834/","small":"https://img3.doubanio.com/img/trailer/small/2504923303.jpg?1510711615","resource_url":"http://vt1.doubanio.com/201711151458/acd474591ffb131d5fa4291823d0680d/view/movie/M/302230834.mp4","id":"223834"},{"medium":"https://img1.doubanio.com/img/trailer/medium/2504493487.jpg?1510224340","title":"片段：团战荒原狼 (中文字幕)","subject_id":"2158490","alt":"https://movie.douban.com/trailer/223645/","small":"https://img1.doubanio.com/img/trailer/small/2504493487.jpg?1510224340","resource_url":"http://vt1.doubanio.com/201711151458/9f2ce09a091ea7f8a82b60dc78402df4/view/movie/M/302230645.mp4","id":"223645"}]
     * subtype : movie
     * directors : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp"},"name_en":"Zack Snyder","name":"扎克·施奈德","alt":"https://movie.douban.com/celebrity/1031904/","id":"1031904"}]
     * comments_count : 219
     * popular_reviews : [{"rating":{"max":5,"value":5,"min":0},"title":"正义联盟VS复仇者分析","subject_id":"2158490","author":{"uid":"adakenndy","avatar":"https://img3.doubanio.com/icon/u115657337-6.jpg","signature":"","alt":"https://www.douban.com/people/adakenndy/","id":"115657337","name":"Ada Wang"},"summary":"欢迎大家了解更多正义联盟电影预热的内容： 正义联盟漫画以及动画整理编年史https://movie.douban.com/review/7945626/ 强调下:人设牛逼不代表电影牛逼！复联1对美漫影响是无容置疑的，希望大家可以平静心情阅读...","alt":"https://movie.douban.com/review/7945531/","id":"7945531"},{"rating":{"max":5,"value":5,"min":0},"title":"正义联盟漫画以及动画整理编年史","subject_id":"2158490","author":{"uid":"adakenndy","avatar":"https://img3.doubanio.com/icon/u115657337-6.jpg","signature":"","alt":"https://www.douban.com/people/adakenndy/","id":"115657337","name":"Ada Wang"},"summary":"ps:近年来DC所有动画电影目录: 【正义联盟】50年内所有动画开头 http://www.bilibili.com/video/av12151396/ 【超人75周年】 http://www.bilibili.com/video/av799299/ 【绿箭75周年】 www.bilibili.com/video/av...","alt":"https://movie.douban.com/review/7945626/","id":"7945626"},{"rating":{"max":5,"value":4,"min":0},"title":"正义联盟未拍之前需要解决的分歧","subject_id":"2158490","author":{"uid":"dsdby","avatar":"https://img3.doubanio.com/icon/u1481957-1.jpg","signature":"","alt":"https://www.douban.com/people/dsdby/","id":"1481957","name":"川流熙攘"},"summary":"1、没有个人系列的铺垫直接拍联盟？会让很多不甚了解这些英雄的观众一头雾水的，毕竟这样的大片眼光绝不只限于北美，漫威这点做得很好，先出个人系列，让全世界的观众充分认识了解了这个人物，有了群众基础，再拍...","alt":"https://movie.douban.com/review/5878079/","id":"5878079"},{"rating":{"max":5,"value":4,"min":0},"title":"《正义联盟》最强指北，进电影院前你应该知道的干货！","subject_id":"2158490","author":{"uid":"1402913","avatar":"https://img3.doubanio.com/icon/u1402913-10.jpg","signature":"定居海外独立影评人","alt":"https://www.douban.com/people/1402913/","id":"1402913","name":"大聪看电影"},"summary":"《正义联盟》想必无需再介绍它的神力了，从确定档期那一天起，就已经圈粉无数。 眼看，《正义联盟》上映在即，片方几乎每一天都在放出新的片段和预告片，加起来有半小时之多，影片的神秘面纱，也渐渐被揭开 另外...","alt":"https://movie.douban.com/review/8919844/","id":"8919844"},{"rating":{"max":5,"value":5,"min":0},"title":"JLA[第一部预告分析]","subject_id":"2158490","author":{"uid":"adakenndy","avatar":"https://img3.doubanio.com/icon/u115657337-6.jpg","signature":"","alt":"https://www.douban.com/people/adakenndy/","id":"115657337","name":"Ada Wang"},"summary":"1. 电影神奇女侠口碑票房双收并没有让正联电影成为女侠1.5，根据加朵所说，她的补拍工作只有一周，戴安娜为队伍带来凝聚力，她支持所有联盟成员并让他们相信自我，但这不是一部女侠电影； 2. 在大家进到蝙蝠洞的...","alt":"https://movie.douban.com/review/8437735/","id":"8437735"},{"rating":{"max":5,"value":1,"min":0},"title":"《正义联盟》，不好意思，只能和你在电影院说声拜拜了！你不值得我去电影院观看。","subject_id":"2158490","author":{"uid":"134248764","avatar":"https://img1.doubanio.com/icon/user_normal.jpg","signature":"","alt":"https://www.douban.com/people/134248764/","id":"134248764","name":"网龙迦楼罗"},"summary":"看过预告片，加上朋友提前观影后透露的细节，只能说《正义联盟》咱们还是在电影院里说拜拜吧。  只要回想起在IMAX3D影院看《超人大战蝙蝠侠》和《神奇女侠》时那糟糕的视觉体验，绝对不会去电影院看《正义联盟》...","alt":"https://movie.douban.com/review/8924613/","id":"8924613"},{"rating":{"max":5,"value":5,"min":0},"title":"哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈","subject_id":"2158490","author":{"uid":"161096745","avatar":"https://img3.doubanio.com/icon/u161096745-1.jpg","signature":"","alt":"https://www.douban.com/people/161096745/","id":"161096745","name":"你们没有任何牌"},"summary":"哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈...","alt":"https://movie.douban.com/review/8923719/","id":"8923719"},{"rating":{"max":5,"value":3,"min":0},"title":"降低深度，忽略剧情，能否取悦大众拯救DC？","subject_id":"2158490","author":{"uid":"164510097","avatar":"https://img3.doubanio.com/icon/u164510097-16.jpg","signature":"看一场电影","alt":"https://www.douban.com/people/164510097/","id":"164510097","name":"闲言少叙"},"summary":"伴随着时代的发展和需要，超级英雄系列电影逐渐进入大众的视野，从简单的视觉刺激、血肉横飞的超级爆米花，延伸至饱含深度富有哲思的经典之作。 超级英雄漫画的起源可以追溯到二战期间，当时的美国弥漫着对纳粹希...","alt":"https://movie.douban.com/review/8921698/","id":"8921698"},{"rating":{"max":5,"value":5,"min":0},"title":"看《正义联盟》前需知道的25件事","subject_id":"2158490","author":{"uid":"169447313","avatar":"https://img1.doubanio.com/icon/user_normal.jpg","signature":"","alt":"https://www.douban.com/people/169447313/","id":"169447313","name":"伟大的芋头"},"summary":"酸叔电影作为电影公号里一个少见的周更号，难得将用两周的稿件写同一部影片，就是将于下周五开画的票房炸弹----《正义联盟》。   酸叔还记得很清楚16年3月关于《蝙蝠侠大战超人：正义黎明》的严重口碑两极分化（...","alt":"https://movie.douban.com/review/8920239/","id":"8920239"},{"rating":{"max":5,"value":5,"min":0},"title":"DC众神的\u201c黄昏\u201d：来自阿兰摩尔的诅咒","subject_id":"2158490","author":{"uid":"anakinii","avatar":"https://img3.doubanio.com/icon/u91987635-1.jpg","signature":"","alt":"https://www.douban.com/people/anakinii/","id":"91987635","name":"白之王"},"summary":"漫威漫改电影，来源于最初期成立了一个独立制作公司。因几个人对开创事业的热情与对前景的前瞻而成立了这公司，而这小公司在热情与获取更多名利的动力的推动下，与大公司形成长期稳定的合作关系，大的电影公司也...","alt":"https://movie.douban.com/review/8918223/","id":"8918223"}]
     * ratings_count : 617
     * aka : ["The Justice League Part One","Justice League Mortal","Justice League of America"]
     */

    public int reviews_count;
    public int wish_count;
    public String original_title;
    public int collect_count;
    /**
     * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504974903.webp
     * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504974903.webp
     * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2504974903.webp
     */

    public ImagesBean images;
    public String douban_site;
    public String year;
    public String alt;
    public String id;
    public String mobile_url;
    public int photos_count;
    public String pubdate;
    public String title;
    public Object do_count;
    public boolean has_video;
    public String share_url;
    public Object seasons_count;
    public String schedule_url;
    public String website;
    public boolean has_schedule;
    public Object collection;
    public Object episodes_count;
    public boolean has_ticket;
    public Object current_season;
    public String mainland_pubdate;
    public String summary;
    public String subtype;
    public int comments_count;
    public int ratings_count;
    public List<?> videos;
    public List<String> blooper_urls;
    /**
     * rating : {"max":5,"value":3,"min":0}
     * useful_count : 0
     * author : {"uid":"161206792","avatar":"https://img3.doubanio.com/icon/u161206792-2.jpg","signature":"","alt":"https://www.douban.com/people/161206792/","id":"161206792","name":"F班的袁湘琴"}
     * subject_id : 2158490
     * content : 充电五分钟 大战两小时
     * created_at : 2017-11-14 12:51:17
     * id : 1271016012
     */

    public List<PopularCommentsBean> popular_comments;
    public List<String> languages;
    /**
     * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp"}
     * name_en : Zack Snyder
     * name : 扎克·施奈德
     * alt : https://movie.douban.com/celebrity/1031904/
     * id : 1031904
     */

    public List<WritersBean> writers;
    public List<String> pubdates;
    public List<String> tags;
    public List<String> durations;
    public List<String> genres;
    /**
     * medium : https://img3.doubanio.com/img/trailer/medium/2501500645.jpg?1510726784
     * title : 中国预告片 (中文字幕)
     * subject_id : 2158490
     * alt : https://movie.douban.com/trailer/222375/
     * small : https://img3.doubanio.com/img/trailer/small/2501500645.jpg?1510726784
     * resource_url : http://vt1.doubanio.com/201711151458/8b11ef3eab943423693b9c6c10060573/view/movie/M/302220375.mp4
     * id : 222375
     */

    public List<TrailersBean> trailers;
    public List<String> trailer_urls;
    /**
     * medium : https://img3.doubanio.com/img/trailer/medium/2503663945.jpg?1509434549
     * title : 花絮：蝙蝠侠特辑 (中文字幕)
     * subject_id : 2158490
     * alt : https://movie.douban.com/trailer/223312/
     * small : https://img3.doubanio.com/img/trailer/small/2503663945.jpg?1509434549
     * resource_url : http://vt1.doubanio.com/201711151458/e63c273e480d56083cdd2abf9f12118c/view/movie/M/302230312.mp4
     * id : 223312
     */

    public List<BloopersBean> bloopers;
    public List<String> clip_urls;
    /**
     * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7622.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7622.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7622.webp"}
     * name_en : Ben Affleck
     * name : 本·阿弗莱克
     * alt : https://movie.douban.com/celebrity/1054417/
     * id : 1054417
     */

    public List<CastsBean> casts;
    public List<String> countries;
    /**
     * thumb : https://img3.doubanio.com/view/photo/thumb/public/p2504033292.webp
     * image : https://img3.doubanio.com/view/photo/photo/public/p2504033292.webp
     * cover : https://img3.doubanio.com/view/photo/albumcover/public/p2504033292.webp
     * alt : https://movie.douban.com/photos/photo/2504033292/
     * id : 2504033292
     * icon : https://img3.doubanio.com/view/photo/icon/public/p2504033292.webp
     */

    public List<PhotosBean> photos;
    /**
     * medium : https://img3.doubanio.com/img/trailer/medium/2504923303.jpg?1510711615
     * title : 片段：神奇女侠篇 (中文字幕)
     * subject_id : 2158490
     * alt : https://movie.douban.com/trailer/223834/
     * small : https://img3.doubanio.com/img/trailer/small/2504923303.jpg?1510711615
     * resource_url : http://vt1.doubanio.com/201711151458/acd474591ffb131d5fa4291823d0680d/view/movie/M/302230834.mp4
     * id : 223834
     */

    public List<ClipsBean> clips;
    /**
     * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp"}
     * name_en : Zack Snyder
     * name : 扎克·施奈德
     * alt : https://movie.douban.com/celebrity/1031904/
     * id : 1031904
     */

    public List<DirectorsBean> directors;
    /**
     * rating : {"max":5,"value":5,"min":0}
     * title : 正义联盟VS复仇者分析
     * subject_id : 2158490
     * author : {"uid":"adakenndy","avatar":"https://img3.doubanio.com/icon/u115657337-6.jpg","signature":"","alt":"https://www.douban.com/people/adakenndy/","id":"115657337","name":"Ada Wang"}
     * summary : 欢迎大家了解更多正义联盟电影预热的内容： 正义联盟漫画以及动画整理编年史https://movie.douban.com/review/7945626/ 强调下:人设牛逼不代表电影牛逼！复联1对美漫影响是无容置疑的，希望大家可以平静心情阅读...
     * alt : https://movie.douban.com/review/7945531/
     * id : 7945531
     */

    public List<PopularReviewsBean> popular_reviews;
    public List<String> aka;

    public static class RatingBean {
        public int max;
        public double average;
        /**
         * 1 : 0
         * 3 : 0
         * 2 : 0
         * 5 : 0
         * 4 : 0
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

    public static class PopularCommentsBean {
        /**
         * max : 5
         * value : 3
         * min : 0
         */

        public RatingBean rating;
        public int useful_count;
        /**
         * uid : 161206792
         * avatar : https://img3.doubanio.com/icon/u161206792-2.jpg
         * signature :
         * alt : https://www.douban.com/people/161206792/
         * id : 161206792
         * name : F班的袁湘琴
         */

        public AuthorBean author;
        public String subject_id;
        public String content;
        public String created_at;
        public String id;

        public static class RatingBean {
            public int max;
            public int value;
            public int min;
        }

        public static class AuthorBean {
            public String uid;
            public String avatar;
            public String signature;
            public String alt;
            public String id;
            public String name;
        }
    }

    public static class WritersBean {
        /**
         * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp
         * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp
         * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp
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

    public static class TrailersBean {
        public String medium;
        public String title;
        public String subject_id;
        public String alt;
        public String small;
        public String resource_url;
        public String id;
    }

    public static class BloopersBean {
        public String medium;
        public String title;
        public String subject_id;
        public String alt;
        public String small;
        public String resource_url;
        public String id;
    }

    public static class CastsBean {
        /**
         * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7622.webp
         * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7622.webp
         * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7622.webp
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

    public static class PhotosBean {
        public String thumb;
        public String image;
        public String cover;
        public String alt;
        public String id;
        public String icon;
    }

    public static class ClipsBean {
        public String medium;
        public String title;
        public String subject_id;
        public String alt;
        public String small;
        public String resource_url;
        public String id;
    }

    public static class DirectorsBean {
        /**
         * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp
         * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp
         * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23346.webp
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

    public static class PopularReviewsBean {
        /**
         * max : 5
         * value : 5
         * min : 0
         */

        public RatingBean rating;
        public String title;
        public String subject_id;
        /**
         * uid : adakenndy
         * avatar : https://img3.doubanio.com/icon/u115657337-6.jpg
         * signature :
         * alt : https://www.douban.com/people/adakenndy/
         * id : 115657337
         * name : Ada Wang
         */

        public AuthorBean author;
        public String summary;
        public String alt;
        public String id;

        public static class RatingBean {
            public int max;
            public int value;
            public int min;
        }

        public static class AuthorBean {
            public String uid;
            public String avatar;
            public String signature;
            public String alt;
            public String id;
            public String name;
        }
    }
}
