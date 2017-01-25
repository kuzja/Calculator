public enum Operation {

    Add("+") {

    },
    Sub("-") {

    };

    String op;

    Operation(String op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return op;
    }
}
