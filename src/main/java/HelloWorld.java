import org.apache.commons.lang3.StringUtils;

import java.io.PrintStream;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args){

        print(System.out);
        String[] result = StringUtils.split("hoge,piyo,foo,bar",",");
        System.out.println(Arrays.toString(result));
    }

    public static void print(PrintStream out){
        out.println("Hello World!");
    }
}
