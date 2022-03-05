package converter

import com.tngtech.java.junit.dataprovider.DataProvider
import com.tngtech.java.junit.dataprovider.DataProviderRunner
import com.tngtech.java.junit.dataprovider.DataProviders.`$$`
import com.tngtech.java.junit.dataprovider.DataProviders.`$`
import com.tngtech.java.junit.dataprovider.UseDataProvider
import converter.token.map.En
import converter.token.map.Nl
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.test.assertEquals

@RunWith(DataProviderRunner::class)
internal class NumberConverterTest {

    companion object {
        @DataProvider
        @JvmStatic
        fun convertDataNl(): Array<Array<Any>> = `$$`(
            `$`("een", "1"),
            `$`("zeven", "7"),
            `$`("twaalf", "12"),
            `$`("achttien", "18"),
            `$`("twintig", "20"),
            `$`("zeventig", "70"),
            `$`("drie en twintig", "23"),
            `$`("acht en vijftig", "58"),
            `$`("honderd", "100"),
            `$`("honderd drie en dertig", "133"),
            `$`("twee honderd acht en tachtig", "288"),
            `$`("duizend", "1.000"),
            `$`("duizend acht", "1.008"),
            `$`("een duizend acht", "1.008"),
            `$`("duizend honderd acht", "1.108"),
            `$`("elf honderd acht", "1.108"),
            `$`("tachtig duizend vier honderd drie en zestig", "80.463"),
            `$`("vijf en tachtig duizend vier honderd drie en zestig", "85.463"),
            `$`("honderd vier en twintig duizend drie honderd vijftig", "124.350"),
            `$`("honderd acht en twintig miljard vier honderd zestig miljoen twee honderd zestien duizend acht honderd zes en twintig", "128.460.216.826"),
            `$`("honderdachtentwintigmiljardvierhonderdzestigmiljoentweehonderdzestienduizendachthonderdzesentwintig", "128.460.216.826"),
        )

        @DataProvider
        @JvmStatic
        fun convertDataEn(): Array<Array<Any>> = `$$`(
            `$`("one", "1"),
            `$`("seven", "7"),
            `$`("twelve", "12"),
            `$`("eighteen", "18"),
            `$`("twenty", "20"),
            `$`("seventy", "70"),
            `$`("twenty three", "23"),
            `$`("fifty eight", "58"),
            `$`("one hundred", "100"),
            `$`("one hundred thirty three", "133"),
            `$`("two hundred eighty eight", "288"),
            `$`("one thousand", "1.000"),
            `$`("one thousand and eight", "1.008"),
            `$`("one thousand one hundred eight", "1.108"),
            `$`("eleven hundred and eight", "1.108"),
            `$`("eighty thousand four hundred and sixty three", "80.463"),
            `$`("eighty five thousand four hundred and sixty three", "85.463"),
            `$`("one hundred twentyfour thousand three hundred and fifty", "124.350"),
            `$`("one hundred twenty eight billion four hundred sixty million two hundred sixteen thousand eight hundred and twenty six", "128.460.216.826"),
            `$`("onehundredtwentyeightbillionfourhundredsixtymilliontwohundredsixteenthousandeighthundredandtwentysix", "128.460.216.826"),
        )
    }

    @Test
    @UseDataProvider(value = "convertDataNl")
    fun testConvertNl(input: String, expected: String) {
        val converter = NumberConverter(Nl(), input)
        val actual = converter.convert()

        assertEquals(expected, actual)
    }

    @Test
    @UseDataProvider(value = "convertDataEn")
    fun testConvertEn(input: String, expected: String) {
        val converter = NumberConverter(En(), input)
        val actual = converter.convert()

        assertEquals(expected, actual)
    }
}