package com.life;

import java.math.BigDecimal;

abstract class ALife {

    abstract protected BigDecimal isAlive(final long n);
    abstract protected void life() throws InterruptedException;
    abstract protected BigDecimal logActions();
    abstract protected void print(final BigDecimal log);

}
