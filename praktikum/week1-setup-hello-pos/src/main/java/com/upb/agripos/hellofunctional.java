import java.util.function.BiConsumer;
public class hellofunctional {
    public static void main(String[] args) {
        BiConsumer<String,Integer> panggil =
            (nama, nim) -> System.out.println("hallo, " + nama + " - " + nim);
        panggil.accept("Ahmad Sultoni", 240202850);
    }
}
