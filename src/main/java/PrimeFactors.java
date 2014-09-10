import java.util.Iterator;

public class PrimeFactors implements Iterable<Long> {
    private final long target;

    public PrimeFactors(long target) {
        this.target = target;
    }

    @Override
    public Iterator<Long> iterator() {
        return new PrimeFactorsIterator(target);
    }

    private class PrimeFactorsIterator implements Iterator<Long> {
        private final long limit;
        private long remainder;
        private long factor;

        public PrimeFactorsIterator(long target) {
            this.remainder = target;
            this.factor = 2;
            this.limit = (long) Math.ceil(Math.sqrt(remainder));
        }

        @Override
        public boolean hasNext() {
            return remainder != 1;
        }

        @Override
        public Long next() {
            while ((remainder % factor) != 0)  {
                factor++;
                if (factor > limit) factor = remainder;
            }

            remainder /= factor;

            return factor;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        Out out = new Out();
        for(Long factor : new PrimeFactors(n)) {
            out.println(factor);
        }
    }

}
