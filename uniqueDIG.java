//UNIQUE DIGIT (EX.25000) ANS:3 BECZ '2','5','0' ARE UNIQUE

public static void main(String args[]){
		String s="25000";
		int a[]=new int[s.length()];
		int i=0,j=0,count=0;
		for(i=0;i<s.length();i++)
		{
			a[i]=Integer.parseInt(Character.toString(s.charAt(i)));
		}
		for(i=0;i<a.length;i++){
			for(j=0;j<i;j++){
				if(a[i]==a[j]){
					count--;break;}
              }
              count++;
		}
	
		System.out.println(count);

	}
