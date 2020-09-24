class Main {
  public static void main(String[] args) {

    wearble[] a= new wearble[2];
    a[0] =new headphone();
    a[1]=new WearableComputer();

    for(int i = 0; i<a.length; i++)
    a[i].putOn();
    for(int i = 0; i<a.length; i++)
    a[i].putOff();
    System.out.println("Hello world!");
  }
}