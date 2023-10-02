public class Main {
    public static void main(String[] args) {

        String sBoolean =  ("tRue");
        boolean bVal = Boolean.parseBoolean(sBoolean);

        String sByte = "120";
        byte byVal = Byte.parseByte(sByte);

        String sShort = "32000";
        short sVal = Short.parseShort(sShort);

        String sInt = "147895632";
        int iVal = Integer.parseInt(sInt);

        String sLong = "987654321987654321";
        long lVal = Long.parseLong(sLong);
        System.out.println(lVal);

        String sDouble = "4444.5d";
        double dVal = Double.parseDouble(sDouble);

        String sFloat = "2354.56f";
        float fVal = Float.parseFloat(sFloat);

        System.out.println("boolean-"+bVal);
        System.out.println("byte-"+byVal);
        System.out.println("short-"+sVal);
        System.out.println("int-"+iVal);
        System.out.println("long-"+lVal);
        System.out.println("double-"+dVal);
        System.out.println("float -"+fVal);
    }
}

