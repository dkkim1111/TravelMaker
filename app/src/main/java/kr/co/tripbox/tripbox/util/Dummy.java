package kr.co.tripbox.tripbox.util;

import java.util.ArrayList;
import java.util.List;

import kr.co.tripbox.tripbox.models.Accompanied;
import kr.co.tripbox.tripbox.models.Tag;
import kr.co.tripbox.tripbox.models.UserInfo;

/**
 * Created by motivation on 16. 3. 19..
 */
public class Dummy {
    public static List<Accompanied> getAccompaniedsDummy1() {
        List<Accompanied> accompanieds = new ArrayList<>();

        //
        UserInfo user1 = new UserInfo();
        user1.setName("김민희");
        user1.setProfile("https://images.vingle.net/upload/t_ca_xl/trptsinftd7l3yofbnsx.jpg");
        user1.setIntroduce("안녕하세요 활기찬 여행자 김민희입니다! 돌아다니기를 좋아하고 사람을 좋아해요 :-)\n" +
                "동행님들 저와 함께 잊지 못할 추억을 만들어보아요!!  \n" +
                "Carpe diem!");

        Accompanied accompanied = new Accompanied();
        accompanied.setIsThunder(true);
        accompanied.setDate("2016.03.28");
        accompanied.setLocation("Paris");
        accompanied.setDesc("오늘 저녁 에펠탑에서 맥주 한 잔?");

        accompanied.setUserInfo(user1);

        List<Tag> tags = new ArrayList<>();
        tags.add(new Tag("에펠탑"));
        tags.add(new Tag("맥주"));

        accompanied.setTags(tags);
        accompanieds.add(accompanied);

        //
        UserInfo user2 = new UserInfo();
        user2.setName("채보미");
        user2.setProfile("http://news.nateimg.co.kr/orgImg/hk/2014/09/01/2014083117041_AA.9034387.1.jpg");
        user2.setIntroduce("안녕하세요 저는 채보미입니다~ 낯을 좀가리지만 즐거운 여행하고 싶어요 :-)");

        Accompanied accompanied2 = new Accompanied();
        accompanied2.setIsThunder(false);
        accompanied2.setDate("2016.03.28 - 2016.03.30");
        accompanied2.setLocation("Hawai");
        accompanied2.setDesc("3명 그룹 새벽 스노클링 어때요?");

        accompanied2.setUserInfo(user2);

        List<Tag> tags2 = new ArrayList<>();
        tags2.add(new Tag("에펠탑"));
        tags2.add(new Tag("맥주"));

        accompanied2.setTags(tags2);

        accompanieds.add(accompanied2);

        return accompanieds;
    }

