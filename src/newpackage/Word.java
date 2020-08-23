/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author IM
 */
public class Word {
    private String Word;
    private char Letter;
    private boolean CorrectLetter;
    private boolean CompleteWord;
    //Las variables booleanas se utilizan como banderas para saber si gan'o o no
        public Word(){
            //constructor en 0
            Word = "";
            Letter = ' ';
            CorrectLetter = false;
            CompleteWord = false;
        }
//Encapsulamiento
    public char getLetter() {
        return Letter;
    
   }
    public boolean getCorrectLetter() {
        return CorrectLetter;
     }
    
    public boolean getCompleteWord() {
        return CompleteWord;
    }
    
    public String getWord() {
        return Word;
    }

    public void setCompleteWord(boolean CompleteWord) {
        this.CompleteWord = CompleteWord;
    }

    public void setCorrectLetter(boolean CorrectLetter) {
        this.CorrectLetter = CorrectLetter;
    }

    public void setLetter(char Letter) {
        this.Letter = Letter;
    }

    public void setWord(String Word) {
        this.Word = Word;
    }
        //Esta funcion busca la letra en la palabra completa
      public boolean FindLetter(String WordSelected, char UsersChar){
        
        for(int i = 0; i < WordSelected.length(); i++){
            if(WordSelected.charAt(i) == UsersChar){ //Compara el char ingresado por el usuario con cada char de la palabra
                System.out.println(WordSelected.charAt(i)); ///Debug
                return true; //Devuelve bandera
            }
        }
        
        return false; 
    }
    
    public String ReplaceLetter(String LabelContain,String WordSelected, char UsersChar){
        
        System.out.println(WordSelected.length());
      //  System.out.println(LabelContain.length());
        for(int i = 0; i < WordSelected.length(); i++){
            //Recorre el label y sustituye el guion con la letra insertada
            if(WordSelected.charAt(i) == UsersChar){
                char[] LabelChars = LabelContain.toCharArray();
                LabelChars[i*2+1] = UsersChar;
                LabelContain = String.valueOf(LabelChars); //Asigna el valor nuevo y lo retorna
            }
        }
        
        return LabelContain;
    }
        
}
