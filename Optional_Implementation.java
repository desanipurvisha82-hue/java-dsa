import java.util.Optional;

public class Optional_Implementation {

    public static void main(String[] args) {

        String name = "hello";
        String p = "";

        Optional<String> s = Optional.of(name);
        Optional<String> s2 = Optional.ofNullable(p);
        Optional<String> s3 = Optional.empty();

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s.isPresent());
        System.out.println(s2.isPresent());
        System.out.println(s3.isPresent());

        String res = s3.orElse("Other");
        System.out.println(res);

        s.ifPresent(n -> System.out.println(n));

        Optional<Integer> l = s.map(n -> n.length());
        System.out.println(l);

        Optional<String> f = s.filter(n -> n.startsWith("n"));
        System.out.println(f);
    }
}