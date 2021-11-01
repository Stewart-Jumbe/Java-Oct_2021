package com.sjumbe;

public class SpeedConverter {

    public double kmval = 1;

    public long toMilesPerHour(double num){
        if(num< 0){
            return -1;
        }
        else{
            long answer = math.round(num/1.609);

            return answer;
        }
    }

    public void printConversion(double kmval){

        long converted = new SpeedConverter(kmval);
        if (kmval < 0){
            System.out.println("Invalid Value");
        }else{
            //System.out.println(kmval + " km/h" +" = "+ converted +" mi/h")
            System.out.printf("%d %s = %d %s",kmval,"km/h",converted,"mi/h");
        }
    }

}
