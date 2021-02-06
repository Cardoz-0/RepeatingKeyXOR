package main.src.java.cardoso.repeatingkey;

import main.src.java.cardoso.repeatingkey.useful.BinUtils;
import main.src.java.cardoso.repeatingkey.useful.UserInput;

import java.text.Normalizer;

public class RepeatingKeyXOR {
    public static void main(String [] args){
        System.out.println("Me de algo para encryptar, se tiver line breaker, coloque somente a primeira frase agora, e a segunda depois");
        String ascii_string = UserInput.scanner();
        int i = 0;
        while(i == 0){
            System.out.println("Quer adicionar mais uma linha? Y/N");
            String YN = UserInput.scanner();
            if ((YN.equals("N")) || YN.equals("n")){
                i = 1;

            }
            else{
                System.out.println("Adicione:");
                String adicionar = UserInput.scanner();
                ascii_string = ascii_string + "\n" + adicionar;
            }
        }
//        String ascii_string = "Burning 'em, if you ain't quick and nimble\n" +
//                "I go crazy when I hear a cymbal";
        System.out.println(ascii_string);
        System.out.println("Give me a key");
        String ascii_key = UserInput.scanner();
        String binary = BinUtils.asciiToBinary(ascii_string);
        String key = BinUtils.asciiToBinary(ascii_key);
        String xorred = BinUtils.repeatingKeyXOR(binary, key);
        String hexified = BinUtils.binToManyHex(xorred);
        System.out.println(hexified);
        System.out.println("Source code: https://github.com/Cardoz-0/RepeatingKeyXOR");
    }

}
