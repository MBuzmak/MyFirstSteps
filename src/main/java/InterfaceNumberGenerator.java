public class InterfaceNumberGenerator {
    interface NumberGenerator<T extends Number>{
        boolean cond(T arg);
    }
    public static NumberGenerator<? super Number> getGenerator(){
        return arg -> arg.intValue() > 0;
    }
}
