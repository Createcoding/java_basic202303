package day05.member;

public class Test {

    public static void main(String[] args) {





        Member m1 = new Member(1,"abc@def.com",
                "1234","콩벌레",
                Gender.MALE, 50);

        Member m2 = new Member(2,"xxx@zzz.com",
                "9999","팥죽이",
                Gender.FEMALE, 30);

        //        System.out.println(m1.inform());
//        System.out.println(m2.inform());

        MemberRepository mr = new MemberRepository();


        Member thief = new Member(4, "uuu@zzz.com",
                "3243", "밥도둑",
                Gender.MALE, 22);

        mr.addMember(thief);
        mr.addMember(thief);

        mr.showMembers();

        boolean flag = mr.isDuplicateEmail("xx@zzz.com");
        System.out.println("flag = " +flag);

    }
}