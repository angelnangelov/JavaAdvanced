package SetsAndMapsAdvanced;

import java.util.*;

public class SoftuniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Set<String> vip = new LinkedHashSet<>();
        Set<String> regular = new LinkedHashSet<>();

        while(!line.equals("PARTY")){
            char firstChar = line.charAt(0);
            if(Character.isDigit(firstChar)){
                //vip
                vip.add(line);
            }
            else{
                //Regular
                regular.add(line);
            }
            line=scanner.nextLine();
        }
        while(!line.equals("END")){

            char firstChar = line.charAt(0);
            if(Character.isDigit(firstChar)){
                //vip
                vip.remove(line);


            }
            else{
                //Regular
                regular.remove(line);

            }
            line=scanner.nextLine();
        }
        System.out.println(vip.size()+regular.size());

        for (String noCommer : vip) {
            System.out.println(noCommer);

        }
        for (String s : regular) {
            System.out.println(s);

        }
    }
}
