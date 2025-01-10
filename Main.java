package Triprism;
import java.util.Scanner;

public class Main<T extends Number> {
    private T length;
    private T base;
    private T height;
    private Scanner scan = new Scanner(System.in);

    public Main (T length, T base, T height) {
        this.length = length;
        this.base = base;
        this.height = height;
    }

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getBase() {
        return base;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public double calculateVolume() {
        return (length.doubleValue() * base.doubleValue() * height.doubleValue()) / 2.0;
    }

    public void inputBaseInfo() {
        System.out.print("Enter the TriPrism length: ");
        setLength((T) Double.valueOf(scan.nextDouble()));

        System.out.print("Enter the TriPrism base: ");
        setBase((T) Double.valueOf(scan.nextDouble()));

        System.out.print("Enter the TriPrism height: ");
        setHeight((T) Double.valueOf(scan.nextDouble()));
        
        
        System.out.println();
        System.out.println("Volume of TriPrism: " + calculateVolume());
    }

    public static void main(String[] args) {
        Main<Double> triPrism = new Main<>(0.0, 0.0, 0.0);
        triPrism.inputBaseInfo();
    }
}
