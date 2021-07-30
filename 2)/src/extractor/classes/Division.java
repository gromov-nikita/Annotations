package extractor.classes;

import extractor.annotations.ExtractInterface;

@ExtractInterface("IDivision")
public class Division {
    public double division(double x, double y) {
        return x / y;
    }
    public int divisionRound (double x, double y) {
        return (int)(x / y);
    }
}
