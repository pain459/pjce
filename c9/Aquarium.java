public class Aquarium {
    /** data fields */
    double l = 1;
    // double b = 1;
    double h = 1;
    double fw = 1;
    double d = 1;
    double w = 1;

    /** Constructer 1 */
    Aquarium() {
    }

    double areaofRectangularTank() {
        double volume = (l * w * h) * 30;
        return volume; // in liters
    }

    double areaOfBowShapedTank() {
        double square_area = l * w;
        double eliptical_area = Math.PI * (l / 2) * (fw - w) / 2;
        double tank_volume = ((square_area + eliptical_area) * h) * 30;
        return tank_volume;
    }

    double areaOfCylinderShapedTank() {
        double r = d / 2;
        double tankVolume = Math.PI * r * r * h * 30;
        return tankVolume;
    }

    double areaofRectangularTank(double l, double w, double h) {
        double volume = (l * w * h) * 30;
        return volume; // in liters
    }

    void updateDimentionsOfRectangularTank(double u_l, double u_w, double u_h) {
        l = u_l;
        w = u_w;
        h = u_h;
    }

    double areaOfBowShapedTank(double l, double w, double fw, double h) {
        double square_area = l * w;
        double eliptical_area = Math.PI * (l / 2) * (fw - w) / 2;
        double tank_volume = ((square_area + eliptical_area) * h) * 30;
        return tank_volume;
    }

    void updateDimentionsBowShapedTank(double u_l, double u_w, double u_fw, double u_h) {
        l = u_l;
        w = u_w;
        fw = u_fw;
        h = u_h;
    }

    double areaOfCylinderShapedTank(double d, double h) {
        double r = d / 2;
        double tankVolume = Math.PI * r * r * h * 30;
        return tankVolume;
    }

    void updateDimentionsCylinderShapedtank(double u_d, double u_h) {
        d = u_d;
        h = u_h;
    }
}
