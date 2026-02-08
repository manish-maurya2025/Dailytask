class Frequency{
    public static void main(String args[]){
      String s = "programming";
   int freq[] = new int[256];

    for(int i = 0; i < s.length(); i++){
    freq[s.charAt(i)]++;
}

   char maxChar = s.charAt(0);
   int maxCount = freq[maxChar];

  for(int i = 0; i < s.length(); i++){
    char ch = s.charAt(i);
    if(freq[ch] > maxCount){
        maxCount = freq[ch];
        maxChar = ch;
    }
}

    System.out.println("Most frequent character: " + maxChar);
    System.out.println("Frequency: " + maxCount);
  


    }
}