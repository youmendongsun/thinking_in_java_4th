package chapter19._4;

enum Search { HITHER, YON }

public class UpcastEnum {

    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER;
        System.out.println(e.getClass());
//        e.values();
        for (Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }
    }

}
