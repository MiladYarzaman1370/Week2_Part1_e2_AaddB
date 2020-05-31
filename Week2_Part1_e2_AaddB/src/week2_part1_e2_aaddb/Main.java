
package week2_part1_e2_aaddb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        String str="";
        String[] strArray;
        while(true)
        {
          str=sc.nextLine();
           strArray= MySplit(str);
           if(strArray==null || strArray.length!=2)
           {
               
           }
           else
           {
             
             if(strIsNumber(strArray[0],strArray[1]))
             {
                 
                 System.out.println(Integer.parseInt(strArray[0])+Integer.parseInt(strArray[1]));
             }
             else
             {
                 
             }
           }
        }
        /*while(true){
            try{
                 a=sc.nextInt();
                 b=sc.nextInt();
                 c=sc.next();
                 
        str=sc.nextLine();
        strArray=str.split(" ",2);
       System.out.println(strArray.length);
        if(strArray.length==2)
            System.out.print(a+b);
        a=0;
        b=0;
        str="";
        strArray=null;
            }catch(Exception e)
            {
                continue;
             }
        }*/
    }
    private static String[] MySplit(String inpoutString) {
        boolean boolTemp=false;
        int temp=0;
        if (inpoutString.length()==0)
            return null;
         for(int c=0;c<inpoutString.length();c++)
         {
             if(inpoutString.charAt(c)!=' ')
                 boolTemp=true;
             else
                 temp++;
                 
         }
         if (temp!=1)
             return null;
         if(!boolTemp)
             return null;
        int intTemp=0;
        for(int j=0;j<inpoutString.length();j++)
        {
              if(j<inpoutString.length()-1)
              {
                  
                if(inpoutString.charAt(j)==' '&&inpoutString.charAt(j+1)!=' ')
                {
                    intTemp++;
                   
                }
              }
              else
              {
                  
                if(inpoutString.charAt(j)==' ')
                {
                    intTemp++;
                   
                }
                
              }
        }
        if(inpoutString.charAt(inpoutString.length()-1)!=' ')
            intTemp++;
      //  else 
           // intTemp--;
            if(inpoutString.charAt(0)==' ')
                intTemp--;
        String[] result=new String[intTemp];
        int index=0;
        String strTemp="";
        for(int i=0;i<inpoutString.length();i++)
        {
            
                if(inpoutString.charAt(i)==' ')
                {
                  if(strTemp.equals(""))
                  {
                      
                  }
                  else
                  {
                      //list.add(strTemp);
                      if(i<inpoutString.length()-1)
                      {
                      result[index]=strTemp;
                      index++;
                      strTemp="";
                      }
                  }
                }
                 else
                {
                  strTemp+=inpoutString.charAt(i);
                }
                
        }
        if(strTemp.equals(""))
            {}
            else
            {
               // index=0;
                if(!strTemp.contains(" "))
                {
                result[index]=strTemp;
                      index++;
                      strTemp="";
                }
            }
        return result;
           
    }

    private static boolean strIsNumber(String str1,String str2) {
        
        for(int i=0;i<str1.length();i++)
        {
            if((int)str1.charAt(i)<=47||(int)str1.charAt(i)>=58)
            {return false;}
            
                
        }
        
        for(int j=0;j<str2.length();j++)
        {
            if((int)str2.charAt(j)>=48&&(int)str2.charAt(j)<=57)
            {}
            else
            {return false;}
                
        }
        return true;
    }
    
}
