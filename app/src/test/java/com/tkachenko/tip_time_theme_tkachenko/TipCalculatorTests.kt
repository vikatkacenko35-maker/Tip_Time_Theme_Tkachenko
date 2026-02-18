package com.tkachenko.tip_time_theme_tkachenko

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
    @Test
    fun calculateTip_20percentNoRounUp(){
        val amount = 10.00
        val tipPercent = 20.00
        val expextedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip =calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expextedTip, actualTip)
    }
}