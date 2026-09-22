public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        ComplexNumber other = (ComplexNumber) o;
        return java.util.Objects.equals(re, other.re)
                && java.util.Objects.equals(im, other.im);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(re, im);
    }
}
