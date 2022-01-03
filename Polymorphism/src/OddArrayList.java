import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class OddArrayList extends ArrayList<Integer> {

    @Override
    public void add(int index, Integer element){
        if(isOdd(element)){
             super.add(index,element);
        }
    }

    @Override
    public boolean add(Integer element){
        if (isOdd(element)){
            return super.add(element);
        }
        else{
            return false;
        }
    }
    @Override
    public boolean addAll(Collection<? extends Integer> c){
        return super.addAll(c.stream()
                .filter(OddArrayList::isOdd)
                .collect(Collectors.toList()));
    }

    @Override
    public boolean addAll(int index,
                          Collection<? extends  Integer> c){
        return super.addAll(index, c.stream()
                .filter(OddArrayList::isOdd)
                .collect(Collectors.toList()));
    }

    @Override
    public Integer set(int index,
                       Integer element){
        if(isOdd(element)){
            return super.set(index, element);
        }else{
            System.out.println(element + "is not odd.");
            return  Integer.MIN_VALUE;
        }
    }

    public static boolean isOdd(Integer element){
        return Math.abs(element) % 2 == 1;
        }
    }

