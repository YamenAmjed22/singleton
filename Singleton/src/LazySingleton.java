import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
// in singleton the new can not use it to solve this make constrictor privet
public class LazySingleton {
    private String[] letters = {"a" , "b" , "c" , "d" , "e"} ;
    private List<String> data = Arrays.asList(letters) ;
    private static LazySingleton object = null ;   // object = null
    public static LazySingleton getInstance(){
        if(object == null){
          object =  new LazySingleton() ;
        }
        return object;
    }
    // the constrictor was public but we make it privet to restrict create object using new
    private LazySingleton(){
        Collections.shuffle(data);
    }
    public void printData(){
        for (String l:data){
            System.out.printf("%s " , l);
        }
        System.out.println();
    }
}

