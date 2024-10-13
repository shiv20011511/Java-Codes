public class JavainternalsProb1 {
    public static void main(String[] args){
//        wap to display all primitive datatypes by taking user input on command line and display their minimum,maximum and default value
                // Integer types
                System.out.println("byte:");
                System.out.println("Minimum Value: " + Byte.MIN_VALUE);
                System.out.println("Maximum Value: " + Byte.MAX_VALUE);
                System.out.println("Default Value: " + 0);
                System.out.println();

                System.out.println("short:");
                System.out.println("Minimum Value: " + Short.MIN_VALUE);
                System.out.println("Maximum Value: " + Short.MAX_VALUE);
                System.out.println("Default Value: " + 0);
                System.out.println();

                System.out.println("int:");
                System.out.println("Minimum Value: " + Integer.MIN_VALUE);
                System.out.println("Maximum Value: " + Integer.MAX_VALUE);
                System.out.println("Default Value: " + 0);
                System.out.println();

                System.out.println("long:");
                System.out.println("Minimum Value: " + Long.MIN_VALUE);
                System.out.println("Maximum Value: " + Long.MAX_VALUE);
                System.out.println("Default Value: " + 0L);
                System.out.println();

                // Floating-point types
                System.out.println("float:");
                System.out.println("Minimum Value: " + Float.MIN_VALUE);
                System.out.println("Maximum Value: " + Float.MAX_VALUE);
                System.out.println("Default Value: " + 0.0f);
                System.out.println();

                System.out.println("double:");
                System.out.println("Minimum Value: " + Double.MIN_VALUE);
                System.out.println("Maximum Value: " + Double.MAX_VALUE);
                System.out.println("Default Value: " + 0.0);
                System.out.println();

                // Character type
                System.out.println("char:");
                System.out.println("Minimum Value: " + (int) Character.MIN_VALUE);
                System.out.println("Maximum Value: " + (int) Character.MAX_VALUE);
                System.out.println("Default Value: " + '\u0000');
                System.out.println();

                // Boolean type
                System.out.println("boolean:");
                System.out.println("No specific minimum or maximum values.");
                System.out.println("Default Value: " + false);
            }
}



