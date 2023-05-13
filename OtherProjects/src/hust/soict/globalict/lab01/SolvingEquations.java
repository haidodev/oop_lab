package hust.soict.globalict.lab01;

public class SolvingEquations {
    public static void FirstDegreeEquation(Double[] vars){
        System.out.println(String.format("The equation: %fx + %f = 0", vars[0], vars[1]));
        if (vars[0] == 0){
            if (vars[1] == 0){
                System.out.println("The equation has infinite number of roots.");
            } else {
                System.out.println("The equation has no roots.");
            }
        } else{
            System.out.println("Root x = " + -vars[1] / vars[0]);
        }
    }
    public static void SecondDegreeEquation(Double[] vars){
        System.out.println(String.format("The equation: %fx^2 + %fx + %f = 0", vars[0], vars[1], vars[2]));
        if (vars[0] == 0){
            Double[] newVars = {vars[1], vars[2]};
            SolvingEquations.FirstDegreeEquation(newVars);
        } else{
            Double delta = vars[1] * vars[1] - 4 * vars[0] * vars[2];
            if (delta < 0) {
                System.out.println("The equation has no roots.");
            }
            else {
                if (delta == 0){
                   System.out.println("Root x1 = x2 = " + -vars[1] / (2 * vars[0]));
                } else {
                   System.out.println("Root x1 = " + (-vars[1] + Math.sqrt(delta)) / (2 * vars[0]));
                   System.out.println("Root x2 = " + (-vars[1] - Math.sqrt(delta)) / (2 * vars[0]));

                }
            }

        }
    }
    public static void LinearSystem(Double[][] vars) {
        double a = vars[0][0];
        double b = vars[0][1];
        double c = vars[1][0];
        double d = vars[1][1];
        double e = vars[0][2];
        double f = vars[1][2];
        System.out.println("The system of equation: ");
        System.out.println(String.format("%fx + %fy = %f", a, b, c));
        System.out.println(String.format("%fx + %fy = %f", d, e, f));

        double detA = a * d - b * c;

        if (detA == 0) {
            System.out.println("Error: The system of linear equations has no unique solution.");
            return;
        }

        double x = (d * e - b * f) / detA;
        double y = (a * f - c * e) / detA;

        System.out.println("Root x = " + x);
        System.out.println("root y = " + y);
    }
    public static void main(String[] args) {
        Double[] vars0 = { 1d, 2d};
        Double[] vars1 = { 1d, 2d, 1d};
        Double[][] vars2 = {{ 1d, 2d, 1d}, { 1d, 3d, 2d}};
        SolvingEquations.FirstDegreeEquation(vars0);
        SolvingEquations.SecondDegreeEquation(vars1);
        SolvingEquations.LinearSystem(vars2);
    }
}
