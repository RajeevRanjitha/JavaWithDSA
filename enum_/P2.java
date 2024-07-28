package enum_;

public enum P2 {
    // Enum constants with fields and method implementations
    PLUS("Ranjirha") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    // Field
    private final String str;

    // Constructor for constants that have a field
    P2(String str) {
        this.str = str;
    }

    // Default constructor for constants without a field
    P2() {
        this.str = null;
    }

    // Abstract method
    public abstract double apply(double x, double y);

    // Method to print a message
    public void print() {
        System.out.println("Ranjitha Gayatri Hi");
    }

    // Getter for the field
    public String getStr() {
        return str;
    }
}
