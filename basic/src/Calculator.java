public interface Calculator {
    int calculate(int n1, int n2);

    default int multiple(int n1, int n2) {
      return n1 * n2;
    }
}
