class Solution {
    public int romanToInt(String s) {
        String romawi = s;
        int kosong = 0;
        int perub = 0;
       
        for(int i = 0; i < romawi.length(); i++ ){
            char str = romawi.charAt(i);
         if(str == 'I'){
             perub = 1;
         }else if(str == 'V'){
             perub  = 5;
         }else if(str == 'X'){
             perub = 10;
        }else if(str == 'L'){
             perub = 50;
    }else if(str == 'C'){
             perub = 100;
    }else if(str == 'D'){
             perub = 500;
    }else if(str == 'M'){
             perub = 1000;
    }
    if(perub > kosong ){
        kosong = perub - kosong;
    }else{
        kosong = perub + kosong;
    }
}
   return kosong;}
}
