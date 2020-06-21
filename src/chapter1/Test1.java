package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @Author: cunxiaopan
 * @Date: 2020/6/21 4:26 下午
 * @Description:
 */
public class Test1 {

  public static void main(String[] args) {
    /** page 7**/
    // old way
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    List<Integer> odds = new ArrayList<>();
    for (int val:list) {
      if(val%2==0){
        odds.add(val);
      }
    }
    for (int val:odds) {
      System.out.println(val);
    }
    //better way
    IntStream.range(0,10).filter(i->i%2==0).forEach(System.out::println);



  }
}
