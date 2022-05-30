package com.company.Task12;

public class Task12 {
    double dividing(double arg1, double arg2) throws NegParam, DivNull{
        if (arg1 < 0) throw new NegParam("One of arguments have negative value.");
        if (arg2 < 0) throw new NegParam("One of arguments have negative value.");
        if (arg2 == 0) throw new DivNull("Second argument equals 0.");
        return arg1 / arg2;
    }
    public Task12(){
        double arr[][]={{4,3}, {-2,1}, {0,1}, {6, -1}, {4,0}};
        for(double d[] :arr) {
            try {
                System.out.println(dividing(d[0],d[1]));
            }catch (NegParam e){
                System.err.println(e);
            }catch (DivNull e){
                System.err.println(e);
            }

        }
    }
}
