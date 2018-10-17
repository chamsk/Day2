package task1;

/**
 * Created by Kor on 17.10.2018.
 */
class Section{
    private double positionX1;
    private double positionY1;
    private double positionX2;
    private double positionY2;

    public Section(double positionX1, double positionY1, double positionX2, double positionY2) {
        this.positionX1 = positionX1;
        this.positionY1 = positionY1;
        this.positionX2 = positionX2;
        this.positionY2 = positionY2;
    }

    public double getPositionX1() {
        return positionX1;
    }

    public double getPositionY1() {
        return positionY1;
    }

    public double getPositionX2() {
        return positionX2;
    }

    public double getPositionY2() {
        return positionY2;
    }

    public void equalsLength(Section a, Section b){
        double lengthA = Math.sqrt(Math.pow((a.getPositionX2()-a.getPositionX1()),2)+(Math.pow(a.getPositionY2()-a.getPositionY1(),2)));
        double lengthB = Math.sqrt(Math.pow((b.getPositionX2()-b.getPositionX1()),2)+(Math.pow(b.getPositionY2()-b.getPositionY1(),2)));
        if(lengthA>lengthB){
            System.out.println("Длина первого отрезка больше, чем второго");
        }
        else if(lengthA<lengthB){
            System.out.println("Длина второго отрезка больше, чем первого");
        }
        else if(lengthB==lengthA){
            System.out.println("длина отрезков равна");
        }

    }
}

