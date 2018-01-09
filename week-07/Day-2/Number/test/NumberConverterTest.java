import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberConverterTest {

  @Test
  void should_return745InString_when_745() {
    int inputNumber = 745;
    String expectedResult = "seven hundred and forty five";

    assertEquals(expectedResult, NumberConverter.numberConverter(inputNumber));
  }

  @Test
  void should_returnInStringZeroToNine_when_inputInt() {
    int inputNumber = 7;
    String expectedResult = "seven";

    assertEquals(expectedResult, NumberConverter.numberConverter(inputNumber));
  }

  @Test
  void should_returnInStringZeroToNineteen_when_inputInt() {
    int inputNumber = 13;
    String expectedResult = "thirteen";

    assertEquals(expectedResult, NumberConverter.numberConverter(inputNumber));
  }

  @Test
  void should_returnInStringZeroToNinetynine_when_inputInt() {
    int inputNumber = 56;
    String expectedResult = "fifty six";

    assertEquals(expectedResult, NumberConverter.numberConverter(inputNumber));
  }

  @Test
  void should_returnInStringZeroToNineHundredNinetynine_when_inputInt1() {
    int inputNumber = 99;
    String expectedResult = "ninety nine";

    assertEquals(expectedResult, NumberConverter.numberConverter(inputNumber));
  }

  @Test
  void should_returnInStringZeroToNineThousandNineHundredNinetynine_when_inputInt1() {
    int inputNumber = 2018;
    String expectedResult = "two thousand eighteen";

    assertEquals(expectedResult, NumberConverter.numberConverter(inputNumber));
  }
}