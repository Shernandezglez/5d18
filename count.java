package cnt;

import java.util.HashMap;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASKII
 */
public class count {
      public String getWords(String cdn)
    {
       int w = 0;
       
       w = cdn.split(" ").length;
       
       return "Palabras " + w;
    }
    
    public String getUni(String cdn)
    {
        HashMap<String, Integer> hm = new HashMap<>();
        
        String[] cosa = cdn.split(" ");
        
        for(String str:cosa)
        {
           if(hm.containsKey(str)){
               int n = hm.get(str);
               n += 1;
               hm.replace(str, n);
           } 
           else
           {
               hm.put(str, 1);
           }
        }
        return "Palabras unicas: " + hm.size();
    }
    
    
    public void getChars(String cdn)
    {
        char[] ac;
        char c;
        int cont = 0;
        
        ac = cdn.toCharArray();
        
        for(int i = 0; i < ac.length; i++)
        {
            c = ac[i];
            for(int j = 0; j < ac.length; j++)
            {
                if(ac[j] == c)
                {
                    cont += 1 ;
                }
                
            }
            
            System.out.print("Letra: " + ac[i] + " " + " Se repite: " + cont + "\n");
            cont = 0;
        }
        
        
    }
    
    public String getSil(String cdn)
    {
        String input = cdn.toLowerCase();
        int syllables = 0,numOfEInTheEnd=0;

        int i = input.length() - 1;
        // count all the e's in the end
        while (i >= 0 && input.charAt(i) == 'e') {
            i--;
            numOfEInTheEnd++;
        }

        if (numOfEInTheEnd == 1) {
            syllables = 1;
        }

        boolean preVowel = false;
        while (i >= 0) {
            if (isVowel(input.charAt(i))) {
                if (!preVowel) {
                   syllables++;
                   preVowel = true;
                }
            } else {
                preVowel = false;
            }
            i--;
        }
        return "Silabas: " + syllables;
        }

        public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            return true;
        }
        return false;
        
    }
}
