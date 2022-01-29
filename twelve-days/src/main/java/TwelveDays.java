import java.util.List;

class TwelveDays {
    public String comm="On the ";
    public String comm2=" day of Christmas my true love gave to me:";
    public String[] verses =new String[12];
    public String[] order={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    public String[] lines={" a Partridge in a Pear Tree."," two Turtle Doves,"," three French Hens,"," four Calling Birds,"," five Gold Rings,"," six Geese-a-Laying,"," seven Swans-a-Swimming,"," eight Maids-a-Milking,"," nine Ladies Dancing,"," ten Lords-a-Leaping,"," eleven Pipers Piping,"," twelve Drummers Drumming,"};
    
    public TwelveDays(){
        for(int i=0;i<=11;i++){
            String ans=comm;
            ans=ans+order[i];
            ans=ans+comm2;
            for(int j=i;j>=0;j--){
                ans=ans+lines[j];
                if(j==1){
                    ans=ans+" and";
                }
            }
            ans=ans+"\n";
            verses[i]=ans;
        }
    }
    String verse(int vern) {
        System.out.println(vern-1);
        return verses[vern-1];
    }

    String verses(int startVerse, int endVerse) {
        String ans="";
        for(int i=startVerse-1;i<endVerse;i++){
            ans=ans+verses[i];
            if(i!=endVerse-1)
            ans=ans+"\n";
        }
        return ans;

    }
    
    String sing() {
      String ans="";
      for(int i=0;i<=11;i++){
            ans=ans+verses[i];
            if(i!=11)
            ans=ans+"\n";
        }
        return ans;
    }
}
