import java.security.cert.CertPathBuilder;
import java.util.ArrayList;
import java.util.List;

/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
class PythagoreanTriplet{
    private int a,b,c;
    private int sumLimit;
    private int sum;

    PythagoreanTriplet(){
        
    }
    PythagoreanTriplet(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static PythagoreanTriplet makeTripletsList() {
        return new PythagoreanTriplet();

    }

    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int sumLimit) {
        this.sumLimit = sumLimit;
        return this;
    }

    public PythagoreanTriplet thatSumTo(int sum) {
        this.sum = sum;
        return this;
    }

    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> resp = new ArrayList<>();
        for (int i = 1; i <= sum; i++) {
            for (int j = i; j <= sum-i; j++) {
                int k=sum-(i+j);
                if(i*i+j*j==k*k && j<k){
                    if(i+j+k==sum){
                        resp.add(new PythagoreanTriplet(i, j, k));
                    }
                }
            }
        }
        return resp;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        PythagoreanTriplet other = (PythagoreanTriplet) obj;
        if ((this.a == other.a) && (this.b == other.b) && (this.c == other.c)) {
            return true;
        }
        return false;
    }
}