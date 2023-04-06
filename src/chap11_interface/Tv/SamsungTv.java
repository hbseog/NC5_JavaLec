package chap11_interface.Tv;

public class SamsungTv implements Tv {
    @Override
    public void Show() {
        System.out.println("SamsungTv를 봅니다.");
    }

    @Override
    public void powerOn() {
        System.out.println("SamsungTv를 켭니다.");
    }

    @Override
    public void powerOff() {
        System.out.println("SamsungTv를 끕니다.");
    }

    @Override
    public void Sound() {
        System.out.println("SamsungTv소리를 듣습니다.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println(channel + "로 채널을 바꿉니다.");
    }
}
