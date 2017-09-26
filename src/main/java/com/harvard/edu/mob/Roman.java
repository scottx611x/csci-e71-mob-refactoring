package com.harvard.edu.mob;

class Roman {
    static int convert(String romanStr) {
        int result = 0;

        char[] chars = romanStr.toCharArray();

        int length = romanStr.length();
        int previousResult = 0;
        int currentResult = 0;
        for (int i = length -1; i >= 0 ; i--)
        {
            currentResult = convert(chars[i]);

            if (currentResult < previousResult)
            {
                result = result - currentResult;
            }
            else
            {
                result = result + currentResult;
            }

            previousResult = currentResult;
        }

        return result;
    }

    private static int convert(char romanChar) {
        switch (romanChar)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            default:
                return 1000;
        }
    }
}