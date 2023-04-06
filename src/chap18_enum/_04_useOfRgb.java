package chap18_enum;

public class _04_useOfRgb {
    public static void main(String[] args) {
        RGB red = RGB.RED;
        RGB green = RGB.valueOf("GREEN");
        RGB blue = RGB.valueOf(RGB.class,"BLUE");

        System.out.println("빨간색은 " + red.getRed()+", " + red.getGreen()+", "+red.getBlue());
        System.out.println("파란색은 " + blue.getRed()+", " + blue.getGreen()+", "+blue.getBlue());
        System.out.println("초록색은 " + green.getRed()+", " + green.getGreen()+", "+green.getBlue());
        red.makeWhite();
        green.makeWhite();
        blue.makeWhite();
    }
}
