package Datevalid;

public class ConsoleInput {

    // Read raw input as String
    public static String getString() {
        try {
            byte[] input = new byte[100];
            int len = System.in.read(input);

            // remove newline (\n or \r\n)
            int actualLen = len;
            if (len > 0 && (input[len - 1] == '\n')) actualLen--;
            if (len > 1 && (input[len - 2] == '\r')) actualLen--;

            return new String(input, 0, actualLen);
        } catch (Exception e) {
            System.out.println("Error reading String!");
            return null;
        }
    }

    // Integer input
    public static int getInt() {
        try {
            String str = getString();
            return Integer.parseInt(str.trim());
        } catch (Exception e) {
            System.out.println("Invalid Integer!");
            return -1;
        }
    }

    // Float input
    public static float getFloat() {
        try {
            String str = getString();
            return Float.parseFloat(str.trim());
        } catch (Exception e) {
            System.out.println("Invalid Float!");
            return -1;
        }
    }

    // Double input
    public static double getDouble() {
        try {
            String str = getString();
            return Double.parseDouble(str.trim());
        } catch (Exception e) {
            System.out.println("Invalid Double!");
            return -1;
        }
    }

    // Character input
    public static char getChar() {
        try {
            String str = getString();
            return str.charAt(0);
        } catch (Exception e) {
            System.out.println("Invalid Character!");
            return '\0';
        }
    }

    // Byte input (numeric)
    public static byte getByte() {
        try {
            String str = getString();
            return Byte.parseByte(str.trim());
        } catch (Exception e) {
            System.out.println("Invalid Byte!");
            return -1;
        }
    }
}