package com.example.jerry.morse;

/**
 * Created by jerry on 16/9/9.
 */
public class morseToAscii {
    private char[] input;
    private String[] devidedInputs = new String[100];

    public String morseToAscii(String s) {
        int i = 0;
        String result = new String();
        input = s.toCharArray();
        for (char chars : input) {
            if (chars !=  ' ') {
                devidedInputs[i] += chars;
            }
            else {
                i++ ;

            }
        }
        for (String inputs : devidedInputs) {

            if (inputs == null) {
                inputs = "null123";
            }
            else {
                inputs = inputs.substring(4);
                switch (inputs) {
                    case ".-":
                        inputs = "a"; break;
                    case "-...":
                        inputs = "b"; break;
                    case "-.-.":
                        inputs = "c"; break;
                    case "----":
                        inputs = "ch"; break;
                    case "-..":
                        inputs = "d"; break;
                    case ".":
                        inputs = "e"; break;
                    case "..-.":
                        inputs = "f"; break;
                    case "--.":
                        inputs = "g"; break;
                    case "....":
                        inputs = "h"; break;
                    case "..":
                        inputs = "i"; break;
                    case ".---":
                        inputs = "j"; break;
                    case "-.-":
                        inputs = "k"; break;
                    case ".-..":
                        inputs = "l"; break;
                    case "--":
                        inputs = "m"; break;
                    case "-.":
                        inputs = "n"; break;
                    case "---":
                        inputs = "o"; break;
                    case ".--.":
                        inputs = "p"; break;
                    case "--.-":
                        inputs = "q"; break;
                    case ".-.":
                        inputs = "r"; break;
                    case "...":
                        inputs = "s"; break;
                    case "-":
                        inputs = "t"; break;
                    case "..-":
                        inputs = "u"; break;
                    case "...-":
                        inputs = "v"; break;
                    case ".--":
                        inputs = "w"; break;
                    case "-..-":
                        inputs = "x"; break;
                    case "-.--":
                        inputs = "y"; break;
                    case "--..":
                        inputs = "z"; break;
                    case ".----":
                        inputs = "1"; break;
                    case "..---":
                        inputs = "2"; break;
                    case "...--":
                        inputs = "3"; break;
                    case "....-":
                        inputs = "4"; break;
                    case ".....":
                        inputs = "5"; break;
                    case "-....":
                        inputs = "6"; break;
                    case "--...":
                        inputs = "7"; break;
                    case "---..":
                        inputs = "8"; break;
                    case "----.":
                        inputs = "9"; break;
                    case "-----":
                        inputs = "0"; break;
                    default:
                        ;
                }
                result += inputs;
            }
        }
        return result;
    }
}
