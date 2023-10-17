import java.util.*;
import java.io.*;

public class Finder {
    public static void main(String[] arg){
        
        Trie ds = new Trie();
        LinkedList<Pair<String>> list = new LinkedList<Pair<String>>();
        String word;
        List<Integer> sufInd;
        
        try{
            
            File f = new File("Input_02.txt");
            Scanner sc = new Scanner(f);
            
            while(sc.hasNext()){
                
                word = sc.next();
                sufInd = ds.getSuffixInd(word);
                
                for(int i : sufInd){
                    
                    if(i >= word.length())  break;
                    list.add(new Pair<String>(word, word.substring(i)));
                }
                
                ds.add(word);
            }
            
            Pair<String> pair;
            int max = 0;
            String longestF = "";
            String longestS = "";
            
            while(!list.isEmpty()){
                
                pair = list.removeFirst();
                word = pair.sec;
                sufInd = ds.getSuffixInd(word);
                
                if(sufInd.isEmpty())    continue;
                
                for(int i : sufInd){
                    
                    if(i > word.length())   break;
                    
                    if(i == word.length()){
                        
                        if(pair.getF().length() > max){
                            longestS = longestF;
                            max = pair.getF().length();
                            longestF = pair.getF();
                        }
                    }
                    
                    else    list.add(new Pair<String>(pair.getF(), word.substring(i)));
                }
            }
            
            System.out.println(longestF);
            System.out.println(longestS);
        }
        
        catch(Exception e){}
    }
}