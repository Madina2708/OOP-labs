package lab_2.problem1.Bmodels;

class DVD extends LibraryItem {
    private double duration; //in minutes

    public DVD(String title, String director, int year, double duration) {
        super(title, director, year);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duration: " + duration + " min";
    }
}