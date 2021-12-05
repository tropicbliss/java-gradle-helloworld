package hello;

import org.joda.time.LocalTime;

public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello, world!");

    LocalTime currentTime = new LocalTime();
    System.out.println(
        "This automated train is provided for the security and convenience of the Black Mesa Research Facility personnel. The time is "
            + currentTime + ".");
  }
}
