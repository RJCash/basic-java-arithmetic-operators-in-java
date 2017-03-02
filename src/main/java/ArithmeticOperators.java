/**
 * Follow the instructions in the javadoc comments below to complete the to-do
 * tasks listed below. You can run all tests by selecting and executing the
 * "Run all tests (ArithmeticOperatorsTest)" run configuration.
 * <p>
 * This exercise is focused on learning how to work with arithmetic operators
 * and different types of data in Java. Specifically, you should pay attention
 * to how different types of data work together. For example, if you divide an
 * integer by a double, what type of data do you get back? Also, pay attention
 * to the fact that all of the expressions you will write follow the same
 * pattern. If you recognize the patterns you can begin to make inferences about
 * how to write your own code and how other code works.
 * <p>
 * For each of the methods listed below, you will use System.out.println() to
 * print the output from a particular expression. For example, if you are asked
 * to add an integer and a double your method body might look like this:
 * <p>
 * <code>System.out.println(123 + 5.12);</code>
 * <p>
 * As with other exercises, don't write more than one line of code at a time!
 * Write a line, test it. If there's a problem, fix it then and there. Once
 * that's working it's safe to move on to the next problem. But, if you try to
 * write or change more than one thing at a time, it can be hard to know what
 * impact your changes are having. For example, if you make a bunch of changes
 * and then your program stops working correctly, how do you know which of those
 * changes introduced the problem? By moving slowly and methodically you will be
 * a faster and better programmer.
 */
public class ArithmeticOperators {

    /**
     * This method should print out the results of adding two integers together.
     * Remember that integers are the numbers we count with. -1, 0, 1, 2, 3,
     * etc. The addition operator is <code>+</code>.
     *
     * EG: eight plus fifteen
     */
    public static void addTwoIntegers() {

        // todo: add two integers together and print them out.
        int x =5, y=4;
        double a = x+y;
        System.out.println(5+4);
    }

    /**
     * This method should print out the result of adding three integers
     * together using the addition operator.
     *
     * EG: eight plus fifteen plus negative one hundred
     */
    public static void addThreeIntegers() {

        // todo: add three integers together and print the result.
        int x=4, y=6, z=-8;
        System.out.println(4+6+8);
    }

    /**
     * This method should print out the results of adding two doubles together.
     * Remember that doubles are decimal numbers. -123.45, 1.6180339887, 3.14,
     * etc.
     *
     * EG: eight point one plus two point one five
     */
    public static void addTwoDoubles() {

        // todo: add two doubles together and print out the result.
        double x =4.234234, y=1234234.234234;
        System.out.println(4.5+12.345);
    }

    /**
     * This method should print out the result of adding three doubles together.
     *
     * EG: eight point one plus two point one five plus negative twenty one point five one
     */
    public static void addThreeDoubles() {

        // todo: add three doubles together and print out the result.
        double x = 23.34, y = 123.67, z = 56546.4;
        System.out.println(23.45+23.5+23.3);
    }

    /**
     * This method should add together a positive and a negative number. Numbers
     * can be either integers or doubles and either one can be negative, though
     * the other must be positive. Remember that we can denote negative numbers
     * using the unary <code>-</code> operator. For example: <code>-5</code>
     *
     * EG: negative five plus thirty two point eight
     */
    public static void addANegativeAndPositiveNumber() {

        // todo: add and print a negative number and a positive number
        int x = -45, y = 5;
        System.out.println(-45 + 5);

    }

    /**
     * This method should print the results of adding an integer and a double.
     *
     * EG: five plus thirty two point eight
     */
    public static void addIntegerAndDouble() {

        // todo: add together and print out an integer and a double
        int x =5;
        double y =8.5;
        System.out.println(5+8.5);
    }

    /**
     * This method should print the results of subtracting two numbers. Remember
     * that the subtraction operator is <code>-</code>.
     *
     * EG: thirty five minus two point eight
     */
    public static void subtractTwoNumbers() {

        // todo: subtract two numbers and print the result
        double x = -67.9, y = 45.3;
        System.out.println(-34.4-45.6);
    }

    /**
     * This method should print the results of subtracting three numbers from
     * each other.
     *
     * EG: thirty five minus two point eight minus seventeen
     */
    public static void subtractThreeNumbers() {

        // todo: subtract three numbers and print the result
        int x =45, y=6;
        double z = -56.2;
        System.out.println(45-6-34);
    }

