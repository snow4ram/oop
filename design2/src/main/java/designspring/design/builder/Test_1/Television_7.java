package designspring.design.builder.Test_1;

public class Television_7 {
    int channel;            // 채널 번호
    int volume;             // 볼륨
    boolean onOff;          // 전원 상태

    void print(){
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }

    int getChannel(){
        return channel;
    }

    // 매개변수를 가지는 메소드 setChannel()
    void setChannel(int argCh){
        channel = argCh;
    }
}
