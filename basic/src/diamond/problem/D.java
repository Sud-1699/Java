package diamond.problem;

public class D implements A, B, C{
    @Override
    public void test() {
        A.super.test();
    }
}
