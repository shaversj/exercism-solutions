class Darts {

    double x;
    double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getRadius(){
        return Math.sqrt((x*x) + (y*y));
    }

    int score() {
        int ans = 0;
        double radius = getRadius();
        if (radius > 10.0){
            ans = 0;
        } else if (5.0 < radius && radius <= 10.0){
            ans = 1;
        } else if (1.0 < radius && radius <= 5.0){
            ans = 5;
        } else if (0.0 <= radius && radius <= 1.0){
            ans = 10;
        }
        return ans;
    }

}
