 import java.util.*;

 public class Trie {
     
     public class Node{
         
         char ch;
         HashMap<Character, Node> child;
         boolean checkWord;
         
         public Node(char ch){
             
             this.ch = ch;
             child = new HashMap<Character, Node>();
             checkWord = false;
         }
         
         public void addNode(char node){
             
             child.put(node, new Node(node));
         }
         
         public Node getNode(char node){
             
             if(!child.keySet().contains(node))  return null;
             return child.get(node);
         }
         
         public boolean checkNode(char node){
             
             return child.keySet().contains(node);
         }
     }
     
     Node root, curr;
     
     public Trie(){
         root = new Node(' ');
         curr = root;
     }
     
     public void add(String str){
         char ch;
         curr = root;
         
         for(int i = 0; i < str.length(); i++){
             ch = str.charAt(i);
             
             if(!curr.checkNode(ch)) curr.addNode(ch);
             curr = curr.getNode(ch);
         }
         
         curr.checkWord = true;
     }
     
     public List<Integer> getSuffixInd(String str){
         List<Integer> ind = new LinkedList<Integer>();
         char ch;
         curr = root;
         
         for(int i = 0; i < str.length(); i++){
             ch = str.charAt(i);
             
             if(!curr.checkNode(ch)) return ind;
             
             curr = curr.getNode(ch);
             if(curr.checkWord)  ind.add(i + 1);
         }
         
         return ind;
     }
 }