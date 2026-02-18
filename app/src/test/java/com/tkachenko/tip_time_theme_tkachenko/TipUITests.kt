package com.tkachenko.tip_time_theme_tkachenko

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.tkachenko.tip_time_theme_tkachenko.ui.theme.Tip_Time_Theme_TkachenkoTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat
import androidx.compose.ui.Modifier


class TipUITests {

    @get:Rule
    val composeTestsRule = createComposeRule()
    @Test
    fun calculate_20_percent_tip(){
        composeTestsRule.setContent {
            Tip_Time_Theme_TkachenkoTheme {
                Surface(modifier = Modifier.fillMaxSize()){TipTimeLayout()}

            }
        }
        composeTestsRule.onNodeWithText("bILL aMOUNT")
            .performTextInput("10")
        composeTestsRule.onNodeWithText("Tip Percentage")
            .performTextInput("20")
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        composeTestsRule.onNodeWithText("Tip Amount: $expectedTip").assertExists("No node with this text was found.")
    }
}