package com.example.jerry.morse;

/**
 * Created by jerry on 16/9/9.
 */
public class asciiToMorse {
    public String asciiToMorse(String string) {
        String result = new String();
        char[] input = string.toCharArray();
        for (char c : input) {
            switch (c) {
                case 'a':
                    result += ".- "; break;
                case 'b':
                    result += "-... "; break;
                case 'c':
                    result += "-.-. "; break;
                case 'd':
                    result += "-.. "; break;
                case 'e':
                    result += ". "; break;
                case 'f':
                    result += "..-. "; break;
                case 'g':
                    result += "--. "; break;
                case 'h':
                    result += ".... "; break;
                case 'i':
                    result += ".. "; break;
                case 'j':
                    result += ".--- "; break;
                case 'k':
                    result += "-.- "; break;
                case 'l':
                    result += ".-.. "; break;
                case 'm':
                    result += "-- "; break;
                case 'n':
                    result += "-. "; break;
                case 'o':
                    result += "--- "; break;
                case 'p':
                    result += ".--. "; break;
                case 'q':
                    result += "--.- "; break;
                case 'r':
                    result += ".-. "; break;
                case 's':
                    result += "... "; break;
                case 't':
                    result += "- "; break;
                case 'u':
                    result += "..- "; break;
                case 'v':
                    result += "...- "; break;
                case 'w':
                    result += ".-- "; break;
                case 'x':
                    result += "-..- "; break;
                case 'y':
                    result += "-.-- "; break;
                case 'z':
                    result += "--.. "; break;
                case '1':
                    result += ".---- "; break;
                case '2':
                    result += "..--- "; break;
                case '3':
                    result += "...-- "; break;
                case '4':
                    result += "....- "; break;
                case '5':
                    result += "..... "; break;
                case '6':
                    result += "-.... "; break;
                case '7':
                    result += "--... "; break;
                case '8':
                    result += "---.. "; break;
                case '9':
                    result += "----. "; break;
                case '0':
                    result += "----- "; break;
                case ' ':
                    result += "/ "; break;
                default:
                    ;
            }
        }
        return result;
    }
}
