class Complex {
    private double real;
    private double imag;

    // Default Constructor
    public Complex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    // Parameterized Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Addition of two complex numbers
    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Subtraction of two complex numbers
    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    // Multiplication of two complex numbers
    public Complex multiply(Complex c) {
        double realPart = this.real * c.real - this.imag * c.imag;
        double imagPart = this.real * c.imag + this.imag * c.real;
        return new Complex(realPart, imagPart);
    }

    // Display a complex number
    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }

    public static void main(String[] args) {
        // Create complex numbers
        Complex c1 = new Complex(3.5, 2.5);
        Complex c2 = new Complex(1.5, 4.5);

        // Perform operations
        System.out.print("Complex Number 1: ");
        c1.display();
        System.out.print("Complex Number 2: ");
        c2.display();

        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        Complex diff = c1.subtract(c2);
        System.out.print("Difference: ");
        diff.display();

        Complex product = c1.multiply(c2);
        System.out.print("Product: ");
        product.display();
    }
}
