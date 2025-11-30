package org.example;

public class Loop {

        public static void main (String[] args) {

            int[] numbers = {59, 32, 43, 20, 17, 95, 52, 3, 69, 84, 71, 21, 15, 99, 8, 67, 75, 49, 1, 87};
            int numberQuantity= numbers.length;
            double sum = 0.0;

            for(int i=0;i < numbers.length; i++) {
                 System.out.println("Number [" + i + "] = " + numbers[i]);
            }
            for(int o =0 ; o < numbers.length; o++ ) {
                 sum += numbers[o];
            }
            // dlaczego ta linijka musi byc w tym miejscu a nie w miejscu zadeklarowanych atrybutow? bo petla for(o) jest dalej i gdyby bylo wyzej to bedzie wyrzucac 0.0 jako srednia bo dopiero dalej jest to liczone?
            double arithmeticAverage = sum / numberQuantity;
            System.out.println(arithmeticAverage);
        }
}
