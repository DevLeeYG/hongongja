package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class list1 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("Java");
        strings.add("is");
        strings.add("cool");

        String message = String.join(" ,,",strings);

        System.out.println(message);

    }

    }

