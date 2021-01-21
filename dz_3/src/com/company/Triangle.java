package com.company;

public class Triangle {
    class Patient {
        double a;
        double b;
        double c;
        double q1;
        double q2;
        double q3;
        String Vid;


        public Patient(double a, double b, double c, double q1, double q2, double q3) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.q1 = q1;
            this.q1 = q1;
            this.q2 = q2;
            this.q3 = q3;
            if(q1 == 90 || q2 == 90 || q3 == 90){
                this.Vid = "Прямой";
            }
            else{
                if(q1 == q2 && q1 == q3){
                    this.Vid = "Ривносторонний";
                }
                else{
                    this.Vid = "Довильный";
                }
            }

        }

        public double getA() {
            return a;
        }

        public void seetA(double a) {
            this.a = a;
        }


        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }


        public double getQ1() {
            return q1;
        }

        public void setQ1(double q1) {
            this.q1 = q1;
        }

        public double getQ3() {
            return q3;
        }

        public void setQ3(double q3) {
            this.q3 = q3;
        }

        public double getQ2() {
            return q2;
        }

        public void setQ2(double q2) {
            this.q2 = q2;

        }
        public  void sq(){
            double s = 0.5*a*b*Math.sin(q1);
            return s ;


        }

    }
}
