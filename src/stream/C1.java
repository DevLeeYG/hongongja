package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class C1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");


      Stream<String> a =  list.stream();

      List<String> b = new ArrayList<>();

      a.forEach(el->{
          b.add(el);
      });

        System.out.println(b);

    }
}
