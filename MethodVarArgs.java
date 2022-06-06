class Method{
    public Method(String... names){
        for(String name : names){
            System.out.println(name);
        }
    }
}
public class MethodVarArgs {
    public static void main(String[] args) {
        Method o = new Method("Meenu", "chimi", "charu", "chitra");
    }
}
