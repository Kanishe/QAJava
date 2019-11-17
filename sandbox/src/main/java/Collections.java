import java.util.ArrayList;
import java.util.List;

public class Collections {
  public static void main(String[] args) {
    String []langs = new String[4];
    langs[0]="java";
    langs[1]="c++";
    langs[2]="pyton";
    langs[3]="php";

    List<String> languages=new ArrayList<>();
    languages.add("assembly");
    languages.add("C");

    for (String lang: languages){
      System.out.println(languages);
    }

  //  for (int i=0; i<langs.length;i++){
  //    System.out.println("I learn: " + langs[i]);
   // or use for each<<
    for (String l:langs){
      System.out.println("I learn: " + l);
    }
  }
}
