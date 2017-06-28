package com.chason.test;

import org.junit.Test;

/**
 * Created by chason on 2017/6/15.
 */
public class Client2 {

    public static int switchIt(int x){
        int j = 1;
        switch (x) {
            case 1: j++;
            case 2: j++;
            case 3: j++;
            case 4: j++;
            case 5: j++;
            default:j++;
        }
        return j + x;
    }

    public void sw(int x){
        int j =1;
        switch (1){
            case 1: j++;
            case 2: j++;
            case 3: j++;
            case 4: j++;
            case 5: j++;
            case 6: j++;
            case 7: j++;
            default:j++;
        }
        System.out.println(j+"--------------");
    }

    @Test
    public void ptinyt(){
      //  System.out.println ("value =" +switchIt(5));
        sw(1);
    }

/*  A. Value =3
          B. Value =4
          C. Value =5
          D. Value =6
          E. Value =7
          F. Value =8*/

}
