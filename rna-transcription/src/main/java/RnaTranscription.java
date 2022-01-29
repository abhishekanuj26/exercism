class RnaTranscription {

    String transcribe(String s) {
        if(s.isEmpty()){
            return "";
        }

        StringBuilder sl=new StringBuilder(s);
        int l=s.length();
        for(int i=0;i<l;i++){
            if(sl.charAt(i)=='G'){
                sl.setCharAt(i, 'C');
            }
            else if(sl.charAt(i)=='C'){
                sl.setCharAt(i, 'G');
            }
           else if(sl.charAt(i)=='T'){
                sl.setCharAt(i, 'A');
            }
          else  if(sl.charAt(i)=='A'){
                sl.setCharAt(i, 'U');
            }
            
        }

      
        String ans=sl.toString();



        return ans;
    }

}
