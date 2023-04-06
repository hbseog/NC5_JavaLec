package chap11_interface.Tv;

public class LgTv implements Tv {

    @Override
    public void Show() {
        System.out.println("LgTv를 봅니다.");
    }

    @Override
    public void powerOn() {
        System.out.println("LgTv를 켭니다.");
    }

    @Override
    public void powerOff() {
        System.out.println("LgTv를 끕니다.");
    }

    @Override
    public void Sound() {
        System.out.println("LgTv소리를 듣습니다.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println(channel + "로 채널을 바꿉니다.");
    }
}