    /**
     * This method should print the results of subtracting a negative and a
     * positive number.
     *
     * EG: negative thirty five minus two point eight
     */
    public static void subtractANegativeAndPositiveNumber() {

        // todo: subtract a negative and positive number
        double x = -100.34;
        int y = 34;
        System.out.println(-122-34);


    }

    /**
     * This method should print the results of combining the addition and
     * subtraction operators with three numbers of any type.
     *
     * EG: seventy five plus negative thirty five minus two point eight
     */
    public static void combineAdditionAndSubtractionWithThreeNumbers() {

        // todo: add and subtract three numbers
        double x = 8.3, y =67.3, z = 34.12;
        System.out.println(8.3+45-3);
    }

    /**
     * This method should print the result of multiplying two numbers. Remember
     * that the multiplication operator is <code>*</code>.
     *
     * EG: six times negative zero point one
     */
    public static void multiplyTwoNumbers() {

        // todo: multiply two numbers
        double x =9234.234, y =3434.34;
        System.out.println(34*34);
    }

    /**
     * This method should print the result of multiplying three numbers.
     *
     * EG: eight times zero times one billion point eight
     */
    public static void multiplyThreeNumbers() {

        // todo: multiply three numbers
        double x =34.3, y=56, z=23;
        System.out.println(34*34*34);
    }

    /**
     * This method should print the result of dividing two integers. Remember
     * that the division operator is <code>/</code>.
     *
     * EG: five divided by negative twelve.
     */
    public static void divideTwoIntegers() {

        // todo: divide two integers
        int x = 45, y = 56;
        System.out.println(23/234);
    }

    /**
     * This method should print the result of dividing three integers.
     *
     * EG: twenty five divided by negative 12 divided by two
     */
    public static void divideThreeIntegers() {

        // todo: divide three integers
        int x = 45, y = 56, z = 23;
        System.out.println(45/12/56);
    }

    /**
     * This method should print the result of dividing two doubles.
     *
     * EG: twenty five point zero divided by negative five point eight
     */
    public static void divideTwoDoubles() {

        // todo: divide two doubles
        double x = 56.4, y =23.4;
        System.out.println(45.6/56.4);
    }

    /**
     * This method should print the result of dividing three doubles.
     *
     * EG: twenty five point zero divided by negative five point eight divided by two hundred thirty two point seven
     */
    public static void divideThreeDoubles() {

        // todo: divide three numbers
        double x= 45.4, y = 45.4, z = 45.4;
        System.out.println(23.43/34.5/1324.4);
    }

    /**
     * This method should print the result of dividing an integer by a double.
     *
     * EG: twenty five divided by five point four
     */
    public static void divideIntegerByDouble() {

        // todo: divide an integer by a double
        int x = 56;
        double y = 45.5;
        System.out.println(56/78.6);
    }

    /**
     * This method should print the result of dividing a double by an integer.
     *
     * EG: five point four divided by twenty five
     */
    public static void divideDoubleByInteger() {

        // todo: divide a double by an integer
        double x = 45.6;
        int c = 34;
        System.out.println(34.4/4);
    }

    /**
     * This method should print the remainder of dividing two integers. Remember
     * that the remainder operator is <code>%</code>. This is sometimes called
     * the modulo operator.
     *
     * EG: The remainder when dividing twenty five by four
     */
    public static void remainderOfDividingTwoIntegers() {

        // todo: print the remainder of dividing two integers
        double x =4.4, y= 5.6;
        System.out.println(23%245);
    }

    /**
     * This method should print the result of an expression that uses each of
     * the following:
     *
     * - Negative and Positive Numbers
     * - Integers and Doubles
     * - Parenthesis
     * - Addition, Subtraction, Multiplication, Division, and Modulo.
     *
     * EG: The remainder of five plus negative four minus negative four times three divided by two point three, divided by nine
     */
    public static void combineAllFiveOperatorsWithParenthesisAndNegativeAndPositiveIntegersAndDoubles() {

        // todo: write a complex expression
        double x = 345.3, y = 45.5;
        int z = 35, h = 234;
        System.out.println(((23+7.33)%54*-12)-h/z);
    }

}
