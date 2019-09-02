package com.life;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Life extends ALife {

    private static BigDecimal next_day = BigDecimal.ONE;
    private static BigDecimal live = BigDecimal.ONE;
    private static BigDecimal doings = BigDecimal.ONE;

    private static List<BigDecimal> digit_array = new ArrayList<BigDecimal>();

    private long countDay = 1;

    public static void main(String[] args) {
        Life life = new Life();
        life.print(life.isAlive(5000));
    }

    @Override
    protected BigDecimal isAlive(final long n) {
        if (this.countDay < n) {
            this.countDay++;
            life();
            return isAlive(n);
        }
        return logActions();
    }

    @Override
    protected void print(BigDecimal log){
        System.out.println("--------");
        System.out.println(log);
    }

    @Override
    protected void life() {
        //System.out.println(live);
        BigDecimal day_x = next_day;
        next_day = live;
        live = day_x.add(next_day);
        System.out.println(live);
        doings = doings.add(live);
        digit_array.add(live);
        if(digit_array.size() == 2){
            BigDecimal first_number = digit_array.get(0);
            BigDecimal second_number = digit_array.get(1);
            BigDecimal fi = second_number.divide(first_number, 999, RoundingMode.CEILING);
            //System.out.println(fi);
            digit_array.clear();
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    @Override
    protected BigDecimal logActions() {
        return doings;
    }

}
