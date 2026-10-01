import java.util.function.UnaryOperator;

public class MethodSqrt {
    public UnaryOperator<Integer> sqrt(){
        return x->x*x;
    }
}