    public static List<Accompanied> getAccompaniedsDummy2() {
        UserInfo user1 = new UserInfo();
        user1.setName("박보영");
        user1.setProfile("https://tv.pstatic.net/thm?size=120x150&quality=9&q=http://sstatic.naver.net/people/portrait/201312/20131211170041770-2535427.jpg");
        user1.setIntroduce("안녕하세요, 여행을 즐기는 박보영이라고 합니다 :) 좋은 여행 같이했으면 좋겠어요.");

        UserInfo user2 = new UserInfo();
        user2.setName("강서준");
        user2.setProfile("https://tv.pstatic.net/thm?size=120x150&quality=9&q=http://sstatic.naver.net/people/portrait/201409/20140901102908101-9567844.jpg");
        user2.setIntroduce("강서준이라고 합니다! 잘부탁드립니다. 여행가치해요~~");

        UserInfo user3 = new UserInfo();
        user3.setName("송중기");
        user3.setProfile("https://tv.pstatic.net/thm?size=120x150&quality=9&q=http://sstatic.naver.net/people/portrait/201407/20140724115403570.jpg");
        user3.setIntroduce("송중기입니다요");

        UserInfo user4 = new UserInfo();
        user4.setName("김민희");
        user4.setProfile("https://images.vingle.net/upload/t_ca_xl/tvehelnhyiydtvlvlmyg.jpg");
        user4.setIntroduce("안녕하세요 활기찬 여행자 김민희입니다! 돌아다니기를 좋아하고 사람을 좋아해요 :-)\n" +
                "동행님들 저와 함께 잊지 못할 추억을 만들어보아요!!  \n" +
                "Carpe diem!");

        UserInfo user5 = new UserInfo();
        user5.setName("하나투어");
        user5.setProfile("http://cfd.tourtips.com/@ext/2015030902/gjehul/New_CI_Kor.jpg");
        user5.setIntroduce("안녕하세요 하나투어입니다.");

        UserInfo user6 = new UserInfo();
        user6.setName("JJ택시투어");
        user6.setProfile("http://modo.phinf.naver.net/20151202_240/1449049404579u4aUh_JPEG/mosaimFVM4.jpeg?type=f320_320");
        user6.setIntroduce("안녕하세요 JJ택시투어 입니다.");

        Accompanied accompanied = new Accompanied();
        accompanied.setUserInfo(user1);
        accompanied.setDate("2016.03.20");
        accompanied.setDesc("Hook에서 피시앤 칩스랑 맥주 한잔 하실 남정네");
        accompanied.setLocation("London");
        accompanied.setIsThunder(true);
        List<Tag> tags = new ArrayList<>();
        tags.add(new Tag("Hook"));
        tags.add(new Tag("맥주"));
        accompanied.setTags(tags);

        Accompanied accompanied2 = new Accompanied();
        accompanied2.setUserInfo(user2);
        accompanied2.setDate("2016.03.20");
        accompanied2.setDesc("따스한 봄 런던 맛점 하실분!!");
        accompanied2.setLocation("London");
        accompanied2.setIsThunder(true);
        List<Tag> tags2 = new ArrayList<>();
        tags2.add(new Tag("맛점"));
        accompanied2.setTags(tags2);

        Accompanied accompanied3 = new Accompanied();
        accompanied3.setUserInfo(user3);
        accompanied3.setDate("2016.03.20");
        accompanied3.setDesc("늦은 밤 비트에 몸을 맡기실분");
        accompanied3.setLocation("London");
        accompanied3.setIsThunder(true);
        List<Tag> tags3 = new ArrayList<>();
        tags3.add(new Tag("클럽"));
        tags3.add(new Tag("DJ마크컴"));
        accompanied3.setTags(tags3);


        Accompanied accompanied4 = new Accompanied();
        accompanied4.setUserInfo(user4);
        accompanied4.setDate("2016.03.20");
        accompanied4.setDesc("맛집이라던데 같이가실분?");
        accompanied4.setLocation("London");
        accompanied4.setIsThunder(true);
        List<Tag> tags4 = new ArrayList<>();
        tags4.add(new Tag("미슐랭"));
        tags4.add(new Tag("스테이크"));
        accompanied4.setTags(tags4);

        Accompanied accompanied5 = new Accompanied();
        accompanied5.setUserInfo(user5);
        accompanied5.setDate("2016.03.20");
        accompanied5.setDesc("가우디투어 땡처리!!");
        accompanied5.setLocation("Barcelona");
        accompanied5.setIsThunder(true);
        accompanied5.setIsPartner(true);
        List<Tag> tags5 = new ArrayList<>();
        tags5.add(new Tag("가우디투어"));
        tags5.add(new Tag("바르셀로나"));
        tags5.add(new Tag("Sponsor"));
        accompanied5.setTags(tags5);

        Accompanied accompanied6 = new Accompanied();
        accompanied6.setUserInfo(user6);
        accompanied6.setDate("2016.03.20");
        accompanied6.setDesc("대만 예스진지 택시투어");
        accompanied6.setLocation("Taiwan");
        accompanied6.setIsThunder(true);
        accompanied6.setIsPartner(true);
        List<Tag> tags6 = new ArrayList<>();
        tags6.add(new Tag("예스진지"));
        tags6.add(new Tag("택시투어"));
        tags6.add(new Tag("Sponsor"));
        accompanied6.setTags(tags6);

        List<Accompanied> accompanieds = new ArrayList<>();

        accompanieds.add(accompanied);
        accompanieds.add(accompanied2);
        accompanieds.add(accompanied3);
        accompanieds.add(accompanied4);
        accompanieds.add(accompanied5);
        accompanieds.add(accompanied6);

        return accompanieds;
    }
}
