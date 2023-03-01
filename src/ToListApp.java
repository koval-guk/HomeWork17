import java.util.ArrayList;
import java.util.List;

public class ToListApp {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> ints = toList(arr1);
        for (Integer i : ints){
            System.out.print(i+"; ");
        }
        System.out.println();
        String[] arr2 = {"one","two","three","four","five"};
        List<String> strings = toList(arr2);
        for (String s : strings){
            System.out.print(s+"; ");
        }

    }
    public static <E> List<E> toList(E[] array){
        List<E> list = new ArrayList<>();
        for (E element : array) {
            list.add(element);
        }
        return list;
    }
}
