package calculator;



import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    void string_with_two_number_and_comma_should_return_sum() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }
    @Test
    void return_sum_of_multiple_nums() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1,2,3"));
    }
    @Test
    void string_handle_new_lines_between_numbers_return_sum() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    @Test(expected=Exception.class)
    void Negative_number_throw_exception() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
         stringCalculator.add("-1");
    }
    
    
    
}
