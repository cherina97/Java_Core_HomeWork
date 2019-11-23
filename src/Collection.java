public class Collection {

    private static Integer [] numbers;

    public Collection(Integer[] numbers) {
        this.numbers = numbers;
    }

    public class Forward implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Integer next() {
            return numbers[index++];
        }
    }

    public Iterator createForwardIterator(){
        return new Forward();
    }

    public class Backward implements Iterator{

        int index = numbers.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Integer next() {
            index = index - 2;
            return numbers[index + 2];
        }
    }

    public Iterator createBackwardIterator(){
        return new Backward();
    }

    public Iterator BackwardAnonymous() {
        return new Iterator() {

            int index = numbers.length - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                index = index - 3;
                return numbers[index + 3];
            }
        };
    }

    public Iterator ForwardLocal(){
        class ForwardLocal implements Iterator{

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < numbers.length;
            }

            @Override
            public Integer next() {
                return numbers[index++];
            }
        }
        return new ForwardLocal();
    }

    static class ForwardStatic implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Integer next() {
            return numbers[index ++];
        }
    }
    static ForwardStatic createForwardStatic(){
        return new ForwardStatic();
    }

}
