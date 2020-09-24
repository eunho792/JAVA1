public class Headphone implements Wearable {
int volume=0;

public void putOn(){
  System.out.println("핸드폰 착용")
}
public void putOff(){
  Sysem.out.println("핸드폰 벗는다")
}
  public void setVolume(int volume) {
    this.volume = volume;
    System.out println("볼륨을 " +volume + "로 변경했습니다.")
  }

}