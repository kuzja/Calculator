public enum Operation {

    Add("+") {
        @Override
        long action(long param1, long param2) {
            return param1 + param2;
        }
    },
    Sub("-") {
        @Override
        long action(long param1, long param2) {
            return param1 - param2;
        }
    };

    String op;

    Operation(String op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return op;
    }

    abstract long action(long param1, long param2);

}
